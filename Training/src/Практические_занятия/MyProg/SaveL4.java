package Практические_занятия.MyProg;

import java.io.Serializable;

public class SaveL4 implements Serializable{
    String str4;

    public SaveL4(String str4) {
        this.str4 = str4;
    }

    @Override
    public String toString() {
        return str4;
    }
}
