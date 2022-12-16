package entities;

public class ProfesorExterno extends Profesor {
	private String titulacion;
	
	public ProfesorExterno() {}
	
	public ProfesorExterno(String dni, String nombre, String apellidos, boolean doctor) {
		super(nombre, apellidos, doctor);
	}

	public String gettitulacion() {
		return titulacion;
	}

	public void settitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

}