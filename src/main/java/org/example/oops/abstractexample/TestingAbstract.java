package org.example.oops.abstractexample;

public class TestingAbstract {
    public static void main(String[] args) {
//        FileHandler handler = new FileHandler();
//        handler.age=30;
//        handler.download("xyz.txt");
//        handler.upload();
//        handler.fileHandle();

//
//        FileHandlerChild fileHandlerChild= new FileHandlerChild();
//        fileHandlerChild.fileHandle();

        Employee employee = new Employee();
        employee.setId(1);
        EmployeeDaoImplForMysql employeeDao = new EmployeeDaoImplForMysql();
        boolean isSaved = employeeDao.save(employee);
        System.out.println("Is saved "+ isSaved);
//        employeeDao.get(1);
//        employeeDao.mySqlMethod();


    }
}
