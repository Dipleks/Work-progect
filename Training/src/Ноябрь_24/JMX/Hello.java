package Ноябрь_24.JMX;

public class Hello implements HelloNBean {
    private String name;

    @Override
    public void sayHello() {
        System.out.println("hello from jmx");
    }

    @Override
    public int addIntegers(int a, int b) {
        return a + b;
    }

    @Override
    public Person retrunPerson() {
        return new Person();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
