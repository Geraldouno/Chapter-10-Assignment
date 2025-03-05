public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, Date birthDate, double hourlyRate, int hoursWorked) {
        super(name, birthDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay(int currentMonth) {
        double pay = hourlyRate * hoursWorked;

        if (getBirthDate().getMonth() == currentMonth) {
            pay += 100.00; 
        }

        return pay;
    }
}