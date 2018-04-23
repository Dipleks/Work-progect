package lessons.Lessons_1.l6_Таблицы;

import javafx.collections.ObservableList;

import java.io.Serializable;

public class Person implements Serializable{
    String name;
    String family;
    String otch;
    String numberPhone;

    public Person(ObservableList<Person> items) {
        this.name = " ";
        this.family = " ";
        this.otch =  " ";
        this.numberPhone = " ";
    }

    public Person(String name, String family, String otch, String numberPhone) {
        this.name = name;
        this.family = family;
        this.otch = otch;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOtch() {
        return otch;
    }

    public void setOtch(String otch) {
        this.otch = otch;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", otch='" + otch + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
