package rise.up.controller.controller1;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.User;
import rise.up.component.ComponentContainer;
import rise.up.enums.UserSteps;
import rise.up.maps.Maps;
import rise.up.util.KeyboardButtonUtil;

public class Aubis_Controller {
    public void handleText(User user, Message message) {
        String text = message.getText();

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(user.getId());

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(user.getId());

        SendVideo sendVideo=new SendVideo();
        sendVideo.setChatId(user.getId());
        if (text.equals("⬅\uFE0F Ortga")) {
            sendMessage.setText("davom eting");
            Maps.User_Steps_Map.put(user, UserSteps.Oyinchi_Menu);
            sendMessage.setReplyMarkup(KeyboardButtonUtil.tanlash());
            ComponentContainer.MY_TELEGRAM_BOT.send(sendMessage);
        } else if (text.equals("\uD83D\uDCA8 Smoke Grenade")) {
            sendVideo.setCaption("Bu video siz uchun :");
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIIcWqikeq6Y0uUR1MX43jZXT-8z3vyAALSpAAC-TEYSV7AnrRAb4K2PQQ"));
            ComponentContainer.MY_TELEGRAM_BOT.send(sendVideo);
        } else if (text.equals("\uD83D\uDD25 Molotov")) {
            sendVideo.setCaption("Bu video siz uchun :");
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIIdGqikhswq8F8kR60pW7tfULZTNvAAALTpAAC-TEYSQ_o8nHFPfJ4PQQ"));
            ComponentContainer.MY_TELEGRAM_BOT.send(sendVideo);
        } else if (text.equals("⚡ Flashbang")) {
            sendVideo.setCaption("Bu video siz uchun :");
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAIL7mrE31xlvI0qYyQGzIuCC1BRIuA8AAJEnAACqWEoSnYJpxDkLkb7PQQ"));
            ComponentContainer.MY_TELEGRAM_BOT.send(sendVideo);
        }
    }
}
