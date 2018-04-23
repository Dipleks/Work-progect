package Patterns.Patterns_31_36;/*Transfer Object*/

public class Patterns_36 {
    public static void main(String[] args) {
        BO bo = new BO();
        System.out.println(bo.serviceJDB.getUser().getName());
    }
}
//создадим Transfer Object
class User {
    String name;
    int age;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
//создадим сервис, их может быть множество
class ServiceJDB {
    public User getUser(){
        User user = new User();
        user.setName("Dennis");
        return user; }}

class BO {
    ServiceJDB serviceJDB = new ServiceJDB();
    public User getUser(){
      return serviceJDB.getUser(); }}
