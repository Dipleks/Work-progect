package Ноябрь_21;/*Robot*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

/*Этот класс используется, чтобы генерировать собственные
системные входные события в целях автоматизации тестирования,
саморабочих демонстрационных примеров, и других приложений,
где управление мыши и клавиатуры необходимо. Основная цель
Робота состоит в том, чтобы облегчить автоматизированное
тестирование реализаций платформы Java. */
public class Robot_u {
    static JFrame jFrame = getFream();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("one");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jFrame.setTitle(jFrame.getTitle()+"1");
            }
        });
        jPanel.add(jButton);
        JButton jButton2 = new JButton("two");
        jPanel.add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
                GraphicsDevice device = environment.getDefaultScreenDevice();
                try {
                    //Создаем робота:
                    Robot robot = new Robot(device);
                    //Присваеваем координаты курсору мышки:
                    robot.mouseMove(750-70,250-10);
                    //Задаем: нажать первую (левую) кнопку:
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    //Задаем: отпустить первую (левую) кнопку:
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    //Автоматическо переключение Tab:
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);

                    //Робот делает скриншот экрана (зададим по размеру):
                    Rectangle rectangle = new Rectangle(0, 0, 1000, 1000);
                    BufferedImage image = robot.createScreenCapture(rectangle);
                } catch (AWTException e) {
                    e.printStackTrace();
                }
            }
        });
        jPanel.revalidate();

    }
    static JFrame getFream (){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
