package Практические_занятия.Serializator2;

import java.io.Serializable;

public class DBProg implements Serializable {
    private String str1;

    public DBProg(String str1) {
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return str1;
    }

}
