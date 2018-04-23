package Lesson_1;

public class First {
    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 2;
        int a3;
        a3 = a1++ + a2++; //если ++ после переменной, то сначало происходит сложение а1+а2 и зпись в а3,
                          // и после к а1 и а2 прибовляется по еденице.
        System.out.println(a3 + "," + a1 + "," + a2); //3,2,3
        int b1 = 1;
        int b2 = 2;
        int b3;
        b3 = ++b1 + ++b2; //если ++ перед переменной, то сначало к b1 и b2 прибовляется по еденице
                          // и после происходит сложение b1+b2 и зпись в b3,
        System.out.println(b3 + "," + b1 + "," + b2); //5,2,3



        /*Если устновить | - "или" или & - "и", то получим "жадный" метод, т.е. когда будет проверка
        * условия if компилятор проверит все условия и выведет ferst, second, YES! Если || или $$, то
        * проверка закончится на условии удовлеторяющего true-истина*/
        if (getFirst() | getSecond()){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        /*Оператор switch проверяет условие и заходит в тот case номер которого будет соответсововать
        условию, если не написать break, то после выполнения case удовлетворяющего условию следом,
        выполнятся и остальные case+default. default выполнится если не один из case не удовлетворяет условию.*/
        int d = 2;
        String str = "wer";
        switch (str) {
            case "wer": {
                System.out.println("one");
                break;
            }
            case "sdf":{
                System.out.println("two");
                break;
            }
            case "ttt": {
                System.out.println("three");
                break;
            }
            default: {
                System.out.println("default");
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == 3){
                continue; //это слово завершает цикл в этом месте и продолжает его выполнение заново!
            }
            System.out.println("Hello " + i);
            if (i == 5) {
                break; //это слово завершит цикл
            }
        }
        //ответ будет: 0,1,2,4,5
    }

    static boolean getFirst() {
        System.out.println("ferst");
        return true;
    }
    static boolean getSecond() {
        System.out.println("second");
        return false;
    }
}
