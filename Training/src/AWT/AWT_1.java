package AWT;
/*Shapes
* Научимся формиовать фигуры.*/
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class AWT_1 {
    static JFrame jFrame = getFrame();
    public static void main(String[] args)throws Exception{
        jFrame.add(new MyComponent()); //передаем наш класс в наше окно.
    }
    static class MyComponent extends Component{
        @Override
        public void paint(Graphics graphics) {
            Graphics2D g2 = (Graphics2D)graphics;

            //Нарисуем линию:
            Line2D line = new Line2D.Double(50, 0, 100, 50);
            g2.draw(line); //рисуем.

            //Нарисуем ректангл (четырехугольник):
            Rectangle2D rectangle2D = new Rectangle2D.Float(100, 0, 100, 50);
            g2.draw(rectangle2D);

            //Нарисуем четырехугольник с закругленными краями:
            RoundRectangle2D roundRectangle2D = new RoundRectangle2D.Float(200, 0, 100, 50, 20, 20);
            /*200, 0 - координаты 1й точки; 100, 50 - координаты 2й точки;
            * 20 - угол закругления верхнего и нижнего краев; 20 - угол закругления левого и правого краев.*/
            g2.draw(roundRectangle2D);

            //Нарисуем элипс:
            Ellipse2D ellipse2D = new Ellipse2D.Double(300, 0, 100, 50);
            /*Рисуется невидимый прямоугольник по координатам
            * и в него помещается элипс.
            * 300, 0 - координаты левой верхней точки;
            * 100, 50 - координаты нижней правой точки.*/
            g2.draw(ellipse2D);

            //Рисуем парабалическую кривую:
            QuadCurve2D quadCurve2D = new QuadCurve2D.Float(400, 0, 425, 100, 450, 0);
            /*400, 0 - координата первой точки;
            * 425, 100 - координаты вершины парабалы;
            * 450, 0 - координаты 2й точки.*/
            g2.draw(quadCurve2D);

            //Рисуем кривую:
            CubicCurve2D cubicCurve2D = new CubicCurve2D.Float(450, 50, 475, 150, 525, -50, 550, 50);
            /*450, 50 - 1я точка;
            * 475, 150 - точка 1й вершины кривой;
            * 525, -50 - точка 2й вершины кривой;
            * 550, 50 - 2я точка.*/
            g2.draw(cubicCurve2D);

            //Рисуем дугу:
            Arc2D arc2D = new Arc2D.Float(0, 100, 100, 100, 0, 90, Arc2D.PIE);
            /*Рисуется подобно элипсу:
            * 0, 100 - 1я точка невидимого прямоугольника;
            * 100, 100 - 2я точка;
            * 0 - угол поворота первой линии;
            * 90 - угол поворота второй линии;
            * Arc2D.PIE - тип линии (есть 3 типа: изогнутая, прямая, без линии).*/
            g2.draw(arc2D);

            //Произвольный рисунок:
            GeneralPath generalPath =new GeneralPath();
            generalPath.moveTo(100, 100); //точка
            generalPath.lineTo(200, 100); //линия
            generalPath.quadTo(250, 200, 300, 100); //парабала
            generalPath.curveTo(325, 200, 375, 0, 400, 250); //кривая
            generalPath.closePath(); //метод замыкающий начало и конец (1ю точку и последнею)

            //Мы можем использовать draw для отрисовки или fill для заполнения:
            g2.fill(generalPath);
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
