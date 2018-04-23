package Swing;
/*ToolBar - панель инструментов*/
import javax.swing.*;
import java.awt.*;

public class Swing_15 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        //Создадим наше меню:
        JToolBar jToolBar = new JToolBar("title");
        //создадим кнопку и просетаем ее, чтоб при наведении был текст:
        JButton one = new JButton("one");
        one.setToolTipText("First");
        jToolBar.add(one);
        jToolBar.add(new JButton("two"));
        jToolBar.addSeparator(); //разделяет кнопки two и three
        jToolBar.add(new JButton("three"));
        jPanel.add(jToolBar);
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
