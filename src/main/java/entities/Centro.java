package entities;

import java.util.Vector;
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
	private String nombre;
	@Column(name="localizacion")
	private String localizacion;
	@Transient
	public Vector<CursoPropio> cursoPropios = new Vector<>();
	@Transient
	public Vector<ProfesorUCLM> plantilla = new Vector<>();
	@Transient
	private CentroDAO centroDAO = new CentroDAO();
	

	public Centro() {}
	
	public Centro(String nombre, String localizacion, Vector<CursoPropio> cursoPropios,
			Vector<ProfesorUCLM> plantilla) {
		super();
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.cursoPropios = cursoPropios;
		this.plantilla = plantilla;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getlocalizacion() {
		return localizacion;
	}

	public void setlocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public Vector<CursoPropio> getcursoPropios() {
		return cursoPropios;
	}

	public void setcursoPropios(Vector<CursoPropio> cursoPropios) {
		this.cursoPropios = cursoPropios;
	}

	public Vector<ProfesorUCLM> getplantilla() {
		return plantilla;
	}

	public void setplantilla(Vector<ProfesorUCLM> plantilla) {
		this.plantilla = plantilla;
	}

	public CentroDAO<Centro> getcentroDAO() {
		return centroDAO;
	}
}