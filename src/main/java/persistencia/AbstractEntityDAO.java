package persistencia;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import controllers.GestorPropuestasCursos;
import jakarta.persistence.Query;

public abstract class AbstractEntityDAO<E> {
	
	private Session session;
	private SessionFactory sessionFactory;
	
	public Session openSession(Class clase) {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(clase).buildSessionFactory();
    	session = sessionFactory.openSession();
    	session.beginTransaction();
		
        return session;
    }
	
	public void closeSession() {
    	session.getTransaction().commit();
    	sessionFactory.close();
    }
	
	public Session getSession() {
        return session;
    }
	
	/* Operaciones CRUD */
	// Create
	public void persist(E entity) {
		openSession(entity.getClass());
		getSession().save(entity);
		closeSession();
	}
	
	// Read
	public Object findById(Class clase, String id) {
		openSession(clase);
        Object obj = getSession().get(clase, id);
        closeSession();
        return obj; 
    }
	
	public Object findById(Class clase, int id) {
		openSession(clase);
        Object obj = getSession().get(clase, id);
        closeSession();
        return obj; 
    }

	public List findAll(Class clase) {
        List objects = null;
        try {
        	openSession(clase);
            Query query = session.createQuery("from " + clase.getName());
            objects = ((org.hibernate.query.Query) query).list();
            closeSession();
        } catch (HibernateException e) {
        	Logger logger = Logger.getLogger(GestorPropuestasCursos.class.getName());
			logger.log(null, "Error Abstract Entity");
        }
        
        return objects;
    }
	
	// Update
	public void update(E entity) {
		openSession(entity.getClass());
        getSession().update(entity);
        closeSession();
    }
	
	// Delete
	public void delete(E entity) {
		openSession(entity.getClass());
        getSession().delete(entity);
        closeSession();
    }
	
}
