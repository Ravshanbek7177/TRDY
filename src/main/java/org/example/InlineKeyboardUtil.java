package org.example;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.LinkedList;
import java.util.List;

public class InlineKeyboardUtil {


    public static InlineKeyboardMarkup MEny() {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" Chizma va modellar ");
        button.setCallbackData("chizma");

        List<InlineKeyboardButton> row = new LinkedList<>();
        row.add(button);

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Rover stano'klar");
        button1.setCallbackData("rover");

        List<InlineKeyboardButton> row1 = new LinkedList<>();
        row1.add(button1);

        List<List<InlineKeyboardButton>>rowList = new LinkedList<>();
        rowList.add(row);
        rowList.add(row1);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);

        return inlineKeyboardMarkup;
    }
    public static InlineKeyboardMarkup menyu() {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("3D");
        button.setCallbackData("3D");

        List<InlineKeyboardButton> row = new LinkedList<>();
        row.add(button);

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("2D");
        button1.setCallbackData("2D");

        List<InlineKeyboardButton> row1 = new LinkedList<>();
        row1.add(button1);

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("🔁 ORQAGA");
        button2.setCallbackData("_Orqaga1");

        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Asosiy Menyu");
        button3.setCallbackData("Asosiy Menyu");

        List<InlineKeyboardButton>row2 = new LinkedList<>();
        row2.add(button2);
        row2.add(button3);

        List<List<InlineKeyboardButton>>rowList = new LinkedList<>();
        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);

        return inlineKeyboardMarkup;
    }

    public static InlineKeyboardMarkup tayorMen() {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Tayyor 3D modellar");
        button.setCallbackData("modellar");

        List<InlineKeyboardButton> row = new LinkedList<>();
        row.add(button);

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Buyurtama berish");
        button1.setCallbackData("buyurtma");

        List<InlineKeyboardButton> row1 = new LinkedList<>();
        row1.add(button1);

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("🔁 ORQAGA");
        button2.setCallbackData("_Orqaga2");

        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Asosiy Menyu");
        button3.setCallbackData("Asosiy Menyu2");

        List<InlineKeyboardButton>row2 = new LinkedList<>();
        row2.add(button2);
        row2.add(button3);

        List<List<InlineKeyboardButton>>rowList = new LinkedList<>();
        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);

        return inlineKeyboardMarkup;
    }

    public static InlineKeyboardMarkup tayor2DMen() {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Tayyor 2D modellar");
        button.setCallbackData("modellar");

        List<InlineKeyboardButton> row = new LinkedList<>();
        row.add(button);

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("Buyurtama berish");
        button1.setCallbackData("buyurtma");

        List<InlineKeyboardButton> row1 = new LinkedList<>();
        row1.add(button1);

        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("🔁 ORQAGA");
        button2.setCallbackData("_Orqaga3");

        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("Asosiy Menyu");
        button3.setCallbackData("Asosiy Menyu3");

        List<InlineKeyboardButton>row2 = new LinkedList<>();
        row2.add(button2);
        row2.add(button3);

        List<List<InlineKeyboardButton>>rowList = new LinkedList<>();
        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);

        return inlineKeyboardMarkup;
    }

    public static InlineKeyboardMarkup Rover(){

        InlineKeyboardButton menbutton = new InlineKeyboardButton();
        menbutton.setText("PC");
        menbutton.setCallbackData("pc");

        InlineKeyboardButton test = new InlineKeyboardButton();
        test.setText("Boshqaruv pragramma ");
        test.setCallbackData("boshpr");


        List<InlineKeyboardButton> row = new LinkedList<>();
        row.add(menbutton);
        row.add(test);



        InlineKeyboardButton test2 = new InlineKeyboardButton();
        test2.setText("CAD/CAM");
        test2.setCallbackData("cad");

        InlineKeyboardButton test1 = new InlineKeyboardButton();
        test1.setText("Zapchast");
        test1.setCallbackData("zapchas");

        List<InlineKeyboardButton> row2 = new LinkedList<>();
        row2.add(test2);
        row2.add(test1);

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("🔁 ORQAGA");
        button.setCallbackData("_orqaV");

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("\uD83D\uDD1D Asosiy Menyu");
        button1.setCallbackData("_AsosiyM");

        List<InlineKeyboardButton> row4 = new LinkedList<>();
        row4.add(button);
        row4.add(button1);

        List<List<InlineKeyboardButton>>rowlis = new LinkedList<>();
        rowlis.add(row);
        rowlis.add(row2);
        rowlis.add(row4);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowlis);
        return inlineKeyboardMarkup;


    }


}
