package AWT;/*Работа с буфером обмена, основы, копирование строк*/

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;

public class AWT_15 {
    public static void main(String[] args) throws Exception {
        //Получим инструменты для работы с буфером обмена:
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        //Поместим в буфер обмена текст:
        StringSelection stringSelection = new StringSelection("Hello!");
        //Достнеим из буфера наше значение:
        clipboard.setContents(stringSelection, null);
        //После выполнения программы, мы можем вставить наше значение, ПКМ-Втавить.

        //Этим кодом мы можем доставать информацию из буфера:
        DataFlavor dataFlavor = DataFlavor.stringFlavor;
        if (clipboard.isDataFlavorAvailable(dataFlavor)) {
            System.out.println(clipboard.getData(dataFlavor));
        }
    }
}
