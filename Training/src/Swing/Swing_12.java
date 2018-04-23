package Swing;
/*Sliders - ползунки*/
import javax.swing.*;
import java.awt.*;

public class Swing_12 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        //Добавим полузнок:
        /*Зададим расположение, 0 - начало, 100 - конец, 20 - исхлдное положение*/
        JSlider jSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
        jPanel.add(jSlider);
        //проставим разметку:
        jSlider.setMinorTickSpacing(10);
        jSlider.setMajorTickSpacing(20);
        jSlider.setPaintTicks(true); //нарисуем
        jSlider.setSnapToTicks(true); //автоматически примагнится к ближайшему дилению после перемещения.
        jSlider.setPaintLabels(true); //нанесем разметку делений.
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
