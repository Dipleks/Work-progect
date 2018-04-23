package Swing;
/*Компоненты выбора RadioButton, RadioGroup, ComponentBox, Border*/
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Swing_11 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args)throws Exception{
        jFrame.add(jPanel);
        //добавим отметку с помощью галочки:
        jPanel.add(new JCheckBox("выбрать")); //у JCheckBox есть еще методы,
                        //вызываются точкой после JCheckBox("выбрать")
        //добавим выбор:
        JRadioButton jRadioButton1 = new JRadioButton("one"); //создадим 1 баттон
        JRadioButton jRadioButton2 = new JRadioButton("two"); //создадим 2 баттон
        jRadioButton1.setSelected(true); //зададим выбранный баттон по умолчанию (не обязательно)
        ButtonGroup buttonGroup = new ButtonGroup(); //сгруппируем наши баттоны
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        //выведем наши баттоны:
        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);
        //создадим бордер:
        Border border = BorderFactory.createEtchedBorder();
        Border border1 = BorderFactory.createTitledBorder(border, "title"); //помещаем бордер и его название.
        //jPanel.setBorder(border1); //выводим бордер
        //создадим компонент позволяющий делаь\ть множественный выбор из выпадающего списка:
        JComboBox<String> jComboBox = new JComboBox<>();
        //создадим значения:
        jComboBox.addItem("one");
        jComboBox.addItem("two");
        jComboBox.addItem("three");
        jPanel.add(jComboBox); //помещаем список на панель.
        jPanel.setBorder(border1); //выводим список
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
