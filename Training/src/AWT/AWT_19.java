package AWT;/*Запуск других приложений на Вашем компьютере из Java*/

import java.awt.*;
import java.io.File;
import java.net.URI;

public class AWT_19 {
    public static void main(String[] args) throws Exception {
        if (Desktop.isDesktopSupported()){
            //Создаем команду для запуска приложений:
            Desktop desktop = Desktop.getDesktop();
            //просмотрим все доступные команды:
            for (Desktop.Action action : Desktop.Action.values()){
                System.out.println(action);
            }
            //запустим фото:
            if (desktop.isSupported(Desktop.Action.OPEN)){
                desktop.open(new File("D:Картинка.jpg")); //запускается наша программа для просмотра фото.
            }
            //запустим сайт в нашем браузере по умолчанию:
            if (desktop.isSupported(Desktop.Action.BROWSE)){
                desktop.browse(new URI("https://google.com"));
            }
        }
    }
}
