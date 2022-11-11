package entities;

import jakarta.persistence.Column;

public class JefeGabinete extends Usuario {
	@Column(name="dni")
	private String dni;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;

	public JefeGabinete(String dni, String nombre, String apellidos) {
		super();
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	

}