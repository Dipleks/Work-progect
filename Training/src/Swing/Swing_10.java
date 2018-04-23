package Swing;
/*Текстовые поля JTextField, JPasswordField, JTextArea, ScrollPane*/
import javax.swing.*;
import java.awt.*;

public class Swing_10 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        //создадим текстовую строку:
        //jPanel.add(new JTextField(20)); //зададим размер на 20 символов.
        //создадим название текстового поля:
        /*JLabel jLabel = new JLabel("Текст: ");
        jPanel.add(jLabel); сократим код:*/
        jPanel.add(new JLabel("Текст: "));
        jPanel.add(new JTextField("Введите текст ", 20)); //задаим начальные строки в поле и размер.
        jPanel.revalidate(); //выводит поле.
        //создадим поле для ввода пароля:
        jPanel.add(new JPasswordField(20)); //зададим размер поля.
        jPanel.revalidate(); //выводим поле.
        //создадим текстовое поле:
        JTextArea jTextArea = new JTextArea(5, 20); //5 строчки, 20 символьная ширина.
        jPanel.add(jTextArea);
        //что бы поле не увеличивалось при наборе, дописываем код:
        jTextArea.setLineWrap(true); //запрещает увеличивать поле в ширину.
        JScrollPane jScrollPane = new JScrollPane(jTextArea); //запрещает увеличение поля в высоту.
        jPanel.add(jScrollPane);
        jPanel.revalidate(); //выводим поле.
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
