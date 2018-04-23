package Практические_занятия.MyProg;

import java.io.Serializable;

public class SaveL1 implements Serializable {
    String str;

    public SaveL1(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}
