package com.one;

public class One {
    public static void main(String[] args) {
        int a=2;
        Two two = new Two();   //Указываем что класс One наследует параметры класса Two.
        System.out.println(a+3+two.b1());

        //Найти сумму всех элементов p, s, b1
        Three three = new Three();  //Указываем что класс One наследует параметры класса Three.

        System.out.println(three.p+three.s+two.b1()); //Добавляем все необходимые значения из класса Two и  Three.
    }
}
//Классы Two и Three.
/* package com.one;
public class Two {
        int b=1;
        int b1() {
            return b;} */

/*package com.one;
public class Three {
        //Дан прямоугольник высота 4см, длина 23см. Найти периметр.
int a = 4;
    int b = 23;
    int p = 2*(a+b);
    int per()
    {return p;}
        //Дан квадрат сторона  равна 16. Найти площадь
    int d = 16;
    int s = d*d;
    int sp() {
        return s;}}*/

