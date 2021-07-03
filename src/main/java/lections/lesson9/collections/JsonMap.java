package lections.lesson9.collections;

import java.util.Map;
import java.util.TreeMap;

import lections.lesson9.to_string.ToJson;

public class JsonMap extends TreeMap<String, Object> implements ToJson {

    @Override
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{").append(System.lineSeparator());
        for (Map.Entry<String, Object> entry : this.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            sb.append(String.format("\t\"%s\": %s,%n", key, formatValue(value)));
        }
        if (sb.lastIndexOf(",") != -1) {
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    /**
     * Formats value to json-representative object
     * @param value - value needs to be formatted
     * @return formatted value
     */
    private String formatValue(Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof Boolean) {
            return value.toString();
        }
        if (value instanceof Number) {
            return value.toString();
        }
        if (value instanceof String) {
            return "\"" + value + "\"";
        }
        if (value instanceof ToJson) {
            return ((ToJson) value).toJson();
        }
        throw new IllegalArgumentException("Value can be only null, primitive, string, ToJson");
    }

    @Override
    public String toString() {
        return toJson();
    }

}
