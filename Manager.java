public class Manager implements Employee {
    private int fixPartSalary = 100000;
    private int amountEarnedMoney = (int) (115000 + ((140000 - 115000)) * Math.random());
    Company company;

    public Manager(Company company) {
        this.company = company;
        company.setIncome(amountEarnedMoney);
    }

    @Override
    public int getMonthSalary() {
        return (int) (fixPartSalary + amountEarnedMoney * 0.05);
    }

    public int getAmountEarnedMoney() {
        return amountEarnedMoney;
    }
}
