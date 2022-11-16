package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.GestorMatriculacion;
import controllers.GestorPropuestasCursos;
import entities.ModoPago;
import persistencia.MatriculaDAO;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

import entities.CursoPropio;
import entities.Estudiante;

public class PantallaMatriculacion extends JFrame {

	private JPanel contentPane;
	private JTextField textDni;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTitulacion;
	private JTextField textCualificacion;
	private GestorMatriculacion GM = new GestorMatriculacion();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaMatriculacion frame = new PantallaMatriculacion();
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
	@SuppressWarnings("unchecked")
	public PantallaMatriculacion() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 354, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textDni = new JTextField();
		textDni.setBounds(10, 28, 128, 20);
		contentPane.add(textDni);
		textDni.setColumns(10);
		
		JLabel lblDni = new JLabel("Dni:");
		lblDni.setBounds(10, 11, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 59, 46, 14);
		contentPane.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(10, 76, 128, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 107, 46, 14);
		contentPane.add(lblApellido);
		
		textApellido = new JTextField();
		textApellido.setBounds(10, 125, 128, 20);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		JLabel lblTitulacion = new JLabel("Titulacion:");
		lblTitulacion.setBounds(10, 156, 73, 14);
		contentPane.add(lblTitulacion);
		
		textTitulacion = new JTextField();
		textTitulacion.setBounds(10, 173, 128, 20);
		contentPane.add(textTitulacion);
		textTitulacion.setColumns(10);
		
		JLabel lblCualificacion = new JLabel("Cualificacion:");
		lblCualificacion.setBounds(10, 204, 113, 14);
		contentPane.add(lblCualificacion);
		
		textCualificacion = new JTextField();
		textCualificacion.setBounds(10, 222, 128, 20);
		contentPane.add(textCualificacion);
		textCualificacion.setColumns(10);
		
		JComboBox comboBoxMetodoDePago = new JComboBox();
		comboBoxMetodoDePago.setBounds(10, 253, 128, 22);
		contentPane.add(comboBoxMetodoDePago);
		comboBoxMetodoDePago.setModel(new DefaultComboBoxModel(new String[] {ModoPago.TARJETA_CREDITO.toString(),ModoPago.TRANSFERENCIA.toString()}));
		
		JComboBox comboBoxCurso = new JComboBox();
		comboBoxCurso.setBounds(10, 286, 128, 22);
		contentPane.add(comboBoxCurso);
		
		List<CursoPropio> listaCursos = GM.recogerCursos();
		
		for(int i=0; i < listaCursos.size(); i++) {
			comboBoxCurso.addItem(listaCursos.get(i).get_id());
		}
		
		JButton btnRealizarPago = new JButton("Realizar Pago");
		btnRealizarPago.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				GM.realizarMatriculacion(textDni.getText(), textNombre.getText(), textTitulacion.getText(),textCualificacion.getText(),/*fecha*/,);
				
			}
		});
		btnRealizarPago.setBounds(10, 326, 128, 23);
		contentPane.add(btnRealizarPago);
		
		JTextPane textPaneRespuesta = new JTextPane();
		textPaneRespuesta.setBounds(148, 284, 180, 65);
		contentPane.add(textPaneRespuesta);
		
		
	}
				
}
