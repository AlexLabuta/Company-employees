public class Operator implements Employee {
    private int fixPartSalary = 50000;
    Company company;

    public Operator(Company company) {
        this.company = company;
    }

    public int getMonthSalary() {
        return fixPartSalary;
    }
}
