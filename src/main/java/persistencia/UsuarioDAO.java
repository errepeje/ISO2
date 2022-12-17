package persistencia;

import entities.Usuario;

import java.util.logging.Logger;

import org.hibernate.Session;

import controllers.GestorPropuestasCursos;

public class UsuarioDAO<E> extends AbstractEntityDAO<E> {
	
	
	@SuppressWarnings("deprecation")
	public Usuario obtenerUsuario(String nick) {
		Usuario usuario = null;
		try {
			Session session = openSession(Usuario.class);
			usuario = (Usuario) session.createQuery("FROM Usuario U WHERE U.nick = :nick").setParameter("nick", nick)
					.uniqueResult();
		} catch(Exception e) {
			Logger logger = Logger.getLogger(GestorPropuestasCursos.class.getName());
			logger.log(null, "Error Gestor Propuesta");
		} finally {
			closeSession();
		}
		
		return usuario;
	}
}
