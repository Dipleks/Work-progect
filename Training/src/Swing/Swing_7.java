package Swing;
/*Actions - действия*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Swing_7 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton(new MyAction());//передаем MyAction
        jButton.setText("Цвет!");
        jPanel.add(jButton);
        /*Обычно мы создаем jButton.addActionListener() и
        * пишем в нем действия кнопки, но его нельзя переиспользовать,
        * для этого ипользуем класс AbstractAction.*/
    }
    static class MyAction extends AbstractAction {
        //можно также сделать свой конструктор:
        MyAction(){
            putValue(AbstractAction.SHORT_DESCRIPTION, "Наводим на кнопку!");
    //SHORT_DESCRIPTION позволяет отобразить текст при наведении на кнопку.
        }
        //переропределим:
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            //тут пишем свои действия
            jPanel.setBackground(Color.black);
        }
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
