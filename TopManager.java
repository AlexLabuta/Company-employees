public class TopManager implements Employee {
    Company company;
    private int fixPartSalary = 300000;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        if (company.getIncome() > 10000000) {
            return (int) (fixPartSalary * 2.5);
        }

        return fixPartSalary;
    }
}
