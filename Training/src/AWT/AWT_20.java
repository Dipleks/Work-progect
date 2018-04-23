package AWT;/*SystemTray*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Добавим иконки в системный трей.*/
public class AWT_20 {
    public static void main(String[] args) throws Exception{
        //проверяем (SystemTray.isSupported()) поддерживает ли
        //наша операционная система системный трей, и пишем действие:
        if (SystemTray.isSupported()){
            SystemTray tray = SystemTray.getSystemTray();
            Image image = new ImageIcon("D:ic.png").getImage();

            //создадим всплывающее меню для нашей иконки:
            PopupMenu popupMenu = new PopupMenu();
            MenuItem menuItem = new MenuItem("One");
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.out.println("one");
                }
            });
            popupMenu.add(menuItem);
            popupMenu.add("Two");
            popupMenu.add("Three");
            //Запускаем иконку:
            tray.add(new TrayIcon(image, "Значек", popupMenu));
        }
    }
}
