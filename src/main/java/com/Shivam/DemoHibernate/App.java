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
    	employee.setName("Shivam");
    	employee.setEmployeeId(02);
    	employee.setEmployeeSalary(50000);
    	
    	// configure() method is used to interact with hibernate.cfg.xml file
    	Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
    	
    	ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
    	
    	SessionFactory sessionFactory = config.buildSessionFactory(reg);
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(employee); 
    	
    	tx.commit();
    }
}
