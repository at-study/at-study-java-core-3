package tests.lesson12;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import lections.lesson12.library.Book;
import lections.lesson12.library.Library;

public class XmlTests {

    @Test
    public void libraryBooksTest() throws JsonProcessingException {
        List<Book> books = Arrays.asList(new Book(20), new Book(100), new Book(555));
        Library library = new Library(books);

        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(library);
        System.out.println(xml);
    }

}
