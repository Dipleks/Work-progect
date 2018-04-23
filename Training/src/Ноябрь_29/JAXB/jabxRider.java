package Ноябрь_29.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/*можем прочесть наш фаил*/
public class jabxRider {
    public static void main(String[] args) throws JAXBException {
        File file = new File("D:myxml.xml");
        JAXBContext context = JAXBContext.newInstance(Custormer.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Custormer custormer = (Custormer)unmarshaller.unmarshal(file);
        System.out.println(custormer.id);
        System.out.println(custormer.name);
        System.out.println(custormer.age);

    }
}
