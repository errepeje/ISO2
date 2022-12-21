package presentacion;
import java.awt.EventQueue;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import controllers.GestorPropuestasCursos;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Color;

public class PantallaLogin extends PantallaPadre {
	private JTextField textFieldUser;
	private JTextField textFieldPass;
	private String uID;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				PantallaLogin frame = new PantallaLogin();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaLogin() {
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		try  {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			Logger logger = Logger.getLogger(GestorPropuestasCursos.class.getName());
			logger.log(null, "Error Login");
		}

		setBounds(100, 100, 334, 289);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		getContentPane().setLayout(null);

		JButton btnRegister = new JButton("Register");
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
					uID = gl.iniciarSesion(textFieldUser.getText(),textFieldPass.getText());
					typeOfUser = gl.obtenerTipoUsuario(uID);
					if (typeOfUser.equals("JefeGabinete")) 
						PantallaConsultarCursosCompleto.main(null);
					if (typeOfUser.equals("Vicerrectorado")) 
						PantallaEmpleadosVicerrectorado.main(null);
					if (typeOfUser.equals("Profesor"))
						PantallaDireccionCursos.crearMainFrame();
						
				} catch(Exception exception) {
					Logger logger = Logger.getLogger(GestorPropuestasCursos.class.getName());
					logger.log(null, "Error Login");
					lblErrorLogin.setVisible(true);
				}
			}
		});
		
		btnLogin.setBounds(52, 171, 100, 23);
		getContentPane().add(btnLogin);
	}
}
