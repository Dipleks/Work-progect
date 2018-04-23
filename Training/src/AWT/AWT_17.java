package AWT;/*DragAndDrop - перенос выделеного цвета
из одного поля или окна в другое. (перетягиваем, зажимаем
Ctrl и перетягиваем, зажимаем Ctrl+Alt и перетягиваем.*/
import javax.swing.*;
import java.awt.*;

public class AWT_17 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args)throws Exception{
        jFrame.add(jPanel);
        JTextField jTextField = new JTextField(10);
        JTextField jTextField2 = new JTextField(10);
        //Разрешаем DragAndDrop:
        jTextField.setDragEnabled(true);
        jTextField2.setDragEnabled(true);
        jPanel.add(jTextField);
        jPanel.add(jTextField2);
        jPanel.revalidate();
    }
    static JFrame getFrame (){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-500, dimension.height/2-300, 1000, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
