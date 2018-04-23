package Практические_занятия.On;

import javax.swing.*;
import java.awt.*;

public class Swin {
    public static void main(String[] args) {
        JFrame jF = new JFrame(){};
        jF.setVisible(true);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setTitle("Panel");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jF.setBounds(dimension.width/2-400, dimension.height/2-300, 800, 600);
        jF.add(new Ping());
    }
    static class Ping extends JComponent{
        @Override
        protected void paintComponent(Graphics graphics) {
            Font font = new Font("Times New Roman", Font.ITALIC, 20);
            Graphics2D graphics2D = (Graphics2D)graphics;
            graphics2D.setFont(font);
            graphics2D.drawString("Hello!", 100,100);

        }
    }
}
