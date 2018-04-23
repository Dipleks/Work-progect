package Практические_занятия.MyProg;

import java.io.Serializable;

public class SaveL4_3 implements Serializable {
    String str4_3;

    public SaveL4_3(String str4_3) {
        this.str4_3 = str4_3;
    }

    @Override
    public String toString() {
        return str4_3;
    }
}
