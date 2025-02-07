package com.Shivam.DemoHibernate;

import org.hibernate.Session;		
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	
public class App 
{
    @SuppressWarnings("deprecation") // suppress deprecation warnings. 
	public static void main( String[] args )
    {
        
    	Laptop laptop = new Laptop();
    	laptop.setlId(103);
    	laptop.setlName("Lenovo");
    	
    	Student student = new Student();
    	student.setName("Niggatosh");
    	student.setRollNumber(14);
    	student.setStudentId(03);
    	student.getLaptop().add(laptop); 
    	
//    	Member member = new Member();
//    	member.setfName("Mathew");
//    	member.setmName("Suresh");
//    	member.setlName("Zachariah");
    	
//    	Employee employee = new Employee();
//    	employee.setEmployeeId(101);
//    	employee.setEmployeeSalary(45000);
//    	employee.setMember(member); // embedding an object into another table.
    	
//    	employee.setName("Rashi");
//    	employee.setEmployeeId(03);
//    	employee.setEmployeeSalary(500000);
    	
    	// configure() method is used to interact with hibernate.cfg.xml file
    	Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	
    	ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
    	
    	SessionFactory sessionFactory = config.buildSessionFactory(reg);
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	//session.save(employee); 
    	
    	//Fetching data from database. Get method takes class and (primary key or id) as parameter.
    	//Employee employee = session.get(Employee.class, 3);
    	
    	session.save(laptop);
    	session.save(student);
    	
    	tx.commit();
    	
    	System.out.println(student);
    }
}
