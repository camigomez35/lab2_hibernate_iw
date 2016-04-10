package co.edu.udea.iw.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.util.MyException;

public class ClienteDAOImplTest {

	@Test
	public void testInsertar() {
		Date fechaCreacion = null;
		ClienteDAO clienteDAO = null;
		Cliente cliente = new Cliente();
		cliente.setCedula("1152454724");
		cliente.setNombres("Maria Camila");
		cliente.setApellidos("Gomez Restrepo");
		cliente.setEmail("camigomez35@gmail.com");
		cliente.setUsuarioCrea("70124326");
		cliente.setFechaCreacion(fechaCreacion);
		
		try {
			clienteDAO = new ClienteDAOImpl();
			clienteDAO.insertar(cliente);
		} catch (MyException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

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

	@Test
	public void testModificar() {
		fail("Not yet implemented");
	}

	@Test
	public void testEliminar() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenerString() {
		fail("Not yet implemented");
	}

}
