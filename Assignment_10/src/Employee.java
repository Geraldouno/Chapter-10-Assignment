public abstract class Employee {
    private String name;
    private Date birthDate;

    public Employee(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public abstract double calculatePay(int currentMonth);
}