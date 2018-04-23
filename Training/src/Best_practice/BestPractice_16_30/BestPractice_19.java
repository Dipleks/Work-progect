package Best_practice.BestPractice_16_30;/*Чем Enum лучше констант*/

public class BestPractice_19 {
    //создадим несколько констант:
    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMICH = 2;

    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;
  /*Если наши константы приватные, то все нормально, но если как в нашем случае они
  * публичные, то может возникнуть ряд проблем!*/
    public static void main(String[] args) {
        int i = (APPLE_FUJI - ORANGE_TEMPLE)/APPLE_PIPPIN;

    }
}
/*1. Энамы логически соеденены вместе.
* 2. Как в случае с константами, мы никогда не будем сравнивать яблоки с апельсинами.
* 3. Тажке без проблем мы можем пробежаться по ним.
* 4. Энамы помогают решать подобные проблемы: int i = (APPLE_FUJI - ORANGE_TEMPLE)/APPLE_PIPPIN,
*    когда мы пытаемся из яблок вычисть апельсины.
* 5. Они финальные, синглтоны, имплементят комперебл и сериалайзебл, не экстендят другие классы,
*    но имплементят интерфейсы, а так же являются инъюдебл.*/
enum Apple {FUJI, PIPPIN, GRANNY_SMICH}
enum Orange {NAVEL, TEMPLE, BLOOD}
