package tests.lesson12;

import org.junit.jupiter.api.Test;

import lections.lesson11.json.JsonUtils;
import lections.lesson12.FileUtils;
import lections.lesson12.widget.WidgetInfo;

public class WidgetTest {
    
    @Test
    public void testWidgetDeserialization() {
        String json = FileUtils.getFileContent("src/main/java/lections/lesson12/widget/widget.json");
        WidgetInfo widgetInfo = JsonUtils.deserialize(json, WidgetInfo.class);
    }
}
