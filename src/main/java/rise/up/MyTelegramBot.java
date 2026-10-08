package rise.up;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendDice;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import rise.up.controller.MainController;

import java.time.LocalDateTime;
import java.util.List;

public class MyTelegramBot extends TelegramLongPollingBot {

     private final MainController mainController=new MainController();

    public MyTelegramBot(TelegramBotsApi telegramBotsApi){
        super("8679947433:AAGCc10cNcL_bF3jq3Bpfut00be9cKBEoJY");
        try {
            telegramBotsApi.registerBot(this);
        }catch (TelegramApiException exception){
            exception.printStackTrace();
            throw new RuntimeException();
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
   if (update.hasMessage()){
       Message message=update.getMessage();
       User user=message.getFrom();

       if(message.hasText()) {
           log(user, message.getText());
           mainController.handleText(user, message);
       }else if (message.hasPhoto()) {
           log(user,message.getPhoto());
       } else if(message.hasVideo()){
           log(user,message.getVideo().getFileId());
           mainController.handleVideo(user,message);
       }
       if (update.hasMessage() && update.getMessage().hasVideo()) {
           long chatId = update.getMessage().getChatId();
           Video video = update.getMessage().getVideo();
           // SendVide class sidan obyekt yaratamiz
           SendVideo sendVideo = new SendVideo();
           sendVideo.setVideo(new InputFile(video.getFileId()));
           sendVideo.setChatId(chatId);

           try {
               execute(sendVideo);
           } catch (TelegramApiException e) {
               throw new RuntimeException(e);
           }
       }
    }

    }

    public void log(User user, String text) {
        System.out.printf("Time : %s , Name : %s , UserId : %s , Text : %s \n",
                LocalDateTime.now(), user.getFirstName(), user.getId(), text);
    }
    private void log(User user, List<PhotoSize> photoSizeList){
        System.out.println("UserId :"+ user.getId());
        for (PhotoSize size: photoSizeList) {
            System.out.println("File Id :" + size.getFileId() + ", Size :" + size.getFileSize());
        }
        }

    public Message send(Object obj){
        try {
            if(obj instanceof SendMessage){
                return execute((SendMessage)obj);
            }else if (obj instanceof SendDice){
                return execute((SendDice) obj );
            }else if (obj instanceof DeleteMessage){
                execute((DeleteMessage) obj);
            }else if (obj instanceof EditMessageText){
                execute((EditMessageText) obj);
            }else if (obj instanceof SendVideo) {
                execute((SendVideo) obj);
            }else if (obj instanceof SendPhoto) {
                execute((SendPhoto) obj);
            }
        }catch (TelegramApiException e){
            throw new RuntimeException(e);
        }
        return null;
    }




    @Override
    public String getBotUsername() {
        return "cs2_uchun_organish_bot";
    }
}
