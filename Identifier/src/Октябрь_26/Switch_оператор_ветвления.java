package Октябрь_26;
public class Switch_оператор_ветвления {
    //Оператор switch это некий аналог оператора if
    //Приведем пример работы оператора switch c примитивом int, с enum и с текстом.
    enum Primer {ONE, TWO, THREE, FOR}
    public static void main(String[] args) {
        Primer primer = Primer.TWO;
        int a = 35;
        String b = "Hello";
        /*switch (a){
            case 2:
                System.out.println(2);
                break;
            case 5:
                System.out.println(5);
                break;
            case 35:
                System.out.println(35);
                break;
            case 3:
                System.out.println(3);
                break;
                /*В данном примере, switch проверяет сначало 1е значение, затем 2е и так до тех пор пока
                * не найдет необходимое, в нашем случае это 35, затем он выводит его консоль.*/
        /*switch (primer){
            case ONE:
                System.out.println(1);
            case THREE:
                System.out.println(3);
            case TWO:
                System.out.println(3);
            case FOR:
                System.out.println(4);
                /*Если мы удалим слово break то на консоль выведутся все значения после TWO, т.е ответ будет 3, 4.*/
        /*switch (b){
            case "2":
                System.out.println(2);
                break;
            case "5":
                System.out.println(5);
                break;
            case "9":
                System.out.println(9);
                break;
            case "3":
                System.out.println(3);
                break;
            default:
                System.out.println("Завершение!");
                break;
                /*Если у нас нет правельного значения, то на консоль ничего не выдется или если мы добавили параметр
                * default, то выведется его значение "Завершение!"*/
        switch (a){
            case 2:
                System.out.println(2);
            default:
                System.out.println("Завершение!");
            case 5:
                System.out.println(5);
            case 9:
                System.out.println(9);
            case 3:
                System.out.println(3);
                /*default можно использовать интересным методом, если его поставить, например, в середениу
                * (или др место), и если у нас отсутствует параметр break, то при отсутствие правельного ответа на
                * консоль выведется значение default и все следующие после значения. Получим ответ:
                * "Завершение!", 5,9,3.*/
        }
    }}
