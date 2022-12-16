package entities;

import java.util.Date;
import java.util.Vector;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="cursopropio")
public class CursoPropio {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="ects")
	private int eCTS;
	@Column(name="fechaInicio")
	private Date fechaInicio;
	@Column(name="fechaFin")
	private Date fechaFin;
	@Column(name="tasaMatricula")
	private int tasaMatricula;
	@Column(name="edicion")
	private int edicion;
	@Column(name="nombreCentro")
	public String nombreCentro;
	@Transient
	public Centro centro;
	@Transient
	public ProfesorUCLM director;
	@Column(name="director")
	public String idDirector;
	@Transient
	public ProfesorUCLM secretario;
	@Column(name="secretario")
	public String idSecretario;
	@Column(name="estadoCurso")
	public EstadoCurso estado;
	@Column(name="tipoCurso")
	public TipoCurso tipo;
	@Column(name="informe")
	public String informe;
	@Transient
	public Vector<Matricula> matriculas = new Vector<>();
	@Transient
	public Vector<Materia> materias = new Vector<>();
	
	public CursoPropio() {}
	
	public CursoPropio(int id, String nombre, int eCTS, Date fechaInicio, Date fechaFin, int tasaMatricula,
			int edicion, Vector<Matricula> matriculas, Centro centro, ProfesorUCLM director,
			ProfesorUCLM secretario, Vector<Materia> materias, EstadoCurso estado, TipoCurso tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.eCTS = eCTS;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tasaMatricula = tasaMatricula;
		this.edicion = edicion;
		this.matriculas = matriculas;
		this.centro = centro;
		this.nombreCentro = centro.getnombre();
		this.director = director;
		this.secretario = secretario;
		this.materias = materias;
		this.estado = estado;
		this.tipo = tipo;
		this.idDirector = director.getDni();
		this.idSecretario = secretario.getDni();
		this.informe = "";
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

	public String getIdDirector() {
		return idDirector;
	}

	public void setIdDirector(String idDirector) {
		this.idDirector = idDirector;
	}

	public String getIdSecretario() {
		return idSecretario;
	}

	public void setIdSecretario(String idSecretario) {
		this.idSecretario = idSecretario;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public int geteCTS() {
		return eCTS;
	}

	public void seteCTS(int eCTS) {
		this.eCTS = eCTS;
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

	public int gettasaMatricula() {
		return tasaMatricula;
	}

	public void settasaMatricula(int tasaMatricula) {
		this.tasaMatricula = tasaMatricula;
	}

	public int getedicion() {
		return edicion;
	}

	public void setedicion(int edicion) {
		this.edicion = edicion;
	}

	public Vector<Matricula> getmatriculas() {
		return matriculas;
	}

	public void setmatriculas(Vector<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public Centro getcentro() {
		return centro;
	}

	public void setcentro(Centro centro) {
		this.centro = centro;
	}

	public ProfesorUCLM getdirector() {
		return director;
	}

	public void setdirector(ProfesorUCLM director) {
		this.director = director;
	}

	public ProfesorUCLM getsecretario() {
		return secretario;
	}

	public void setsecretario(ProfesorUCLM secretario) {
		this.secretario = secretario;
	}

	public Vector<Materia> getmaterias() {
		return materias;
	}

	public void setmaterias(Vector<Materia> materias) {
		this.materias = materias;
	}

	public EstadoCurso getestado() {
		return estado;
	}

	public void setestado(EstadoCurso estado) {
		this.estado = estado;
	}

	public TipoCurso gettipo() {
		return tipo;
	}

	public void settipo(TipoCurso tipo) {
		this.tipo = tipo;
	}
	
	public String getinforme() {
		return informe;
	}

	public void setinforme(String informe) {
		this.informe = informe;
	}
}