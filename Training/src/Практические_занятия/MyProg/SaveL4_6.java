package Практические_занятия.MyProg;

import java.io.Serializable;

public class SaveL4_6 implements Serializable {
    String str4_6;

    public SaveL4_6(String str4_6) {
        this.str4_6 = str4_6;
    }

    @Override
    public String toString() {
        return str4_6;
    }
}
