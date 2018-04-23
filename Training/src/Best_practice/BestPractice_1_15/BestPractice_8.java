package Best_practice.BestPractice_1_15;/*Переопределение clone*/

import java.util.Date;

public class BestPractice_8 implements Cloneable {
    /*исключения рекомендуется помещать в try, а не в шапку
    * это будет рассомтренно отдельно!*/
/*Создадим конструктор, минус клонирования в том, что при клонировании конструктора уже не будет!
* Так же если мы создадим объекты которые будут являтся приватными и финальными,
* то их склонировать у нас уже не получится!*/
//    public BestPractice_8() {
//        System.out.println("construktor");}

    /*Вместо клона можно сделать подобный конструктор, что может избавить от ряда проблем клона:*/
    public BestPractice_8(BestPractice_8 bestPractice_8) {
        this.objects = bestPractice_8.objects;
        date = new Date();
        this.i = bestPractice_8.i;
    }

    private Object[] objects;
    private Date date;
    int i;
    public static void main(String[] args) throws CloneNotSupportedException {
//        BestPractice_8 bestclone = new BestPractice_8();
//        BestPractice_8 clone = bestclone.clone();
//        //требования к клону:
//        System.out.println(bestclone != clone);
//        System.out.println(bestclone.getClass() == clone.getClass());
//        System.out.println(bestclone.equals(clone)); //не абсолютное требование.
    }
    //Теперь клонируем этот класс:

    @Override
    protected BestPractice_8 clone() throws CloneNotSupportedException {
            return (BestPractice_8)super.clone();
    }
}
