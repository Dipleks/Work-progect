package Swing;
/*MouseListener - действия с помощью мышки.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Swing_9 {
    static JFrame jFrame = getFrame();
    /*static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        //добавим MouseListener, это интерфейс отвечающий за обработку событий мышки.
        //Тут у нас быдут все события связанные с мышкой,
        //но есть код короче, если нам не нужны все события!
       *//* jFrame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
            }
        });*//*
       //Напишем более кородкий код:
        jFrame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
      //тут пишем действия,например, при клике мыши менять цвет
                jPanel.setBackground(Color.black);
            }
        });}*/
    //Сделаем интересней, будем отслеживать координаты мышки:
    public static void main(String[] args) throws Exception{
        JComponent jComponent = new MyComponent();
        jFrame.add(jComponent);
        jFrame.addMouseMotionListener(new MouseAdapter() {
            //преопределяем метод mouseMoved, интерфейса MouseMotionListener
            //который обрабатывает движение мышки:
            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                super.mouseMoved(mouseEvent);
                //берем наши координаты:
                MyComponent.xCoord = mouseEvent.getX();
                MyComponent.yCoord = mouseEvent.getY();
                //вызовем метод repaint, коорый вызывает
                //paintComponent и перерисовывает в нем координаты:
                jComponent.repaint();
            }
        });
    }
    //Создадим класс:
    static class MyComponent extends JComponent{
        //сделавем координаты:
        public static int xCoord;
        public static int yCoord;
        //переопределим метод JComponent:

        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            //выведем наши координаты:
            ((Graphics2D)graphics).drawString("Координаты мышки x: " + xCoord + " y: " + yCoord, 50, 50);
        }
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