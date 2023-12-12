package com.example.ai_app;
import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import android.widget.EditText;
import android.widget.Button;
import java.util.ArrayList;
import android.view.View;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;



public class MainActivity extends AppCompatActivity implements ChatContract.View {

    private RecyclerView recyclerView;
    private EditText messageEditText;
    private Button sendButton;
    private ChatAdapter chatAdapter;
    private ChatContract.Presenter presenter;

    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view_chat);
        messageEditText = findViewById(R.id.edit_text_message);
        sendButton = findViewById(R.id.button_send);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        chatAdapter = new ChatAdapter(new ArrayList<>());
        recyclerView.setAdapter(chatAdapter);

        presenter = new ChatPresenter(this);

        appDatabase = AppDatabase.getInstance(this);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage();
            }
        });

        // Загрузите сообщения из базы данных при запуске
        loadMessagesFromDatabase();
    }

    private void sendMessage() {
        String userMessage = messageEditText.getText().toString().trim();
        presenter.sendMessage(userMessage);
        messageEditText.getText().clear();

        //  сообщение пользователя в базе данных
        saveMessageToDatabase( userMessage, true);
        // Оторазите сообщение пользователя в списке
        displayMessage(userMessage, true);

        String aiResponse = getAIResponse(userMessage);
        // сообщение ИИ в базе данных
        saveMessageToDatabase(aiResponse, false);
        // Отобразите ответ ИИ в списке
        displayMessage(aiResponse, false);
    }


    private String getAIResponse(String userMessage) {
        return "Default AI response";
    }


    private void saveMessageToDatabase(final String message, final boolean isUserMessage) {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                appDatabase.messageDao().insertMessage(new MessageEntity(message, isUserMessage));
            }
        });
    }


    private void loadMessagesFromDatabase() {
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                List<MessageEntity> messages = appDatabase.messageDao().getAllMessages();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        for (MessageEntity messageEntity : messages) {
                            boolean isUserMessage = messageEntity.isUserMessage();
                            String displayMessage = isUserMessage ? "You: " + messageEntity.getContent() : "AI: " + messageEntity.getContent();
                            chatAdapter.addMessage(displayMessage, isUserMessage);
                        }
                        recyclerView.scrollToPosition(chatAdapter.getItemCount() - 1);
                    }
                });
            }
        });
    }



    public void displayMessage(String message, boolean isUserMessage) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                String displayMessage;
                if (isUserMessage) {
                    displayMessage = "You: " + message;
                } else {
                    displayMessage = "AI: " + message;
                }
                chatAdapter.addMessage(displayMessage, isUserMessage);
                recyclerView.scrollToPosition(chatAdapter.getItemCount() - 1);
            }
        });
    }
}
