public class Program {
    public static void main(String[] args) {

        JobAgency agency = new JobAgency();

        Master master = new Master(NameGenerator.generate(), NameGenerator.generateSalary(30000, 100000));


        Specialisation specialist = new Specialisation(NameGenerator.generate(), NameGenerator.generateSalary(30000, 100000));
        Student student = new Student(NameGenerator.generate());
        agency.registerObserver(master);
        agency.registerObserver(specialist);
        agency.registerObserver(student);

        Company company1 = CompanyGenerator.generate();
        Company company2 = CompanyGenerator.generate();
        Company company3 = CompanyGenerator.generate();

        master.setCompanyName(company1.getName());
        agency.registerObserver(master);
        master.setCompanyName(company2.getName());
        agency.registerObserver(master);
        master.setCompanyName(company3.getName());
        agency.registerObserver(master);

        Vacancy vacancy1 = VacancyGenerator.generate();
        Vacancy vacancy2 = VacancyGenerator.generate();
        Vacancy vacancy3 = VacancyGenerator.generate();
        agency.addVacancy(vacancy1, company1.getName());
        agency.addVacancy(vacancy2, company2.getName());
        agency.addVacancy(vacancy3, company3.getName());


        company1.addVacancy(vacancy1);
        company2.addVacancy(vacancy2);
        company3.addVacancy(vacancy3);
        company1.publishVacancies();
        company2.publishVacancies();
        company3.publishVacancies();


        agency.removeVacancy(vacancy1, company1.getName());
        agency.removeVacancy(vacancy3, company2.getName());
        agency.removeVacancy(vacancy3, company3.getName());;

    }
}
