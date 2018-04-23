package interfaceLesson.int2_0;

public class ClassA2_0 implements TestInt2_0
{
    public static void main(String[] args) {
        TestInt2_0 testInt2_0 = new ClassB2_0();
        testInt2_0.test2_0("ClassTEST");
        System.out.println(testInt2_0.toString().length());
    }
}
