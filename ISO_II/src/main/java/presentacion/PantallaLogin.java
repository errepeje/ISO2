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
	private String UID;
	private String typeOfUser;
	
	
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
	    EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Vicerrectorado");
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
                
                try  {
                   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                   e.printStackTrace();
                }
                
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        		frame.setBounds(100, 100, 334, 289);
        		contentPanel = new JPanel();
        		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
                
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        		frame.getContentPane().setLayout(null);
        		
        		
        		JButton btnRegister = new JButton("Register");
        		btnRegister.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        			}
        		});
        		btnRegister.setBounds(174, 171, 100, 23);
        		frame.getContentPane().add(btnRegister);
        		
        		textFieldUser = new JTextField();
        		textFieldUser.setBounds(82, 58, 151, 20);
        		frame.getContentPane().add(textFieldUser);
        		textFieldUser.setColumns(10);
        		
        		textFieldPass = new JTextField();
        		textFieldPass.setBounds(82, 114, 151, 20);
        		frame.getContentPane().add(textFieldPass);
        		textFieldPass.setColumns(10);
        		
        		JLabel lblUser = new JLabel("Usuario:");
        		lblUser.setBounds(82, 33, 46, 14);
        		frame.getContentPane().add(lblUser);
        		
        		JLabel lblPassword = new JLabel("Contraseña:");
        		lblPassword.setBounds(82, 89, 70, 14);
        		frame.getContentPane().add(lblPassword);
        		
        		JLabel lblErrorLogin = new JLabel("Inicio de sesión incorrecto, compruebe sus datos");
        		lblErrorLogin.setForeground(new Color(255, 0, 0));
        		lblErrorLogin.setBounds(37, 205, 237, 23);
        		lblErrorLogin.setVisible(false);
        		frame.getContentPane().add(lblErrorLogin);
        		
        		JLabel lblForgotPass = new JLabel("¿Olvidaste la contraseña?");
        		lblForgotPass.setForeground(new Color(0, 255, 255));
        		lblForgotPass.setBounds(82, 146, 132, 14);
        		frame.getContentPane().add(lblForgotPass);
        		
        		JButton btnLogin = new JButton("Log in");
        		btnLogin.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				//Hacer la consulta al gestor de login
        				//recorrer la respuesta del gestor login y guardar el id y el tipo usuario
        				if (typeOfUser.equals("JefeGabinete")) 
        					PantallaConsultarCursos.main(null);
        				if (typeOfUser.equals("Vicerrectorado")) 
        					PantallaEmpleadosVicerrectorado.main(null);
        				if (typeOfUser.equals("Profesor"))
        					PantallaDireccionCursos.crearMainFrame();
        			}
        			
        		});
        		btnLogin.setBounds(52, 171, 100, 23);
        		frame.getContentPane().add(btnLogin);
  
            }
        });
	}
}
