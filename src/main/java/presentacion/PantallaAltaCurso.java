package presentacion;

import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Generated;
import entities.TipoCurso;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

@Generated
public class PantallaAltaCurso extends PantallaPadre {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				PantallaAltaCurso frame = new PantallaAltaCurso();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaAltaCurso() {
		setTitle("Alta curso");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 675, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		/* DEFINIMOS ELEMENTOS */
		JLabel lblCategoriaCurso = new JLabel("Selecciona la categoría de curso:");
		lblCategoriaCurso.setFont(new Font(fuente, Font.PLAIN, 14));
		lblCategoriaCurso.setBounds(6, 72, 301, 23);
		contentPane.add(lblCategoriaCurso);

		JRadioButton rdbtnFPTU = new JRadioButton("Formación permanente (requiere titulación universitaria)");
		buttonGroup.add(rdbtnFPTU);
		rdbtnFPTU.setBounds(16, 102, 295, 23);
		contentPane.add(rdbtnFPTU);

		JRadioButton rdbtnFP = new JRadioButton("Formación permanente (no requiere formación)");
		buttonGroup.add(rdbtnFP);
		rdbtnFP.setBounds(16, 128, 295, 23);
		contentPane.add(rdbtnFP);

		JRadioButton rdbtnEP = new JRadioButton("Enseñanzas propias");
		buttonGroup.add(rdbtnEP);
		rdbtnEP.setBounds(16, 154, 174, 23);
		contentPane.add(rdbtnEP);

		JLabel lblTipoCurso = new JLabel("Selecciona el tipo de curso:");
		lblTipoCurso.setFont(new Font(fuente, Font.PLAIN, 14));
		lblTipoCurso.setBounds(6, 188, 211, 23);
		contentPane.add(lblTipoCurso);

		JComboBox comboBoxTipoCurso = new JComboBox();
		comboBoxTipoCurso.setBounds(24, 218, 283, 22);
		contentPane.add(comboBoxTipoCurso);

		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setFont(new Font(fuente, Font.PLAIN, 19));
		btnAceptar.setBounds(6, 347, 641, 39);
		contentPane.add(btnAceptar);

		JLabel lblFechaInicio = new JLabel("Introduzca la fecha de inicio(dd-mm-yyyy):");
		lblFechaInicio.setFont(new Font(fuente, Font.PLAIN, 14));
		lblFechaInicio.setBounds(6, 251, 301, 23);
		contentPane.add(lblFechaInicio);

		textFieldDiaInicio = new JTextField();
		textFieldDiaInicio.setToolTipText("");
		textFieldDiaInicio.setBounds(16, 279, 66, 20);
		contentPane.add(textFieldDiaInicio);
		textFieldDiaInicio.setColumns(10);

		JLabel lblNumECTS = new JLabel("Introduzca el número de créditos:");
		lblNumECTS.setFont(new Font(fuente, Font.PLAIN, 14));
		lblNumECTS.setBounds(346, 128, 301, 23);
		contentPane.add(lblNumECTS);

		textFieldECTS = new JTextField();
		textFieldECTS.setToolTipText("Dia");
		textFieldECTS.setColumns(10);
		textFieldECTS.setBounds(356, 156, 291, 20);
		contentPane.add(textFieldECTS);

		JLabel lblFechaFin = new JLabel("Introduzca la fecha de finalización(dd-mm-yyyy):");
		lblFechaFin.setFont(new Font(fuente, Font.PLAIN, 14));
		lblFechaFin.setBounds(346, 251, 301, 23);
		contentPane.add(lblFechaFin);

		textFieldMesInicio = new JTextField();
		textFieldMesInicio.setColumns(10);
		textFieldMesInicio.setBounds(103, 279, 66, 20);
		contentPane.add(textFieldMesInicio);

		textFieldAnyoInicio = new JTextField();
		textFieldAnyoInicio.setColumns(10);
		textFieldAnyoInicio.setBounds(189, 278, 66, 20);
		contentPane.add(textFieldAnyoInicio);

		JLabel lblg1 = new JLabel("-");
		lblg1.setHorizontalAlignment(SwingConstants.CENTER);
		lblg1.setFont(new Font(fuente, Font.PLAIN, 24));
		lblg1.setBounds(83, 282, 16, 14);
		contentPane.add(lblg1);

		JLabel lblg2 = new JLabel("-");
		lblg2.setHorizontalAlignment(SwingConstants.CENTER);
		lblg2.setFont(new Font(fuente, Font.PLAIN, 24));
		lblg2.setBounds(168, 279, 22, 20);
		contentPane.add(lblg2);

		textFieldDiaFin = new JTextField();
		textFieldDiaFin.setToolTipText("");
		textFieldDiaFin.setColumns(10);
		textFieldDiaFin.setBounds(356, 279, 66, 20);
		contentPane.add(textFieldDiaFin);

		JLabel lblg3 = new JLabel("-");
		lblg3.setHorizontalAlignment(SwingConstants.CENTER);
		lblg3.setFont(new Font(fuente, Font.PLAIN, 24));
		lblg3.setBounds(423, 282, 16, 14);
		contentPane.add(lblg3);

		textFieldMesFin = new JTextField();
		textFieldMesFin.setColumns(10);
		textFieldMesFin.setBounds(443, 279, 66, 20);
		contentPane.add(textFieldMesFin);

		JLabel lblg4 = new JLabel("-");
		lblg4.setHorizontalAlignment(SwingConstants.CENTER);
		lblg4.setFont(new Font(fuente, Font.PLAIN, 24));
		lblg4.setBounds(511, 281, 16, 14);
		contentPane.add(lblg4);

		textFieldAnyoFin = new JTextField();
		textFieldAnyoFin.setColumns(10);
		textFieldAnyoFin.setBounds(529, 278, 66, 20);
		contentPane.add(textFieldAnyoFin);

		JLabel lblTasa = new JLabel("Introduzca la tasa de la matrícula:");
		lblTasa.setFont(new Font(fuente, Font.PLAIN, 14));
		lblTasa.setBounds(346, 11, 301, 23);
		contentPane.add(lblTasa);

		textFieldTasa = new JTextField();
		textFieldTasa.setToolTipText("Dia");
		textFieldTasa.setColumns(10);
		textFieldTasa.setBounds(354, 39, 291, 20);
		contentPane.add(textFieldTasa);

		JLabel lblCentro = new JLabel("Selecciona el centro:");
		lblCentro.setFont(new Font(fuente, Font.PLAIN, 14));
		lblCentro.setBounds(346, 64, 301, 23);
		contentPane.add(lblCentro);

		JComboBox comboBoxCentro = new JComboBox();
		comboBoxCentro.setBounds(354, 91, 291, 22);
		contentPane.add(comboBoxCentro);
		String[] idCentro = gpc.obtenerCentros();
		for(int i=0; i<idCentro.length; i++)
			comboBoxCentro.addItem(idCentro[i]);

		JLabel lblInfo = new JLabel("INFORMACIÓN: ");
		lblInfo.setBounds(16, 310, 641, 26);
		contentPane.add(lblInfo);

		textFieldNombre = new JTextField();
		textFieldNombre.setToolTipText("Dia");
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(14, 40, 291, 20);
		contentPane.add(textFieldNombre);

		JLabel lblNombre = new JLabel("Pon un nombre al curso:");
		lblNombre.setFont(new Font(fuente, Font.PLAIN, 14));
		lblNombre.setBounds(6, 11, 211, 23);
		contentPane.add(lblNombre);

		JLabel lblSecretario = new JLabel("Selecciona el secretario del curso:");
		lblSecretario.setFont(new Font(fuente, Font.PLAIN, 14));
		lblSecretario.setBounds(346, 188, 301, 23);
		contentPane.add(lblSecretario);

		JComboBox comboBoxSecretario = new JComboBox();
		comboBoxSecretario.setBounds(356, 218, 291, 22);
		contentPane.add(comboBoxSecretario);
		String[] dni = gpc.obtenerSecretarios();
		for(int i=0; i<dni.length; i++)
			comboBoxSecretario.addItem(dni[i]);

		/* ACCIONES */
		rdbtnFPTU.addActionListener(new ActionListener() {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent e) {
				comboBoxTipoCurso.setModel(new DefaultComboBoxModel(new String[] {"MASTER", "ESPECIALISTA", "EXPERTO"}));
			}
		});

		rdbtnFP.addActionListener(new ActionListener() {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent e) {
				comboBoxTipoCurso.setModel(new DefaultComboBoxModel(new String[] {"FORMACION_AVANZADA", "FORMACION_CONTINUA"}));
			}
		});

		rdbtnEP.addActionListener(new ActionListener() {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent e) {
				comboBoxTipoCurso.setModel(new DefaultComboBoxModel(new String[] {"MICROCREDENCIALES", "CORTA_DURACION", "VERANO_Y_EXTENSION", "MAYORES"}));
			}
		});

		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gpc.realizarPropuestaCurso(
						textFieldNombre.getText(),
						Integer.parseInt(textFieldECTS.getText()),
						darFormatoFecha(textFieldDiaInicio.getText() + "/" + textFieldMesInicio.getText() + "/" + textFieldAnyoInicio.getText()),
						darFormatoFecha(textFieldDiaFin.getText() + "/" + textFieldMesFin.getText() + "/" + textFieldAnyoFin.getText()),
						Integer.parseInt(textFieldTasa.getText()),
						1,
						comboBoxCentro.getSelectedItem().toString(),
						"abs",
						comboBoxSecretario.getSelectedItem().toString(),
						TipoCurso.valueOf(comboBoxTipoCurso.getSelectedItem().toString()));
			}	
		});
	}
}
