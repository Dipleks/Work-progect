package Ноябрь_22;/*Интерфейсы подробнее*/
/*Интерфейсы имют свойство уневерсальности,
* сравним интерфейс с розеткой. И так, итерфейс -
* розетка, калассы - это техника, мы можем подключить
* утюг, холодильник, чайник, интерфейс всегда нам будет
* отдавать свой метод (электричество). Интерфейс всегда
* абстрактный, имеет всегда только финальные, статические поля; это
* все указывается по умолчанию и писать не надо, например,
* final static int. Наш интерфейс может содержать внутренние классы
* и внутренние интерфейсы, enum и все они будут по умолчанию
* public static!*/
public class Интерфейсы_подробнее {
}

interface Annimal{
    //все данные public static
    int p = 5; //public static final
    enum E {}
    class F {}
    interface J {}
    void method();
}
interface Car {
    void method2();
}
class Dis implements Annimal, Car {
    @Override
    public void method() {
    }
    @Override
    public void method2() {
    }
}