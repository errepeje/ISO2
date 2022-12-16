package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario {
	@Id
	@Column(name="dni")
	private String dni;
	@Column(name="nick")
	private String nick;
	@Column(name="password")
	private String password;
	
	public Usuario(String dni, String nick, String password) {
		super();
		this.dni = dni;
		this.nick = nick;
		this.password = password;
	}
	
	public Usuario() {}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
