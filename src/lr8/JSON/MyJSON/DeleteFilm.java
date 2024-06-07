package lr8.JSON.MyJSON;

import java.io.FileReader;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DeleteFilm {
    public static void main(String[] args) {
        System.out.println("Введите название фильма, который вы хотите удалить: ");
        Scanner in = new Scanner(System.in);
        removeBook(in.nextLine());
    }
    public static void removeBook(String title){
        try {
            String fileName = "src/lr8/JSON/MyJSON/filmJson.json";

            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader(fileName));
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonArray = (JSONArray) jsonObject.get("films");
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject film = (JSONObject) iterator.next();
                if (title.equals(film.get("filmName"))) {
                    iterator.remove();
                }
            }

            try (FileWriter file = new FileWriter(fileName)) {
                file.write(jsonObject.toJSONString());
                file.flush();
                System.out.println("Json файл успешно обновлен!");
            }

            System.out.println("Фильмы, которые остались в JSON файле: ");
            ParserMyJSON.myParserJSON(fileName);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
