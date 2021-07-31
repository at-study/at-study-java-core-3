package tests.lesson12.pom_xml;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class PomXmlDeserializationTest {
    
    @Test
    public void pomXmlDeserializationTest() throws IOException {
        XmlMapper m = new XmlMapper();
        Project project = m.readValue(new File("pom.xml"), Project.class);
    }
}
