package FX;/*Пропертя в javaFX, это как бы обертка над обертками
* т.е int имеет обетку Integer а она в свою очередь имеет IntegerProperty*/

import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class FX_5 {
    public static void main(String[] args) {
        /*Они бывают Simple (можно и гетать и сетать) и ReadOnly (можно только гетать)*/
        IntegerProperty integerProperty = new SimpleIntegerProperty(5);
        IntegerProperty integerProperty2 = new ReadOnlyIntegerWrapper(5);

        //Мы можем их складывать, вычитать, умножать...:
        //System.out.println(integerProperty.add(integerProperty2).getValue()); //Ответ: 10
        //Можно так же использовать непосредственно знаки:
        IntegerBinding integerBinding = new IntegerBinding() {
            {
                super.bind(integerProperty, integerProperty2);
            }
            @Override
            protected int computeValue() {
                return integerProperty.get() + integerProperty2.get();
            }
        };
        System.out.println(integerBinding.get()); //Ответ: 10
        //можем переопределить:
        integerProperty.set(1);
        System.out.println(integerBinding.get()); //Ответ: 6

//        integerProperty.set(6); //мы можем засетать
//        System.out.println(integerProperty.get()); //можем получить

        //Так же можно добавить лисенеры, которые будут менять значения:
//        integerProperty.addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//                System.out.println("new value = " + newValue);
//            }
//        });

        /*Мы можем забиндить значения.*/
        integerProperty.bind(integerProperty2);
        //Тепрь если мы засетаем integerProperty2, то и integerProperty поменяется:
        integerProperty2.set(6);
        //System.out.println(integerProperty.get());
        /*Бинд связывает значения в одну сторону, т.е
        * засетать integerProperty мы теперь не сможем:*/
        //integerProperty.set(7); //получим ошибку!
        /*Для того что бсетать в обе строны мы должны задать:*/
        //integerProperty.bindBidirectional(integerProperty2);
    }
}
class User{
    //прелесть этих обертов том что преопределив мы получаем гетеры и сетеры:
    StringProperty stringProperty = new SimpleStringProperty("Denis");

    public String getStringProperty() {
        return stringProperty.get();
    }

    public StringProperty stringPropertyProperty() {
        return stringProperty;
    }

    public void setStringProperty(String stringProperty) {
        this.stringProperty.set(stringProperty);
    }
}
