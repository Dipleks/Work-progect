package Patterns.Patterns_16_30;/*Observable*/
//import java.util.Observable;
//import java.util.Observer;
//import java.util.Scanner;
//public class Patterns_23 {
//    public static void main(String[] args) {
//        System.out.println("Enter Text: ");
//        EventSource eventSource = new EventSource();
//        eventSource.addObserver(new Observer() {
//            @Override
//            public void update(Observable observable, Object o) {
//                System.out.println("Received response " + o); }});
//        new Thread(eventSource).start(); }}
//class EventSource extends Observable implements Runnable{
//    @Override
//    public void run() {
//        while (true){
//            String response = new Scanner(System.in).next();
//            setChanged();
//            notifyObservers(response); } }}
import java.util.ArrayList;
import java.util.List;

public class Patterns_23 {
    public static void main(String[] args) {
        Observer observer = new Observer("One");
        Observer observer2 = new Observer("Two");
        observer.setState("new state");
        observer2.setState("hello"); }}

interface Observable{ void update();}

class Observer implements Observable{
    static List<Observer> observers = new ArrayList<>();
    String name;
    String state;
    public Observer(String name) {
        this.name = name;
        observers.add(this); }
    public void setState(String state) {
        this.state = state;
        notifyAllObservers(); }
    void notifyAllObservers(){
        for (Observer observer : observers){
            observer.update(); } }
    @Override
    public void update() {
        System.out.println(name + " change status: " + state); }}