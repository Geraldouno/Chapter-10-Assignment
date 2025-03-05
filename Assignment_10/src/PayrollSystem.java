public class PayrollSystem {
    public static void main(String[] args) {
        Date date1 = new Date(15, 5, 1985);  // May 15, 1985
        Date date2 = new Date(22, 7, 1990);  // July 22, 1990
        Date date3 = new Date(1, 5, 1980);   // May 1, 1980

        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee("Alice", date1, 3000.00);
        employees[1] = new HourlyEmployee("Bob", date2, 20.00, 160);  // 160 hours worked
        employees[2] = new SalariedEmployee("Charlie", date3, 4000.00);

        int currentMonth = 5;

        for (Employee employee : employees) {
            double pay = employee.calculatePay(currentMonth);
            System.out.println("Employee: " + employee.getName() + ", Pay: $" + pay);
        }
    }
}