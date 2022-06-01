import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    public int income;

    private final List<Employee> listEmployees = new ArrayList<>();

    public List<Employee> getListEmployees() {
        return listEmployees;
    }

    void hire(Employee employee) {
        listEmployees.add(employee);
    }

    void hireAll(List<Employee> employees) {
        listEmployees.addAll(employees);
    }

    void fire(Employee employee) {

        listEmployees.remove(employee);
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int amountEarnedMoneyOfManger) {
        income += amountEarnedMoneyOfManger;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        listEmployees.sort(new EmployeesComparator());
        Collections.reverse(listEmployees);

        return getListSalary(listEmployees, count);
    }

    List<Employee> getLowestSalaryStaff(int count) {
        listEmployees.sort(new EmployeesComparator());
        return getListSalary(listEmployees, count);
    }

    private List<Employee> getListSalary(List<Employee> employees, int count) {
        if (count <= 0) {
            return Collections.emptyList();
        } else {
            if (count < employees.size()) {
                return employees.subList(0, count);
            } else {
                return employees;
            }
        }
    }

    public int getNumberEmployees(Company company) {
        return listEmployees.size();
    }
}
