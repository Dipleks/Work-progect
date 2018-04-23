package AWT;
/*Transformation - трансформация фигур.*/

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class AWT_5 {
    static JFrame jFrame = getFrame();
    public static void main(String[] args)throws Exception{
        jFrame.add(new MyComponent4());
    }
    static class MyComponent4 extends Component {
        @Override
        public void paint(Graphics graphics) {
            Graphics2D g2 = (Graphics2D) graphics;
            Rectangle2D rectangle2D = new Rectangle2D.Float(50,50,150,150);
            //g2.shear(0.2,0.2); //искажение;
            //g2.scale(2,2); //маштабирование;
            g2.rotate(45); //поворот в радианах;
            //g2.translate(50,50); //сдвиг.
            g2.draw(rectangle2D);
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
