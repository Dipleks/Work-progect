package Ноябрь_23;/*Создание XML, SAX подход*/

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;

public class XML_4 {
    public static void main(String[] args) throws Exception {
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("temp2.xml"));
        writer.writeStartDocument();
        writer.writeStartElement("root");
        writer.writeStartElement("font");
        writer.writeAttribute("size", "20");
        writer.writeCharacters("TimeNewRoman");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeStartDocument();
    }
}
