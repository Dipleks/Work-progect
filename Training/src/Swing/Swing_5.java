package Swing;
/*LookAndFeel*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_5 {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
//Мы можем посмотреть список стандартных окон которые нам предлагает java:
//        UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
//        for (UIManager.LookAndFeelInfo lookAndFeelInfo : lookAndFeelInfos){
//            System.out.println(lookAndFeelInfo.getName());
//            System.out.println(lookAndFeelInfo.getClassName());}
        //Добавим для примера 5 кнопок:
        JButton jButton1 = new JButton("Metal");
        JButton jButton2 = new JButton("Nimbus");
        JButton jButton3 = new JButton("CDE/Motif");
        JButton jButton4 = new JButton("Windows");
        JButton jButton5 = new JButton("Windows Classic");
        //Добавим их на панель:
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton5);
        //Добавим обработчики наших кнопок:
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
         //передаем наш класс, полученный из lookAndFeelInfo.getClassName():
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    //передаем наш класс, полученный из lookAndFeelInfo.getClassName():
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    //передаем наш класс, полученный из lookAndFeelInfo.getClassName():
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
            }
        });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    //передаем наш класс, полученный из lookAndFeelInfo.getClassName():
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
            }
        });
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    //передаем наш класс, полученный из lookAndFeelInfo.getClassName():
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
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
