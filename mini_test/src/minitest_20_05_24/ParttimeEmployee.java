package minitest_20_05_24;

public class ParttimeEmployee extends Employee {
    double workHour ;

    public ParttimeEmployee(int code, String name, int age, String phoneNumber, String email, double workHour) {
        super(code, name, age, phoneNumber, email);
        this.workHour = workHour;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    @Override
    public double getSalary() {
        return workHour * 100000;
    }
}
