package entities;

import java.util.Date;

public class Materia {
	private String _nombre;
	private double _horas;
	private Date _fechaInicio;
	private Date _fechaFin;
	public CursoPropio CursoPropio_;
	public Profesor _responsable;
	
	public Materia() {}
	
	public Materia(String _nombre, double _horas, Date _fechaInicio, Date _fechaFin, CursoPropio CursoPropio_,
			Profesor _responsable) {
		super();
		this._nombre = _nombre;
		this._horas = _horas;
		this._fechaInicio = _fechaInicio;
		this._fechaFin = _fechaFin;
		this.CursoPropio_ = CursoPropio_;
		this._responsable = _responsable;
	}

	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}

	public double get_horas() {
		return _horas;
	}

	public void set_horas(double _horas) {
		this._horas = _horas;
	}

	public Date get_fechaInicio() {
		return _fechaInicio;
	}

	public void set_fechaInicio(Date _fechaInicio) {
		this._fechaInicio = _fechaInicio;
	}

	public Date get_fechaFin() {
		return _fechaFin;
	}

	public void set_fechaFin(Date _fechaFin) {
		this._fechaFin = _fechaFin;
	}

	public CursoPropio getCursoPropio_() {
		return CursoPropio_;
	}

	public void setCursoPropio_(CursoPropio cursoPropio_) {
		CursoPropio_ = cursoPropio_;
	}

	public Profesor get_responsable() {
		return _responsable;
	}

	public void set_responsable(Profesor _responsable) {
		this._responsable = _responsable;
	}
}