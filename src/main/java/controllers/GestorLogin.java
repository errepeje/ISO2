package controllers;

import entities.Estudiante;
import entities.JefeGabinete;
import entities.PersonalVicerrectorado;
import entities.ProfesorUCLM;
import entities.Usuario;
import persistencia.UsuarioDAO;

public class GestorLogin {
	
	static UsuarioDAO uDAO = new UsuarioDAO<Usuario>();
	
	public static String iniciarSesion (String nick, String password) throws Exception, NullPointerException {
		String uID="";
		Usuario existente = uDAO.obtenerUsuario(nick, password);
		if (existente.getPassword().equals(password))
			uID=existente.getDni();
		else
			throw new Exception ("Usuario o contraseña incorrectos");
		return uID;
	}
	public static String obtenerTipoUsuario (String uID) {
		Estudiante e = (Estudiante) uDAO.findById(Estudiante.class, uID);
		ProfesorUCLM pU = (ProfesorUCLM) uDAO.findById(ProfesorUCLM.class, uID);
		PersonalVicerrectorado p = (PersonalVicerrectorado) uDAO.findById(PersonalVicerrectorado.class, uID);
		JefeGabinete jG = (JefeGabinete) uDAO.findById(JefeGabinete.class, uID);
		if (e != null)
			return "Estudiante";
		if (pU != null)
			return "Profesor";
		if (p != null)
			return "Vicerrectorado";
		if (jG != null)
			return "JefeGabinete";
		return "noTipo";
	}
}
