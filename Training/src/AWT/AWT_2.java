package AWT;
/*Areas - обрезание фигур.*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class AWT_2 {
    static JFrame jFrame = getFrame();
    public static void main(String[] args)throws Exception{
        jFrame.add(new MyComponent1());
    }
    static class MyComponent1 extends Component {
        @Override
        public void paint(Graphics graphics) {
            Graphics2D g2 = (Graphics2D)graphics;
            //Создаем 1ю фигуру:
            Area area = new Area(new Rectangle2D.Float(0,0,150,150));

            //Создаем 2ю фигуру, которая объединится с 1й:
            //area.add(new Area(new Ellipse2D.Float(50,50,200,200)));

            //Вычтим из 1й фигуры 2ю:
            //area.subtract(new Area(new Ellipse2D.Float(50,50,200,200)));

            //Оставляем общее поле двух фигур:
            //area.intersect(new Area(new Ellipse2D.Float(50,50,200,200)));

            //Оставляем все поля фигур кроме общего:
            area.exclusiveOr(new Area(new Ellipse2D.Float(50,50,200,200)));

            g2.fill(area);
        }
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
