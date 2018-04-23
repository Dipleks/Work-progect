package Октябрь_30;

import java.io.Serializable;

public class User implements Serializable{
    int xp; //содзаем жизни героя, которые необходимо сохранить.
    /*implements-им наш класс сеарилизацией.*/
    /*Статические поля никогда не сеарилизуются,
    * например у нас есть статическое значение:*/
    static int b;
    /*Добавляем нашему User sord*/
    //Sord sord;
    /*Если клас Sord не сериализуем, то помечаем его как не сериализуемым:*/
    transient Sord sord;
}
