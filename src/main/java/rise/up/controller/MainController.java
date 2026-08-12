package rise.up.controller;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.User;
import rise.up.component.ComponentContainer;
import rise.up.util.KeyboardButtonUtil;

public class MainController {
    public void handleText(User user, Message message) {
    String text= message.getText();
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(user.getId());
        if (text.equals("/start")){
            sendMessage.setText("Assalomu alaykum");
            sendMessage.setReplyMarkup(KeyboardButtonUtil.menu());
            ComponentContainer.MY_TELEGRAM_BOT.send(sendMessage);
        } else if (text.equals("\uD83D\uDE09 Boshlash")) {
            sendMessage.setText("Siz boshlash menyusini bosdingiz");
            ComponentContainer.MY_TELEGRAM_BOT.send(sendMessage);
        } else if (text.equals("ℹ\uFE0F Info")){
            sendMessage.setText("Siz info menyusini bosdingiz");
            ComponentContainer.MY_TELEGRAM_BOT.send(sendMessage);
        }
    }

    public void deleteMessage(User user,Message message){
        DeleteMessage deleteMessage=new DeleteMessage();
        deleteMessage.setChatId(user.getId());
        deleteMessage.setMessageId(message.getMessageId());
        ComponentContainer.MY_TELEGRAM_BOT.send(deleteMessage);
    }
}
