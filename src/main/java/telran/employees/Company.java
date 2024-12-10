package telran.employees;

public interface Company extends Iterable<Employee> {
    void addEmployee(Employee empl);

    Employee getEmployee(long id);

    Employee removeEmployee(long id);

    int getDepartmentBudget(String department);

    String[] getDepartments();

    Manager[] getManagersWithMostFactor();
}
