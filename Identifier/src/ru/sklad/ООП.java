package ru.sklad;

public class ООП {
    /*public class ООП_Person {
    //Для ООП_Person класса мы создаем общие параметры котороые будут использоваться в классе ООП
    int рост; //рост добавляем кадому человеку из ООП
    float вес; //рост добавляем кадому человеку из ООП*/
    //Используем класс ООП_Person

    public static void main(String[] args) {
        ООП_Person max = new ООП_Person();
        max.рост = 175;
        max.вес = 70;

        //Допустим мы захотели добавить дополнительный параметр нашим персонажам:
        //void say (String str) {
        //System.out.println(str);}

        max.say("Мой рост и мой вес: ");
        System.out.println(max.рост+"\n"+ max.вес);

        ООП_Person denis = new ООП_Person();
        denis.рост = 174;
        denis.вес = 71.4f;
        max.say("Мой рост и мой вес: ");
        System.out.println(denis.рост+"\n"+denis.вес);
    }
}
