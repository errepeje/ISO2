package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaConsultarCursos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				PantallaConsultarCursos frame = new PantallaConsultarCursos();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaConsultarCursos() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 222, 214);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnConsultarEdiciones = new JButton("Consultar ediciones");
		btnConsultarEdiciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaConsultarCursos_Ediciones.main(null);
			}
		});
		btnConsultarEdiciones.setBounds(22, 29, 174, 23);
		contentPane.add(btnConsultarEdiciones);
		
		JButton btnConsultarCursosIngresos = new JButton("Consultar Cursos Ingresos");
		btnConsultarCursosIngresos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaConsultarCursos_Ingresos.main(null);
			}
		});
		btnConsultarCursosIngresos.setBounds(22, 77, 174, 23);
		contentPane.add(btnConsultarCursosIngresos);
		
		JButton btnConsultarRechazadoAceptado = new JButton("Rechazado aceptado");
		btnConsultarRechazadoAceptado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaConsultarRechazadoAceptado.main(null);
			}
		});
		btnConsultarRechazadoAceptado.setBounds(22, 130, 174, 23);
		contentPane.add(btnConsultarRechazadoAceptado);
	}
}
