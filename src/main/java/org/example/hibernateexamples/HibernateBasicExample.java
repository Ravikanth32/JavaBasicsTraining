package org.example.hibernateexamples;

import org.example.hibernateexamples.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.IdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateBasicExample {
    public static void main(String[] args) {
//        save();

//        saveWithJavaConfigurations();
        saveExample();

//        SessionFactory sessionFactory1 = new Configuration().configure()
//                .buildSessionFactory();
//
//        Session session1 = sessionFactory1.openSession();
//        session1.beginTransaction();
//
//        Employee employee1 = new Employee();
//        employee1.setName("ram");
//        employee1.setEmail("ram@gmail.com");
//
//        session1.save(employee1);
//
//        session1.getTransaction().commit();
//        session1.close();
//        sessionFactory1.close();
    }

    private static void saveExample() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactoryUsingJavaConfiguration();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Employee employee = new Employee();
        employee.setName("ravi");
        employee.setEmail("ravi@gmail.com");
        session.save(employee);
        session.clear();
        session.evict(employee);
        employee.setEmail("ravixyz@gmail.com");
        session.getTransaction().commit();


//        Session deleteSession = HibernateUtil.getSessionFactoryUsingJavaConfiguration().openSession();
//        deleteSession.beginTransaction();
//        deleteSession.clear();
//        deleteSession.evict(employee);
//        deleteSession.close();
//        session.beginTransaction();
//        session.remove(employee);  // session.delete(employee)
//        session.getTransaction().commit();
//        session.close();

//        ------ Retrieve Employee ID
        // byID
        Session session1 = HibernateUtil.getSessionFactoryUsingJavaConfiguration().openSession();
//        Employee e = session1.byId(Employee.class).getReference(1L);
//        System.out.println(e.getEmail());
        // Load

//        Employee loadEmp = session1.load(Employee.class, 2L);
//        System.out.println(loadEmp.getEmail());
        // GET
        Employee employee1 = session1.get(Employee.class, 2L);
        System.out.println(employee1);
        // Hibernate

//        List<Employee> employees = session1.createQuery("from Employee", Employee.class).list();
//        employees.forEach(emp -> System.out.println("------------->"+emp.getName()));


        HibernateUtil.shutdown();
    }

    private static void saveWithJavaConfigurations() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactoryUsingJavaConfiguration();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Employee employee = new Employee();
        employee.setName("ravi");
        employee.setEmail("ravi@gmail.com");
        session.save(employee);

        Employee ram = new Employee();
        ram.setName("ram");
        ram.setEmail("ram@gmail.com");

        session.save(ram);

        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
    private static void save() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory1();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Employee employee = new Employee();
        employee.setName("ravi");
        employee.setEmail("ravi@gmail.com");
        session.save(employee);

        Employee ram = new Employee();
        ram.setName("ram");
        ram.setEmail("ram@gmail.com");

        session.save(ram);

        session.getTransaction().commit();
        session.close();
        HibernateUtil.close();
    }
}
