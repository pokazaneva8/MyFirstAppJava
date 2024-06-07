package lr8.JSON.MyJSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ParserMyJSON {
    public static void main(String[] args) {
        String fileName = "src/lr8/JSON/MyJSON/filmJson.json";
        myParserJSON(fileName);
    }
    public static void myParserJSON (String fileName){
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader(fileName));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("films");

            for (Object o : jsonArray) {
                JSONObject film = (JSONObject) o;
                System.out.println("\nТекущий элемент: film");
                System.out.println("Название фильма: " + film.get("filmName"));
                System.out.println("Режиссёр: " + film.get("director"));
                System.out.println("Год выпуска: " + film.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
