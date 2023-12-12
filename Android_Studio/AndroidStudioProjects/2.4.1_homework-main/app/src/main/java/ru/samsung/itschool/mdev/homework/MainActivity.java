package ru.samsung.itschool.mdev.homework;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private EditText linkEditText;
    private TextView resTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linkEditText = findViewById(R.id.linkEditText);
        resTextView = findViewById(R.id.resTextView);
    }

    public void downloadImage(View view) {
        String imageUrl = linkEditText.getText().toString();
        new DownloadImageTask().execute(imageUrl);
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Void> {
        @Override
        protected Void doInBackground(String... params) {
            try {
                String imageUrl = params[0];
                URL url = new URL(imageUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoInput(true);
                connection.connect();
                InputStream input = connection.getInputStream();
                // TODO: Save the image to the "Downloads" folder

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            resTextView.setText("Image downloaded!");
        }
    }
}
