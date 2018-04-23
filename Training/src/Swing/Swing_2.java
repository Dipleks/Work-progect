package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;
/*Учимся рисовать!*/

public class Swing_2 {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
        //Посмотрим список доступных шрифтов:
        /*String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String s : fonts){
            System.out.println(s); //Ответ: выведется список шрифтов.
        }*/
    }
    //Создадим класс в котором и будем рисовать:
    static class MyComponent extends JComponent {
        //переопределим printComponent:
        @Override
        protected void paintComponent(Graphics graphics) {
            //Выведем надпись в нашем окне:
            Font font = new Font("Times New Roman", Font.BOLD, 20); //название шрифта, тип шрифта, размер шрифта
            //преобразуем наш устаревший метод к новому классу:
            Graphics2D g2 = (Graphics2D) graphics; //с помощью него будем рисовать.
            g2.setFont(font); //передаем наш шрифт.
            g2.drawString("Hello Word!", 20, 20); //выводимая надпись и ее координаты.
  //Font использовать не обязательно, без нго надпись будет выведена в своем стандврте!
            //Нарисуем линию:
            //Line2D l2 = new Line2D.Double(70,70,190,190); //задаем координаты х1,у1,х2,у2
            //Можно передать координаты по точкам:
            Point2D p1 = new Point2D.Double(70,70); //первая точка
            Point2D p2 = new Point2D.Double(190,190); //вторая точка
            Line2D l2 = new Line2D.Double(p1,p2);
            g2.draw(l2); //передадим нашу линию в new MyComponent()
            //Нарисуем элипс:
            Ellipse2D el = new Ellipse2D.Double(70, 70, 190, 190);
            //Ellipse2D el = new Ellipse2D.Double(); //можно задать точками:
            //el.setFrameFromDiagonal(p1,p2); //задаем точки
            g2.draw(el);
            //закрасим наш элипс:
            //g2.setPaint( new Color(120,200, 50)); //задаем цвет в ручную
            g2.setPaint(Color.blue); //выбираем цвет из имеющихся
            //g2.fill(el); //закрашиваем
            //Нарисуем рэктанг:
            Rectangle2D r2 = new Rectangle2D.Double(70, 70, 190, 190);
            g2.draw(r2);
         //Выводим изображения:
   /*         try {
                URL url = new URL("http://www.smartronic.co.uk/wp-content/uploads/2014/10/android-300x300.png"); //передадим ссылку из интернета
                Image image = new ImageIcon(url).getImage(); //передаем наш url
                g2.drawImage(image, 250,70, null);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }*/
   //Или просто передадим нашу ссылу с компьютера:
            Image image = new ImageIcon("D:zappy-768x768.png").getImage();
            g2.drawImage(image, 250,70, null);
        }
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250, dimension.height/2 -150, 500, 300);
        return jFrame;
    }
}
