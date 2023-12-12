package com.example.ai_app;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MessageDao {

    @Insert
    void insertMessage(MessageEntity message);

    @Query("SELECT * FROM messages WHERE is_user_message = 1")
    List<MessageEntity> getUserMessages();

    @Query("SELECT * FROM messages WHERE is_user_message = 0")
    List<MessageEntity> getAIMessages();

    @Query("SELECT * FROM messages")
    List<MessageEntity> getAllMessages();

}
