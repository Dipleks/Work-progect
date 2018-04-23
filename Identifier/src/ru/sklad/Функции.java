package ru.sklad;

public class Функции {
    //public static void main(String[] args) { //main  это и есть наша функция или по другому метод
    //ststic означает что вункция возвращает какое-либо значение
        /*String[] args означает что функция возращает массив аргументов, так же в скобках можно написать др значение
         *кторое нам возвращает функция*/
    // }
    //Если функци ничего не возвращает то мы пишем просто void
    /*void func (int a, int b) {
        int c = a+b;
        System.out.println(c);
    }*/ /*такая функция не выполнится, для того чтоб функция выполнилась необходимо дописать public или privat плюс
         *static. И в методе public static void main прописываем нашу функцию func и здаем параметры*/
    /*public static void main(String[] args) {
        func(12, 56); //теперь функция работает, ответ 68.
    }
    public static void func(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }*/
    //Так же мы можем создать функци которая будет что-то возращать, к примеру вернем int,
    //тогда наша функция примет вид:
    public static void main(String[] args) {
        int d = func(20, 56); //создаем параметр int и присваеваем нашу функцию
        System.out.println(d); //Ответ. 76
    }
    public static int func (int a, int b) { //возращаем int
        int c;
        c = a+b;
        return c;
    }
}
