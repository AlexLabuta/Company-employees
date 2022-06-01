public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        hireEmployees(company);

        System.out.println("Топ 10 зарплат:");
        for (Employee employees : company.getTopSalaryStaff(10)) {
            System.out.println(employees.getMonthSalary() + " руб.");
        }

        System.out.println("30 самых низких зарплат:");
        for (Employee employees : company.getLowestSalaryStaff(30)) {
            System.out.println(employees.getMonthSalary() + " руб.");
        }
        System.out.println("Увольняем половину сотрудинков");
        int count = company.getNumberEmployees(company) / 2;
        for (int i = 0; i < count; i++) {
            int indexFire = (int) (company.getNumberEmployees(company) * Math.random());
            company.fire(company.getListEmployees().get(indexFire));
        }

        System.out.println("Топ 10 зарплат:");
        for (Employee employees : company.getTopSalaryStaff(10)) {
            System.out.println(employees.getMonthSalary() + " руб.");
        }

        System.out.println("30 самых низких зарплат:");
        for (Employee employees : company.getLowestSalaryStaff(30)) {
            System.out.println(employees.getMonthSalary() + " руб.");
        }
    }

    private static void hireEmployees(Company company) {

        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator(company);
            company.hire(operator);
        }

        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager(company);
            company.hire(manager);
        }

        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager(company);
            company.hire(topManager);
        }
    }
}
