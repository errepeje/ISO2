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
	private List<Matricula> listaEstudiantes = new ArrayList<>();
	private Vector<Matricula> matriculas = new Vector<Matricula>();
	private CursoPropio curso = new CursoPropio();
	private Estudiante estudiante = new Estudiante();
	private Matricula matricula = new Matricula();

	public boolean realizarMatriculacion(String dni,String nombre, String apellido,String titulacion,String cualificacion,Date fecha,boolean pagado,int cursopropio,ModoPago modopago) {		
		
		 Matricula matriculaNueva = new Matricula(fecha,pagado,estudiante,curso,modopago);

		
		if(mDAO.findMatricula(matricula.getClass(), cursopropio,dni)) {
			//hacer get del curso que he seleccionado
			matriculas = (Vector<Matricula>) eDAO.findAll(matriculas.getClass());
			
			boolean existeMatricula = false;
			for(int i=0;i<matriculas.size();i++) {
				if(matriculas.get(i)._estudiante.get_dni() == dni) {
					if(matriculas.get(i) == matriculaNueva) {
						existeMatricula = true;
					}
				}
			}
			if(!existeMatricula) {				
				matriculas.add(matriculaNueva);
			}
			
			Estudiante estudianteMatriculado = new Estudiante(dni,nombre,apellido,titulacion,cualificacion,matriculas);
			mDAO.persist(matricula);
		}else{
			return false;
		};
		return true;
		
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
	
	public boolean matriculasAlumnoCoinciden(String dni){
		
		boolean matriculado = false;
				
		matricula = (Matricula) mDAO.encontrarMatriculasDeEstudiantes(estudiante.getClass(), dni);
		
		//metodo para comprobar si el estudiante ya se ha matriculado 
		
		
		return matriculado;
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