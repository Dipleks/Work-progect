package Ноябрь_28;

import java.lang.annotation.*;

public class Аннотации {
    public static void main(String[] args) {
        /*Все что начинается с @ называется аннотициями!*/
    }
}
@Deprecated //можем добавить куда угодно в класс, метод, значение...
    @MyAnn()
class MyClass {
    @Deprecated
    int i;
    @Deprecated
    MyClass(){

    }
    @Deprecated
    public void method(@Deprecated int i1){

    }
}
//Можно создать свою аннотацию:
//@interface MyAnn {
//    //можем прописать в ней свои параметры:
//    boolean run() default true;
//    int i() default  1; // но при применении этой аннотации необходимо указать переменную i.
//    //если задать int i default то указывать переменную не нужно.
//    //Но все default значения можно переопределить.
//    String value();}

class MyClass2 extends MyClass{}

//Мы можем ограничивать аннотации:
@Inherited //если не будет этой аннтоции, то MyAnn применится только к классу MyClass, а если ее ввести, то
           //применится и классу MyClass2
@Retention(RetentionPolicy.RUNTIME) //эта анотация говорит когда будет виден MyAnn.
//@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE}) //эта аннотация говорит к чему именно будет
                                           //пременён наш MyAnn (класс, метод и т.д)
@interface MyAnn {
    boolean run() default true;
    int i() default  1;
}