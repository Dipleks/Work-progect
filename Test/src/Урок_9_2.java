public class Урок_9_2 {
    private int weight; // вес кота
    private String name; // имя кота
    private String color; // окрас кота

    // кот ест
    public void eat() {
        System.out.println("Ням, ням... \n");
    }
    // кот спит
    public void sleep(){
        System.out.println("Сплю zz-zz-z... \n");
    }
    // кот говорит
    public String speak (String words) {
        String phrase = words + "...мау...\n";
        return phrase;
    }
}
