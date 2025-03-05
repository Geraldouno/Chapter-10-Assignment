public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, Date birthDate, double salary) {
        super(name, birthDate); 
        this.salary = salary;
    }

    @Override
    public double calculatePay(int currentMonth) {
        double pay = salary;

        if (getBirthDate().getMonth() == currentMonth) {
            pay += 100.00; 
        }

        return pay;
    }
}