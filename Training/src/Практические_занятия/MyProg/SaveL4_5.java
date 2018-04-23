package Практические_занятия.MyProg;

import java.io.Serializable;

public class SaveL4_5 implements Serializable {
    String str4_5;

    public SaveL4_5(String str4_5) {
        this.str4_5 = str4_5;
    }

    @Override
    public String toString() {
        return str4_5;
    }
}
