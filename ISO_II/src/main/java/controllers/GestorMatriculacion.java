package controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import entities.CursoPropio;
import entities.EstadoCurso;
import entities.Estudiante;
import entities.Matricula;
import entities.ModoPago;
import persistencia.CursoPropioDAO;
import persistencia.EstudianteDAO;
import persistencia.MatriculaDAO;

public class GestorMatriculacion {
	
	static MatriculaDAO mDAO = new MatriculaDAO<Matricula>();
	static EstudianteDAO eDAO = new EstudianteDAO<Estudiante>();
	static CursoPropioDAO cDAO = new CursoPropioDAO<CursoPropio>();
	private List<CursoPropio> listaCursos;
	private List<CursoPropio> listaCursosAprobados = new ArrayList<>();
	private static List<Matricula> listaMatriculaEstudiantes = new ArrayList<>();
	private static Vector<Matricula> matriculas = new Vector<Matricula>();
	private Vector<Estudiante> estudiantesMatriculados = new Vector<Estudiante>();
	private static  CursoPropio curso = new CursoPropio();
	private  Estudiante estudiante = new Estudiante();
	

	public boolean realizarMatriculacion(String dni,String nombre, String apellido,String titulacion,String cualificacion,Date fecha,boolean pagado, int cursopropio,ModoPago modopago) {		
		
		boolean matriculacreada = false;
		
//		Matricula matriculaNueva = new Matricula(fecha,pagado,estudiante,curso,modopago);

		
		if(comprobarMatriculas(Matricula.class,cursopropio,dni)) {
			
			//matriculas = mDAO.encontrarMatriculasDeEstudiantes(matricula.getClass(), dni);
			
			//matriculas.add(matriculaNueva);
			
//			//hacer get del curso que he seleccionado
//			matriculas = (Vector<Matricula>) eDAO.findAll(matriculas.getClass());
//			
//			boolean existeMatricula = false;
//			for(int i=0;i<matriculas.size();i++) {
//				if(matriculas.get(i)._estudiante.get_dni() == dni) {
//					if(matriculas.get(i) == matriculaNueva) {
//						existeMatricula = true;
//					}
//				}
//			}
//			if(!existeMatricula) {				
//				matriculas.add(matriculaNueva);
//			}
//			
//			Estudiante estudianteMatriculado = new Estudiante(dni,nombre,apellido,titulacion,cualificacion,matriculas);
//			mDAO.persist(matricula);
			matriculacreada = false;
		}else{
//			return false;
			Estudiante estudianteMatriculado = new Estudiante(dni,nombre,apellido,titulacion,cualificacion,matriculas);
			Matricula matriculaNueva = new Matricula(0, fecha, pagado, modopago, dni, cursopropio);
			matriculas.add(matriculaNueva);
			
			mDAO.persist(matriculaNueva);
			matriculacreada = true;
			
		};
		return matriculacreada;
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static boolean comprobarMatriculas (Class clase, int idCurso,String idEstudiante) {
		int idCursoAnterior;
		idEstudiante = "01223334A"; 
		boolean existeMatricula = false;
		int cursoActual=0 ; 
		
//		estudiante = eDAO.findById(clase.getName(), idEstudiante);
		listaMatriculaEstudiantes = mDAO.findAll(Matricula.class);
		
		for(int i=0;i<listaMatriculaEstudiantes.size();i++) {
			
			if(listaMatriculaEstudiantes.get(i).get_idEstudiante().equals(idEstudiante)) {
				cursoActual = listaMatriculaEstudiantes.get(i).get_idCursoPropio();
			}
		}
		
		if(cursoActual==idCurso) {
			existeMatricula = true;
		}
		
//		for(int i =0;(i<estudianteActual._matriculas.size()) && (existeMatricula == false ) ;i++) {
//			curso = estudianteActual._matriculas.get(i)._titulo;
//			 idCursoAnterior = curso.get_id();
//			
//			if(idCurso.equals(idCursoAnterior)) {
//				existeMatricula = true;
//			}
//				
//		}
		
		return existeMatricula;
	}
	
	public List<CursoPropio> recogerCursos() {
		listaCursos = cDAO.findAll(curso.getClass());
		
		for(int i=0; i<listaCursos.size() ;i++) {
			if(listaCursos.get(i).get_estado() == EstadoCurso.VALIDADO) {
				listaCursosAprobados.add(i,listaCursos.get(i));
			}
		}
		return listaCursosAprobados;
	}

	public void realizarPagoMatricula(CursoPropio aCurso, Estudiante aEstudiante) {
		throw new UnsupportedOperationException();
	}

	private void realizarPagoTarjeta(CursoPropio aCurso, Estudiante aEstudiante) {
		throw new UnsupportedOperationException();
	}

	private void realizarPagoTransferencia(CursoPropio aCurso, Estudiante aEstudiante) {
		throw new UnsupportedOperationException();
	}

	private void operation() {
		throw new UnsupportedOperationException();
	}
}