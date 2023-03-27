package org.example.oops.thiskeyword;

import java.util.Date;


// pojo entity DTO model
// encapsulation
public class Employee {
    private String name;
    private int age;
    private Date joiningDate;
    private String text;

    Employee(){

    }

    Employee(String name,Date joiningDate){
        this.text = name + joiningDate;
        this.name = name;
        this.joiningDate = joiningDate;
    }
    Employee(String name, int age,Date joiningDate){
        this.name=name;
        this.age = age;
        this.joiningDate = joiningDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void printDOJ(){
        System.out.println(this.joiningDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", joiningDate=" + joiningDate +
                '}';
    }



}
