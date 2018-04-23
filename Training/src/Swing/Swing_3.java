package Swing;
/*ActionListener*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_3 {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
  //создадим панель для кнопки:
        JPanel jPanel = new JPanel();
  //Добавим нашу панель в наше окно:
        jFrame.add(jPanel);
  //Создадим кнопку:
        JButton jButton = new JButton("submit");
  //Добавим на панель нашу кнопку:
        jPanel.add(jButton);
  //Добавляем действие для нашей кнопки, будем использовать анонимный класс:
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //установим фон при нажатии:
                jPanel.setBackground(Color.blue);
            }
        });
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
