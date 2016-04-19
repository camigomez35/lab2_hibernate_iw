package co.edu.udea.iw.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import co.edu.udea.iw.dto.Usuario;
import co.edu.udea.iw.util.MyException;

public class UsuarioDAOImplTest {

	/**
	 * Pruabe de obtención de un usuario por el login
	 */
	@Test
	public void testObtener() {
		Usuario usuario = null;
		UsuarioDAO usuarioDAO = null;
		try {
			usuarioDAO = new UsuarioDAOImpl();
			usuario= usuarioDAO.obtener("elver");
			
			System.out.println("Nombre usurio: " + usuario.getNombre());
			System.out.println("Nombre usurio: " + usuario.getRol().getNombre());
			assertNotNull(usuario);
			
		} catch (MyException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
