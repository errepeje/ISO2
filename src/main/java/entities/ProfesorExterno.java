package entities;

public class ProfesorExterno extends Profesor {
	public ProfesorExterno(String _dni, String _nombre, String _apellidos, boolean _doctor) {
		super(_nombre, _apellidos, _doctor);
		// TODO Auto-generated constructor stub
	}

	private String _titulacion;
}