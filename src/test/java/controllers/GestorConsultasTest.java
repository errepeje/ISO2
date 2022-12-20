package controllers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GestorConsultasTest {

	@Test
	public void testObtenerCursos() {
		int id[] = GestorConsultas.obtenerCursos();
		assertTrue(id.length>0);
	}
	@Test
	public void testObtenerCursos1() {
		boolean menorQueCero = true;
		int[] cursos = GestorConsultas.obtenerCursos();
		for(int i=0;i<cursos.length;i++) {
			if(cursos[i] < 0 ) {
				menorQueCero = false;
			}
		}
		assertTrue(menorQueCero);
	}

	@Test
	public void testObtenerEdicion() {
		int[] edicion = GestorConsultas.obtenerEdicion();
		assertTrue(edicion.length>0);
	}
	
	@Test
	public void testObtenerEdicion1() {
		boolean menorQueCero = true;
		int[] edicion = GestorConsultas.obtenerEdicion();
		for(int i=0;i<edicion.length;i++) {
			if(edicion[i] < 0 ) {
				menorQueCero = false;
			}
		}
		assertTrue(menorQueCero);
	}

	@Test
	public void testObtenerEstado() {
		String[] consultas = GestorConsultas.obtenerEstado();
        assertTrue(consultas.length > 0);
	}
	
	@Test
	public void testObtenerEstado1() {
		String[] consultas = GestorConsultas.obtenerEstado();
        boolean noNulo = true;

        for(int i=0; i < consultas.length; i++) {
            if(consultas[i] == null)
                noNulo = false;
        }

        assertTrue(noNulo);
	}

	@Test
	public void testObtenerTipoCurso() {
		String[] tipoCurso = GestorConsultas.obtenerTipoCurso();
        assertTrue(tipoCurso.length > 0);
	}
	@Test
	public void testObtenerTipoCurso1() {
		String[] consultas = GestorConsultas.obtenerTipoCurso();
        boolean noNulo = true;

        for(int i=0; i < consultas.length; i++) {
            if(consultas[i] == null)
                noNulo = false;
        }

        assertTrue(noNulo);
	}

	@Test
	public void testObtenerIngresos() {
		int[] ingresos = GestorConsultas.obtenerIngresos();
		assertTrue(ingresos.length>0);
	}
	
	@Test
	public void testObtenerIngresos1() {
		boolean menorQueCero = true;
		int[] ingresos = GestorConsultas.obtenerIngresos();
		for(int i=0;i<ingresos.length;i++) {
			if(ingresos[i] < 0 ) {
				menorQueCero = false;
			}
		}
		assertTrue(menorQueCero);
	}

}