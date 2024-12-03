package com.Shivam.DemoHibernate;

import org.hibernate.Session;	
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
        
    	Student student = new Student();
    	student.setName("Priya");
    	student.setRollNumber(13);
    	student.setStudentId(01);
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);	
    	SessionFactory sessionFactory = config.buildSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(student); 
    	tx.commit();
    }
}
