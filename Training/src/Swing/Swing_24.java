package Swing;
/*File Dialog - диалоговые окна для работы с фалами.*/
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

public class Swing_24 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("Нажми!");
        jPanel.add(jButton);
//Добавим действия:
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Создадим панель выбора файлов:
                JFileChooser jFileChooser = new JFileChooser();
                //Метод определения текущей директории,т.е по умолчанию
                //будет открыто именно указаное место:
                jFileChooser.setCurrentDirectory(new File("D:"));
                //Метод выделения файлов, т.е. например при сохранении файла,
                //в поле имени автоматически будет отображаться данное расширение файла:
                //jFileChooser.setSelectedFile(new File(".txt"));
        //Метод определения возможности выделения нескольких файлов:
                jFileChooser.setMultiSelectionEnabled(true);
  //Метод определения выделяемых объектов - файлы, директории или файлы с директориями:
                jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                //Добавим фильтры (по умолчанию указано All Files):
                jFileChooser.setFileFilter(new FileFilter() {
                    @Override
                    public boolean accept(File file) {
                        if (file.getName().endsWith("png")){
                            return true;
                        }
                        return false;
                    }

                    @Override
                    public String getDescription() {
                        return "only png files";
                    }
                });
                //Можем добавить текстовое поле:
                JTextField jTextField = new JTextField("Не доступно!", 50);
//                jFileChooser.add(jTextField, BorderLayout.WEST);

                //Для опеределения свойств файла (например можно настрить:
                //при нажатии на jpg-фаил его отоборажение в миниатюре с лева)
//                jFileChooser.addPropertyChangeListener(new PropertyChangeListener() {
//                    @Override
//                    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
//                        jTextField.setText(propertyChangeEvent.getNewValue().toString());
//                    }
//                });

                /*Эти команды заключительные:*/
                //Отобразим диалоговое окно файлов "Открыть":
                jFileChooser.showOpenDialog(jPanel);
                //Отобразим диалоговое окно файлов "Сохранить":
                //jFileChooser.showSaveDialog(jPanel);
                //Отобразим диалоговое окно файлов со своей кнопкой:
                //jFileChooser.showDialog(jPanel, "Моя кнопка");
            }
        });
        jPanel.revalidate();
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
