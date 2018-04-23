package Patterns.Patterns_31_36;/*Composite Entity (J2EE) -
патерн вэб разработки, позволяет получать объекты не по одному, а все
сразу.*/

public class Patterns_31 {
    public static void main(String[] args) {
        CompositeEntity compositeEntity = new CompositeEntity();
        for (String s : compositeEntity.getData()) {
            System.out.println(s);
        }
    }
}
class DependetObject1{
    String getData(){
        return "one";
    }
}
class DependetObject2{
    String getData(){
        return "two";
    }
}
//теперь сделаем класс который объединит наши объекты:
class CoarseGainedObject {
    DependetObject1 dependetObject1 = new DependetObject1();
    DependetObject2 dependetObject2 = new DependetObject2();
    public String[] getData(){
        return new String[]{dependetObject1.getData(), dependetObject2.getData()};
    }
}
//и создаем наш патерн:
class CompositeEntity{
    CoarseGainedObject coarseGainedObject = new CoarseGainedObject();
    public String[] getData(){
        return coarseGainedObject.getData();
    }
}
