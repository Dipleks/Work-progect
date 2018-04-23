package Swing;
/*Menu - меню*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_13 {
    static JFrame jFrame = getFrame();
    public static void main(String[] args) {
        //Создадим меню в нашем окне:
        JMenuBar jMenuBar = new JMenuBar();

        JMenu file = new JMenu("File"); //добавим меню фаил.
        JMenu edit = new JMenu ("Edit");
        jMenuBar.add(file); //добавим меню в наше окно
        jMenuBar.add(edit);

        file.add(new JMenuItem("Open"));  //так же можем добавить, подчеркивание
                                    //буквы и иконки ("Open", "0", new ImageIcon(""))
        JMenuItem save = file.add(new JMenuItem("Save"));
        save.setEnabled(false); //это сделает меню не активным, true активным.
        file.addSeparator(); //проводим черту в меню после слова Save
        JMenuItem exit = file.add(new JMenuItem("Exit"));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0); //закроем наше приложение при нажатии exit.
            }
        });
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E")); //сделаем доступным
                     //закрытие приложение через горячие клавиши Ctrl + E.


        edit.add(new JMenuItem("Cut"));
        edit.add(new JMenuItem("Copy"));
        //сделаем подменю:
        JMenu options = new JMenu("Options");
        edit.add(options);
        options.add("one");
        options.add("two");

        //также мы можем добавить чекбокс меню:
        edit.add(new JCheckBoxMenuItem("checkbox"));

        //и можем добавить радиабаттон:
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButtonMenuItem jRadioButtonMenuItem1 = new JRadioButtonMenuItem("Radio1");
        JRadioButtonMenuItem jRadioButtonMenuItem2 = new JRadioButtonMenuItem("Radio2");
        buttonGroup.add(jRadioButtonMenuItem1);
        buttonGroup.add(jRadioButtonMenuItem2);
        edit.add(jRadioButtonMenuItem1);
        edit.add(jRadioButtonMenuItem2);

        jFrame.setJMenuBar(jMenuBar); //добавляем меню
        jFrame.revalidate(); //запускаем
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
