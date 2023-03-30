package org.example.oops.abstractexample;

public  class EmployeeDaoImplForMysql implements EmployeeDao{
    @Override
    public boolean save(Employee employee) {
        if(employee != null){
            if(employee.getId() >0 ){
                System.out.println("I am in save "+employee);
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee get(int id) {
        System.out.println("I am in get "+id);
        return null;
    }

    @Override
    public Employee update(Employee newEmployee) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    void mySqlMethod(){
        System.out.println(" i am mysql method");
    }


}
