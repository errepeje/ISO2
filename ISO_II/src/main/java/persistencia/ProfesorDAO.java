package persistencia;

//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import entities.Profesor;

public class ProfesorDAO<E> extends AbstractEntityDAO<E> {
//	
//	private Session session;
//	private SessionFactory sessionFactory;
	
	public ProfesorDAO() {}

//	public Profesor findById(String id, Profesor p) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
//	public Session openSession() {
//		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Profesor.class).buildSessionFactory();
//    	session = sessionFactory.openSession();
//    	session.beginTransaction();
//		
//        return session;
//    }
   
//    public void closeSession() {
//    	session.getTransaction().commit();
//    	sessionFactory.close();
//    }
 
//    public Session getCurrentSession() {
//        return session;
//    }
 
//    public void persist(Profesor entity) {
//        getCurrentSession().save(entity);
//    }
// 
//    public void update(Profesor entity) {
//        getCurrentSession().update(entity);
//    }
// 
//    public Profesor findById(String id) {
//    	Profesor profesor = (Profesor) getCurrentSession().get(Profesor.class, id);
//        return profesor; 
//    }
// 
//    public void delete(Profesor entity) {
//        getCurrentSession().delete(entity);
//    }
 
//    @SuppressWarnings("unchecked")
//    public List<Profesor> findAll() {
//        List<Profesor> profesores = (List<Profesor>) getCurrentSession().createQuery("from Profesor").list();
//        return profesores;
//    }
// 
//    public void deleteAll() {
//        List<Profesor> entityList = findAll();
//        for (Profesor entity : entityList) {
//            delete(entity);
//        }
//    }
}
