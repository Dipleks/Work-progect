public class Obed {
    String[] arrS = new String[2];
    public String fild(){
        arrS[0] = "hello";
        arrS[1] = "str1";
        if (arrS[0] != arrS[1]){
            arrS[1] = "hello1";
        }

        return arrS[1];
    }

    public String[] getArrS() {
        return arrS;
    }

    public void setArrS(String[] arrS) {

        this.arrS = arrS;
    }
}
