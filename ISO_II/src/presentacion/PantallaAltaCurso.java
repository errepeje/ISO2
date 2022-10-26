package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.text.View;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PantallaAltaCurso extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldDiaInicio;
	private JTextField textFieldNumECTS;
	private JTextField textFieldMesInicio;
	private JTextField textFieldAnyoInicio;
	private JTextField textFieldDiaFin;
	private JTextField textFieldMesFin;
	private JTextField textFieldAnyoFin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaAltaCurso frame = new PantallaAltaCurso();
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
	public PantallaAltaCurso() {
		setTitle("Alta curso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		/* DEFINIMOS ELEMENTOS */
		JLabel lblCategoriaCurso = new JLabel("Selecciona la categoría de curso:");
		lblCategoriaCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCategoriaCurso.setBounds(6, 11, 301, 23);
		contentPane.add(lblCategoriaCurso);

		JRadioButton rdbtnFPTU = new JRadioButton("Formación permanente (requiere titulación universitaria)");
		buttonGroup.add(rdbtnFPTU);
		rdbtnFPTU.setBounds(16, 41, 295, 23);
		contentPane.add(rdbtnFPTU);

		JRadioButton rdbtnFP = new JRadioButton("Formación permanente (no requiere formación)");
		buttonGroup.add(rdbtnFP);
		rdbtnFP.setBounds(16, 67, 295, 23);
		contentPane.add(rdbtnFP);

		JRadioButton rdbtnEnseñanzasPropias = new JRadioButton("Enseñanzas propias");
		buttonGroup.add(rdbtnEnseñanzasPropias);
		rdbtnEnseñanzasPropias.setBounds(16, 93, 174, 23);
		contentPane.add(rdbtnEnseñanzasPropias);

		JLabel lblTipoCurso = new JLabel("Selecciona el tipo de curso:");
		lblTipoCurso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoCurso.setBounds(6, 131, 211, 23);
		contentPane.add(lblTipoCurso);

		JComboBox comboBoxTipoCurso = new JComboBox();
		comboBoxTipoCurso.setBounds(16, 165, 291, 22);
		contentPane.add(comboBoxTipoCurso);

		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBounds(116, 403, 89, 23);
		contentPane.add(btnAceptar);

		JLabel lblFechaInicio = new JLabel("Introduzca la fecha de inicio(dd-mm-yyyy):");
		lblFechaInicio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaInicio.setBounds(6, 274, 301, 23);
		contentPane.add(lblFechaInicio);

		textFieldDiaInicio = new JTextField();
		textFieldDiaInicio.setToolTipText("");
		textFieldDiaInicio.setBounds(16, 302, 66, 20);
		contentPane.add(textFieldDiaInicio);
		textFieldDiaInicio.setColumns(10);

		JLabel lblNumECTS = new JLabel("Introduzca el número de créditos:");
		lblNumECTS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumECTS.setBounds(6, 209, 301, 23);
		contentPane.add(lblNumECTS);

		textFieldNumECTS = new JTextField();
		textFieldNumECTS.setToolTipText("Dia");
		textFieldNumECTS.setColumns(10);
		textFieldNumECTS.setBounds(16, 238, 291, 20);
		contentPane.add(textFieldNumECTS);
		
		JLabel lblFechaFin = new JLabel("Introduzca la fecha de finalización(dd-mm-yyyy):");
		lblFechaFin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaFin.setBounds(6, 335, 301, 23);
		contentPane.add(lblFechaFin);
		
		textFieldMesInicio = new JTextField();
		textFieldMesInicio.setColumns(10);
		textFieldMesInicio.setBounds(103, 302, 66, 20);
		contentPane.add(textFieldMesInicio);
		
		textFieldAnyoInicio = new JTextField();
		textFieldAnyoInicio.setColumns(10);
		textFieldAnyoInicio.setBounds(189, 301, 66, 20);
		contentPane.add(textFieldAnyoInicio);
		
		JLabel lblg1 = new JLabel("-");
		lblg1.setHorizontalAlignment(SwingConstants.CENTER);
		lblg1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg1.setBounds(83, 305, 16, 14);
		contentPane.add(lblg1);
		
		JLabel lblg2 = new JLabel("-");
		lblg2.setHorizontalAlignment(SwingConstants.CENTER);
		lblg2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg2.setBounds(171, 304, 16, 14);
		contentPane.add(lblg2);
		
		textFieldDiaFin = new JTextField();
		textFieldDiaFin.setToolTipText("");
		textFieldDiaFin.setColumns(10);
		textFieldDiaFin.setBounds(16, 360, 66, 20);
		contentPane.add(textFieldDiaFin);
		
		JLabel lblg3 = new JLabel("-");
		lblg3.setHorizontalAlignment(SwingConstants.CENTER);
		lblg3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg3.setBounds(83, 363, 16, 14);
		contentPane.add(lblg3);
		
		textFieldMesFin = new JTextField();
		textFieldMesFin.setColumns(10);
		textFieldMesFin.setBounds(103, 360, 66, 20);
		contentPane.add(textFieldMesFin);
		
		JLabel lblg4 = new JLabel("-");
		lblg4.setHorizontalAlignment(SwingConstants.CENTER);
		lblg4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg4.setBounds(171, 362, 16, 14);
		contentPane.add(lblg4);
		
		textFieldAnyoFin = new JTextField();
		textFieldAnyoFin.setColumns(10);
		textFieldAnyoFin.setBounds(189, 359, 66, 20);
		contentPane.add(textFieldAnyoFin);
		
		JLabel lblInfo = new JLabel("Información:");
		lblInfo.setBounds(16, 391, 291, 14);
		contentPane.add(lblInfo);

		/* ACCIONES */
		rdbtnFPTU.addActionListener(new ActionListener() {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent e) {
				comboBoxTipoCurso.setModel(new DefaultComboBoxModel(new String[] {"Másteres de Formación Permanente", "Especialistas", "Expertos"}));
			}
		});

		rdbtnFP.addActionListener(new ActionListener() {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent e) {
				comboBoxTipoCurso.setModel(new DefaultComboBoxModel(new String[] {"Cursos Universitarios de Formación Avanzada", "Cursos de Formación Continua"}));
			}
		});

		rdbtnEnseñanzasPropias.addActionListener(new ActionListener() {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public void actionPerformed(ActionEvent e) {
				comboBoxTipoCurso.setModel(new DefaultComboBoxModel(new String[] {"Microcredenciales", "Actividades formativas de corta duración", "Cursos de Verano y Extensión Universitaria", "Formación de Mayores"}));
			}
		});

		comboBoxTipoCurso.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent itemEvent) {
				String opcion = comboBoxTipoCurso.getSelectedItem().toString();

				switch(opcion) {
				/* Casos de enseñanzas de formacion permanentes */
					case "Másteres de Formación Permanente":
//						lblFechaInicio.setText("Introduce el número de cursos:");
						break;
					case "Especialistas":
//						lblFechaInicio.setText("Introduce el número de semestres:");
						break;
					case "Expertos":
//						lblFechaInicio.setText("NO APLICA");
						break;
						
				/* Casos de enseñanzas de formacion permanentes que no requieren titulacion */
					case "Cursos Universitarios de Formación Avanzada":
//						lblFechaInicio.setText("Introduce el número de cursos:");
						break;
					case "Cursos de Formación Continua":
//						lblFechaInicio.setText("Introduce el número de semestres:");
						break;
						
				/* Casos de enseñanzas propias */
					case "Microcredenciales":
//						lblFechaInicio.setText("NO APLICA");
						break;
					case "Actividades formativas de corta duración":
//						lblFechaInicio.setText("Introduce el número de cursos:");
						break;
					case "Cursos de Verano y Extensión Universitaria":
//						lblFechaInicio.setText("Introduce el número de semestres:");
						break;
					case "Formación de Mayores":
//						lblFechaInicio.setText("NO APLICA");
						break;
						
				}

			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
//				if(!comprobarFormatoFecha()) {
//					lblInfo.setText("Información: Datos mal introducidos.");					
//				} else {
//					 guardar datos					
//				}
			}
		});

	}
	
//	public boolean comprobarFormatoFecha() {
//		int dayI, monthI, yearI, dayF, monthF, yearF;
//		
//		dayI = Integer.parseInt(textFieldDiaInicio.getText().toString());
//		monthI = Integer.parseInt(textFieldMesInicio.getText().toString());
//		yearI = Integer.parseInt(textFieldAnyoInicio.getText().toString());
//		LocalDate inicio = LocalDate.of(yearI, monthI, dayI);
//		
//		dayF = Integer.parseInt(textFieldDiaFin.getText().toString());
//		monthF = Integer.parseInt(textFieldMesFin.getText().toString());
//		yearF = Integer.parseInt(textFieldAnyoFin.getText().toString());
//		LocalDate fin = LocalDate.of(yearF, monthF, dayF);
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		
//		// Conversion de string a date
//		String inicio = request.getParameter("addtimeinicio");
//		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
//		Date fechaInicio = date.parse(Dateinicio);

		// La fecha actual
//		Date fechaactual = new Date(System.currentTimeMillis())
//		int milisecondsByDay = 86400000;
//		int dias = (int) ((fin.getTime() - inicio.getTime()) / milisecondsByDay);
		
        
//        return true;
//	}
}
