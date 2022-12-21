package controllers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GestorConsultasTest {

    @Test
    public void testObtenerCursos() {
        int id[] = GestorConsultas.obtenerCursos();
        assertTrue(id.length > 0);
    }
    @Test
    public void testObtenerCursosVacio() {
        int id[] = GestorConsultas.obtenerCursos();
        assertFalse(id.length <= 0);
    }

    @Test
    public void testObtenerEdicion() {
        int[] edicion = GestorConsultas.obtenerEdicion();
        assertTrue(edicion.length>0);
    }

    @Test
    public void testObtenerEdicionVacia() {

        int[] edicion = GestorConsultas.obtenerEdicion();
        assertFalse(edicion.length <= 0);
    }

    @Test
    public void testObtenerEstado() {
        String[] consultas = GestorConsultas.obtenerEstado();
        assertTrue(consultas.length > 0);
    }

    @Test
    public void testObtenerEstadoInvalido() {
        String[] consultas = GestorConsultas.obtenerEstado();
        assertFalse(consultas.length <= 0);
    }

    @Test
    public void testObtenerTipoCurso() {
        String[] tipoCurso = GestorConsultas.obtenerTipoCurso();
        assertTrue(tipoCurso.length > 0);
    }
    @Test
    public void testObtenerTipoCursoInvalido() {
        String[] tipoCurso = GestorConsultas.obtenerTipoCurso();
        assertFalse(tipoCurso.length <= 0);
    }

    @Test
    public void testObtenerIngresos() {
        int[] ingresos = GestorConsultas.obtenerIngresos();
        assertTrue(ingresos.length>=0);
    }

    @Test
    public void testObtenerIngresosNegativos() {
        int[] ingresos = GestorConsultas.obtenerIngresos();
        assertFalse(ingresos.length < 0);
    }

}