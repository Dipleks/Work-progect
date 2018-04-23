package Ноябрь_23;/*xml - dom подход*/

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/*Будем учиться работать с xml-файлами. Для примера будем
* работать со стандартным IntelliJ IDEA докуметом myProperty.xml.
* Получим информацию о нем!
* Есть два основных подхода сделать это: DOM и SAX!
*
* Расмотрим пример с DOM подходом!*/
public class XML_1 {
    public static void main(String[] args) throws Exception {
/*DOM Parser загружает содержимое XML-файла в память в виде
* документа, по которому мы можем легко перемещаться.
* DOM Parser отлично подходит для маленьких документов XML,
* так как он загружает полный XML файл в память. Для больших
* файлов XML, нужно использовать SAX Parser.*/

        //Получаем билдер:
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); //создаем новый экземпляр
        DocumentBuilder builder = factory.newDocumentBuilder(); //создаем новый докумет для построения
        //получаем сам документ:
        Document document = builder.parse(new File("myProperty.xml"));

        //Из него мы можем получать элементы:
        Element element = document.getDocumentElement();
        printElement(element.getChildNodes());
//        System.out.println(element.getTagName()); //получим имя тэга
//        //Получим список всех наших чаилдов, для этого создадим цикл и добавим в него проверку:
//        NodeList nodeList = element.getChildNodes(); //получить дочерние узлы
//        for (int i = 0; i < nodeList.getLength(); i++) {
//            if (nodeList.item(i) instanceof Element)
//            System.out.println(((Element) nodeList.item(i)).getTagName());
//        }
    }
    //Мы може пробежать по всему фалу, создадим метод:
    static void printElement(NodeList nodeList){
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i) instanceof Element) {
                System.out.println(((Element) nodeList.item(i)).getTagName());
                //выведем атребуты:
                if ((((Element) nodeList.item(i)).hasAttribute("name"))){
                    System.out.println((((Element) nodeList.item(i)).hasAttribute("name")));
                }
                if (nodeList.item(i).hasChildNodes()) {
                    printElement(nodeList.item(i).getChildNodes());
                }

            }
        }
    }
}
