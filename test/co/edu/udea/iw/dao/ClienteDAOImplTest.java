package co.edu.udea.iw.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.util.MyException;

public class ClienteDAOImplTest {

	/*
	 * Prueba de inserción
	 */
	@Test
	public void testInsertar() {
		fail("Not yet implemented");
	}

	/*
	 * prueba para obtener todos los clientes
	 */
	@Test
	public void testObtener() {
		List <Cliente> clientes = null;
		ClienteDAO clienteDAO = null;
		try {
			clienteDAO = new ClienteDAOImpl();
			clientes= clienteDAO.obtener();
			
			assertTrue(clientes.size() >0);
		} catch (MyException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	/*
	 * Prueba para modificar
	 */
	@Test
	public void testModificar() {
		fail("Not yet implemented");
	}

	/*
	 * Prueba para eliminar
	 */
	@Test
	public void testEliminar() {
		fail("Not yet implemented");
	}

	/*
	 * Prueba para obtener un cliente por su cedula
	 */
	@Test
	public void testObtenerString() {
		Cliente cliente = null;
		ClienteDAO clienteDAO = null;
		try {
			clienteDAO = new ClienteDAOImpl();
			cliente= clienteDAO.obtener("1152454724");
			
			System.out.println("Cliente: " + cliente.getNombres());
			assertNotNull(cliente);
			
		} catch (MyException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
