package Best_practice.BestPractice_1_15;/*Переопределение HashCode*/

import java.util.HashMap;
import java.util.Map;

public class BestPractice_7 {
    int i;
    int x;
    int j = i + x;
    public static void main(String[] args) {
        Map<BestPractice_7, String> map = new HashMap<>();
        map.put(new BestPractice_7(), "one");
        System.out.println(map.get(new BestPractice_7()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BestPractice_7 that = (BestPractice_7) o;
        return i == that.i && x == that.x && j == that.j;
    }
/*Без HashCode наш код работать не будет. Мы получим null, с HashCode получим "one"*/
    @Override
    public int hashCode() {
        //return 12; //с точки зрения производительности так делать нельзя.
        /*наиболее оптимальным будет такое преопределение:*/
        int result = 17;
        result = 31 * result + i;
        result = 31 * result + x;
        return result;
    }
    /*В HashCode должны использоваться теже параметры что и в equals, при этом в
    * HashCode их может быть меньше, но ни как не наоборот! Т.е в HashCode мы можем
    * не использовать "х" например. Параметры типа "j" лучше не использовать вообще,
    * т.к это значение получено из двух предыдущих!*/
}
