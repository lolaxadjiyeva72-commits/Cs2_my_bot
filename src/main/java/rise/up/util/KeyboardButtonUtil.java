package rise.up.util;

import com.vdurmont.emoji.EmojiParser;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.Arrays;

public class KeyboardButtonUtil {
    public static KeyboardButton buttonEmoji(String text,String emoji){
        String emojiText= EmojiParser.parseToUnicode(emoji+ " " + text);
        return new KeyboardButton(emojiText);
    }

    public static ReplyKeyboardMarkup menu() {
        KeyboardButton start = KeyboardButtonUtil.buttonEmoji("Boshlash", "\uD83D\uDE09");
        KeyboardButton info = KeyboardButtonUtil.buttonEmoji("Info", "ℹ\uFE0F");
        KeyboardRow row = new KeyboardRow();
        row.add(start);
        row.add(info);

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }
}
