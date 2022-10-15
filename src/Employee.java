public class Employee {
    private String name;
    private Integer salary;
    private Integer workHours;
    private Integer hireYear;

    public Employee(String name, Integer salary, Integer workHours, Integer hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public Integer tax() {
        if (this.salary > 1000) {
            return (this.salary / 100) * 3;
        } else {
            return 0;
        }
    }

    public Integer bonus() {
        if (this.workHours > 40) {
            Integer overTime = this.workHours - 40;
            return overTime * 30;
        } else {
            return 0;
        }
    }

    public Double raiseSalary() {
        Integer workingYear = 2021 - this.hireYear;
        Integer income = this.salary + bonus() - tax();
        if (workingYear < 10) {
            return income * 0.05;
        } else if (workingYear < 20 && workingYear > 9) {
            return income * 0.10;
        } else {
            return income * 0.15;
        }
    }


    public String toString() {
        Integer tax = tax();
        Integer bonus = bonus();
        Double salaryRaise = raiseSalary();
        Integer incomeWithTaxAndBonus = this.salary + bonus - tax;
        Integer totalIncome = this.salary + bonus;

        String result = "isim: "+ this.name
                + " maas: " + this.salary
                + " calisma saati: " + this.workHours
                + " baslangic yili: "+ this.hireYear
                +  " vergi: " + tax
                +  " bonus: " + bonus
                +  " maas artisi: " + salaryRaise
                +  " Vergi ve bonuslarla birlikte maas: " + incomeWithTaxAndBonus
                +  " Toplam maas: " +  totalIncome;
        System.out.println(result);
        return result;
    }
}
