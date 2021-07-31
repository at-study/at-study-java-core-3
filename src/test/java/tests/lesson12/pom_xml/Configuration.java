package tests.lesson12.pom_xml;

public class Configuration {
    private Integer source;
    private Integer target;

    public Configuration() {
    }

    public Configuration(Integer source, Integer target) {
        this.source = source;
        this.target = target;
    }

    public Integer getSource() {
        return source;
    }

    public Integer getTarget() {
        return target;
    }
}
