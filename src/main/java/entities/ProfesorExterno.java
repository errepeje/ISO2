package entities;

public class ProfesorExterno extends Profesor {
	private String _titulacion;
	
	public ProfesorExterno() {}
	
	public ProfesorExterno(String _dni, String _nombre, String _apellidos, boolean _doctor) {
		super(_nombre, _apellidos, _doctor);
		// TODO Auto-generated constructor stub
	}

	public String get_titulacion() {
		return _titulacion;
	}

	public void set_titulacion(String _titulacion) {
		this._titulacion = _titulacion;
	}

}