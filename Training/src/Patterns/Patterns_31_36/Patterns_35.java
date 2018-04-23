package Patterns.Patterns_31_36;/*Service Locator
помогает закешировать сервисы (например, когда много сервисов JNDI)*/

import java.util.ArrayList;
import java.util.List;

public class Patterns_35 {
    public static void main(String[] args) {
        Servicei servicei = ServiceLocator.getService("Service1");
        servicei.execude();
        servicei = ServiceLocator.getService("Service2");
        servicei.execude();
    }
}
//сделаем сервис:
interface Servicei{
    String getName();
    void execude();
}
//сделаем его имплементации:
class Service1 implements Servicei {
    @Override
    public String getName() { return "Service1"; }
    @Override
    public void execude() { System.out.println("Executing Service1"); }}
class Service2 implements Servicei {
    @Override
    public String getName() { return "Service2"; }
    @Override
    public void execude() { System.out.println("Executing Service2"); }}

//сделаем класс который будет инициализировать наши сервесы:
class InitialContext{
    public Object loolup(String jndiName){
        if (jndiName.equalsIgnoreCase("SERVICE1")){ return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2")) {
            return new Service2(); }return null; }}

//сделаем кэш который все это будет кешировать:
class Cache{
    private List<Servicei> services = new ArrayList<>();
    public Servicei getService(String serviceName){
        for (Servicei servicei : services){
            if (servicei.getName().equalsIgnoreCase(serviceName)){
                System.out.println("returning cached " + serviceName + " object");
                return servicei; } }
        return null; }
    public void addService (Servicei newService){
        boolean exests = false;
        for (Servicei servicei : services){
            if (servicei.getName().equalsIgnoreCase(newService.getName())){
                exests = true; } }
        if (!exests){
            services.add(newService); } }}

class ServiceLocator{
    private static Cache cache;
    static {cache = new Cache(); }
    public static Servicei getService(String jdniName){
        Servicei servicei = cache.getService(jdniName);
        if (servicei != null){ return servicei; }
        InitialContext context = new InitialContext();
        Servicei servicei1 = (Servicei)context.loolup(jdniName);
        cache.addService(servicei1);
        return servicei1;
    }
}
