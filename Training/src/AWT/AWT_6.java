package AWT;
/*Clip - Обрезание фигур*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class AWT_6 {
    static JFrame jFrame = getFrame();
    public static void main(String[] args)throws Exception{
        jFrame.add(new MyComponent5());
    }
    static class MyComponent5 extends Component {
        @Override
        public void paint(Graphics graphics) {
            Graphics2D g2 = (Graphics2D) graphics;
            Rectangle2D rectangle2D = new Rectangle2D.Float(100,100,350,350);
            Ellipse2D ellipse2D = new Ellipse2D.Float(50,50, 700, 400);
            g2.clip(ellipse2D); //clip - обрезает этой фигурой.
            g2.fill(rectangle2D);

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
