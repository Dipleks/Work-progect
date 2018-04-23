package AWT;
/*Скорость и качество отрисовки фигур*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AWT_8 {
    static JFrame jFrame = getFrame();
    public static void main(String[] args)throws Exception{
        jFrame.add(new MyComponent7());
    }
    static class MyComponent7 extends JComponent {
        @Override
        public void paint(Graphics graphics) {
            //делаем качественную отрисовку, но медленную:
            Graphics2D g2 = (Graphics2D) graphics;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Ellipse2D ellipse2D = new Ellipse2D.Float(50,50,250,250);
            g2.draw(ellipse2D);

            //делаем быструю отрисовку, но не качественную:
            RenderingHints renderingHints = new RenderingHints(null);
            renderingHints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
            g2.setRenderingHints(renderingHints); //<Map>
            Ellipse2D ellipse2D1 = new Ellipse2D.Float(300,50,250,250);
            g2.draw(ellipse2D1);
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
