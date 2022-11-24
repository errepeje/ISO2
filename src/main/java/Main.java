import entities.Profesor;
import entities.ProfesorUCLM;

public class Main {

	public static void main(String[] args) {
		
//		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Profesor.class).buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		Profesor p = new Profesor("main2", "2", "3", true);
//		session.save(p);
//		session.getTransaction().commit();
//		sessionFactory.close();
		
		// FUNCIONA con ABSTRACT ENTITY DAO
//		Profesor p = new Profesor("mod", "b", "c", true);
		
		
		
//		Session s = p.get_profesorDAO().openSession(p.getClass());
//		Profesor p1 = (Profesor) p.get_profesorDAO().findById(p.getClass(), "abs");
//		p.get_profesorDAO().persist(p);
//		p.get_profesorDAO().closeSession();
//		System.out.println(p1.get_dni());
		
		
    }
}
