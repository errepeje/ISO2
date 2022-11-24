package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
@Entity
@Table(name="profesor")
@PrimaryKeyJoinColumn(name = "dni")
public class Profesor extends Usuario {
	@Column(name="nombre")
	private String _nombre;
	@Column(name="apellidos")
	private String _apellidos;
	@Column(name="doctor")
	private boolean _doctor;
	
	public Profesor() {}
	
	public Profesor(String _nombre, String _apellidos, boolean _doctor) {
		super();
		this._nombre = _nombre;
		this._apellidos = _apellidos;
		this._doctor = _doctor;
	}
	
	public String get_nombre() {
		return _nombre;
	}
	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}
	public String get_apellidos() {
		return _apellidos;
	}
	public void set_apellidos(String _apellidos) {
		this._apellidos = _apellidos;
	}
	public boolean is_doctor() {
		return _doctor;
	}
	public void set_doctor(boolean _doctor) {
		this._doctor = _doctor;
	}
}