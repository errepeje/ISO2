package entities;

public class ProfesorExterno extends Profesor {
	private String titulacion;
	private String dni;
	private boolean doctor;
	
	public ProfesorExterno() {}
	
	public ProfesorExterno(String dni, String nombre, String apellidos, boolean doctor, String titulacion) {
		super(nombre, apellidos, doctor);
		this.dni = dni;
		this.doctor = doctor;
		this.titulacion = titulacion;
	}

	public String gettitulacion() {
		return titulacion;
	}

	public void settitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	@Override
	public String getDni() {
		return dni;
	}

	@Override
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public boolean isdoctor() {
		return doctor;
	}

	@Override
	public void setdoctor(boolean doctor) {
		this.doctor = doctor;
	}
	
	
}