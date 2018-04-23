package Повторение;

import java.util.*;

public class Two {
    public static void main(String[] args) throws Exception {
        ArrayList arrrayList = new ArrayList(3);
        arrrayList.ensureCapacity(3);
        arrrayList.ensureCapacity(1);
        arrrayList.ensureCapacity(2);

        for (int i = 0; i<arrrayList.size(); i++) {
            System.out.println(arrrayList.get(i));
        }

    }
}
