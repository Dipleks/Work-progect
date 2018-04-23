package Swing;
/*Dialogs - диалоги!
* Создадим диологовые окна при нажатии на кнопку.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_22 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("Нажми и увидешь окно!");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //JOptionPane.showMessageDialog(jPanel, "Мой диалог", "Заголовок", JOptionPane.ERROR_MESSAGE);
                //JOptionPane.showConfirmDialog(jPanel, "Мой диалог", "Заголовок", JOptionPane.OK_CANCEL_OPTION);
                //JOptionPane.showOptionDialog(jPanel, "Сообщение", "Заголовок", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"one","two","three"},"two");
                JOptionPane.showInputDialog(jPanel, "Введите текст!");
            }
        });

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
