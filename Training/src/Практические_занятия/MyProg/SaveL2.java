package Практические_занятия.MyProg;

import java.io.Serializable;

public class SaveL2 implements Serializable {
    String str1;

    public SaveL2(String str1) {
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return str1;
    }
}
