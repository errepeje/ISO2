package entities;

import java.util.Vector;
import entities.CursoPropio;
import entities.ProfesorUCLM;

public class Centro {
	private String _nombre;
	private String _localizacion;
	private Object _attribute;
	public Vector<CursoPropio> _cursoPropios = new Vector<CursoPropio>();
	public Vector<ProfesorUCLM> _plantilla = new Vector<ProfesorUCLM>();
}