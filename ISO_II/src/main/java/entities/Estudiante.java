package entities;

import java.util.Vector;


import entities.Matricula;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="estudiante")

public class Estudiante {
	private String _dni;
	private String _nombre;
	private String _apellidos;
	private String _titulacion;
	private String _cualificacion;
	public Vector<Matricula> _matriculas = new Vector<Matricula>();
	
	public Estudiante(String _dni, String _nombre, String _apellidos, String _titulacion, String _cualificacion,
			Vector<Matricula> _matriculas) {
		super();
		this._dni = _dni;
		this._nombre = _nombre;
		this._apellidos = _apellidos;
		this._titulacion = _titulacion;
		this._cualificacion = _cualificacion;
		this._matriculas = _matriculas;
	}
	
	public Estudiante() {
		super();
	}

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