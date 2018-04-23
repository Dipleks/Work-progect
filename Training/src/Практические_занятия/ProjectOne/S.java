package Практические_занятия.ProjectOne;

import java.io.Serializable;

public class S implements Serializable {
    String string;

    public S (String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
