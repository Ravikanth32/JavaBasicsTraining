package org.example.oops.abstractexample;

public interface EmployeeDao {

    static void m1() {
        System.out.println();
    }

    boolean save(Employee employee);

    Employee get(int id);

    Employee update(Employee newEmployee);

    void delete(int id);

}
