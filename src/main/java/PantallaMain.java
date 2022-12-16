import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import presentacion.PantallaConsultarCursos;
import presentacion.PantallaDireccionCursos;
import presentacion.PantallaEmpleadosVicerrectorado;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaMain extends JFrame {

	private JPanel contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				PantallaMain frame = new PantallaMain();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 195, 150);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		
		JButton btnDirector = new JButton("DIRECTOR");
		btnDirector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaDireccionCursos.crearMainFrame();
			}
		});
		contentPanel.add(btnDirector);
		
		JButton btnJefegabinete = new JButton("Jefe de gabinete ");
		btnJefegabinete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaConsultarCursos.main(null);
			}
		});
		contentPanel.add(btnJefegabinete);
		
		JButton btnVicerrectorado = new JButton("Vicerrectorado");
		btnVicerrectorado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaEmpleadosVicerrectorado.main(null);
			}
		});
		contentPanel.add(btnVicerrectorado);
	}

}
