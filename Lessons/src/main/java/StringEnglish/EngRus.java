package StringEnglish;

public class EngRus {

    private String[] str = new String[60];

    private String[] mStr() {
        str[0] = "1";
        str[1] = "2";
        str[2] = "3";
        str[3] = "4";
        str[4] = "5";
        return str;
    }

    public String[] getStr(){

        mStr();
        System.out.println(str[1]);

        return str;
    }

}
