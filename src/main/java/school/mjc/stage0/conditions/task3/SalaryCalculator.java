package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double taxes;
        if (salary<=0)
            System.out.println("wrong input!");
        else {
            if (salary<=10000)
                taxes = salary*15.0/100.0;
            else 
                if (salary>20000)
                    taxes = salary*5.0;
                else
                    taxes = salary*18.0/100.0;
            System.out.println(taxes);
        }
    }
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.calculateSalary(145);
    }
}
