package controllers;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GestorLoginTest {

	@Test
	public void testIniciarSesion() throws NullPointerException, Exception {
		String nick = "fer";
		String password = "fer";
		String uID = "";
		uID = GestorLogin.iniciarSesion(nick, password);
		assertTrue(uID.equals("01234432"));
	}
	
	@Test
	public void testObtenerTipoUsuarioEstudiante() {
		String uIDTest = "02222222";
		String userTypeTest = GestorLogin.obtenerTipoUsuario(uIDTest);	
		assertTrue(userTypeTest.equals("Estudiante"));
	}

	@Test
	public void testObtenerTipoUsuarioProfesor() {
		String uIDTest = "87423456";
		String userTypeTest = GestorLogin.obtenerTipoUsuario(uIDTest);	
		assertTrue(userTypeTest.equals("Profesor"));
	}
	
	@Test
	public void testObtenerTipoUsuarioJefeGabinete() {
		String uIDTest = "99923456";
		String userTypeTest = GestorLogin.obtenerTipoUsuario(uIDTest);	
		assertTrue(userTypeTest.equals("JefeGabinete"));
	}
	
	@Test
	public void testObtenerTipoUsuarioVicerrectorado() {
		String uIDTest = "01234432";
		String userTypeTest = GestorLogin.obtenerTipoUsuario(uIDTest);	
		assertTrue(userTypeTest.equals("Vicerrectorado"));
	}

	@Test
	public void testObtenerTipoUsuarioNoTipo() {
		String uIDTest = "99999999999";
		String userTypeTest = GestorLogin.obtenerTipoUsuario(uIDTest);	
		assertTrue(userTypeTest.equals("noTipo"));
	}
}