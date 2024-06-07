package lr8.XML.MyXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;
import javax.xml.transform.TransformerFactory;

public class DeleteFilm {
    public static void main(String[] args) {
        System.out.println("Введите название фильма, который хотите удалить");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        deleteFilm(name);
    }
    public static void deleteFilm(String movieName) {
        try {
            File inputFile = new File("src/lr8/XML/MyXML/filmLibrary.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("film");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    if (movieName.equals(element.getElementsByTagName("filmName").item(0).getTextContent())) {
                        Node parentNode = element.getParentNode();
                        parentNode.removeChild(element);
                        System.out.println("Фильм успешно удален " + element.getElementsByTagName("filmName")
                                .item(0).getTextContent());
                    }
                }
            }
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(inputFile);
            transformer.transform(source, result);
            System.out.println("В файле остались даннные о фильмах: ");
            MyXMLParser.MyXMLPars();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
