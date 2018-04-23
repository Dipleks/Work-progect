package Swing;
/*WindowListener -данным методом мы можем переопределить
* события нашего окна.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Swing_6 {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        //Вызовим класс WindowListener с его методами
        //для переопределяения событий окна:
        jFrame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent windowEvent) {

            }

            @Override
            public void windowClosing(WindowEvent windowEvent) {

            }

            @Override
            public void windowClosed(WindowEvent windowEvent) {

            }

            @Override
            public void windowIconified(WindowEvent windowEvent) {

            }

            @Override
            public void windowDeiconified(WindowEvent windowEvent) {

            }

            @Override
            public void windowActivated(WindowEvent windowEvent) {

            }

            @Override
            public void windowDeactivated(WindowEvent windowEvent) {

            }
        });
        //И тут мы можем переопределить наши параметры.
        //Для экономии места, можно использовать более короткий код,
        //вызывая методы по отдельности:
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                //и пишем тут свой код
                super.windowClosing(windowEvent);
            }
        });
    }
    static JFrame getFrame (){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
