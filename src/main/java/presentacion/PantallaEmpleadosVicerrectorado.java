package presentacion;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PantallaEmpleadosVicerrectorado extends JFrame {
	private JPanel contentPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				PantallaEmpleadosVicerrectorado frame = new PantallaEmpleadosVicerrectorado();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaEmpleadosVicerrectorado() {
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);

		try  {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		setBounds(100, 100, 299, 194);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("¿QUÉ DESEA HACER?");
		lblTitulo.setBackground(SystemColor.activeCaption);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTitulo.setBounds(0, 0, 280, 36);
		getContentPane().add(lblTitulo);


		JButton btnRealizarPropuesta = new JButton("Evaluar propuesta");
		btnRealizarPropuesta.setBounds(67, 47, 153, 23);
		getContentPane().add(btnRealizarPropuesta);
		btnRealizarPropuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaEvaluarPropuesta.main(null);
			}
		});

		JButton btnEditarCurso = new JButton("OP2");
		btnEditarCurso.setBounds(67, 81, 153, 23);
		getContentPane().add(btnEditarCurso);

		JButton btnVisualizar = new JButton("OP3");
		btnVisualizar.setBounds(67, 115, 153, 23);
		getContentPane().add(btnVisualizar);
	}
}
