package entities;

import java.util.Vector;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="estudiante")
@PrimaryKeyJoinColumn(name = "dni")
public class Estudiante extends Usuario {
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="titulacion")
	private String titulacion;
	@Column(name="cualificacion")
	private String cualificacion;
	@Transient
	public Vector<Matricula> matriculas ;

	public Estudiante(String nombre, String apellidos, String titulacion, String cualificacion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.titulacion = titulacion;
		this.cualificacion = cualificacion;
		matriculas = new Vector<>();
	}
	public Estudiante() {}
	
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
	public String gettitulacion() {
		return titulacion;
	}
	public void settitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	public String getcualificacion() {
		return cualificacion;
	}
	public void setcualificacion(String cualificacion) {
		this.cualificacion = cualificacion;
	}
	public Vector<Matricula> getmatriculas() {
		return matriculas;
	}
	public void setmatriculas(Vector<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
}