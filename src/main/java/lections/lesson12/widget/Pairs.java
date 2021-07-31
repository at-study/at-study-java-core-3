package lections.lesson12.widget;

public class Pairs {
    private String key1;
    private String key2;
    private Integer version;

    public Pairs(String key1, String key2, Integer version) {
        this.key1 = key1;
        this.key2 = key2;
        this.version = version;
    }

    public String getKey1() {
        return key1;
    }

    public String getKey2() {
        return key2;
    }

    public Integer getVersion() {
        return version;
    }
}
