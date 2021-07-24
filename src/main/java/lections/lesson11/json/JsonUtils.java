package lections.lesson11.json;

import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {

    public static String serialize(Object object) {
        return getGson().toJson(object);
    }

    public static <T> T deserialize(String json, Class<T> clazz) {
        return getGson().fromJson(json, clazz);
    }

    private static Gson getGson() {
        return new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateSerializer())
                .registerTypeAdapter(LocalDate.class, new LocalDateDeserializer())
                .create();
    }
}
