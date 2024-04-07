import java.util.Random;
public class VacancyGenerator {
    private static String[] positions = new String[] {
            "Data Scientist",
            "Web Developer",
            "Software Engineer",
            "Frontend Developer",
            "Backend Developer",
            "Full Stack Developer",
            "DevOps Engineer",
            "System Administrator",
            "Database Administrator",
            "Cloud Engineer",
            "Security Analyst",
            "Machine Learning Engineer",
            "Mobile Developer",
            "Network Engineer",
            "UX/UI Designer",
            "Product Manager",
            "Project Manager",
            "Quality Assurance Engineer",
            "Technical Writer",
            "Business Analyst",
            "Sales Engineer"};
    private static Random random = new Random();

    public static Vacancy generate() {
        String position = positions[random.nextInt(positions.length)];
        int salary = 10000 + random.nextInt(90000);
        return new Vacancy(position, salary);
    }
}
