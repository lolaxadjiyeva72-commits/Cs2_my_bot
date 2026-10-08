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

public class Nuke_Controller {
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
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAILiGq7wXoQXI9NUdq-Kf2ceCDNPSbOAAL8sQACFaHgSSKyHAdFJnQfPQQ"));
            ComponentContainer.MY_TELEGRAM_BOT.send(sendVideo);
        } else if (text.equals("\uD83D\uDD25 Molotov")) {
            sendVideo.setCaption("Bu video siz uchun :");
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAILxWrA-C8e0ebuZduHoK8q6IZSTfbyAAIvpwACyrQBSozrMwABf0Dlnz0E"));
            ComponentContainer.MY_TELEGRAM_BOT.send(sendVideo);
        } else if (text.equals("⚡ Flashbang")) {
            sendVideo.setCaption("Bu video siz uchun :");
            sendVideo.setVideo(new InputFile("BAACAgIAAxkBAAILoGq_pSFsB6VdgLjS0ut-IOfJ01O1AAJysgAC45UAAUqCQ_p5GZYnhD0E"));
            ComponentContainer.MY_TELEGRAM_BOT.send(sendVideo);
        }
    }
}
