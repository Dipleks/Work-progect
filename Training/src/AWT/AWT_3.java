package AWT;
/*Stroke - изминение толщины и стиля линий*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class AWT_3 {
    static JFrame jFrame = getFrame();
    public static void main(String[] args)throws Exception{
        jFrame.add(new MyComponent2());
    }
    static class MyComponent2 extends Component {
        @Override
        public void paint(Graphics graphics) {
            Graphics2D g2 = (Graphics2D)graphics;

            Line2D line2D = new Line2D.Double(200, 100, 500, 100);
            //зададим параметры нашей линии:
            g2.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 10, new float[]{5, 50, 10, 30}, 0));
            /*10 - толщина в пикселах;
            * BasicStroke.CAP_ROUND - концы прямой (закругленные, обрезанные, прямые);
            * BasicStroke.JOIN_MITER - пересечения прямых (закругленные, обрезанные, прямые);
            * 10 - предел митра;
            * массив тире, тире-пробел-тире-пробел...
            * 0 - фаза тире.*/
            g2.draw(line2D);

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
