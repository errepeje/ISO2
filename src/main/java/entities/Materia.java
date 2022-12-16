package entities;

import java.util.Date;

public class Materia {
	private String nombre;
	private double horas;
	private Date fechaInicio;
	private Date fechaFin;
	private CursoPropio cursoPropio;
	private Profesor responsable;
	
	public Materia() {}
	
	public Materia(String nombre, double horas, Date fechaInicio, Date fechaFin, CursoPropio cursoPropio,
			Profesor responsable) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cursoPropio = cursoPropio;
		this.responsable = responsable;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public double gethoras() {
		return horas;
	}

	public void sethoras(double horas) {
		this.horas = horas;
	}

	public Date getfechaInicio() {
		return fechaInicio;
	}

	public void setfechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getfechaFin() {
		return fechaFin;
	}

	public void setfechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public CursoPropio getCursoPropio() {
		return cursoPropio;
	}

	public void setCursoPropio(CursoPropio cursoPropio) {
		this.cursoPropio = cursoPropio;
	}

	public Profesor getresponsable() {
		return responsable;
	}

	public void setresponsable(Profesor responsable) {
		this.responsable = responsable;
	}
}