package entities;

import java.util.Vector;
import entities.CursoPropio;
import entities.ProfesorUCLM;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import persistencia.CentroDAO;

@Entity
@Table(name="centro")
public class Centro {
	@Id
	@Column(name="nombre")
	private String _nombre;
	@Column(name="localizacion")
	private String _localizacion;
	@Transient
	public Vector<CursoPropio> _cursoPropios = new Vector<CursoPropio>();
	@Transient
	public Vector<ProfesorUCLM> _plantilla = new Vector<ProfesorUCLM>();
	@Transient
	private CentroDAO _centroDAO = new CentroDAO();
	

	public Centro() {}
	
	public Centro(String _nombre, String _localizacion, Vector<CursoPropio> _cursoPropios,
			Vector<ProfesorUCLM> _plantilla) {
		super();
		this._nombre = _nombre;
		this._localizacion = _localizacion;
		this._cursoPropios = _cursoPropios;
		this._plantilla = _plantilla;
	}

	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}

	public String get_localizacion() {
		return _localizacion;
	}

	public void set_localizacion(String _localizacion) {
		this._localizacion = _localizacion;
	}

	public Vector<CursoPropio> get_cursoPropios() {
		return _cursoPropios;
	}

	public void set_cursoPropios(Vector<CursoPropio> _cursoPropios) {
		this._cursoPropios = _cursoPropios;
	}

	public Vector<ProfesorUCLM> get_plantilla() {
		return _plantilla;
	}

	public void set_plantilla(Vector<ProfesorUCLM> _plantilla) {
		this._plantilla = _plantilla;
	}

	public CentroDAO get_centroDAO() {
		return _centroDAO;
	}
}