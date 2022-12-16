package controllers;

import java.util.Date;
import java.util.List;

import entities.Centro;
import entities.CursoPropio;
import entities.TipoCurso;
import persistencia.CentroDAO;
import persistencia.CursoPropioDAO;
import persistencia.ProfesorDAO;
import entities.EstadoCurso;
import entities.ProfesorUCLM;

public class GestorConsultas {

	static CursoPropioDAO cpDAO = new CursoPropioDAO<CursoPropio>();
	static CentroDAO cDAO = new CentroDAO<Centro>();
	static ProfesorDAO pDAO = new ProfesorDAO<ProfesorUCLM>();

	public List<CursoPropio> consultarIngresos(TipoCurso aTipo, Date aFechaInicio, Date aFechaFin) {
		throw new UnsupportedOperationException();
	}

	public List<CursoPropio> consultarEstadoCursos(EstadoCurso aEstadoCurso, Date aFechaInicio, Date aFechaFin) {
		throw new UnsupportedOperationException();
	}

	public List<CursoPropio> listarEdicionesCursos(Date aFechaInicio, Date aFechaFin) {
		throw new UnsupportedOperationException();
	}

	public static int[] obtenerCursos() {

		int i = 0;

		List<CursoPropio> cursos = cpDAO.findAll(CursoPropio.class);
		int[] id = new int[cursos.size()];

		for(CursoPropio c: cursos) {
			id[i] = c.get_id();
			i++;
		}

		return id;
	}

	public static int[] obtenerEdicion() {
		/*Ahora muestra todos los cursos -> hay q cambiarlo
		 * para que muestre unicamente los denegados*/
		int i = 0;

		List<CursoPropio> cursos = cpDAO.findAll(CursoPropio.class);
		int[] Edicion = new int[cursos.size()];

		for(CursoPropio c: cursos) {
			Edicion[i] = c.get_edicion();
			i++;
		}

		return Edicion;
	}

	public static String[] obtenerEstado() {
		/*Ahora muestra todos los cursos -> hay q cambiarlo
		 * para que muestre unicamente los denegados*/
		int i = 0;

		List<CursoPropio> cursos = cpDAO.findAll(CursoPropio.class);
		String[] Estado = new String[cursos.size()];

		for(CursoPropio c: cursos) {
			Estado[i] = c.get_estado().toString();
			i++;
		}

		return Estado;
	}

	public static String[] obtenerTipoCurso() {
		/*Ahora muestra todos los cursos -> hay q cambiarlo
		 * para que muestre unicamente los denegados*/
		int i = 0;

		List<CursoPropio> cursos = cpDAO.findAll(CursoPropio.class);
		String[] TipoCurso = new String[cursos.size()];

		for(CursoPropio c: cursos) {
			TipoCurso[i] = c.get_tipo().toString();
			i++;
		}

		return TipoCurso;
	}

	public static int[] obtenerIngresos() {
		/*Ahora muestra todos los cursos -> hay q cambiarlo
		 * para que muestre unicamente los denegados*/
		int i = 0;

		List<CursoPropio> cursos = cpDAO.findAll(CursoPropio.class);
		int[] Ingresos = new int[cursos.size()];

		for(CursoPropio c: cursos) {
			Ingresos[i] = c.get_tasaMatricula();
			i++;
		}

		return Ingresos;
	}

	public static CursoPropio obtenerCursos(int id) {
		return (CursoPropio) cpDAO.findById(CursoPropio.class, id);
	}
}