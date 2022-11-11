package controllers;

import entities.CursoPropio;
import entities.ProfesorUCLM;
import entities.Usuario;
import persistencia.CursoPropioDAO;
import persistencia.ProfesorDAO;
import persistencia.UsuarioDAO;

public class GestorLogin {
	
	
//	static EstudianteDAO eDAO = new CursoPropioDAO<Estudiante>();
//	static JefeGabinete jgDAO = new JefeGabineteDAO<JefeGabinete>();
//	static PersonalVicerrectoradoDAO pvDAO = new PersonalVicerrectoradoDAO<PersonalVicerrectorado>();
	static UsuarioDAO uDAO = new UsuarioDAO<Usuario>();
	static ProfesorDAO pDAO = new ProfesorDAO<ProfesorUCLM>();
	
	public static String iniciarSesion (String nick, String password) throws Exception {
		String uID="";
		Usuario existente = uDAO.obtenerUsuario(nick, password);
		if (existente.getPassword().equals(password))
			uID=existente.getDni();
		else
			throw new Exception ("Usuario o contraseña incorrectos");
		return uID;
	}
}
