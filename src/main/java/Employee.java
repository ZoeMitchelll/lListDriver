import java.time.LocalDate;
import java.util.Random;

public class Employee {
    private String firstName;
    private LocalDate hireDate;
    private Double anualSalaray;

    public Employee(int nameLength, int minSalary, int maxSalary) {// target String length and min/max salary are arbitrarily chosen for
        this.firstName = givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect(7);
        this.hireDate = LocalDate.now();
        Random random = new Random();
        this.anualSalaray = 15_600 + (1_501_760 - 15_600) * random.nextDouble();
    }

    protected static Employee generateRandomEmployee() {
        return new Employee();
    }

    public static String givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect(int targetStringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        String generatedString =
                random.ints(leftLimit, rightLimit + 1)
                        .limit(targetStringLength)
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString();
        return generatedString;
    } // method found on https://www.baeldung.com/java-random-string number 3
}
