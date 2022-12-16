package entities;

import java.util.Date;

public class Matricula {
	private Date _fecha;
	private boolean _pagado;
	public Estudiante _estudiante;
	public CursoPropio _titulo;
	public ModoPago _tipoPago;
	
	public Matricula() {}
	
	public Matricula(Date _fecha, boolean _pagado, Estudiante _estudiante, CursoPropio _titulo,
			ModoPago _tipoPago) {
		super();
		this._fecha = _fecha;
		this._pagado = _pagado;
		this._estudiante = _estudiante;
		this._titulo = _titulo;
		this._tipoPago = _tipoPago;
	}

	public Date get_fecha() {
		return _fecha;
	}

	public void set_fecha(Date _fecha) {
		this._fecha = _fecha;
	}

	public boolean is_pagado() {
		return _pagado;
	}

	public void set_pagado(boolean _pagado) {
		this._pagado = _pagado;
	}

	public Estudiante get_estudiante() {
		return _estudiante;
	}

	public void set_estudiante(Estudiante _estudiante) {
		this._estudiante = _estudiante;
	}

	public CursoPropio get_titulo() {
		return _titulo;
	}

	public void set_titulo(CursoPropio _titulo) {
		this._titulo = _titulo;
	}

	public ModoPago get_tipoPago() {
		return _tipoPago;
	}

	public void set_tipoPago(ModoPago _tipoPago) {
		this._tipoPago = _tipoPago;
	}
}