package Patterns.Patterns_1_15;/*Adapter - превращает (адаптирует) старый интерфейс
в новый! Помещает его в "обертку"*/

public class Patterns_9 {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washCar(new Audii());
//Теперь мы сможем поместить на нашу мойку трек:
        carWash.washCar(new TrackWrap(new MyTreak())); }}

//Допустим у нас есть машина, и она может мыть себя:
interface Carr{ void wash();}

//И есть мойка машин:
class CarWash {
    public void washCar (Carr carr){ carr.wash(); }}

//создадим машину:
class Audii implements Carr {
    @Override
    public void wash() { System.out.println("wash car"); }}

//Но дупустим у нас есть еще машина, но методы мойки у нее другие:
interface Track{
    void clean();}

/*Теперь нам необходимо каким-то образом помыть машину нашей мойкой
* carWash.washCar(new Audii());*/
class MyTreak implements Track{
    @Override
    public void clean() { System.out.println("Track is clear"); }}

/*Проблем заключает в том что CarWash не принимает carWash.washCar(new Track())
* Тут нам поможет патернт адаптация:*/
/*Создаем отдельный класс который будет являтся врапером (оберткой):*/
class TrackWrap implements Carr{
    Track track;
//создадим конструктор
    public TrackWrap(Track track) { this.track = track; }
    @Override
    public void wash() {
        //вызовем у трека клеан:
        track.clean(); }}