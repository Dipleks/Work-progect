package Практические_занятия.Table_2;

import javafx.scene.control.ComboBox;

public class SaveTable {

    private String name, dateRozhdenia;
    private ComboBox pol;

    public SaveTable() {
        this.name = " ";
        this.dateRozhdenia = " ";
        this.pol = null;
    }

    public SaveTable(String name, String dateRozhdenia, ComboBox pol) {
        this.name = name;
        this.dateRozhdenia = dateRozhdenia;
        this.pol = pol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateRozhdenia() {
        return dateRozhdenia;
    }

    public void setDateRozhdenia(String dateRozhdenia) {
        this.dateRozhdenia = dateRozhdenia;
    }

    public ComboBox getPol() {
        return pol;
    }

    public void setPol(ComboBox pol) {
        this.pol = pol;
    }
}
