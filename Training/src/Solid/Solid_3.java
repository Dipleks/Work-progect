package Solid;/*Open Close principle
При́нцип откры́тости/закры́тости (англ. The Open Closed Principle, OCP) — принцип ООП,
устанавливающий следующее положение: «программные сущности
(классы, модули, функции и т. п.) должны быть открыты для расширения,
но закрыты для изменения».*/

//public class Solid_3 {
//    public static void main(String[] args) {
//        Tayota tayota = new Tayota();
//        workInTaxi(tayota);}
//    //у нас есть клиент, работа в такси:
//    static void workInTaxi(Tayota tayota){ tayota.getPassengers();}}
////у нас есть тйота и мы хотим чтоб она работала такси.
//class Tayota {
//    void getPassengers(){System.out.println("get passengers");}}
/*Но этот код хоть и рабочий, но неправильный если учитывать 5 правил написания кода.
* Т.к. наш код не расширяем! Если кнам придет клиент и захочет что-либо добавить, то
* это уже не получится! Например, он хочет чтоб в нашем атопрке была 2х дверная машина,
* а она может принять только одного пасажира! Из-за этого нам приходится переписать весь код:*/
//public class Solid_3 {
//    public static void main(String[] args) {
//        Celica celica = new Celica();
//        workInTaxi(celica);}
//    //у нас есть клиент, работа в такси:
//    static void workInTaxi(Tayota tayota){
//        if (tayota instanceof Celica){ tayota.getPassenger();
//        } else { tayota.getPassengers();}}}
////у нас есть тйота и мы хотим чтоб она работала такси.
//class Tayota {
//    void getPassengers(){System.out.println("get passengers");}
//    void getPassenger(){System.out.println("get one passengers");}}
//class Celica extends Tayota{ }

/*Вроде опять все замечательно все работает, но это опять все не правильно
* завтра приходит новое требоваание и опять все менять!
* Теперь сделаем как должно быть, т.е сделаем его расширяемым:*/
public class Solid_3 {
    public static void main(String[] args) {
        Celica celica = new Celica();
        workInTaxi(celica); }
    static void workInTaxi(Car car){ car.workInTaxi(); }}

interface Car { void workInTaxi();}

class Tayota implements Car{
    void getPassengers(){ System.out.println("get passengers"); }
    @Override
    public void workInTaxi() { getPassengers(); }}

class Celica implements Car{
    void getPassenger(){ System.out.println("get one passengers"); }
    @Override
    public void workInTaxi() { getPassenger(); }}

/*Когда мы используем классы, то главный класс знает о подклассе и управляет им
* а подкласс не знает об гл.классе, получается одностороняя связь (main -> class)
* Для того чтоб такого не было, нужно пользоваться интерфейсами, тогда гл.класс
* будет знать об интерфейсе, подкласс будет знать об интерфейсе, интерфейс не знает об
* классах и будет являтся как бы мостом: (main -> interface <- class)*/

