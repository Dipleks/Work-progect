package Collections;/*Maps*/

import java.util.*;

public class MapsLesson {
    public static void main(String[] args) {
/*1*/   Map<String, String> hashMap = new HashMap<>();
      /*HashMap получает быстро доступ к объктам. В HashMap
      * значения лежат рандомно.*/
/*2*/   Map<String, String> linkedHashMap = new LinkedHashMap<>();
      /*В LinkedHashMap значения можно упорядочить.*/
/*3*/   Map<String, String> treeMap = new TreeMap<>();
      /*TreeMap сортирует значения подобно дереву на левый (меньшее значение) и правые
      * (болшее значение) значения, и на red - false и
      * black - true.*/
/*4*/   Map<String, String> hashtable = new Hashtable<>();
/*5*/   Map<String, String> suncHashMap = Collections.synchronizedMap(new HashMap<>());
    }
}
