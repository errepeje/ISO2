package entities;

import java.util.Date;

public class Matricula {
	
	public Matricula(Date _fecha, boolean _pagado, Estudiante _estudiante, CursoPropio _titulo, ModoPago _tipoPago) {
		super();
		this._fecha = _fecha;
		this._pagado = _pagado;
		this._estudiante = _estudiante;
		this._titulo = _titulo;
		this._tipoPago = _tipoPago;
	}
	public Matricula() {}
	private Date _fecha;
	private boolean _pagado;
	public Estudiante _estudiante;
	public CursoPropio _titulo;
	public ModoPago _tipoPago;
}
