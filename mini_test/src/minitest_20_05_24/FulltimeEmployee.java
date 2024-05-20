package minitest_20_05_24;

public class FulltimeEmployee extends Employee {
    double bonus ;
    double fine;
    double baseSalary;

    public FulltimeEmployee(int code, String name, int age, String phoneNumber, String email, double bonus, double fine, double baseSalary) {
        super(code, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fine = fine;
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return baseSalary + (bonus - fine);
    }
}
