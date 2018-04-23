package Best_practice.BestPractice_1_15;/*Минимизируйте accessibility*/

import java.awt.*;

public class BestPractice_10 {
    private int i;
    public static void main(String[] args) {
        Point point;
    }
/*Все переменные всегда нужно делать приватными, за исключением когда нам
* необходимы другие доступы к переменной. Все классы всегда должны знать минимум друг о друге,
* и иметь доступ друг к другу, например через геторы.*/
    public int getI() {
        return i;
    }
}
