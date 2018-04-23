package testAddLabelStringInGroup;

class StringAbs
{

    private String[] strEn = new String[4];
    private String[] strRu = new String[4];

    private String[] getEn() {
        strEn[0] = "one";
        strEn[1] = "two";
        strEn[2] = "three";
        strEn[3] = "four";
        return strEn;
    }

    private String[] getRu() {
        strRu[0] = "один";
        strRu[1] = "два";
        strRu[2] = "три";
        strRu[3] = "четыре";
        return strRu;
    }

    String[] getStrEn() {
        getEn();
        return strEn;
    }

    String[] getStrRu() {
        getRu();
        return strRu;
    }
}
