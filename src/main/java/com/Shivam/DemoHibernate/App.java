package com.Shivam.DemoHibernate;

import org.hibernate.Session;		
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	
public class App 
{
    public static void main( String[] args )
    {
        
//    	Student student = new Student();
//    	student.setName("Priya");
//    	student.setRollNumber(13);
//    	student.setStudentId(01);
    	
    	Employee employee = new Employee();
//    	employee.setName("Rashi");
//    	employee.setEmployeeId(03);
//    	employee.setEmployeeSalary(500000);
    	
    	// configure() method is used to interact with hibernate.cfg.xml file
    	Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
    	
    	ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
    	
    	SessionFactory sessionFactory = config.buildSessionFactory(reg);
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	//session.save(employee); 
    	
    	// Fetching data from database. Get method takes class and (primary key or id) as parameter.
    	employee = session.get(Employee.class, 3);
    	
    	tx.commit();
    	
    	System.out.println(employee);
    }
}
