import java.util.ArrayList;

public class JobAgency {
    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<Vacancy> vacancies = new ArrayList<>();
    private String companyName;

    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            for (Vacancy vacancy : vacancies) {
                observer.receiveOffer(vacancy.getDescription(), vacancy.getSalary(), companyName);
            }
        }
    }

    public void addVacancy(Vacancy vacancy, String companyName) {
        this.companyName = companyName;
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(Vacancy vacancy, String companyName) {
        vacancies.remove(vacancy);
        System.out.println("Vacancy removed: " + vacancy.getDescription() + " from company " + companyName);
        notifyObservers();
    }
}
