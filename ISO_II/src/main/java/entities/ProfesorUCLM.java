package entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="profesorUCLM")
//@DiscriminatorValue("not null")
@PrimaryKeyJoinColumn(name="dni")
public class ProfesorUCLM extends Profesor {
	@Column(name="categoria")
	public CategoriaProfesor _categoria;
	@Column(name="nombreCentro")
	public String nombreCentro;
	@Transient
	public Centro _centroAdscripcion;
	
	public ProfesorUCLM() {}
	
	public ProfesorUCLM(String _dni, String _nombre, String _apellidos, boolean _doctor) {
		super(_nombre, _apellidos, _doctor);
		// TODO Auto-generated constructor stub
	}
	
	
	public ProfesorUCLM(String _centroAdscripcion,
			CategoriaProfesor _categoria) {
		super();
		this.nombreCentro = _centroAdscripcion;
		this._categoria = _categoria;
	}

	public CategoriaProfesor get_categoria() {
		return _categoria;
	}

	public void set_categoria(CategoriaProfesor _categoria) {
		this._categoria = _categoria;
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

	public Centro get_centroAdscripcion() {
		return _centroAdscripcion;
	}

	public void set_centroAdscripcion(Centro _centroAdscripcion) {
		this._centroAdscripcion = _centroAdscripcion;
	}
}