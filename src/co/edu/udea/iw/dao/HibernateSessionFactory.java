package co.edu.udea.iw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import co.edu.udea.iw.util.MyException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author CamiGomez318
 * @version 1
 */
class HibernateSessionFactory {

	private static SessionFactory sessionFactory = null;
	private Configuration configuration = new Configuration();
	private static HibernateSessionFactory hsf = null;
	
	
	protected HibernateSessionFactory(){
		
	}
	 public static HibernateSessionFactory getInstance(){
		 if (hsf==null){
			 hsf = new HibernateSessionFactory();
			 return hsf;
		 }else{
			 return hsf;
		 }
	 }
	
	public Session getSession() throws MyException{
		try {
			if (sessionFactory == null) {
				configuration.configure("co/edu/udea/iw/dto/hibernate.cfg.xml");
				sessionFactory = configuration.buildSessionFactory();
			}
			return sessionFactory.openSession();
		} catch (HibernateException e) {
			throw new MyException(e);
		}
	}
	
}



