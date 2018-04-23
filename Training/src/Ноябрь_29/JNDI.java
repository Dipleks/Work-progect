package Ноябрь_29;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import java.io.File;
import java.util.Properties;

/*JNDI - это набор интерфейсоф, позваляющий связывать имена с объектами!*/
public class JNDI {
    public static void main(String[] args) throws Exception{
        String name = "D:Test.txt"; //имя
        //String name = "D:"; //имя

        Properties prop = new Properties();
        prop.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
        prop.put(Context.PROVIDER_URL, "file:///");

        Context initialContext = new InitialContext(prop);

        File obj = (File)initialContext.lookup(name);
        System.out.println(obj.getName());
        if (name.equals(""))
            System.out.println("Looked up the initial context.");
        else
            System.out.println(name + "is bound to" + obj);

        //можем вызвать список объктов:
        NamingEnumeration list = initialContext.list("D:");
        while (list.hasMore()){
            NameClassPair nc = (NameClassPair)list.next();
            //System.out.println(nc);
        }
/*Для того чтобы проект заработал необходимо скачать фаил RefFSContextFactory
* и подключить к нашему проекту.*/
    }
}
