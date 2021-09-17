package com.lbl.learn.springboot.config.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: BaoLei Li
 * @date: 2021/9/16
 **/
@JsonComponent
public class CustomJsonSerializer {

    public static class Serializer extends JsonSerializer<Object> {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        @Override
        public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
                throws IOException {
            if (o instanceof Date) {
                jsonGenerator.writeString(sdf.format(o));
            } else {
                jsonGenerator.writeObject(o);
            }
        }
    }

    public static class Deserializer extends JsonDeserializer<Date> {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        @Override
        public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            Date date = null;
            try {
                date = sdf.parse(jsonParser.getText());
            }
            catch (ParseException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return date;
        }
    }
}
