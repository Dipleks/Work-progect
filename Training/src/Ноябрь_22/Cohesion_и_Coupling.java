package Ноябрь_22;/*Cohesion и Coupling*/

public class Cohesion_и_Coupling {
}
/*Представим у нас есть закусачная в ней есть работники. Работник
* должен приготовить еду, отнести еду, убрать мусор. Если мы запишем все
* дейсвия рабочих в один класс это будет не корректным кодом, он будет работать,
* но будет считься не корректным, т.к каждый класс должен отвечать
* за минимальное число действий, а не за кучу "работников"*/
class Zakusochnay {
    Gotovka gotovka;
    Otnesti otnesti;
    Ubrat ubrat;
}
//class Rabotniki{
//    void gotovka(){}
//    void otnesti(){}
//    void ubrat(){}}
/*В идеале код должен выглядить так:*/
class Gotovka {
    void got(){}}
class Otnesti{
    void otne(){}}
class Ubrat{
    void ur(){}}
/*Тотже пример можно привести с машиной, машина может ехать и тормозить,
* в данном примере, ехать и тормозить будет правельней занести в один общий класс!
* Т.к. если машина едит, то она обязательно будет и тормозить!*/

/*Теперь поговорим о связи (Coupling) между классами, у нас есть класс "А" и "В".
* в классе "А" мы возращаем значение i, а в классе "В" выводим его. Правильным будет
* вывести возращаемое значение, а не присвоеное:*/
class A {
    int i = 5;
    public int getI(){
        return i;
    }}
class B {
    void printL(){
        System.out.println(new A().i); //не правильно!
        System.out.println(new A().getI()); //правильно!
    }
} /*Если сделать нашу int i приватной, то сразу поймем разницу!*/