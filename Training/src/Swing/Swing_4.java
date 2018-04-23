package Swing;
/*EventHandler*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class Swing_4 {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("submit");
        jPanel.add(jButton);

        /*jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               jFrame.setTitle(((JButton)actionEvent.getSource()).getText());
            }
        }); данную команду можно упростить в одну строчку:*/
//Вызываем EventHandler в нем create (создаем): класс, объект который измееняем,
//свойство которое хотим получить, далее что хотим вызвать (source) и с каким свойством (text):
        jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "source.text"));
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
