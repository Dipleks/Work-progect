package AWT;
/*Transparency - прозрачность фигур.*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class AWT_7 {
    static JFrame jFrame = getFrame();
    public static void main(String[] args)throws Exception{
        jFrame.add(new MyComponent6());
    }
    static class MyComponent6 extends Component {
        @Override
        public void paint(Graphics graphics) {
            Graphics2D g2 = (Graphics2D) graphics;

            Rectangle2D rectangle2D = new Rectangle2D.Float(50,50,100,100);
            Color color = new Color(0, 0, 0); //задаем цвет RGB
            g2.setColor(color);
            g2.fill(rectangle2D);

            Rectangle2D rectangle2D1 = new Rectangle2D.Float(150,50,100,100);
            Color color1 = new Color(0, 0, 0, 0.5f); //задаем цвет RGB и прозрачность (0.5 - 50%)
            g2.setColor(color1);
            g2.fill(rectangle2D1);

            Rectangle2D rectangle2D2 = new Rectangle2D.Float(200,50,100,100);
            Color color2 = new Color(0, 0, 0, 0.1f); //задаем цвет RGB
            /*Можно еще сделать перекрытия фигурами, делается при помощи AlphaComposite:*/
            g2.setComposite(AlphaComposite.SrcOver);
            g2.setColor(color2);
            g2.fill(rectangle2D2);
        }}
    static JFrame getFrame (){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-500, dimension.height/2-300, 1000, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame; }}
