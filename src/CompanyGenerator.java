import java.util.Random;

public class CompanyGenerator {
    private static final String[] COMPANY_NAMES = {
            "Tech Solutions Inc.",
            "Innovate Corp",
            "Global Tech Enterprises",
            "Future Systems Ltd.",
            "Digital Innovations LLC",
            "Smart Solutions Co.",
            "Tech Innovations Ltd.",
            "Global Software Group",
            "Innovative Technologies Inc.",
            "Advanced Systems Corporation"};
    private static final Random random = new Random();

    public static Company generate() {
        String companyName = COMPANY_NAMES[random.nextInt(COMPANY_NAMES.length)];
        return new Company(companyName);
    }
}

