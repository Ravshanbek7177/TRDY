package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;

public class QueryController  extends Thread {

    private UserService userService;
    private  CallbackQuery callbackQuery ;
    public QueryController(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        userService = new UserService(this);

    }

    public  void run(){

        SendMessage sendMessage = new SendMessage();
        String data = callbackQuery.getData();
        String idStr = String.valueOf(callbackQuery.getFrom().getId());
        if(data.equals("chizma")){
          userService.start1( idStr,sendMessage);
        } else if (data.equals("3D")) {
            userService.men3D(idStr,sendMessage);
        } else if (data.equals("2D")) {
          userService.men2D(idStr,sendMessage);
        } else if (data.equals("_Orqaga1")) {
            userService.asosiymen(idStr,sendMessage);
        }else if (data.equals("Asosiy Menyu")){
            userService.asosiymen(idStr,sendMessage);
        } else if (data.equals("_Orqaga2")) {
            userService.start1(idStr,sendMessage);
        }else if(data.equals("Asosiy Menyu2")){
            userService.asosiymen(idStr,sendMessage);
        } else if (data.equals("_Orqaga3")) {
            userService.start1(idStr,sendMessage);
        }else if (data.equals("Asosiy Menyu3")){
            userService.asosiymen(idStr,sendMessage);
        } else if (data.equals("rover")) {
             userService.Rover(idStr,sendMessage);
        }else if(data.equals("_orqaV")){
            userService.asosiymen(idStr,sendMessage);
        }else if(data.equals("_AsosiyM")){
            userService.asosiymen(idStr,sendMessage);
        }


    }





}
