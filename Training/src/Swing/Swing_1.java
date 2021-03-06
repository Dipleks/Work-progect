package Swing;
import javax.swing.*;
import java.awt.*;
/*Swing*/
/*Первой попыткой Sun создать графический интерфейс для Java
была библиотека AWT (Abstract Window Toolkit) — инструментарий
для работы с различными оконными средами. Sun сделал прослойку
на Java, которая вызывает методы из библиотек, написанных на С.
Библиотечные методы AWT создают и используют графические
компоненты операционной среды. С одной стороны, это хорошо,
так как программа на Java похожа на остальные программы в рамках
одной ОС. Но при запуске ее на другой платформе могут возникнуть
различия в размерах компонентов и шрифтов, которые будут портить
внешний вид программы.
Чтобы обеспечить мультиплатформенность AWT интерфейсы вызовов
компонентов были унифицированы, вследствии чего их функциональность
получилась немного урезанной. Да и набор компонентов получился
довольно небольшой. Так например, в AWT нет таблиц, а в кнопках
не поддерживается отображение иконок. Тем не менее пакет java.awt
входит в Java с самого первого выпуска и его можно использовать
для создания графических интерфейсов.
Таким образом, компоненты AWT не выполняют никакой "работы". Это
просто «Java-оболочка» для элементов управления той операционной
системы, на которой они работают. Все запросы к этим компонентам
перенаправляются к операционной системе, которая и выполняет всю
работу.
Использованные ресурсы AWT старается освобождать автоматически.
Это немного усложняет архитектуру и влияет на производительность.
Написать что-то серьезное с использованием AWT будет несколько
затруднительно. Сейчас ее используют разве что для апплетов.

Основные концепции SWING
Вслед за AWT Sun разработала графическую библиотеку компонентов
Swing, полностью написанную на Java. Для отрисовки используется
2D, что принесло с собой сразу несколько преимуществ. Набор
стандартных компонентов значительно превосходит AWT по разнообразию
и функциональности. Swing позволяет легко создавать новые компоненты,
наследуясь от существующих, и поддерживает различные стили и скины.
Создатели новой библиотеки пользовательского интерфейса Swing не
стали «изобретать велосипед» и в качестве основы для своей
библиотеки выбрали AWT. Конечно, речь не шла об использовании
конкретных тяжеловесных компонентов AWT (представленных классами
Button, Label и им подобными). Нужную степень гибкости и управляемости
обеспечивали только легковесные компоненты. */
public class Swing_1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //создаем клавиши свернуть, развернуть, закрыть
        //jFrame.setSize(500, 300); //устанавливаем размер окна
        //jFrame.setLocation(500, 400); //устанавливаем расположение окна
        //Вместо setSize и setLocation мы можем использовать:
        //jFrame.setBounds(100, 200, 500, 300);
   //100 - растояние от левого края экравна
   //200 - растояние от верхнего края экрана
   //500 - ширина окна
   //300 - выстоа окна
 /*Что бы наше окно не "летало" по всему экрану, т.е. для его
 * отображения по центру луче использовать такую команду:*/

        Toolkit toolkit = Toolkit.getDefaultToolkit();  //инструмент для работы с приложениями отностися к AWT
        Dimension dimension = toolkit.getScreenSize();//вернем высоту нашего экрана
        //теперь мы можем вывести расчет раположения окна:
        jFrame.setBounds(dimension.width/2-250, dimension.height/2 -150, 500, 300);
        jFrame.setTitle("Моё первое окно!"); //пишем название окна
    }
} //Ответ: после компиляции на экран выведется окно или дестопное приложение!
/*Десктопные приложения – это полнофункциональные программы,
которые работают вне зависимости от других приложений и требуют
наличие оператора. Для их работы необходимы достаточные аппаратные
ресурсы компьютера, само приложение и набор функций для работы с
приложением.*/