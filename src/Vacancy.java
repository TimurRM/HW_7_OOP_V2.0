public class Vacancy {
    private String description;
    private int salary;

    public Vacancy(String description, int salary) {
        this.description = description;
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public int getSalary() {
        return salary;
    }
}
