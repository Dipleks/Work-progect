package com.Five;

public class Quest extends Kluychi {
    public int ks (){
        return 15000;
    }
    @Override
    public void help(){
        System.out.println("Help");
    }
    public static void main(String[] args) {
        int k1=1000;
        int k2=2000;
        int k3=4000;
        int k4=8000;
        int ks=k1+k2+k3+k4;
        System.out.print(ks);

    }
    int o = 64;
    int ok() {return o;}
}
