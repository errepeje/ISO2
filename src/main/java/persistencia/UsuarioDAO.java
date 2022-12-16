package persistencia;

import entities.Usuario;
import org.hibernate.Session;

public class UsuarioDAO<E> extends AbstractEntityDAO<E> {
	public Usuario obtenerUsuario(String nick, String pass) {
		Usuario usuario = null;
		try {
			Session session = openSession(Usuario.class);
			usuario = (Usuario) session.createQuery("FROM Usuario U WHERE U.nick = :nick").setParameter("nick", nick)
					.uniqueResult();			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closeSession();			
		}
		
		return usuario;
	}
}
