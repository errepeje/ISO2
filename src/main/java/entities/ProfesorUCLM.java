package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="profesorUCLM")
@PrimaryKeyJoinColumn(name="dni")
public class ProfesorUCLM extends Profesor {
	@Column(name="categoria")
	public CategoriaProfesor categoria;
	@Column(name="nombreCentro")
	public String nombreCentro;
	@Transient
	public Centro centroAdscripcion;
	@Transient
	private String dni;
	
	public ProfesorUCLM() {}
	
	public ProfesorUCLM(String dni, String nombre, String apellidos, boolean doctor) {
		super(nombre, apellidos, doctor);
		this.dni = dni;
	}
	
	
	public ProfesorUCLM(String centroAdscripcion,
			CategoriaProfesor categoria) {
		super();
		this.nombreCentro = centroAdscripcion;
		this.categoria = categoria;
	}

	public CategoriaProfesor getcategoria() {
		return categoria;
	}

	public void setcategoria(CategoriaProfesor categoria) {
		this.categoria = categoria;
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

	public Centro getcentroAdscripcion() {
		return centroAdscripcion;
	}

	public void setcentroAdscripcion(Centro centroAdscripcion) {
		this.centroAdscripcion = centroAdscripcion;
	}
}