package Практические_занятия.Table;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Produkt")
@XmlType(propOrder = {"name", "priz", "drop"})
public class Produkt {

    private String name;
    private double priz;
    private int drop;

    public Produkt() {
        this.name = " ";
        this.priz = 0;
        this.drop = 0;
    }

    public Produkt(String name, double priz, int drop) {
        this.name = name;
        this.priz = priz;
        this.drop = drop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriz() {
        return priz;
    }

    public void setPriz(double priz) {
        this.priz = priz;
    }

    public int getDrop() {
        return drop;
    }

    public void setDrop(int drop) {
        this.drop = drop;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", priz=" + priz +
                ", drop=" + drop +
                '}';
    }
}
