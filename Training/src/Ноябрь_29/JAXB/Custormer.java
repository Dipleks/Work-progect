package Ноябрь_29.JAXB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*JAXB позволяет связывать XML файлы с нашей программой.*/
//Создадим пользователя:
@XmlRootElement //добавим аннотацию для работы с XML
public class Custormer {
    int id;
    String name;
    int age;
    //Создадим гетеры и сеторы:

    public int getId() {
        return id;
    }
    @XmlAttribute //id сделаем атрибутом
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    @XmlElement //используем для сетов
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @XmlElement //используем для сетов
    public void setAge(int age) {
        this.age = age;
    }
}
