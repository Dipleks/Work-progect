package lessons.Lessons_1.l3_Инкапсуляция;

public class RunEncap {
    public static void main(String args[]){
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name: " + encap.getName() + " Age: " + encap.getAge());
        /*
        * Получим ответ:
        *   Name: James Age: 20
        * */
    }
}
/*   Преимущества Инкапсуляция:
 * 1) Поля класса могут быть сделаны только для чтения или только для записи.
 * 2) Класс может иметь полный контроль над тем, что хранится в его полях.
 * 3) Пользователям одного класса не знаю, как класс хранит свои данные. Класс может
 *    изменить тип данных поля и пользователям класса не нужно изменить какие-либо данные своего кода.
 *    */
