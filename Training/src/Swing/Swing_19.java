package Swing;
/*No Layout*/
import javax.swing.*;
import java.awt.*;

public class Swing_19 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
/*Если мы не хотим использовать ни каких Layout, то можно
* прописать все кнопки вручную, но при этом при этом мы
* теряем все приимущества лаутов, т.е если мы будем пердвигать
* наше окно маштобированием (за уголки), то наши элементы не будут
* перемещаться, а будут иметь фиксированные координаты.
* Приведем пример с кнопкой:*/
        jPanel.setLayout(null); //указываем что у нас нет лаутов.
        JButton jButton = new JButton("ONE");
        //указываем координаты в пикселах и размеры кнопки в пикселах:
        jButton.setBounds(50, 50, 100, 40);
        jPanel.add(jButton);
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
