package Swing;
/*KeyStroke*/
/*KeyStroke представляет ключевое действие на клавиатуре, или
эквивалентном устройстве ввода. KeyStrokes может соответствовать
только нажатию или выпуску определенного ключа, как KEY_PRESSED
и KeyEvents KEY_RELEASED делают; поочередно, они могут соответствовать
вводу определенного символа Java, так же, как KEY_TYPED, который
делают KeyEvents. Во всех случаях KeyStrokes может определить
модификаторы (высокий звук, сдвиг, управление, meta, altGraph,
или комбинация этого), который должен присутствовать во время
действия для точного совпадения. */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Swing_8 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        AbstractAction myAction = new MyAction();
        JButton jButton = new JButton(new Swing_7.MyAction());
        jButton.setText("Цвет!");
        jPanel.add(jButton);

        //Создадим сочитание клавишь, которое будет менять
        //цвет фона нашего окна (альтернатива нажатия кнопки "Цвет!"):
        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B");
  //задаем область в нашем окне где будет работать наше сочетание.
  //Если у нас есть область меню или рабочей области, то при
  //наведении мышки в эту область или при переходе в эту область
  //будет работать наше сочетание. Или можно сразу задать
  //выполнение сочитания клавишь во всей области.
        InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(keyStroke, "changeColor");
        ActionMap actionMap = jPanel.getActionMap();
        actionMap.put("changeColor", myAction);
    }
    static class MyAction extends AbstractAction {
        MyAction(){
            putValue(AbstractAction.SHORT_DESCRIPTION, "Наводим на кнопку!");
        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            jPanel.setBackground(Color.black);
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
