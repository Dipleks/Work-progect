package lessons.Lessons_1.l7_Серализация;

import java.io.Serializable;

public class ClassDB implements Serializable {
    private int a;
    private int b;
    private int c;

    public ClassDB() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public ClassDB(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = a+b;
    }

    @Override
    public String toString() {
        return "ClassDB{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
