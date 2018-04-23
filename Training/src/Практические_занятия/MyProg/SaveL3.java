package Практические_занятия.MyProg;

import java.io.Serializable;

public class SaveL3 implements Serializable {
    String str3;

    public SaveL3(String str3) {
        this.str3 = str3;
    }

    @Override
    public String toString() {
        return str3;
    }
}
