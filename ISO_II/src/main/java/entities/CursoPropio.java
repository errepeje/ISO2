package entities;

import java.util.Date;
import java.util.Vector;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import persistencia.CursoPropioDAO;

@Entity
@Table(name="cursopropio")
public class CursoPropio {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int _id;
	@Column(name="nombre")
	private String _nombre;
	@Column(name="ects")
	private int _eCTS;
	@Column(name="fechaInicio")
	private Date _fechaInicio;
	@Column(name="fechaFin")
	private Date _fechaFin;
	@Column(name="tasaMatricula")
	private int _tasaMatricula;
	@Column(name="edicion")
	private int _edicion;
	@Column(name="nombreCentro")
	public String nombreCentro;
	@Transient
	public Centro _centro;
	@Transient
	public ProfesorUCLM _director;
	@Column(name="director")
	public String idDirector;
	@Transient
	public ProfesorUCLM _secretario;
	@Column(name="secretario")
	public String idSecretario;
	@Column(name="estadoCurso")
	public EstadoCurso _estado;
	@Column(name="tipoCurso")
	public TipoCurso _tipo;
	@Transient
	public Vector<Matricula> _matriculas = new Vector<Matricula>();
	@Transient
	public Vector<Materia> _materias = new Vector<Materia>();
	
	public CursoPropio() {}
	
	public CursoPropio(int _id, String _nombre, int _eCTS, Date _fechaInicio, Date _fechaFin, int _tasaMatricula,
			int _edicion, Vector<Matricula> _matriculas, Centro _centro, ProfesorUCLM _director,
			ProfesorUCLM _secretario, Vector<Materia> _materias, EstadoCurso _estado, TipoCurso _tipo) {
		super();
		this._id = _id;
		this._nombre = _nombre;
		this._eCTS = _eCTS;
		this._fechaInicio = _fechaInicio;
		this._fechaFin = _fechaFin;
		this._tasaMatricula = _tasaMatricula;
		this._edicion = _edicion;
		this._matriculas = _matriculas;
		this._centro = _centro;
		this.nombreCentro = _centro.get_nombre();
		this._director = _director;
		this._secretario = _secretario;
		this._materias = _materias;
		this._estado = _estado;
		this._tipo = _tipo;
		this.idDirector = _director.get_dni();
		this.idSecretario = _secretario.get_dni();
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}

	public int get_eCTS() {
		return _eCTS;
	}

	public void set_eCTS(int _eCTS) {
		this._eCTS = _eCTS;
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

	public int get_tasaMatricula() {
		return _tasaMatricula;
	}

	public void set_tasaMatricula(int _tasaMatricula) {
		this._tasaMatricula = _tasaMatricula;
	}

	public int get_edicion() {
		return _edicion;
	}

	public void set_edicion(int _edicion) {
		this._edicion = _edicion;
	}

	public Vector<Matricula> get_matriculas() {
		return _matriculas;
	}

	public void set_matriculas(Vector<Matricula> _matriculas) {
		this._matriculas = _matriculas;
	}

	public Centro get_centro() {
		return _centro;
	}

	public void set_centro(Centro _centro) {
		this._centro = _centro;
	}

	public ProfesorUCLM get_director() {
		return _director;
	}

	public void set_director(ProfesorUCLM _director) {
		this._director = _director;
	}

	public ProfesorUCLM get_secretario() {
		return _secretario;
	}

	public void set_secretario(ProfesorUCLM _secretario) {
		this._secretario = _secretario;
	}

	public Vector<Materia> get_materias() {
		return _materias;
	}

	public void set_materias(Vector<Materia> _materias) {
		this._materias = _materias;
	}

	public EstadoCurso get_estado() {
		return _estado;
	}

	public void set_estado(EstadoCurso _estado) {
		this._estado = _estado;
	}

	public TipoCurso get_tipo() {
		return _tipo;
	}

	public void set_tipo(TipoCurso _tipo) {
		this._tipo = _tipo;
	}
}