package presentacion;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import controllers.GestorLogin;
import presentacion.PantallaDireccionCursos;
import presentacion.PantallaEmpleadosVicerrectorado;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class PantallaLogin extends JFrame {

	private JPanel contentPanel;
	private JTextField textFieldUser;
	private JTextField textFieldPass;
	private GestorLogin gL = new GestorLogin();
	private String uID;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaLogin frame = new PantallaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);

		try  {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		setBounds(100, 100, 334, 289);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		getContentPane().setLayout(null);


		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegister.setBounds(174, 171, 100, 23);
		getContentPane().add(btnRegister);

		textFieldUser = new JTextField();
		textFieldUser.setBounds(82, 58, 151, 20);
		getContentPane().add(textFieldUser);
		textFieldUser.setColumns(10);

		textFieldPass = new JTextField();
		textFieldPass.setBounds(82, 114, 151, 20);
		getContentPane().add(textFieldPass);
		textFieldPass.setColumns(10);

		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setBounds(82, 33, 46, 14);
		getContentPane().add(lblUser);

		JLabel lblPassword = new JLabel("Contraseña:");
		lblPassword.setBounds(82, 89, 70, 14);
		getContentPane().add(lblPassword);

		JLabel lblErrorLogin = new JLabel("Inicio de sesión incorrecto, compruebe sus datos");
		lblErrorLogin.setForeground(new Color(255, 0, 0));
		lblErrorLogin.setBounds(37, 205, 237, 23);
		lblErrorLogin.setVisible(false);
		getContentPane().add(lblErrorLogin);

		JLabel lblForgotPass = new JLabel("¿Olvidaste la contraseña?");
		lblForgotPass.setForeground(new Color(0, 255, 255));
		lblForgotPass.setBounds(82, 146, 132, 14);
		getContentPane().add(lblForgotPass);

		JButton btnLogin = new JButton("Log in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String typeOfUser = "";
				try {
					uID = gL.iniciarSesion(textFieldUser.getText(),textFieldPass.getText());
					typeOfUser = gL.obtenerTipoUsuario(uID);
					if (typeOfUser.equals("JefeGabinete")) 
						PantallaConsultarCursos.main(null);
					if (typeOfUser.equals("Vicerrectorado")) 
						PantallaEmpleadosVicerrectorado.main(null);
					if (typeOfUser.equals("Profesor"))
						PantallaDireccionCursos.crearMainFrame();
//					if (typeOfUser.equals("Estudiante"))
						//hacer algo con pantalla de estudiante
						
				}catch (Exception exception) {
					exception.printStackTrace();
					lblErrorLogin.setVisible(true);
				}

			}

		});
		btnLogin.setBounds(52, 171, 100, 23);
		getContentPane().add(btnLogin);

	}
}
