package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;

public class UserService extends  Thread {
    private MyTelegramBot myTelegramBot ;

    private QueryController queryController ;

    public UserService(QueryController queryController) {
        this.queryController =queryController ;
        myTelegramBot = new MyTelegramBot();
    }


    public void start1(String idStr, SendMessage sendMessage) {
            sendMessage = new SendMessage();
            sendMessage.setText("Quydagilardan birini tanlang⬇️");
            sendMessage.setChatId(idStr);
            sendMessage.setReplyMarkup(InlineKeyboardUtil.menyu());
            myTelegramBot.sendMsg(sendMessage);

        }

        public void men3D(String idStr , SendMessage sendMessage){
           sendMessage.setText("Tayyor 3D maddellar");
           sendMessage.setChatId(idStr);
           sendMessage.setReplyMarkup(InlineKeyboardUtil.tayorMen());
           myTelegramBot.sendMsg(sendMessage);
        }

        public void asosiymen(String idStr , SendMessage sendMessage){
            sendMessage.setText("Assalomu aleykum Hush kelibsiz siz bu yerdan O'zizga keraklli prekt va tavarlani olshingiz mumkin");
            sendMessage.setChatId(String.valueOf(idStr));
            sendMessage.setReplyMarkup(InlineKeyboardUtil.MEny());
            myTelegramBot.sendMsg(sendMessage);

        }
        public void men2D(String idStr , SendMessage sendMessage){
            sendMessage.setText("Tayyor 2D maddellar");
            sendMessage.setChatId(idStr);
            sendMessage.setReplyMarkup(InlineKeyboardUtil.tayor2DMen());
            myTelegramBot.sendMsg(sendMessage);

        }

        public void Rover(String idStr , SendMessage sendMessage){
        sendMessage.setText(" Siz bu yerdan o'zizngizga kerakli narsani topshingiz mumkin ");
        sendMessage.setChatId(idStr);
        sendMessage.setReplyMarkup(InlineKeyboardUtil.Rover());
        myTelegramBot.sendMsg(sendMessage);
        }



    }


