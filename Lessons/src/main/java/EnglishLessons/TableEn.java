package EnglishLessons;

import javafx.scene.control.Button;

public class TableEn {
    String number;
    String enStr;
    Button transleit;

    public TableEn(String number, String enStr, Button transleit) {
        this.number = number;
        this.enStr = enStr;
        this.transleit = transleit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEnStr() {
        return enStr;
    }

    public void setEnStr(String enStr) {
        this.enStr = enStr;
    }

    public Button getTransleit() {
        return transleit;
    }

    public void setTransleit(Button transleit) {
        this.transleit = transleit;
    }

    @Override
    public String toString() {
        return "TableEn{" +
                "number='" + number + '\'' +
                ", enStr='" + enStr + '\'' +
                ", transleit=" + transleit + '\'' +
                '}';
    }
}
