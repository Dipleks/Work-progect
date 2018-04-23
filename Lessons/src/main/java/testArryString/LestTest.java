package testArryString;

import java.util.ArrayList;
import java.util.List;

public class LestTest {
    private static List<String> list = new ArrayList<>();
    private static StringTest stringTest = new StringTest();

    protected static List<String> stringList(){

        list.add(0, stringTest.getS0());
        list.add(1, stringTest.getS1());
        list.add(2,stringTest.getS2());

        return list;
    }
}
