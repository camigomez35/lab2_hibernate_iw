package co.edu.udea.iw.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.HibernateException;
import org.junit.Test;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.util.MyException;

public class CiudadDAOImplTest {

	/*
	 * Prueba para obtener todos las ciudades
	 */
	@Test
	public void testObtener() {
		List <Ciudad> ciudades = null;
		CiudadDAO ciudadDAO = null;
		try {
			ciudadDAO = new CiudadDAOImpl();
			ciudades = ciudadDAO.obtener();
			
			assertTrue(ciudades.size() >0);
		} catch (MyException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}

}
