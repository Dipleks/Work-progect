package Ноябрь_23;/*Создание xml, DOM поход.*/

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ThreadFactory;

public class XML_3 {
    public static void main(String[] args) throws Exception {
        /*Создадим xml фаил с нуля!*/
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();

        //Добавим элементы:
        Element root = document.createElement("root");
        Element font = document.createElement("font");
        Text text = document.createTextNode("TimeNewRoman");
        document.appendChild(root);
        root.appendChild(font);
        font.appendChild(text);
        font.setAttribute("size", "20");

        //Теперь сохраняем наш фаил:
        //1 способ:
        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.INDENT, "yes");
        t.transform(new DOMSource(document), new StreamResult(new FileOutputStream("D:temp.xml")));

        //2 способ, записывает в консоль:
        DOMImplementation impl = document.getImplementation();
        DOMImplementationLS implLS = (DOMImplementationLS)impl.getFeature("LS","3.0");
        LSSerializer ser = implLS.createLSSerializer();
        ser.getDomConfig().setParameter("format-pretty-print", true);
        String str = ser.writeToString(document);
        System.out.println(str);

        //3 способ:
        LSOutput out = implLS.createLSOutput();
        out.setEncoding("UTF-8");
        out.setByteStream(Files.newOutputStream(Paths.get("temp.xml")));
        ser.write(document, out);
    }
}
