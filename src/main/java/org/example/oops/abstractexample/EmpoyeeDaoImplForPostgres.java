package org.example.oops.abstractexample;

public class EmpoyeeDaoImplForPostgres implements EmployeeDao{
    @Override
    public boolean save(Employee employee) {
        return false;
    }

    @Override
    public Employee get(int id) {
        return null;
    }

    @Override
    public Employee update(Employee newEmployee) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
