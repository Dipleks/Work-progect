package Ноябрь_24.JMX;

import java.io.Serializable;

public class Person implements Serializable{
    private String name = "Denis";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
