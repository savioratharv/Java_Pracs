public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 50000.0, 2020, "123-45-6789");
        Employee emp2 = new Employee("Jane Doe", 60000.0, 2021, "987-65-4321");
        // Testing accessor methods
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getAnnualSalary());
        System.out.println("Start Year: " + emp1.getStartYear());
        System.out.println("National Insurance Number: " + emp1.getNationalInsuranceNumber());
        // Testing equals method
        System.out.println("Are emp1 and emp2 equal? " + emp1.equals(emp2));
    }
}
