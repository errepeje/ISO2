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
@Table(name = "matricula")

public class Matricula {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int _id;
		@Column(name="fecha")
		private Date  _fecha;
		@Column(name="pagado")
		private boolean _pagado;
		@Column(name = "modopago")
		private ModoPago _tipoPago;
		@Transient
		private Estudiante _estudiante;
		@Column(name = "estudiante")
		private String _idEstudiante;
		@Transient
		private CursoPropio _cursoCursoPropio;
		@Column(name = "cursopropio")
		private String _idCursoPropio;
		@Transient 
		public Vector<Estudiante> _estudiantes = new Vector<Estudiante>();
		@Transient 
		public Vector<CursoPropio> _cursospropios = new Vector<CursoPropio>();
		public Matricula(int _id, Date _fecha, boolean _pagado, ModoPago _tipoPago, String idEstudiante,
				String idCursoPropio) {
			super();
			this._id = _id;
			this._fecha = _fecha;
			this._pagado = _pagado;
			this._tipoPago = _tipoPago;
			this._idEstudiante = _estudiante.get_dni();
			this._idCursoPropio = String.valueOf(_cursoCursoPropio.get_id());
		}
		public int get_id() {
			return _id;
		}
		public void set_id(int _id) {
			this._id = _id;
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
		public ModoPago get_tipoPago() {
			return _tipoPago;
		}
		public void set_tipoPago(ModoPago _tipoPago) {
			this._tipoPago = _tipoPago;
		}
		public String get_idEstudiante() {
			return _idEstudiante;
		}
		public void set_idEstudiante(String _idEstudiante) {
			this._idEstudiante = _idEstudiante;
		}
		public String get_idCursoPropio() {
			return _idCursoPropio;
		}
		public void set_idCursoPropio(String _idCursoPropio) {
			this._idCursoPropio = _idCursoPropio;
		}
	}
	

