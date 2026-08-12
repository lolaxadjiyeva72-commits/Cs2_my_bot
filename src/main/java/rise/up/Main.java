package rise.up;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import rise.up.component.ComponentContainer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            MyTelegramBot myTelegramBot=new MyTelegramBot(telegramBotsApi);
            ComponentContainer.MY_TELEGRAM_BOT = myTelegramBot;
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}