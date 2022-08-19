package co.medirecords.exam.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class JsonUtility {

    private ObjectMapper objectMapper;

    public JsonUtility(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public String toJson(Object o){
        try {
            return objectMapper.writeValueAsString(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public <T> T toObject(String json, Class<T> t){
        try {
            return objectMapper.readValue(json, t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
