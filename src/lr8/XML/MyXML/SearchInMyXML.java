package lr8.XML.MyXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class SearchInMyXML {
    public static void main(String[] args) {
        System.out.println("Введите фамилию и имя режиссера, фильм которого вы хотите найти: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        searchFilm(name);
    }
    public static void searchFilm(String movieDirector) {
        try {
            File inputFile = new File("src/lr8/XML/MyXML/filmLibrary.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("film");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    if (movieDirector.equals(element.getElementsByTagName("director")
                            .item(0).getTextContent())) {
                        System.out.println("Название фильма: "
                                + element.getElementsByTagName("filmName").item(0)
                                .getTextContent());
                        System.out.println("Режиссёр: "
                                + element.getElementsByTagName("director").item(0)
                                .getTextContent());
                        System.out.println("Год выпуска: "
                                + element.getElementsByTagName("year").item(0)
                                .getTextContent());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

