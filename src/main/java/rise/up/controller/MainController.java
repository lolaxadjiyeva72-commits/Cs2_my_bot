package rise.up.controller;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.Video;
import rise.up.component.ComponentContainer;
import rise.up.controller.controller1.*;
import rise.up.enums.UserSteps;
import rise.up.maps.Maps;
import rise.up.util.KeyboardButtonUtil;

public class MainController {
    PlayersController playersController = new PlayersController();
    IshlashController ishlashController=new IshlashController();
    Ishlash1Controller ishlash1Controller=new Ishlash1Controller();
    Ishlash2_Controller ishlash2Controller=new Ishlash2_Controller();
    Cache_Controller ishlash3Controller=new Cache_Controller();
    Aubis_Controller ishlash4Controller=new Aubis_Controller();
    Mirage_Controller ishlash5Controller=new Mirage_Controller();
    Inferno_Controller infernoController=new Inferno_Controller();
    Ancient_Controller ancientController=new Ancient_Controller();
    Dust_Controller dustController=new Dust_Controller();
    Train_Controller trainController=new Train_Controller();
    Nuke_Controller nukeController=new Nuke_Controller();
    Vertigo_Controller vertigoController=new Vertigo_Controller();
    Overpass_Controller overpassController=new Overpass_Controller();
    Boulder_Controller boulderController=new Boulder_Controller();
    Fachwerk_Controller fachwerkController=new Fachwerk_Controller();
    Office_Controller officeController=new Office_Controller();
    Shelter_Controller shelterController=new Shelter_Controller();
    Italiy_Controller italiyController=new Italiy_Controller();
    public void handleText(User user, Message message) {
        String text = message.getText();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(user.getId());
        DeleteMessage deleteMessage=new DeleteMessage();
        deleteMessage.setChatId(user.getId());
        if (text.equals("/start")) {
            sendMessage.setText("Salom cs2 uchun maxsus botga hush kelibsiz : ");
            sendMessage.setReplyMarkup(KeyboardButtonUtil.menu());
            ComponentContainer.MY_TELEGRAM_BOT.send(sendMessage);
        }else if (Maps.User_Steps_Map.containsKey(user)) {
            switch (Maps.User_Steps_Map.get(user)) {
                case Oyinchi_Menu -> playersController.handleText(user, message);
                case Ishlash_Menu -> ishlashController.handleText(user, message);
                case Ishlash1_Menu -> ishlash1Controller.handleText(user, message);
                case Ishlash2_Menu -> ishlash2Controller.handleText(user, message);
                case Ishlash3_Menu -> ishlash3Controller.handleText(user, message);
                case Ishlash4_Menu -> ishlash4Controller.handleText(user, message);
                case Ishlash5_Menu -> ishlash5Controller.handleText(user, message);
                case Ishlash6_Menu ->infernoController.handleText(user, message);
                case Ishlash7_Menu -> dustController.handleText(user, message);
                case Ishlash8_Menu -> ancientController.handleText(user, message);
                case Ishlash9_Menu -> trainController.handleText(user, message);
                case Ishlash10_Menu -> vertigoController.handleText(user, message);
                case Ishlash11_Menu -> nukeController.handleText(user, message);
                case Ishlash12_Menu -> overpassController.handleText(user, message);
                case Ishlash13_Menu -> boulderController.handleText(user, message);
                case Ishlash14_Menu -> fachwerkController.handleText(user, message);
                case Ishlash15_Menu -> shelterController.handleText(user, message);
                case Ishlash16_Menu -> officeController.handleText(user, message);
                case Ishlash17_Menu -> italiyController.handleText(user, message);
            }
        }
         if (text.equals("\uD83D\uDE09 Boshlash")) {
            sendMessage.setText(":Tanlang:");
            sendMessage.setReplyMarkup(KeyboardButtonUtil.tanlash());
            Maps.User_Steps_Map.put(user, UserSteps.Oyinchi_Menu);
            ComponentContainer.MY_TELEGRAM_BOT.send(sendMessage);
        } else if (text.equals("ℹ\uFE0F Info")) {
            sendMessage.setText("Bu bot cs2 o'rganish uchun yaratilgan bo'lib ," +
                    "bu bot cs2 0dan o'rgata oladi deb o'ylayman");
            ComponentContainer.MY_TELEGRAM_BOT.send(sendMessage);
        }

    }
    public void handleVideo(User user, Message message) {
        Video video=message.getVideo();
        System.out.println(
                "Nomi :" + video.getFileName() +"\n" +
                        "Davomiyligi :" + video.getDuration() + "\n" +
                        "Id :" + video.getFileId()
        );
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(user.getId());
        sendMessage.setText("Yuborilgan video saqlandi");
        ComponentContainer.MY_TELEGRAM_BOT.send(sendMessage);


    }
    public void deleteMessage (User user, Message message){
                        DeleteMessage deleteMessage = new DeleteMessage();
                        deleteMessage.setChatId(user.getId());
                        deleteMessage.setMessageId(message.getMessageId());
                        ComponentContainer.MY_TELEGRAM_BOT.send(deleteMessage);
                    }

}
