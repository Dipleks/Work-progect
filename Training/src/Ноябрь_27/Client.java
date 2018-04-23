package Ноябрь_27;
import Ноябрь_24.JMX.HelloNBean;

import javax.management.JMX;
import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

public class Client {
    public static void main(String[] args) throws Exception {
        //создаем наш клиент:
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://:9999/jmxrmi");
        JMXConnector jmxc = JMXConnectorFactory.connect(url, null);
        MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();

        ObjectName mbeanName = new ObjectName("Ноябрь_24.JMX:type=Hello");
        //Это объект который будет работать на нашем ПК, мы будем посылать на него
        //запрос, а он будет отправлять его на удоленный ПК:
        HelloNBean mbeanProxy = JMX.newMBeanProxy(mbsc, mbeanName, HelloNBean.class, true);

        //Тепрь мы можем вызвать методы:
        mbeanProxy.sayHello();
        System.out.println(mbeanProxy.addIntegers(1, 2));
        mbeanProxy.setName("hello");
        System.out.println(mbeanProxy.getName());
        System.out.println(mbeanProxy.retrunPerson().getName());

        jmxc.close();
    }
}
