package org.example.oops.thiskeyword;

import org.example.oops.Animal;

import java.util.Date;


public class ThisKeywordExample {
    public static void main(String[] args) {
//        Date joiningDate = new Date();
//        Employee e = new Employee("e",20,new Date());
////        System.out.println(e.hashCode());
//        System.out.println(e.name);
//        e.printDOJ();
//
//        Employee e1 = new Employee();
//        e1.name="ravi";
//        e1.joiningDate = new Date();
//        System.out.println(e1.name);
//        e1.printDOJ();
//
//        Employee e2 = new Employee("e2",new Date());
////        e2.name="ravi";
//        e2.setName("ravi");
//        String name = e2.getName();
//        e2.printDOJ();
//        System.out.println(name);
//
//        Animal a= new Animal();
//        User u = new User(null,13);
//        System.out.println(u.name());

//        User u1 = new User();

        Person p = new Person();

        Person ravi = new Person();
        ravi.setName("ravi");
        ravi.setEmail("ravi@gmail.com");
        System.out.println(ravi.toString());
        Person raj = new Person("raja","raja@gm.com");
        System.out.println(raj.toString());

        Person ram = Person.builder().name("ram").email("ram@gm.com").build();

        System.out.println(ram);

//        Person p = new Person("ravi");

        // gradle

    }
}
