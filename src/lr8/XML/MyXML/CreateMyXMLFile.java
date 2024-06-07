package lr8.XML.MyXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class CreateMyXMLFile {
    static Document doc;
    static Element rootElement;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите данные о фильме:");
        System.out.println("Название, Режиссёр, Год выпуска");
        Film film1 = new Film("Любовь и голуби",
                "Меньшов Владимир", "1984");
        Film film2 = new Film("12 стульев",
                "Захаров Марк", "1976");
        Film film3 = new Film(in.nextLine(), in.nextLine(), in.nextLine());
        Film [] films = {film1, film2, film3};

        try{
            DocumentBuilderFactory docFactory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder =
                    docFactory.newDocumentBuilder();

            doc = docBuilder.newDocument();
            rootElement = doc.createElement("filmLibrary");
            doc.appendChild(rootElement);

            for (Film movie : films){
                addFilmInFile(movie);
            }

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File("src/lr8/XML/MyXML/filmLibrary.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void addFilmInFile(Film movie){
        Element film = doc.createElement("film");
        rootElement.appendChild(film);

        Element name = doc.createElement("filmName");
        name.appendChild(doc.createTextNode(movie.filmName));
        film.appendChild(name);

        Element director = doc.createElement("director");
        director.appendChild(doc.createTextNode(movie.director));
        film.appendChild(director);

        Element year = doc.createElement("year");
        year.appendChild(doc.createTextNode(movie.year));
        film.appendChild(year);
    }
}