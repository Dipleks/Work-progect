package Практические_занятия.Serializator1;

import java.io.Serializable;

public class Bd implements Serializable {
    private String str1;
    private String str2;

    public Bd(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "Bd{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                '}';
    }
}
