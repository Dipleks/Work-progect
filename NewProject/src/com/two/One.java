package com.two;
       //Изучаем Полиморфизм!
public class One {
           public static void main(String[] args)
               { One p = new One();
                   p.sTwo(new Two());
                   One p1 = new One();
                   p1.sThree(new Three()); }
           private void setTwo(Two two) {}
           void sTwo(Two two)
           {two.traktor();
               System.out.print(two.t3);
               System.out.print(" сек.\n");}
           void sThree(Three three)
           {three.mashin();
               System.out.print(three.s);
               System.out.print(" сек.");}
}


