package controllers;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

import entities.Centro;
import entities.CursoPropio;
import entities.EstadoCurso;
import entities.ProfesorUCLM;
import entities.TipoCurso;

public class GestorPropuestasCursosTest {
	GestorPropuestasCursos gestorPropuestasCursos = new GestorPropuestasCursos();
	
	@Test
	public void testRealizarPropuestaCurso() throws ParseException {
		int propuestasAntes = gestorPropuestasCursos.obtenerCursosDenegados().length;
		CursoPropio cursoPropio = gestorPropuestasCursos.realizarPropuestaCurso("C4", 10, new Date(2022,12,12), new Date(2023,12,12), 400, 1, "ESI", "87423456", "87423456", TipoCurso.EXPERTO);	
		int propuestasDespues = gestorPropuestasCursos.obtenerCursosDenegados().length;
		
		assertTrue(propuestasDespues - propuestasAntes == 1);
	}
	
	@Test
	public void testEvaluarPropuesta() {
		CursoPropio cursoPropio = gestorPropuestasCursos.evaluarPropuesta(1106, EstadoCurso.PROPUESTO, "No cumple los requisitos");
		assertTrue(cursoPropio.getid() == 1106 && cursoPropio.getestado() == EstadoCurso.PROPUESTO);
	}

	@Test
	public void testObtenerCentro() {
		Centro centro = GestorPropuestasCursos.obtenerCentro("Facultad Cuenca");
		assertTrue(centro.getnombre().equals("Facultad Cuenca"));
	}

	@Test
	public void testObtenerProfesor() {
		ProfesorUCLM profesor = GestorPropuestasCursos.obtenerProfesor("87423456");
		assertTrue(profesor.getDni().equals("87423456"));
	}

	@Test
	public void testObtenerSecretarios() {
		String[] idSecretarios = GestorPropuestasCursos.obtenerSecretarios();
		assertTrue(idSecretarios.length > 0);
	}
	
	@Test
	public void testObtenerSecretarios1() {
		String[] idSecretarios = GestorPropuestasCursos.obtenerSecretarios();
		boolean noNulo = true;
		
		for(int i=0; i < idSecretarios.length; i++) {
			if(idSecretarios[i] == null)
				noNulo = false;
		}
		
		assertTrue(noNulo);
	}

	@Test
	public void testObtenerCentros() {
		String[] idCentros = GestorPropuestasCursos.obtenerCentros();
		assertTrue(idCentros.length > 0);
	}
	
	@Test
	public void testObtenerCentros1() {
		String[] idCentros = GestorPropuestasCursos.obtenerCentros();
		boolean noNulo = true;
		
		for(int i=0; i < idCentros.length; i++) {
			if(idCentros[i] == null)
				noNulo = false;
		}
		
		assertTrue(noNulo);
	}

	@Test
	public void testObtenerCursosDenegados() {
		int[] idCursosDenegados = GestorPropuestasCursos.obtenerCursosDenegados();
		assertTrue(idCursosDenegados.length > 0);
	}
	
	@Test
	public void testObtenerCursosDenegados1() {
		int[] idCursosDenegados = GestorPropuestasCursos.obtenerCursosDenegados();
		boolean noNulo = true;
		
		for(int i=0; i < idCursosDenegados.length; i++) {
			if(idCursosDenegados[i] < 0)
				noNulo = false;
		}
		
		assertTrue(noNulo);
	}

	@Test
	public void testObtenerCurso() {
		CursoPropio c = GestorPropuestasCursos.obtenerCurso(1102);
		assertTrue(c.getid() == 1102);
	}

}
