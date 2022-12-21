package persistencia;

import java.util.Date;
import java.util.List;

import entities.CursoPropio;
import entities.EstadoCurso;
import entities.TipoCurso;

public class CursoPropioDAO<E> extends AbstractEntityDAO<E> {	/*public class CursoPropioDAO extends AbstractEntityDAO<E>*/

	public int crearNuevoCurso(CursoPropio aCurso) {
		throw new UnsupportedOperationException();
	}

	public CursoPropio seleccionarCurso(CursoPropio aCurso) {
		throw new UnsupportedOperationException();
	}

	public CursoPropio editarCurso(CursoPropio aCurso) {
		throw new UnsupportedOperationException();
	}

	public List<CursoPropio> listarCursosPorEstado(EstadoCurso aEstado, Date aFechaInicio, Date aFechaFin) {
		throw new UnsupportedOperationException();
	}

	public double listarIngresos(TipoCurso aTipo, Date aFechaInicio, Date aFechaFin) {
		throw new UnsupportedOperationException();
	}

	public void listarEdicionesCursos(Date aFechaInicio, Date aFechaFin) {
		throw new UnsupportedOperationException();
	}
}