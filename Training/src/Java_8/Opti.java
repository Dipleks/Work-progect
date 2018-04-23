package Java_8;/*Optional*/
/*Для борьбы с NullPointerException в java 8 сделали Optional*/
import java.util.Optional;

public class Opti {
    public static void main(String[] args) {
        Optional<String> optional = getO();
        if (optional.isPresent()){
            System.out.println(optional.get());
        }
    }
    static Optional<String> getO(){
        if (false){
            return Optional.of("Hello");
        }
        //return null; //что бы не получить ошибку, в случае если в нашем
                    //условии мы каки-то образом получаем false, лучше записать так:
        return Optional.empty();
    }
}
