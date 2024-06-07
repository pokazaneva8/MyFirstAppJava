package lr8.JSON.MyJSON;

import lr8.XML.MyXML.Film;

import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateMyJSON {
    static JSONObject filmLibrary = new JSONObject();
    static JSONArray filmsArr = new JSONArray();

    public static void main(String[] args) {
        String fileName = "src/lr8/JSON/MyJSON/filmJson.json";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите данные о фильме:");
        System.out.println("Название, Режиссёр, Год выпуска");
        Film film1 = new Film("Любовь и голуби",
                "Меньшов Владимир", "1984");
        Film film2 = new Film("12 стульев",
                "Захаров Марк", "1976");
        Film film3 = new Film(in.nextLine(), in.nextLine(), in.nextLine());
        Film [] films = {film1, film2, film3};

        for (Film movie : films){
            addFilm(movie);
        }

        filmLibrary.put("films", filmsArr);

        try (FileWriter file = new FileWriter(fileName)) {
            file.write(filmLibrary.toJSONString());
            System.out.println("Json файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void addFilm (Film movie){
        JSONObject newFilm = new JSONObject();
        newFilm.put("filmName", movie.filmName);
        newFilm.put("director", movie.director);
        newFilm.put("year", movie.year);
        filmsArr.add(newFilm);
    }
}
