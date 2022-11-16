package persistencia;

public class EstudianteDAO<E> extends AbstractEntityDAO<E> {
	
	public EstudianteDAO() {}
	
	
	
//	public void insertar(Estudiante e) {
//	     SessionFactory sf = HibernateUtil.getSessionFactory();
//	     Session sesion = sf.openSession();
//	     Transaction tx = sesion.beginTransaction();
//	     sesion.saveOrUpdate(e);
//	     tx.commit();
//	     sesion.close();
//	}
	
//	public List<Estudiante> readFromManager(){
//	    EntityManager manager = SessionManager.getEntityManager();
//	    EntityTransaction tran = manager.getTransaction();
//	    tran.begin();
//	    Query query = manager.createQuery("select b from Coche b");
//	    List<Coche> coches = query.getResultList();
//	    tran.commit();
//	    manager.close();
//	    return coches;
//	}
	
	
	
	
}
