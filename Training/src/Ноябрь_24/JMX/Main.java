package Ноябрь_24.JMX;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args) throws Exception{
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("Ноябрь_24.JMX:type=Hello");
        Hello mbean = new Hello();
        server.registerMBean(mbean, name);

        System.out.println("Waiting forever");
        Thread.sleep(Long.MAX_VALUE);

    }
}
