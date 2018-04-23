package Patterns.Patterns_31_36;/*Front Controller
Шаблон проектирования Front Controller (контроллер внешнего вида)
возвращает нас в область более традиционных, серверных шаблонов
проектирования. Front Controller базируется на архитектурном шаблоне
Модель-Представление-Контроллер (MVC), но подгоняется для
Web-приложений корпоративного уровня.
Front Controller является одним из шаблонов проектирования J2EE
от Sun Microsystems. Его основной функцией является создание
централизованно управляемого механизма связи для управления
представлениями страниц.

Представим что наш Patterns_33 это Front Controller*/
import java.util.Scanner;

public class Patterns_33 {
    public static void main(String[] args) {
 //Сделаем переход по нашим страницам (url):
        try(Scanner scanner = new Scanner(System.in)){
            while (scanner.hasNext()){
  /*Сделаем обработку каждого запроса в отдельном потоке:*/
                String nextLine = scanner.nextLine();
                new Thread() {
                    @Override
                    public void run() {
                        new DispatcherServlet().process(nextLine);
                    }
                }.start();
 /*Делать это не обязательно достаточно было написать просто
 * new DispatcherServlet().process(scanner.nextLine()); т.к
 * потоки образуются самостоятельно (по умолчанию!)*/
            } } }}
//Создадим деспатчерсервлет котрому будет передоваться управление:
class DispatcherServlet {
    void process(String url){
        switch (url){
            case "home" : new HomeController().show(); break;
            case "user" : new UserController().show(); break;
            default: new DefaultController().show();
        } }}
//и создадим несколько других контроллеров (подконтроллеров):
class HomeController{
    void show(){ System.out.println("is home"); }}
class UserController{
    void show(){ System.out.println("is user"); }}
class DefaultController{
    void show(){ System.out.println("is error"); }}

