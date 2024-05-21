package minitest_20_05_24;

public class Main {
    public static void main(String[] args) {
        Employee [] employees = new Employee[6];
        employees[0] = new FulltimeEmployee(001,"Chuck",25,"0325385051","sampleA@gamail.com",500000,70000,5000000);
        employees[1] = new FulltimeEmployee(002,"Mike",21,"0159472051","sampleB@gamail.com",550000,0,3000000);
        employees[2] = new FulltimeEmployee(003,"Dik",27,"0957503581","sampleC@gamail.com",0,120000,4000000);
        employees[3] = new ParttimeEmployee(004,"Mick",20,"0938505757","SampleD@gmail.com",40);
        employees[4] = new ParttimeEmployee(005,"Mai",25,"0938543532","SampleE@gmail.com",30);
        employees[5] = new ParttimeEmployee(006,"Paul",23,"0593059533","SampleF@gmail.com",35);

        System.out.println("Average Salary: " + getAverageSalary(employees));
        System.out.println(" ");
        double averageSalary = getAverageSalary(employees);
        System.out.println("Employee's salary less than average salary: ");
        compareEmpSalary(employees, averageSalary);
        System.out.println(" ");
        System.out.println("Total salary pay for part time employee: "+getTotalParttimeSalary(employees));
        System.out.println(" ");
        FulltimeEmployee [] fulltimeEmployee = getFulltimeList(employees);
        getSortFulltimeEmp(fulltimeEmployee);


   }
    public static double getAverageSalary(Employee [] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        double averageSalary = Math.round((totalSalary / employees.length) * 100.0) / 100.0;

        return averageSalary;
    }
    public static void compareEmpSalary(Employee [] employees, double value){
        for (Employee employee: employees){
            if (employee.getSalary() < value){
                System.out.println(employee.getName()+" "+employee.getCode()+" "+employee.getSalary());
            }
        }
    }
    public static double getTotalParttimeSalary(Employee [] employees){
        double totalSalaryParttime = 0;
        for (Employee employee : employees){
            if (employee instanceof ParttimeEmployee){
                ParttimeEmployee parttimeEmp = (ParttimeEmployee) employee;
                totalSalaryParttime += parttimeEmp.getSalary();
            }
        }
        return totalSalaryParttime;

    }
    public static FulltimeEmployee [] getFulltimeList(Employee[] employees){
        int countFulltimeEmployee = 0;
        for (Employee employee : employees){
            if(employee instanceof FulltimeEmployee){
                countFulltimeEmployee++;
            }
        }
        FulltimeEmployee [] fulltimeEmployees = new FulltimeEmployee[countFulltimeEmployee];
        int index = 0;
        for (Employee employee : employees){
            if(employee instanceof  FulltimeEmployee){
                fulltimeEmployees[index++]= (FulltimeEmployee) employee;
            }
        }
        return fulltimeEmployees;
    }
    public static void getSortFulltimeEmp(FulltimeEmployee [] employees){
        for (int i = 0; i < employees.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < employees.length; j++) {
                if (employees[j].getSalary() < employees[minIndex].getSalary()){
                    minIndex = j;
                }
            }
            FulltimeEmployee temp = employees[minIndex] ;
            employees[minIndex] = employees[i];
            employees[i] = temp;
        }
        for (FulltimeEmployee fulltimeEmployee : employees){
            System.out.println(fulltimeEmployee.getName()+ " "+fulltimeEmployee.getSalary());
        }
    }
}

