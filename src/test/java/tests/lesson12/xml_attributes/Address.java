package tests.lesson12.xml_attributes;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Address {

    @JacksonXmlProperty
    private Street street;
    @JacksonXmlProperty(localName = "house")
    private Integer houseNumber;
    @JacksonXmlProperty
    private Flat flat;

    private static class Street {
        @JacksonXmlProperty(localName = "type")
        private String streetType;
        @JacksonXmlText
        private String name;
    }

    private static class Flat {
        @JacksonXmlProperty(localName = "rooms")
        private Integer roomsAmount;
        @JacksonXmlProperty
        private Double square;
        @JacksonXmlText
        private Integer number;
    }
}
