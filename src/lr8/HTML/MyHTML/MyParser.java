package lr8.HTML.MyHTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyParser {
    public static void main(String[] args) {
        addInFile();
        System.out.println("Данные записаны в файл");
    }
    public static void addInFile() {
        try {
            File file = new File("src/lr8/HTML/MyHTML/input.txt");
            FileWriter writer = new FileWriter(file);

            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            Elements newsParent = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");

            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    System.out.println("Тема: " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0));
                    writer.write("Тема: " + String.valueOf(((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0)) + "\n");

                    System.out.println("Дата: " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0) + "\n");
                    writer.write("Дата : " + String.valueOf(((Element) nodes.get(i))
                            .getElementsByClass("blockdate")
                            .get(0).childNodes().get(0)) + "\n\n");
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            addInFile();
        }
    }
}

