//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Iterator;




        public class Main {


        public static void main(String[] args) {
            ArrayList<Employee> employees = new ArrayList();
            Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
            Technology technology = new Technology("Java", 800);
            dev.addTechnology(technology);
            employees.add(dev);
            Tester tester = new Tester("Jane", "Smith", "Los angeles", "jane@smith.com", "987654321", 2021);
            tester.addTestType("UI/UX");
            employees.add(tester);
            Manager manager = new Manager("Bob", "Johnson", "Chicago", "bob@johnson.com", "1122334455", 2019);
            Goal goal = new Goal(2010, 10, 15, "Implementing FB login", 1000);
            manager.addGoals(goal);
            employees.add(manager);
            int totalAmount = 0;

            Employee employee;
            for(Iterator var8 = employees.iterator(); var8.hasNext(); totalAmount += employee.calculateSalary()) {
                employee = (Employee)var8.next();
            }

            System.out.println("Total amount to be paid this month: " + totalAmount + " usd");
        }
    }


