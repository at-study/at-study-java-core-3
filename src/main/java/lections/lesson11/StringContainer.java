package lections.lesson11;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringContainer {

    private List<String> repeatableStrings = Arrays.asList("строка1", "строка2", "строка3");
    private Set<String> uniqueStrings = new TreeSet<>(repeatableStrings);

    public StringContainer() {
    }

    public List<String> getRepeatableStrings() {
        return repeatableStrings;
    }

    public Set<String> getUniqueStrings() {
        return uniqueStrings;
    }
}
