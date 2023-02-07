package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public class MainController {

    private  MyTelegramBot myTelegramBot;

    public MainController(MyTelegramBot myTelegramBot) {
        this.myTelegramBot = myTelegramBot;
    }

    public void start( String text , Message message){
        if(text.equals("/start")){
            SendMessage sendMessage = new SendMessage();
            sendMessage.setText("Assalomu aleykum Hush kelibsiz siz bu yerdan O'zizga keraklli prekt va tavarlani olshingiz mumkin");
            sendMessage.setChatId(message.getChatId());
            sendMessage.setReplyMarkup();

        }
    }



}
