package Практические_занятия.MyProg;

import java.io.Serializable;

public class SaveL4_4 implements Serializable {
    String str4_4;

    public SaveL4_4(String str4_4) {
        this.str4_4 = str4_4;
    }

    @Override
    public String toString() {
        return str4_4;
    }
}
