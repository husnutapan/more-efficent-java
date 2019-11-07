package stream;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class PredicateStream {

    public static void main(String[] args) {

        Date myDate1 = new Date(2014, 02, 11);
        Date myDate2 = new Date(2015, 02, 11);
        Date myDate3 = new Date(2016, 02, 11);
        Date myDate4 = new Date(2017, 02, 11);

        PredicateStream predicateStream = new PredicateStream();
        List<Company> companies = new ArrayList<Company>() {{
            add(new Company(1l, "Google", true, myDate1));
            add(new Company(2l, "Facebook", false, myDate2));
            add(new Company(3l, "Yahoo", true, myDate3));
            add(new Company(4l, "Uber", true, myDate4));
        }};

        System.out.println("----Basic Predication---");
        predicateStream.getFortuneCompanies(predicateStream.getFortuneCompanies(companies)).stream().forEach(System.out::println);

        System.out.println("----Multiple Predication----");
        predicateStream.getFortuneCompanies(predicateStream.getFortuneAndNewFoundationCompanies(companies)).stream().forEach(System.out::println);
    }

    public List<Company> getFortuneCompanies(List<Company> companies) {
        return companies.stream().filter(PredicateUtils.getActiveCompanies()).collect(Collectors.toList());
    }

    public List<Company> getFortuneAndNewFoundationCompanies(List<Company> companies) {
        return companies.stream()
                .filter(PredicateUtils.getMultiplePredication().stream().reduce(k -> true, Predicate::and))
                .collect(Collectors.toList());
    }

}

class PredicateUtils {
    static Predicate<Company> getActiveCompanies() {
        Predicate<Company> predicate = company -> company.isActive();
        return predicate;
    }

    static Predicate<Company> newlyFoundationCompanies() {
        Predicate<Company> predicate = company -> {
            int foundationYear = company.getFoundationDate().getYear();
            if (foundationYear > 2015) return true;
            return false;
        };
        return predicate;
    }

    static List<Predicate<Company>> getMultiplePredication() {
        List<Predicate<Company>> predicates = new ArrayList<>();
        predicates.add(getActiveCompanies());
        predicates.add(newlyFoundationCompanies());
        return predicates;
    }
}

class Company {
    private Long id;
    private String name;
    private boolean active;
    private Date foundationDate;

    public Company(Long id, String name, boolean active, Date foundationDate) {
        this.id = id;
        this.active = active;
        this.name = name;
        this.foundationDate = foundationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }

    @Override
    public String toString() {
        return "Company Name: " + name;
    }
}

class MapLine {
    private Company company;
    private int employeeSize;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getEmployeeSize() {
        return employeeSize;
    }

    public void setEmployeeSize(int employeeSize) {
        this.employeeSize = employeeSize;
    }
}