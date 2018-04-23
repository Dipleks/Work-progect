package AWT;
/*Paint изменение цвета, политры и градиента фигур*/
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

public class AWT_4 {
    static JFrame jFrame = getFrame();
    public static void main(String[] args)throws Exception{
        jFrame.add(new MyComponent3());
    }
    static class MyComponent3 extends Component {
        @Override
        public void paint(Graphics graphics) {
            Graphics2D g2 = (Graphics2D)graphics;
            Ellipse2D ellipse2D = new Ellipse2D.Float(100, 100, 700, 400);
            //Сделаем градиентную заливку:
            //g2.setPaint(new GradientPaint(new Point2D.Float(100, 100), Color.red, new Point2D.Float(700, 400), Color.cyan));
            /*координаты 1й точки - цвет начала градиента - координаты 2й точки - цвет конца градиента*/

            //заполнение цветом из фала (например можем заполнить рисунком):
            try {
                g2.setPaint(new TexturePaint(ImageIO.read(new File("D:zappy-768x768.png")), new Rectangle2D.Float(0,0,200,100)));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g2.fill(ellipse2D);
        }}
    static JFrame getFrame (){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-500, dimension.height/2-300, 1000, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame; }}
