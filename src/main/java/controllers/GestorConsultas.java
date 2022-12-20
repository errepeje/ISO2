package controllers;

import java.util.List;

import entities.Centro;
import entities.CursoPropio;
import persistencia.CentroDAO;
import persistencia.CursoPropioDAO;
import persistencia.ProfesorDAO;
import entities.ProfesorUCLM;

public class GestorConsultas {

	static CursoPropioDAO<CursoPropio> cpDAO = new CursoPropioDAO<>();
	static CentroDAO<Centro> cDAO = new CentroDAO<>();
	static ProfesorDAO<ProfesorUCLM> pDAO = new ProfesorDAO<>();

	public static int[] obtenerCursos() {

		int i = 0;

		List<CursoPropio> cursos = cpDAO.findAll(CursoPropio.class);
		int[] id = new int[cursos.size()];

		for(CursoPropio c: cursos) {
			id[i] = c.getid();
			i++;
		}
		return id;
	}

	public static int[] obtenerEdicion() {
		/*Ahora muestra todos los cursos -> hay q cambiarlo
		 * para que muestre unicamente los denegados*/
		int i = 0;

		List<CursoPropio> cursos = cpDAO.findAll(CursoPropio.class);
		int[] edicion = new int[cursos.size()];

		for(CursoPropio c: cursos) {
			edicion[i] = c.getedicion();
			i++;
		}

		return edicion;
	}

	public static String[] obtenerEstado() {
		/*Ahora muestra todos los cursos -> hay q cambiarlo
		 * para que muestre unicamente los denegados*/
		int i = 0;

		List<CursoPropio> cursos = cpDAO.findAll(CursoPropio.class);
		String[] estado = new String[cursos.size()];

		for(CursoPropio c: cursos) {
			estado[i] = c.getestado().toString();
			i++;
		}

		return estado;
	}

	public static String[] obtenerTipoCurso() {
		/*Ahora muestra todos los cursos -> hay q cambiarlo
		 * para que muestre unicamente los denegados*/
		int i = 0;

		List<CursoPropio> cursos = cpDAO.findAll(CursoPropio.class);
		String[] tipoCurso = new String[cursos.size()];

		for(CursoPropio c: cursos) {
			tipoCurso[i] = c.gettipo().toString();
			i++;
		}

		return tipoCurso;
	}

	public static int[] obtenerIngresos() {
		int i = 0;

		List<CursoPropio> cursos = cpDAO.findAll(CursoPropio.class);
		int[] ingresos = new int[cursos.size()];

		for(CursoPropio c: cursos) {
			ingresos[i] = c.gettasaMatricula();
			i++;
		}

		return ingresos;
	}
	
	public static CursoPropio obtenerCursos(int id) {
        return (CursoPropio) cpDAO.findById(CursoPropio.class, id);
    }
}