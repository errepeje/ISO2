package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
@Entity
@Table(name="profesor")
@PrimaryKeyJoinColumn(name = "dni")
public class Profesor extends Usuario {
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="doctor")
	private boolean doctor;
	
	public Profesor() {}
	
	public Profesor(String dni, String nick, String password, String nombre, String apellidos, boolean doctor) {
		super(dni, nick, password);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.doctor = doctor;
	}
	
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public String getapellidos() {
		return apellidos;
	}
	public void setapellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public boolean isdoctor() {
		return doctor;
	}
	public void setdoctor(boolean doctor) {
		this.doctor = doctor;
	}
}