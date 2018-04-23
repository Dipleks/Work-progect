package Октябрь_23;
                           //Перечисления enum
public class _Enum {
    /*Условие! маленькая чашка коффе стоит 25р., средняя 35р., большая 45р.. Большая бывает "А" класса за 55р. и "В"
    * класса за 45р.. Необходимо создать цену для каждого коффе.*/
    enum Coffe1 {MINI (25), NORMAL (35), MAXI (45) {
        int getCoffe1 (){  //возвращаем для MAXI значение 55
            return 55;}};

    int coffepub;
    Coffe1 (int coffepub){
        this.coffepub = coffepub;}  //используется для ссылки на текущий класс с учетом метода или конструктора
                                    //экземпляра (MINI, NORMAL, MAXI)
    int getCoffe1(){
        return coffepub; }
    }
    public static void main(String[] args) {
        Coffe1 coffe1 = Coffe1.MAXI;  //определяем значение MINI
        Coffe1 coffe11 = Coffe1.MINI; //определяем значение NORMAL
        Coffe1 coffe12 = Coffe1.NORMAL; //определяем значение MAXI

        System.out.println("Стоимость коффе "+coffe11+" равна "+coffe11.coffepub+"руб.");
        System.out.println("Стоимость коффе "+coffe12+" равна "+coffe12.coffepub+"руб.");
        if (coffe1.coffepub<50){System.out.println("Стоимость коффе "+coffe1+" класса В: "+coffe1.coffepub+"руб.");
        }
        if (coffe1.getCoffe1()>50) {System.out.println("Стоимость коффе "+coffe1+" класса А: "+coffe1.getCoffe1()+"руб.");}
    }
}
/*Ответ!
Стоимость коффе MINI равна 25руб.
Стоимость коффе NORMAL равна 35руб.
Стоимость коффе MAXI класса В: 45руб.
Стоимость коффе MAXI класса А: 55руб.*/
