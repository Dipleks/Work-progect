package Практические_занятия.MyProg;

import java.io.Serializable;

public class SaveL4_7 implements Serializable {
    String str4_7;

    public SaveL4_7(String str4_7) {
        this.str4_7 = str4_7;
    }

    @Override
    public String toString() {
        return str4_7;
    }
}
