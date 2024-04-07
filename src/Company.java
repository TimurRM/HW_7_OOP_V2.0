import java.util.ArrayList;

public class Company implements Publisher {
    private String name;
    private ArrayList<Vacancy> vacancies = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addVacancy(Vacancy vacancy) {
        vacancies.add(vacancy);
        System.out.println("Vacancy added: " + vacancy.getDescription() + " / Company: " + getName());
    }

    public void publishVacancies() {
        for (Vacancy vacancy : vacancies) {
            System.out.println("Publishing vacancy: " + vacancy.getDescription() + " / Company: " + getName());
        }
    }
}
