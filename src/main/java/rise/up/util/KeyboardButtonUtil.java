package rise.up.util;

import com.sun.security.auth.module.Krb5LoginModule;
import com.vdurmont.emoji.EmojiParser;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.Arrays;
import java.util.Map;

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
    public static ReplyKeyboardMarkup tanlash() {
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton oyinchi =KeyboardButtonUtil.buttonEmoji("Oyinchi haqda","\uD83E\uDD77\uD83C\uDFFB");
        KeyboardButton qurollar = KeyboardButtonUtil.buttonEmoji("Qurollar haqda","\uD83D\uDD2B");
        KeyboardButton bombalar=KeyboardButtonUtil.buttonEmoji("Bombalar haqda","\uD83D\uDCA3");
        KeyboardButton skinlar=KeyboardButtonUtil.buttonEmoji("Skinlar haqda","\uD83E\uDD77\uD83C\uDFFC");

        KeyboardRow row3=new KeyboardRow();
        row3.add(back);

        KeyboardRow row=new KeyboardRow();
        row.add(oyinchi);

        KeyboardRow row1=new KeyboardRow();
        row1.add(qurollar);

        KeyboardRow row2=new KeyboardRow();
        row2.add(bombalar);

        KeyboardRow row4=new KeyboardRow();
        row4.add(skinlar);

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row3,row,row1,row2,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }
public static ReplyKeyboardMarkup turi(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton terrorist=KeyboardButtonUtil.buttonEmoji("Terrorist","\uD83D\uDD2B");
        KeyboardButton counter_terrosrist=KeyboardButtonUtil.buttonEmoji("Counter_Terrorist","\uD83E\uDD77\uD83C\uDFFC");

       KeyboardRow row1=new KeyboardRow();
        row1.add(back);

        KeyboardRow row= new KeyboardRow();
        row.add(terrorist);
        row.add(counter_terrosrist);

    ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
    replyKeyboardMarkup.setKeyboard(Arrays.asList(row1,row));
    replyKeyboardMarkup.setResizeKeyboard(true);
    return replyKeyboardMarkup;

    }
    public static ReplyKeyboardMarkup turi1(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton terrorist=KeyboardButtonUtil.buttonEmoji("Terrorist","\uD83D\uDD2B");
        KeyboardButton bombs=KeyboardButtonUtil.buttonEmoji("Bombalar","\uD83D\uDCA3");
        KeyboardButton counter_terrosrist=KeyboardButtonUtil.buttonEmoji("Counter_Terrorist","\uD83E\uDD77\uD83C\uDFFC");
        KeyboardRow row1=new KeyboardRow();
        row1.add(back);
        KeyboardRow row= new KeyboardRow();
        row.add(terrorist);
        row.add(counter_terrosrist);
        KeyboardRow row2=new KeyboardRow();
        row2.add(bombs);

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row1,row,row2));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }
    public static ReplyKeyboardMarkup TerroristQurollari(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton pichoq=KeyboardButtonUtil.buttonEmoji("Knife","\uD83D\uDDE1");
        KeyboardButton zeus=KeyboardButtonUtil.buttonEmoji("Zeus","⚡\uFE0F");
        KeyboardButton bomb=KeyboardButtonUtil.buttonEmoji("Bomb","\uD83D\uDCA5");

        KeyboardButton glok=KeyboardButtonUtil.buttonEmoji("Glock-18","");
        KeyboardButton dual=KeyboardButtonUtil.buttonEmoji("Dual Berettas","");
        KeyboardButton p250=KeyboardButtonUtil.buttonEmoji("P-250","");
        KeyboardButton tec=KeyboardButtonUtil.buttonEmoji("Tec-9","");
        KeyboardButton deagle=KeyboardButtonUtil.buttonEmoji("Desert_Deagle","");


        KeyboardButton nova=KeyboardButtonUtil.buttonEmoji("Nova","");
        KeyboardButton xm1014=KeyboardButtonUtil.buttonEmoji("Xm1014","");
        KeyboardButton mp5=KeyboardButtonUtil.buttonEmoji("Mp5-SD","");
        KeyboardButton p90=KeyboardButtonUtil.buttonEmoji("P90","");
        KeyboardButton mAC_10=KeyboardButtonUtil.buttonEmoji("Mac-10","");

        KeyboardButton galil=KeyboardButtonUtil.buttonEmoji("Galli","");
        KeyboardButton ak47=KeyboardButtonUtil.buttonEmoji("Ak-47","");
        KeyboardButton ssg08=KeyboardButtonUtil.buttonEmoji("SSG-08","");
        KeyboardButton sg553=KeyboardButtonUtil.buttonEmoji("SG-553","");
        KeyboardButton awp=KeyboardButtonUtil.buttonEmoji("AWP","");

        KeyboardRow row=new KeyboardRow();
        row.add(pichoq);
        row.add(zeus);
        row.add(bomb);

        KeyboardRow row1=new KeyboardRow();
        row1.add(glok);
        row1.add(nova);
        row1.add(galil);

        KeyboardRow row2=new KeyboardRow();
        row2.add(dual);
        row2.add(xm1014);
        row2.add(ak47);

        KeyboardRow row3=new KeyboardRow();
        row3.add(p250);
        row3.add(mp5);
        row3.add(ssg08);

        KeyboardRow row4=new KeyboardRow();
        row4.add(tec);
        row4.add(p90);
        row4.add(sg553);

        KeyboardRow row5=new KeyboardRow();
        row5.add(deagle);
        row5.add(mAC_10);
        row5.add(awp);

        KeyboardRow row6=new KeyboardRow();
        row6.add(back);

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row6,row,row1,row2,row3,row4,row5));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }
    public static ReplyKeyboardMarkup CounterTerroristQurollari(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton pichoq=KeyboardButtonUtil.buttonEmoji("Knife","\uD83D\uDD2A");
        KeyboardButton zeus=KeyboardButtonUtil.buttonEmoji("Zeus","⚡\uFE0F");
        KeyboardButton defuseKit=KeyboardButtonUtil.buttonEmoji("Defuse","✂\uFE0F");

        KeyboardButton usp=KeyboardButtonUtil.buttonEmoji("USP-S","");
        KeyboardButton dualBetters=KeyboardButtonUtil.buttonEmoji("Dual Berettas","");
        KeyboardButton p250=KeyboardButtonUtil.buttonEmoji("P-250","");
        KeyboardButton fiveSeven=KeyboardButtonUtil.buttonEmoji("Five-SevenN","");
        KeyboardButton desert=KeyboardButtonUtil.buttonEmoji("Desert_Deagle","");

        KeyboardButton nova=KeyboardButtonUtil.buttonEmoji("Nova","");
        KeyboardButton xm1014=KeyboardButtonUtil.buttonEmoji("Xm1014","");
        KeyboardButton m5sd=KeyboardButtonUtil.buttonEmoji("Mp5-SD","");
        KeyboardButton p90=KeyboardButtonUtil.buttonEmoji("P90","");
        KeyboardButton mP9=KeyboardButtonUtil.buttonEmoji("MP9","");

        KeyboardButton famas=KeyboardButtonUtil.buttonEmoji("FAMAS","");
        KeyboardButton m4a1=KeyboardButtonUtil.buttonEmoji("M4A1-S","");
        KeyboardButton ssg08=KeyboardButtonUtil.buttonEmoji("SSG-08","");
        KeyboardButton aug=KeyboardButtonUtil.buttonEmoji("AUG","");
        KeyboardButton awp=KeyboardButtonUtil.buttonEmoji("AWP","");

        KeyboardRow row6=new KeyboardRow();
        row6.add(back);

        KeyboardRow row=new KeyboardRow();
        row.add(pichoq);
        row.add(zeus);
        row.add(defuseKit);

        KeyboardRow row1=new KeyboardRow();
        row1.add(usp);
        row1.add(nova);
        row1.add(famas);

        KeyboardRow row2=new KeyboardRow();
        row2.add(dualBetters);
        row2.add(xm1014);
        row2.add(m4a1);

        KeyboardRow row3=new KeyboardRow();
        row3.add(p250);
        row3.add(m5sd);
        row3.add(ssg08);

        KeyboardRow row4=new KeyboardRow();
        row4.add(fiveSeven);
        row4.add(p90);
        row4.add(aug);

        KeyboardRow row5=new KeyboardRow();
        row5.add(desert);
        row5.add(mP9);
        row5.add(awp);

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row6,row,row1,row2,row3,row4,row5));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboardMarkup bombalar1(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton hE=KeyboardButtonUtil.buttonEmoji("HE Grenade","\uD83D\uDCA3 Bombalar");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardButton decoy=KeyboardButtonUtil.buttonEmoji("Decoy Grenade","\uD83D\uDCE2");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row1=new KeyboardRow();
        row1.add(hE);
        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);
        KeyboardRow row5=new KeyboardRow();
        row5.add(decoy);

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row1,row2,row3,row4,row5));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }

    public static ReplyKeyboard kartalar() {
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton cache=KeyboardButtonUtil.buttonEmoji("Cache","");
        KeyboardButton anubis=KeyboardButtonUtil.buttonEmoji("Anubis","");
        KeyboardButton inferno=KeyboardButtonUtil.buttonEmoji("Inferno","");
        KeyboardButton mirage=KeyboardButtonUtil.buttonEmoji("Mirage","");
        KeyboardButton dust=KeyboardButtonUtil.buttonEmoji("Dust II","");
        KeyboardButton nuke=KeyboardButtonUtil.buttonEmoji("Nuke","");
        KeyboardButton ancient=KeyboardButtonUtil.buttonEmoji("Ancient","");
        KeyboardButton train=KeyboardButtonUtil.buttonEmoji("Train","");
        KeyboardButton vertigo=KeyboardButtonUtil.buttonEmoji("Vertigo","");
        KeyboardButton overpass=KeyboardButtonUtil.buttonEmoji("Overpass","");
        KeyboardButton boulder=KeyboardButtonUtil.buttonEmoji("Boulder","");
        KeyboardButton fachwerk=KeyboardButtonUtil.buttonEmoji("Fachwerk","");
        KeyboardButton shelter=KeyboardButtonUtil.buttonEmoji("Shelter","");
        KeyboardButton office=KeyboardButtonUtil.buttonEmoji("Office","");
        KeyboardButton italy=KeyboardButtonUtil.buttonEmoji("Italy","");

        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row1=new KeyboardRow();
        row1.add(cache);
        row1.add(anubis);

        KeyboardRow row2=new KeyboardRow();
        row2.add(inferno);
        row2.add(mirage);

        KeyboardRow row3=new KeyboardRow();
        row3.add(dust);
        row3.add(nuke);

        KeyboardRow row4=new KeyboardRow();
        row4.add(ancient);
        row4.add(train);

        KeyboardRow row5=new KeyboardRow();
        row5.add(vertigo);
        row5.add(overpass);

        KeyboardRow row6=new KeyboardRow();
        row6.add(boulder);
        row6.add(fachwerk);

        KeyboardRow row7=new KeyboardRow();
        row7.add(shelter);
        row7.add(office);
        row7.add(italy);

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row1,row2,row3,row4,row5,row6,row7));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    } public static ReplyKeyboard bombalar0(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardButton decoy=KeyboardButtonUtil.buttonEmoji("Decoy Grenade","\uD83D\uDCE2");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar2(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar3(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar4(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar5(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar6(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar7(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar8(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar9(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar10(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar11(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar12(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar13(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }public static ReplyKeyboard bombalar14(){
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton smoke=KeyboardButtonUtil.buttonEmoji("Smoke Grenade","\uD83D\uDCA8");
        KeyboardButton flashbang=KeyboardButtonUtil.buttonEmoji("Flashbang","⚡");
        KeyboardButton molotov=KeyboardButtonUtil.buttonEmoji("Molotov","\uD83D\uDD25");
        KeyboardRow row=new KeyboardRow();
        row.add(back);

        KeyboardRow row2=new KeyboardRow();
        row2.add(smoke);
        KeyboardRow row3=new KeyboardRow();
        row3.add(flashbang);
        KeyboardRow row4=new KeyboardRow();
        row4.add(molotov);


        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }

    public static ReplyKeyboard skinlar() {
        KeyboardButton back=KeyboardButtonUtil.buttonEmoji("Ortga","⬅\uFE0F");
        KeyboardButton rfl=KeyboardButtonUtil.buttonEmoji("RFL","");
     KeyboardButton skinoz=KeyboardButtonUtil.buttonEmoji("Skinoz","");
     KeyboardButton skinfight=KeyboardButtonUtil.buttonEmoji("Skin fight","");
     KeyboardButton skin=KeyboardButtonUtil.buttonEmoji("Skin chiqarish haqda qisqacha ma'lumot","");
        KeyboardRow row=new KeyboardRow();
        row.add(back);
        KeyboardRow row1=new KeyboardRow();
        row1.add(rfl);
        KeyboardRow row2=new KeyboardRow();
        row2.add(skinoz);
        KeyboardRow row3=new KeyboardRow();
        row3.add(skinfight);
        KeyboardRow row4=new KeyboardRow();
        row4.add(skin);
        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(Arrays.asList(row,row1,row2,row3,row4));
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }
}

