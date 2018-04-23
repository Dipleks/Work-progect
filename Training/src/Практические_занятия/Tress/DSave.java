package Практические_занятия.Tress;

import java.io.Serializable;

public class DSave implements Serializable {
    String str;

    public DSave(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}
