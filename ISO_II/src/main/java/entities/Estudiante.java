package entities;

import java.util.Vector;


import entities.Matricula;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name="estudiante")
@PrimaryKeyJoinColumn(name = "dni")

public class Estudiante extends Usuario {
	@Column(name="dni")
	private String _dni;
	@JoinColumn(name="dni",referencedColumnName="dni", insertable=false, updatable=false)
	@Column(name="nombre")
	private String _nombre;
	@Column(name="apellidos")
	private String _apellidos;
	@Column(name="titulacion")
	private String _titulacion;
	@Column(name="cualificacion")
	private String _cualificacion;
	public Vector<Matricula> _matriculas = new Vector<Matricula>();
	
	public String get_dni() {
		return _dni;
	}
	public void set_dni(String _dni) {
		this._dni = _dni;
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
	public String get_titulacion() {
		return _titulacion;
	}
	public void set_titulacion(String _titulacion) {
		this._titulacion = _titulacion;
	}
	public String get_cualificacion() {
		return _cualificacion;
	}
	public void set_cualificacion(String _cualificacion) {
		this._cualificacion = _cualificacion;
	}
	public Vector<Matricula> get_matriculas() {
		return _matriculas;
	}
	public void set_matriculas(Vector<Matricula> _matriculas) {
		this._matriculas = _matriculas;
	}
	
	
}