package controllers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
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
		CursoPropio cursoPropio = gestorPropuestasCursos.realizarPropuestaCurso("C4", 10, new Date(2022,9,9), new Date(2023,9,9), 700, 1, "ESI", "87423456", "87423456", TipoCurso.EXPERTO);	
		int propuestasDespues = gestorPropuestasCursos.obtenerCursosDenegados().length;
		
		assertTrue(propuestasDespues - propuestasAntes == 1);
	}
	
	@Test
	public void testRealizarPropuestaCurso1() throws ParseException {
		CursoPropio cursoPropio = gestorPropuestasCursos.realizarPropuestaCurso("C4", 0, new Date(2022,9,9), new Date(2023,9,9), 0, 0, "ESI", "87423456", "87423456", TipoCurso.EXPERTO);	
		
		assertNull(cursoPropio);
	}
	
	@Test
	public void testRealizarPropuestaCurso2() throws ParseException {
		CursoPropio cursoPropio = gestorPropuestasCursos.realizarPropuestaCurso("C4", -4, new Date(2022,9,9), new Date(2023,9,9), -10, -20, "ESI", "87423456", "87423456", TipoCurso.EXPERTO);	
		
		assertNull(cursoPropio);
	}
	
	@Test
	public void testEvaluarPropuesta() {
		CursoPropio cursoPropio = gestorPropuestasCursos.evaluarPropuesta(1106, EstadoCurso.PROPUESTA_RECHAZADA, "No cumple los requisitos");
		assertTrue(cursoPropio.getid() == 1106);
	}
	
	@Test
	public void testEvaluarPropuesta1() {
		CursoPropio cursoPropio = gestorPropuestasCursos.evaluarPropuesta(-10, EstadoCurso.PROPUESTA_RECHAZADA, "No cumple los requisitos");
		assertNull(cursoPropio);
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
		assertFalse(idSecretarios.length <= 0);
	}

	@Test
	public void testObtenerCentros() {
		String[] idCentros = GestorPropuestasCursos.obtenerCentros();
		assertTrue(idCentros.length > 0);
	}
	
	@Test
	public void testObtenerCentros1() {
		String[] idCentros = GestorPropuestasCursos.obtenerCentros();
		assertFalse(idCentros.length <= 0);
	}

	@Test
	public void testObtenerCursosDenegados() {
		int[] idCursosDenegados = GestorPropuestasCursos.obtenerCursosDenegados();
		assertTrue(idCursosDenegados.length > 0);
	}
	
	@Test
	public void testObtenerCursosDenegados1() {
		int[] idCursosDenegados = GestorPropuestasCursos.obtenerCursosDenegados();
		assertFalse(idCursosDenegados.length <= 0);
	}

	@Test
	public void testObtenerCurso() {
		CursoPropio c = GestorPropuestasCursos.obtenerCurso(1102);
		assertTrue(c.getid() == 1102);
	}
	
	@Test
	public void testObtenerCurso1() {
		CursoPropio c = GestorPropuestasCursos.obtenerCurso(0);
		assertNull(c);
	}
	
	@Test
	public void testObtenerCurso2() {
		CursoPropio c = GestorPropuestasCursos.obtenerCurso(-10);
		assertNull(c);
	}
}
