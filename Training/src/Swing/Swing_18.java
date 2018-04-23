package Swing;
/*GridBagLayout - это метод позволяющий нарисовать невидимую ячейку
* в которую мы добовляем наши элементы. Т.е. если более простым
* языком, расположение элементов вводится вручную, а не автоматически.*/
import javax.swing.*;
import java.awt.*;

public class Swing_18 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        GridBagLayout gridBagLayout = new GridBagLayout(); //создаем новую разметку.
        jPanel.setLayout(gridBagLayout); //передаем на панель нашу разметку.

        GridBagConstraints g1 = new GridBagConstraints();
        g1.weightx = 0; //сколько клеток будет знамать наше поле по Х.
        g1.weighty = 0; //сколько клеток будет знамать наше поле по Y.
        g1.gridx = 0; //начало расположения нашего поля по Х.
        g1.gridy = 0; //начало расположения нашего поля по Y.
        g1.gridwidth = 2; //сколько клеток будет знамать наше поле по ширине
        g1.gridheight = 2; //сколько клеток будет знамать наше поле по высоте
        /*После того как задали значения выводим на панель, то что нам необходимо
        * в нашем случае это текстовое поле (JTextArea) с высотой 4 и шириной 20*/
        jPanel.add(new JTextArea(4, 20), g1);

        //Создадим 3 кнопки:
        GridBagConstraints g2 = new GridBagConstraints();
        g2.weightx = 0;
        g2.weighty = 0;
        g2.gridx = 2;
        g2.gridy = 0;
        g2.gridwidth = 2;
        g2.gridheight = 1;
        jPanel.add(new JButton("Верхняя кнопка!"), g2);

        GridBagConstraints g3 = new GridBagConstraints();
        g3.weightx = 0;
        g3.weighty = 0;
        g3.gridx = 2;
        g3.gridy = 1;
        g3.gridwidth = 1;
        g3.gridheight = 1;
        jPanel.add(new JButton("Левая"), g3);

        GridBagConstraints g4 = new GridBagConstraints();
        g4.weightx = 0;
        g4.weighty = 0;
        g4.gridx = 3;
        g4.gridy = 1;
        g4.gridwidth = 1;
        g4.gridheight = 1;
        jPanel.add(new JButton("Правая"), g4);

        jPanel.revalidate(); //вызываем наш метод.
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
