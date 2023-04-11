package org.example.hibernateexamples.util;

import org.example.hibernateexamples.Employee;
import org.example.hibernateexamples.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateUtil {

    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration().configure()
                        .buildSessionFactory();
            } catch (Exception e) {
                if (sessionFactory != null) {
                    sessionFactory.close();
                }
            }
        }
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory1() {
        if (sessionFactory == null) {
            try {
                registry = new StandardServiceRegistryBuilder().configure().build();
                MetadataSources sources = new MetadataSources(registry);
                Metadata metadata = sources.getMetadataBuilder().build();
                sessionFactory = metadata.getSessionFactoryBuilder().build();
            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }


    public static SessionFactory getSessionFactoryUsingJavaConfiguration() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties properties = new Properties();
                properties.put("hibernate.connection.driver_class", "org.postgresql.Driver");
                properties.put("hibernate.connection.url", "jdbc:postgresql://localhost:5432/sample");
                properties.put("hibernate.connection.username", "postgres");
                properties.put("hibernate.connection.password", "postgres");
                properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
                properties.put(Environment.SHOW_SQL, "true");
                properties.put("hibernate.hbm2ddl.auto", "create");
                configuration.setProperties(properties);
                configuration.addAnnotatedClass(Employee.class);
                configuration.addAnnotatedClass(Student.class);
                registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(registry);
            } catch (Exception e) {
                e.printStackTrace();
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }

    public static void shutdown() {
        if (registry != null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    public static void close() {
        if (sessionFactory == null) {
            sessionFactory.close();
        }
    }
}
