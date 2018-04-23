package Patterns.Patterns_16_30;/*Mediator помогает инкапсулировать и облегчить
общение между объектами!*/
import java.util.ArrayList;
import java.util.List;

public class Patterns_21 {
    public static void main(String[] args) {
        ConkretniMediator conM = new ConkretniMediator();
        conM.add(new ConkretniColegi(conM, "One"));
        conM.add(new ConkretniColegi(conM, "Two"));
        ConkretniColegi cc = new ConkretniColegi(conM, "Three");
        conM.add(cc);
        cc.changeStatus(); }}
interface Mediator{ void requestAll(Colegi colegi);}

class ConkretniMediator implements Mediator{
    List<Colegi> colegis = new ArrayList<>();
    void add(Colegi colegi){
        colegis.add(colegi); }
    @Override
    public void requestAll(Colegi colegi) {
        colegi.setTrue();
        for (Colegi c : colegis){
            if (c != colegi){ c.setFalse(); } } }}

interface Colegi {
    void setFalse();
    void setTrue();
    void changeStatus();}

class ConkretniColegi implements Colegi {
    boolean status;
    Mediator mediator;
    String name;
    public ConkretniColegi(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name; }
    @Override
    public void setFalse() {
        status = false;
        System.out.println(name + " status is false"); }
    @Override
    public void setTrue() {
        status = true;
        System.out.println(name + " status is true"); }
    @Override
    public void changeStatus() {
        mediator.requestAll(this); }}