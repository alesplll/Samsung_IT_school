package com.example.ai_app;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "messages")
public class MessageEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "content")
    private String content;

    @ColumnInfo(name = "is_user_message")
    private boolean isUserMessage;

    public MessageEntity() {
    }

    public MessageEntity(String content, boolean isUserMessage) {
        this.content = content;
        this.isUserMessage = isUserMessage;
    }

    public boolean isUserMessage() {
        return isUserMessage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUserMessage(boolean userMessage) {
        isUserMessage = userMessage;
    }
}



