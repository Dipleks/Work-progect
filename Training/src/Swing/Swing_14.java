package Swing;
/*PopupMenu - выпадающее меню, при нажатии правой кнопкой мыши.*/
import javax.swing.*;
import java.awt.*;

public class Swing_14 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        //создадим меню:
        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.add(new JMenuItem("One")); //добавляем пункты
        jPopupMenu.add(new JMenuItem("Two"));
        jPanel.setComponentPopupMenu(jPopupMenu); //выводим наше меню.
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
