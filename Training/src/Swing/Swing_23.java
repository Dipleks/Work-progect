package Swing;
/*Custom dialog - настраиваемое диалоговое окно.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Диалоговые окна бывают модальные и немодалные.
* Модальные окна - это окна которые не дают взаимодействовать
* с основным окном до тех пор пока наше диалоговое модальное окно
* активно (принимает значение true)*/
public class Swing_23 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();
    //Создадим наше диалоговое окно:
    static class MyDialog extends JDialog {
        //создаем конструктор с параметрами окна:
        public MyDialog() {
            super(jFrame, "заголовок", true /*мод.окно*/);
            add(new JTextField(), BorderLayout.NORTH); //создаем текстовое поле и задаем его расположение.
            add(new JButton("Кнопка"), BorderLayout.SOUTH); //создаем кнопку и ее раположение.
            setBounds(450, 450, 300, 200); //задаем координаты расположения окна и его размеры.
        }}
    public static void main(String[] args) {
        jFrame.add(jPanel);
        //создвем нашу кнопку и помещаем ее на панель:
        JButton jButton = new JButton("Наша кнопка");
        jPanel.add(jButton);
        //Отображаем наш MyDialog:
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MyDialog myDialog = new MyDialog();
                myDialog.setVisible(true);
            }}); }
    static JFrame getJFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame; }}
