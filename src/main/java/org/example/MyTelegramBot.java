package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import org.telegram.telegrambots.meta.generics.TelegramBot;

public class MyTelegramBot extends TelegramLongPollingBot {
    public MainController mainController ;
    private QueryController queryController;

    public MyTelegramBot() {
        mainController = new MainController(this);
    }

    @Override
    public String getBotUsername() {
        return "3D_bot";
    }

    @Override
    public String getBotToken() {
        return "5868018034:AAGl_XxIsTrkHhMstW0V57U0YiCzHw0q_pE";
    }

    @Override
    public void onUpdateReceived(Update update) {
     /*   if(update.getMessage().getChatId()==2034683255){
            if(update.getMessage().getPhoto() != null){
                String phonID = update.getMessage().getPhoto().toString();
                System.out.println("arsimnin Idisi" + phonID);
            }else if (update.getMessage().getDocument() != null) {
                String dokumentId = update.getMessage().getDocument().getFileId();

                System.out.println("Dokument ID    "+ dokumentId);
            }
        }
*/


          if(update.hasMessage()){
              Message message = update.getMessage();
            mainController.start(message.getText(), message);
          } else if (update.hasCallbackQuery()) {
              CallbackQuery callbackQuery = update.getCallbackQuery();
              queryController = new QueryController(callbackQuery);
              queryController.run();
          }

    }

    public void sendMsg(SendMessage sendMessage){
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

}
