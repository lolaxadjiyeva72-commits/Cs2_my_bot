package rise.up.component;

import rise.up.MyTelegramBot;
import rise.up.dto.Cs2Dto;

import java.util.ArrayList;

public class ComponentContainer {
    private static int id=0;

    public static MyTelegramBot MY_TELEGRAM_BOT;

    public static int getId(){
        return id++;
    }

}
