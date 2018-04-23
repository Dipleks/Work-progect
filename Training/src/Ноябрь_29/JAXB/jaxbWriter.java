package Ноябрь_29.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class jaxbWriter {
    public static void main(String[] args) throws Exception{
        //создадим класс
        Custormer custormer = new Custormer();
        //получим сеторы
        custormer.setId(1);
        custormer.setName("Denis");
        custormer.setAge(18);

        //создадим новый фаил:
        File file = new File("D:myxml.xml");
        //укажим наш класс
        JAXBContext context = JAXBContext.newInstance(Custormer.class);
        //добавим переводчик из xml в объект
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); /*преобразуем в xml вид, без
                                                         * этой команды все будет в одну строку*/
        //передадим объект и новый фаил:
        marshaller.marshal(custormer, file); //запишем информацию в xml фаил
        marshaller.marshal(custormer, System.out); //продублируем информацию xml файла в консоле
    }
}
