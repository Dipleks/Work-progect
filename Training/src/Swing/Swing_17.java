package Swing;
/*BorderGrid Layout - раположение кнопок по границе окна и по сетки:*/
import javax.swing.*;
import java.awt.*;

public class Swing_17 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        //Расположим по границам:
//        jFrame.add(new JButton("one"), BorderLayout.NORTH);
//        jFrame.add(new JButton("two"), BorderLayout.EAST);
//        jFrame.add(new JButton("three"), BorderLayout.CENTER);
//        jFrame.add(new JButton("four"), BorderLayout.WEST);
//        jFrame.add(new JButton("five"), BorderLayout.SOUTH);

        //Сделаем расположение по сетке:
        jFrame.add(jPanel);
        jPanel.setLayout(new GridLayout(2, 2));
        jPanel.add(new JButton("one"));
        jPanel.add(new JButton("two"));
        jPanel.add(new JButton("three"));
        jPanel.add(new JButton("four"));
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
