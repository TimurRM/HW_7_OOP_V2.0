public class Master implements Observer {
    private String name;
    private int salary;
    private String companyName;

    public Master(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Метод для установки названия компании
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void receiveOffer(String vacancyDescription, int salary, String companyName) {
        System.out.println(name + " received an offer for vacancy: " + vacancyDescription + " with salary " + salary + " from company " + companyName);
    }
}
