package root;

public class StringText
{
    private String[] stringRu = new String[5];
    private String[] stringEn = new String[5];

    public String[] getStringRu() {
        getStringRui();
        return stringRu;
    }

    String[] getStringEn() {
        getStringEni();
        return stringEn;
    }


    private void getStringRui() {
        stringRu[0] = "Один один";
        stringRu[1] = "Два два";
        stringRu[2] = "Три три";
        stringRu[3] = "Четыре четыре";
        stringRu[4] = "Пять пять";
    }


    private void getStringEni() {
        stringEn[0] = "One one";
        stringEn[1] = "Two two";
        stringEn[2] = "Three three";
        stringEn[3] = "Four four";
        stringEn[4] = "Five five";
    }
}
