package lr8.JSON.MyJSON;

import java.io.FileReader;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class SearchInMyJSON {
    public static void main(String[] args) {
        System.out.println("Введите фамилию и имя режиссёра, фильмы которого хотите найти: ");
        Scanner in = new Scanner(System.in);
        SeachFilm(in.nextLine());

    }
    public static void SeachFilm(String director) {
        try {
            String fileName = "src/lr8/JSON/MyJSON/filmJson.json";
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader(fileName));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("films");
            for (Object o : jsonArray) {
                JSONObject film = (JSONObject) o;
                if (director.equals(film.get("director"))) {
                    System.out.println("\nТекущий элемент: film");
                    System.out.println("Название фильма: " + film.get("filmName"));
                    System.out.println("Режиссёр: " + film.get("director"));
                    System.out.println("Год выпуска: " + film.get("year"));
                }
            }

            //String director = "Меньшов";
             /*jsonArray.stream()
                    .filter(film -> film instanceof JSONObject)
                    .map(film -> (JSONObject) film)
                    .filter(film -> director.equals(film.get("director")))
                    .forEach(film -> {
                        System.out.println("\nТекущий элемент: film");
                        System.out.println("Название фильма: " + film.getClass("fileName"));
                        System.out.println("Режиссёр: " + film.get("director"));
                        System.out.println("Год выпуска: " + film.get("year"));
                    });*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
