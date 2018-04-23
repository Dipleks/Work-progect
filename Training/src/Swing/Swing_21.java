package Swing;
/*Focus*/
import javax.swing.*;
import java.awt.*;

public class Swing_21 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
 /*Кнопкой Tab мы можем в приложениях переключатся между кнопками,
 * по у молчанию фокус стоит слева на право и сверху вниз, мы можем,
 * поменять начальный фокус и при желании можем убрать определенные
 * элементы с фокуса!*/
        jFrame.add(jPanel);
        jPanel.add(new JButton("ONE"));
        jPanel.add(new JButton("TWO")).setFocusable(false); //заперещаем фокус.
        jPanel.add(new JButton("THREE")).requestFocusInWindow(); //задаем начальный фокус
    }
    static JFrame getJFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
