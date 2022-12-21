package entities;

import java.util.Date;

public class Matricula {
	private Date fecha;
	private boolean pagado;
	private Estudiante estudiante;
	private CursoPropio titulo;
	private ModoPago tipoPago;
	
	public Matricula() {}
	
	public Matricula(Date fecha, boolean pagado, Estudiante estudiante, CursoPropio titulo,
			ModoPago tipoPago) {
		super();
		this.fecha = fecha;
		this.pagado = pagado;
		this.estudiante = estudiante;
		this.titulo = titulo;
		this.tipoPago = tipoPago;
	}

	public Date getfecha() {
		return fecha;
	}

	public void setfecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean ispagado() {
		return pagado;
	}

	public void setpagado(boolean pagado) {
		this.pagado = pagado;
	}

	public Estudiante getestudiante() {
		return estudiante;
	}

	public void setestudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public CursoPropio gettitulo() {
		return titulo;
	}

	public void settitulo(CursoPropio titulo) {
		this.titulo = titulo;
	}

	public ModoPago gettipoPago() {
		return tipoPago;
	}

	public void settipoPago(ModoPago tipoPago) {
		this.tipoPago = tipoPago;
	}
}