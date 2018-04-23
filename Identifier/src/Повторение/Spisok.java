package Повторение;

import java.io.*;
import java.util.*;

public class Spisok {
    public static void main(String[] args) throws Exception {
        List a = new ArrayList();
        a.add("Tom 1");
        a.add(" ");
        a.add("Tom 2");
        for (int i = 0; i<a.size(); i++){
            System.out.print(a.get(i));
        }
        Queue b = new LinkedList();
        b.offer("\n");
        b.offer("Tom 4");
        b.offer(" ");
        b.offer("Tom 3");
        while (b.size()>0){
            System.out.print(b.poll());
        }
        Queue c = new PriorityQueue();
        c.offer("\n");
        c.offer("Tom 4"+"\n");
        c.offer("Tom 3 ");
        while (c.size()>0){
            System.out.print(c.poll());
        }
        Map d = new TreeMap();
        String k1 = "Куджо";
        String k2 = "Стихи";
        int key1 = 325;
        int key2 = 562;
        d.put(key1, k1);
        d.put(key2, k2);
        Set book = d.entrySet();
        System.out.println(d.keySet());
        System.out.println(d.entrySet());
        for (Object o: book){
            System.out.print(o+" ");
        }
    }
}
