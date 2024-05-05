import java.util.ArrayList;
import java.util.Iterator;

public class Developer extends Employee {
    private ArrayList<Technology> technologies = new ArrayList();

    public Developer(String name, String surname, String city, String email, String Pesel, int year) {
        super("john", "doe", "newYork", "john@doe.com", "123456789", 2020);
    }

    public void addTechnology(Technology technology) {
        this.technologies.add(technology);
    }

    public int calculateSalary() {
        int base = super.calculateSalary();
        int bonus = 0;

        Technology tech;
        for(Iterator var3 = this.technologies.iterator(); var3.hasNext(); bonus += tech.getBonus()) {
            tech = (Technology)var3.next();
        }

        return base + bonus;
    }
}
