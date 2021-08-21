package lections.lesson15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;

import homework_task.lesson14.helpers.JsonHelper;
import homework_task.lesson14.model.Account;
import homework_task.lesson14.model.Passport;
import homework_task.lesson14.model.Person;
import homework_task.lesson14.model.Property;

import static java.time.format.DateTimeFormatter.ofPattern;

public class Application {
    private static final Comparator<Person> LASTNAME_FIRSTNAME_COMPARATOR = (person1, person2) -> person1.getLastName().equals(person2.getLastName())
            ? person1.getFirstName().compareTo(person2.getFirstName())
            : person1.getLastName().compareTo(person2.getLastName());

    public static void main(String[] args) throws IOException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework_task/lesson14/dataset.json");

        long petrovCount = persons.stream()
                .filter(pers -> "Петров".equals(pers.getLastName()))
                .count();

        long nullCount = persons.stream()
                .filter(p -> p.getPassport() == null)
                .count();

        List<Passport> allPassports = persons.stream()
                .filter(p -> p.getPassport() != null)
                .map(Person::getPassport)
                //     .filter(passport -> passport.getSeries().startsWith("5"))
                .collect(Collectors.toList());

        List<Property> allProperties = persons.stream()
                .flatMap(person -> person.getProperties().stream())
                .collect(Collectors.toList());

        // 50 - 60
        allPassports.stream()
                .limit(60)
                .skip(49)
                .forEach(passport -> System.out.printf("%s-%s%n", passport.getSeries(), passport.getNumber()));

        // 07588.095.2.85417864528
        boolean isPersonExist = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .anyMatch(account -> account.getAccountNumber().equals("07588.095.2.85417864528"));

        boolean allPeopleHaveCards = persons.stream()
                .noneMatch(person -> person.getCards().isEmpty());
        List<Person> peopleWithoutCards = persons.stream()
                .filter(person -> person.getCards().isEmpty())
                .collect(Collectors.toList());

        peopleWithoutCards.stream()
                .sorted(LASTNAME_FIRSTNAME_COMPARATOR)
                .forEach(person -> System.out.println(person.getLastName() + " " + person.getFirstName()));

        List<Passport> sortedByDatePassports = allPassports.stream()
                .sorted((pass1, pass2) -> {
                    LocalDate d1 = LocalDate.parse(pass1.getIssueDate(), ofPattern("dd.MM.yyyy"));
                    LocalDate d2 = LocalDate.parse(pass2.getIssueDate(), ofPattern("dd.MM.yyyy"));
                    return d1.compareTo(d2);
                })
                .collect(Collectors.toList());

        long noPropertiesCount = persons.stream()
                .filter(person -> person.getProperties().isEmpty())
                .peek(person -> System.out.printf("%s %s %s%n",
                        person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();

        List<String> allLastNames = persons.stream()
                .map(Person::getLastName)
                .distinct()
                .collect(Collectors.toList());

        double totalPropertiesPrice = allProperties.stream()
                .map(property -> property.getPrice())
                .reduce((a, b) -> a + b)
                .orElse(0d);

        int result = Stream.of(2, 4, 6, 8)
                .reduce((a, b) -> a + b)
                .get();


        int allLettersCount = Stream.of("Семь", "пятниц", "на", "неделе")
                .map(String::length)
                .reduce(Integer::sum)
                .get();

        double lowestBalance = persons.stream()
                .filter(person -> person.getProperties().stream()
                        .anyMatch(property -> property.getAddress().contains("Докукина")))
                .flatMap(person -> person.getAccounts().stream())
                .map(acc -> acc.getAccountBalance())
                .min(Comparator.naturalOrder())
                .get();

        final Path PATH = Paths.get("src/main/java/lections/lesson15/input.txt");
        Assertions.assertEquals(4, getCharSequenceCount("Алекс", PATH));
        Assertions.assertEquals(2, getCharSequenceCount("Ви", PATH));
        Assertions.assertEquals(1, getCharSequenceCount("Смирнов", PATH));

        Map<Passport, List<Account>> passportToAccounts = persons.stream()
                .filter(person -> person.getPassport() != null)
                .collect(Collectors.toMap(
                        person -> person.getPassport(),
                        person -> new ArrayList<>(person.getAccounts())
                ));

    }

    private static int getCharSequenceCount(String text, Path path) throws IOException {
        return Files.lines(path)
                .reduce((s1, s2) -> s1 + s2)
                .map(line -> line.split(text).length - 1)
                .orElse(0);
    }

}
