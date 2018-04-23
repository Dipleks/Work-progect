package Практические_занятия.MyProg;

import java.io.Serializable;

public class SaveL42 implements Serializable {
    String str42;

    public SaveL42(String str42) {
        this.str42 = str42;
    }

    @Override
    public String toString() {
        return str42;
    }
}
