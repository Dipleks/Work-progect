package Swing;
/*Custom Layout - пользовательский мекет.
* Создаем свой макет!*/
import javax.swing.*;
import java.awt.*;

public class Swing_20 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        //Приведем пример на кнопках:
        /*Например, у нас задача расположить 3 кнопки от
        * левого верхнего края к нижнему праваму.*/
        jFrame.add(jPanel);
        jPanel.setLayout(new MyLayout());
        jPanel.add(new JButton("One"));
        jPanel.add(new JButton("Two"));
        jPanel.add(new JButton("Three"));
    }
    /*Создаем класс и имплементим интерфейс LayoutManager
    * и переопределяем его методы, использовать будем только
    * layoutContainer*/
    static class MyLayout implements LayoutManager{
        @Override
        public void addLayoutComponent(String s, Component component) {
        }
        @Override
        public void removeLayoutComponent(Component component) {
        }
        @Override
        public Dimension preferredLayoutSize(Container container) {
            return null;
        }
        @Override
        public Dimension minimumLayoutSize(Container container) {
            return null;
        }
        @Override
        public void layoutContainer(Container container) {
            //Создадим цикл для наших кнопок:
            for (int i = 0; i < container.getComponentCount(); i++) {
                //получаем компонент:
                Component component = container.getComponent(i);
                component.setBounds(i*100, i*50, 100, 50);
            }
        }
    }
    static JFrame getJFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
