package Октябрь_26;

public class Цикл_while_и_do {
    //Цикл while очень удобен когда необходимо пройти значение несколько раз, например:
    public static void main(String[] args) {
        int a = 5;
        while (a > 0){
            System.out.println(a);
            a--; //дикрементой мы задаем уменьшения нашего значения на 1 каждый раз как "а" зайдет в цикл до тех пор
                 //пока "а" > 0, т.е ответ: 5, 4, 3, 2, 1.
            /*Цикл while выполняется до тех пор пока значение "иста" ("true")
            * Этим циклом очень удобно проверять массывы.*/
        }
        int[] arr = {3, 8, 22};
        int b = 0;
        while (b < arr.length){
            System.out.println(arr[b]);
            b++; //если не указать инкременту, то значение нулевого индекса 3, будет выводится бесконечно.
        }
        /*do выполняется до тех пор пока значение while является "истина", и оно выполяется минимум 1 раз.*/
        b=0;
        do { System.out.print(arr[b]+" ");
            b++;} while (b < arr.length); //в данном примере do выполнится 3 раза, ответ будет 3, 8, 22; но если
                                          //условие b < arr.length изменить на b > arr.length, то do выполнится
                                          //минимум один раз, ответ будет: 3!
    }

}
