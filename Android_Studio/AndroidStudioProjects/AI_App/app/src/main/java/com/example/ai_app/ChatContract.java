package com.example.ai_app;

public interface ChatContract {

    interface View {
        void displayMessage(String message, boolean isUserMessage);
    }

    interface Presenter {
        void sendMessage(String message);
    }
}
