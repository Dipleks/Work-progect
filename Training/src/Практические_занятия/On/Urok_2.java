package Практические_занятия.On;

import javax.swing.*;
import java.awt.*;

public class Urok_2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-300, dimension.height/2-200, 600, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
