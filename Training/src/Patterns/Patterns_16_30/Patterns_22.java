package Patterns.Patterns_16_30;/*Momento позволяет сохранить
статус объкта в другой объект.*/

public class Patterns_22 {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("one");
        CareTaker careTaker = new CareTaker();
        careTaker.setMomento(originator.creatMomento());
        originator.setState("two");
        originator.getDataFromMomento(careTaker.getMomento());
        System.out.println(originator.getState()); }}

class CareTaker {
    Momento momento;
    public Momento getMomento() { return momento; }
    public void setMomento(Momento momento) { this.momento = momento; }}

class Originator{
    String state;
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    Momento creatMomento(){ return new Momento(state); }
    void getDataFromMomento(Momento momento){
        this.state = momento.getState(); }}

class Momento{
    String state;
    public Momento(String state) { this.state = state; }
    public String getState() { return state; }}
