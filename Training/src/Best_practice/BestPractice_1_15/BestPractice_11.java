package Best_practice.BestPractice_1_15;/*Как создавать immutable классы*/
/*immutable должны быть финальными:*/
public final class BestPractice_11 {
    /*immutable - это классы значения которых не переопределяемы.*/
    private final int i;

    public BestPractice_11(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
