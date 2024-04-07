import java.util.Random;

public class NameGenerator {
    private static String[] firstNames = {
            "Liam",
            "Noah",
            "Oliver",
            "Emma",
            "Ava",
            "Charlotte",
            "Sophia",
            "Amelia",
            "Isabella",
            "Mia"};
    private static String[] lastNames = {
            "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Martinez", "Hernandez", "Lopez", "Gonzalez"};
    private static Random random = new Random();

    public static String generate() {
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];
        return firstName + " " + lastName;
    }

    public static int generateSalary(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}


