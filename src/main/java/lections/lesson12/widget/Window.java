package lections.lesson12.widget;

public class Window {

    private String title;
    private String name;
    private Integer width;
    private Integer height;
    private Pairs object;

    public Window(String title, String name, Integer width, Integer height, Pairs object) {
        this.title = title;
        this.name = name;
        this.width = width;
        this.height = height;
        this.object = object;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Pairs getObject() {
        return object;
    }
}
