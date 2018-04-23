package Декабрь_12;/*Assertions - по умолчанию отключены.
На практике используются не всегда. Не обходимы для проверки
приложения на стадии программрования.*/

public class Assertions {
/*Подключим Assertions: Edit Configurations - VM options - "-ea"*/
    public static void main(String[] args) {
        //assert false;
        //Примеры:
/*1*/   int x = 5;
        switch (x){
            case 1: break;
            case 2: break;
            default: assert false; } //после проверки всех кейсов если не будет найдена 5 вылитит эсепшен.

/*2*/   if (true){

        } else if(false){

        }else {assert false;}

/*3*/   assert args.length > 0; //проверяем пришли ли какие-нибудь параметры.
/*4*/   assert args.length > 0 : "test"; //test - можно заменить любым текстом, вылитит вместе с ошибкой!

/*5*/   assert args.length > 0 : getIt(); //тоже что и в примере 4, только будет возвращенное значение.
    }
    static int getIt(){
        return 5;
    }
}
