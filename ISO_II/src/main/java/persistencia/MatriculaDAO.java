package persistencia;

import java.util.List;
import java.util.Vector;

import entities.Matricula;

public class MatriculaDAO<E> extends AbstractEntityDAO<E>{
	public MatriculaDAO() {}
	
	
	
	public boolean findMatricula(Class clase, int idCurso,String idEstudiante) {
		idEstudiante = "01223334A";
		openSession(clase);
		boolean exists = (Long) session.createQuery("select count(*) from "+clase.getName() +" where estudiante is "+idEstudiante+" and idcursopropio is"+idCurso).uniqueResult() > 0;
		closeSession();
		return exists;
	}
	
	public Vector<Matricula> encontrarMatriculasDeEstudiantes (Class clase,String idEstudiante){
		idEstudiante = "01223334A";
		openSession(clase);
		Vector<Matricula> matriculas =  (Vector<Matricula>) session.createQuery("from "+clase.getName() +" where estudiante is "+idEstudiante);
		closeSession();
		
		return matriculas;
	}
	
	
}
