package Практические_занятия.Dnevnik;

import javafx.scene.control.Button;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class T {

        GregorianCalendar greg = new GregorianCalendar();
        int today = greg.get(Calendar.DAY_OF_MONTH);
        int weekday = greg.get(Calendar.DAY_OF_WEEK);
        int month = greg.get(Calendar.MONTH);
        int FirstDayOfWeek = greg.getFirstDayOfWeek();

        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();

        public String butText() {
            String a = String.valueOf(today);
            return a;
        }

        public String buttonsText (){

            String b = "test";

            return b;
        }

        public String labelText () {
            String c = "ret";


            return c;
        }

}
