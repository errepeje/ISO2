package persistencia;

import entities.Usuario;
import org.hibernate.Session;

public class UsuarioDAO<E> extends AbstractEntityDAO<E> {
	public Usuario obtenerUsuario(String nick) {
		Usuario usuario = null;
		try {
			Session session = openSession(Usuario.class);
			usuario = (Usuario) session.createQuery("FROM Usuario U WHERE U.nick = :nick").setParameter("nick", nick)
					.uniqueResult();
			closeSession();
		} catch(Exception e) {
			Throwable throwable = new Throwable();
			throwable.printStackTrace();
		} finally {
			closeSession();
		}
		
		return usuario;
	}
}
