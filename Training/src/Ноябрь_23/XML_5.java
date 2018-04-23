package Ноябрь_23;/*XPath и работа с XML*/

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;

public class XML_5 {
    public static void main(String[] args) throws Exception{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("myProperty.xml"));

        //Получаем доступ по указаному пути:
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();
        System.out.println(xPath.evaluate("/preferences/root/map/entry", document));
        System.out.println(xPath.evaluate("/preferences/root/node/node/map", document));
        System.out.println(xPath.evaluate("count(/preferences/root/node/node/map)", document));

        NodeList list = (NodeList)xPath.evaluate("/preferences/root/node/node/map", document, XPathConstants.NODESET);
        Node nod = (Node)xPath.evaluate("/preferences/root/node/node[2]", document, XPathConstants.NODE);
        int cout = ((Number)xPath.evaluate("count(/preferences/root/node/node/map)", document, XPathConstants.NUMBER)).intValue();
    }
}
