package lections.lesson12.widget;

public class Text {

    private String data;
    private Integer size;
    private String style;
    private String name;
    private Integer hOffset;
    private Integer vOffset;
    private String alignment;
    private String onMouseUp;

    public Text(String data, Integer size, String style, String name, Integer hOffset, Integer vOffset, String alignment, String onMouseUp) {
        this.data = data;
        this.size = size;
        this.style = style;
        this.name = name;
        this.hOffset = hOffset;
        this.vOffset = vOffset;
        this.alignment = alignment;
        this.onMouseUp = onMouseUp;
    }

    public String getData() {
        return data;
    }

    public Integer getSize() {
        return size;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    public Integer gethOffset() {
        return hOffset;
    }

    public Integer getvOffset() {
        return vOffset;
    }

    public String getAlignment() {
        return alignment;
    }

    public String getOnMouseUp() {
        return onMouseUp;
    }
}
