import java.util.ArrayList;
import java.util.Iterator;

public class Manager extends Employee {
    private ArrayList<Goal> goals = new ArrayList();

    public Manager(String name, String surname, String city, String email, String Pesel, int year) {
        super(name, surname, city, email, Pesel, year);
    }

    public void addGoals(Goal goal) {
        this.goals.add(goal);
    }

    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = 0;

        Goal var4;
        for(Iterator var3 = this.goals.iterator(); var3.hasNext(); var4 = (Goal)var3.next()) {
        }

        return baseSalary + bonus;
    }
}