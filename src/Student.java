public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String vacancyDescription, int salary, String companyName) {
        System.out.println(name + " received an offer for vacancy: " + vacancyDescription + " with salary " + salary + " from company " + companyName);
    }
}

