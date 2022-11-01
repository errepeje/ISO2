package controllers;

import java.util.Date;
import java.util.List;

import entities.*;
import persistencia.*;

public class GestorPropuestasCursos {
	
	static CursoPropioDAO cpDAO = new CursoPropioDAO<CursoPropio>();
	static CentroDAO cDAO = new CentroDAO<Centro>();
	static ProfesorDAO pDAO = new ProfesorDAO<ProfesorUCLM>();

	public CursoPropio realizarPropuestaCurso(String nombre, int ECTS, Date fechaInicio,
			Date fechaFin, int tasaMatricula, int edicion, String nombreCentro, String idDirector,
			String idSecretario, TipoCurso tipoCurso) {
		
		Centro centro = null;
		Profesor director = null;
		Profesor secretario = null;
		
		try {
			centro = obtenerCentro(nombreCentro);
			director = obtenerProfesor(idDirector);
			secretario = obtenerProfesor(idSecretario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ProfesorUCLM p1 = (ProfesorUCLM) director;
		p1.set_categoria(CategoriaProfesor.CATEDRATICO);
		p1.setNombreCentro("ESI");
		
		ProfesorUCLM p2 = (ProfesorUCLM) secretario;
		p2.set_categoria(CategoriaProfesor.CATEDRATICO);
		p2.setNombreCentro("ESI");
		
		CursoPropio cursoPropio = new CursoPropio(1, nombre, ECTS, fechaInicio, fechaFin,
				tasaMatricula, edicion, null, centro, p1, p2, null,
				EstadoCurso.PROPUESTO, tipoCurso);
		
		cpDAO.persist(cursoPropio);
		
		return cursoPropio;
	}

	public void editarPropuestaCurso(CursoPropio aCurso) {
		cpDAO.update(aCurso);
	}

	public void evaluarPropuesta(int idCurso, EstadoCurso evaluacion) { 
		CursoPropio evaluado = (CursoPropio) cpDAO.findById(CursoPropio.class, idCurso);
		evaluado.set_estado(evaluacion);
		editarPropuestaCurso(evaluado);
	}

	public void altaCursoAprobado(CursoPropio aCurso) {
		throw new UnsupportedOperationException();
	}
	
	public static Centro obtenerCentro(String nombre) {
		return (Centro) cpDAO.findById(Centro.class, nombre);
	}
	
	public static ProfesorUCLM obtenerProfesor(String id) {
		return (ProfesorUCLM) pDAO.findById(ProfesorUCLM.class, id);
	}
	
	public static String[] obtenerSecretarios() {
		int i = 0;
		
		List<ProfesorUCLM> profesores = pDAO.findAll(ProfesorUCLM.class);
		String[] id = new String[profesores.size()];
		
		for(ProfesorUCLM p: profesores) {
			id[i] = p.get_dni();
			i++;
		}
		
		return id;
	}
	
	public static String[] obtenerCentros() {
		int i = 0;
		
		List<Centro> centros = cDAO.findAll(Centro.class);
		String[] id = new String[centros.size()];
		
		for(Centro c: centros) {
			id[i] = c.get_nombre();
			i++;
		}
		
		return id;
	}
	
	public static int[] obtenerCursosDenegados() {
		/*Ahora muestra todos los cursos -> hay q cambiarlo
		 * para que muestre unicamente los denegados*/
		int i = 0;
		
		List<CursoPropio> cursos = cpDAO.findAll(CursoPropio.class);
		int[] id = new int[cursos.size()];
		
		for(CursoPropio c: cursos) {
			id[i] = c.get_id();
			i++;
		}
		
		return id;
	}
	
	public static CursoPropio obtenerCurso(int id) {
		return (CursoPropio) cpDAO.findById(CursoPropio.class, id);
	}
}