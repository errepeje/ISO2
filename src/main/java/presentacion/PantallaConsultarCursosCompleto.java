package presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class PantallaConsultarCursosCompleto extends PantallaPadre {
	private JTextField buscar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				PantallaConsultarCursosCompleto frame = new PantallaConsultarCursosCompleto();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public PantallaConsultarCursosCompleto() {

		setTitle("Consultar Cursos");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel); 
		panel.setLayout(null);

		DefaultListModel listModel = new DefaultListModel();


		JList listCursos = new JList(listModel);
		listCursos.setBounds(10, 194, 166, 299);
		panel.add(listCursos);

		JLabel lblFechaInicio = new JLabel("Fecha de inicio (dd-mm-yyyy): ");
		lblFechaInicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaInicio.setBounds(186, 199, 279, 19);
		panel.add(lblFechaInicio);

		JLabel lblFechaFin = new JLabel("Fecha de fin (dd-mm-yyyy): ");
		lblFechaFin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaFin.setBounds(186, 252, 279, 19);
		panel.add(lblFechaFin);

		JLabel lblTasaMatricula = new JLabel("Tasa: ");
		lblTasaMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTasaMatricula.setBounds(186, 307, 279, 19);
		panel.add(lblTasaMatricula);

		JLabel lblEditaLosEcts = new JLabel("ECTS: ");
		lblEditaLosEcts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEditaLosEcts.setBounds(186, 357, 279, 19);
		panel.add(lblEditaLosEcts);

		textFieldDiaInicio = new JTextField();
		textFieldDiaInicio.setEditable(false);
		textFieldDiaInicio.setToolTipText("");
		textFieldDiaInicio.setColumns(10);
		textFieldDiaInicio.setBounds(186, 221, 66, 20);
		panel.add(textFieldDiaInicio);

		JLabel lblg1 = new JLabel("-");
		lblg1.setHorizontalAlignment(SwingConstants.CENTER);
		lblg1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg1.setBounds(253, 224, 16, 14);
		panel.add(lblg1);

		textFieldMesInicio = new JTextField();
		textFieldMesInicio.setEditable(false);
		textFieldMesInicio.setColumns(10);
		textFieldMesInicio.setBounds(273, 221, 66, 20);
		panel.add(textFieldMesInicio);

		JLabel lblg2 = new JLabel("-");
		lblg2.setHorizontalAlignment(SwingConstants.CENTER);
		lblg2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg2.setBounds(338, 221, 22, 20);
		panel.add(lblg2);

		textFieldAnyoInicio = new JTextField();
		textFieldAnyoInicio.setEditable(false);
		textFieldAnyoInicio.setColumns(10);
		textFieldAnyoInicio.setBounds(359, 220, 66, 20);
		panel.add(textFieldAnyoInicio);

		textFieldDiaFin = new JTextField();
		textFieldDiaFin.setEditable(false);
		textFieldDiaFin.setToolTipText("");
		textFieldDiaFin.setColumns(10);
		textFieldDiaFin.setBounds(186, 276, 66, 20);
		panel.add(textFieldDiaFin);

		JLabel lblg11 = new JLabel("-");
		lblg11.setHorizontalAlignment(SwingConstants.CENTER);
		lblg11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg11.setBounds(253, 279, 16, 14);
		panel.add(lblg11);

		textFieldMesFin = new JTextField();
		textFieldMesFin.setEditable(false);
		textFieldMesFin.setColumns(10);
		textFieldMesFin.setBounds(273, 276, 66, 20);
		panel.add(textFieldMesFin);

		JLabel lblg21 = new JLabel("-");
		lblg21.setHorizontalAlignment(SwingConstants.CENTER);
		lblg21.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg21.setBounds(338, 276, 22, 20);
		panel.add(lblg21);

		textFieldAnyoFin = new JTextField();
		textFieldAnyoFin.setEditable(false);
		textFieldAnyoFin.setColumns(10);
		textFieldAnyoFin.setBounds(359, 275, 66, 20);
		panel.add(textFieldAnyoFin);

		textFieldTasa = new JTextField();
		textFieldTasa.setEditable(false);
		textFieldTasa.setBounds(186, 326, 239, 20);
		panel.add(textFieldTasa);
		textFieldTasa.setColumns(10);

		textFieldECTS = new JTextField();
		textFieldECTS.setEditable(false);
		textFieldECTS.setColumns(10);
		textFieldECTS.setBounds(186, 377, 239, 20);
		panel.add(textFieldECTS);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(186, 11, 279, 19);
		panel.add(lblNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setToolTipText("");
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(186, 29, 239, 20);
		panel.add(textFieldNombre);

		textFieldEdicion = new JTextField();
		textFieldEdicion.setToolTipText("");
		textFieldEdicion.setEditable(false);
		textFieldEdicion.setColumns(10);
		textFieldEdicion.setBounds(186, 82, 239, 20);
		panel.add(textFieldEdicion);

		JLabel lblEdicion = new JLabel("Edicion:");
		lblEdicion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdicion.setBounds(186, 60, 279, 19);
		panel.add(lblEdicion);

		JLabel lblTipoDeCurso = new JLabel("Tipo de curso:");
		lblTipoDeCurso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoDeCurso.setBounds(186, 115, 279, 19);
		panel.add(lblTipoDeCurso);

		textFieldTipoCurso = new JTextField();
		textFieldTipoCurso.setToolTipText("");
		textFieldTipoCurso.setEditable(false);
		textFieldTipoCurso.setColumns(10);
		textFieldTipoCurso.setBounds(186, 134, 239, 20);
		panel.add(textFieldTipoCurso);

		JLabel lblEstadoCurso = new JLabel("Estado del curso:");
		lblEstadoCurso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEstadoCurso.setBounds(185, 160, 279, 19);
		panel.add(lblEstadoCurso);

		textFieldEstadoCurso = new JTextField();
		textFieldEstadoCurso.setToolTipText("");
		textFieldEstadoCurso.setEditable(false);
		textFieldEstadoCurso.setColumns(10);
		textFieldEstadoCurso.setBounds(185, 178, 239, 20);
		panel.add(textFieldEstadoCurso);

		JLabel lblNombreCentro = new JLabel("Nombre del centro:");
		lblNombreCentro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreCentro.setBounds(185, 402, 279, 19);
		panel.add(lblNombreCentro);

		textNombreCentro = new JTextField();
		textNombreCentro.setEditable(false);
		textNombreCentro.setColumns(10);
		textNombreCentro.setBounds(188, 424, 239, 20);
		panel.add(textNombreCentro);

		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDirector.setBounds(184, 452, 279, 19);
		panel.add(lblDirector);

		textDirector = new JTextField();
		textDirector.setEditable(false);
		textDirector.setColumns(10);
		textDirector.setBounds(186, 473, 239, 20);
		panel.add(textDirector);

		JLabel lblSecretario = new JLabel("Secretario:");
		lblSecretario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSecretario.setBounds(181, 497, 279, 19);
		panel.add(lblSecretario);

		textFieldSecretario = new JTextField();
		textFieldSecretario.setEditable(false);
		textFieldSecretario.setColumns(10);
		textFieldSecretario.setBounds(186, 516, 239, 20);
		panel.add(textFieldSecretario);
		textFieldTasa.setEditable(false);

		////Rechazado/Acep
		JComboBox estadosBox = new JComboBox();
		estadosBox.setBounds(10, 81, 166, 21);
		panel.add(estadosBox);
		String [] allEstados = {"TODOS", "PROPUESTO", "VALIDADO", "PROPUESTA_RECHAZADA", "EN_MATRICULACI??N", "EN_IMPARTICI??N", "TERMINADO"};
		for(int i=0; i<allEstados.length; i++)
			estadosBox.addItem(allEstados[i]);

		JLabel lblEstadoDeCurso = new JLabel("Estado de curso:");
		lblEstadoDeCurso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEstadoDeCurso.setBounds(10, 59, 279, 19);
		panel.add(lblEstadoDeCurso);

		///Ingresos
		JComboBox tiposBox = new JComboBox();
		tiposBox.setBounds(10, 28, 166, 21);
		panel.add(tiposBox);
		String [] allEstados1 = {"TODOS", "MASTER", "EXPERTO", "ESPECIALISTA", "FORMACION_AVANZADA", "FORMACION_CONTINUA", "MICROCREDENCIALES", "CORTA_DURACION","VERANO_Y_EXTENSION", "MAYORES"};
		for(int i=0; i<allEstados1.length; i++)
			tiposBox.addItem(allEstados1[i]);

		txtIngresos = new JTextField();
		txtIngresos.setBounds(10, 516, 96, 19);
		panel.add(txtIngresos);
		txtIngresos.setColumns(10);

		JLabel lblTipoDeCurso1 = new JLabel("Tipo de curso:");
		lblTipoDeCurso1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoDeCurso1.setBounds(10, 11, 279, 19);
		panel.add(lblTipoDeCurso1);

		JLabel lblIngresosTotales = new JLabel("Ingresos totales:");
		lblIngresosTotales.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresosTotales.setBounds(10, 497, 279, 19);
		panel.add(lblIngresosTotales);

		///Ediciones
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(10, 161, 87, 21);
		panel.add(btnBuscar);

		buscar = new JTextField();
		buscar.setBounds(10, 135, 109, 19);
		panel.add(buscar);
		buscar.setColumns(10);

		JLabel lblEdicinABuscar = new JLabel("Edici??n a buscar:");
		lblEdicinABuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdicinABuscar.setBounds(10, 112, 279, 19);
		panel.add(lblEdicinABuscar);

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listModel.removeAllElements();

				int ingresosTotales=0;
				int[] idCursos = gc.obtenerCursos();
				int[] edicionCursos = gc.obtenerEdicion();
				String[] estadoCursos = gc.obtenerEstado();
				String[] tipoCursos = gc.obtenerTipoCurso();
				int[] ingresosCursos = gc.obtenerIngresos();

				for(int j=0; j<edicionCursos.length; j++) {
					if (buscar.getText().length()==0 || edicionCursos[j]== Integer.parseInt(buscar.getText()) &&
							estadoCursos[j].equals(estadosBox.getSelectedItem().toString()) || estadosBox.getSelectedItem().toString().equals("TODOS") && 
							tipoCursos[j].equals(tiposBox.getSelectedItem().toString()) || tiposBox.getSelectedItem().toString().equals("TODOS")) {
						listModel.addElement(idCursos[j]);
						ingresosTotales= ingresosTotales + ingresosCursos[j];							
					} 						

				}
				txtIngresos.setText(Integer.toString(ingresosTotales));				
			}
		});

		listCursos.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (listCursos.getSelectedValue() != null) {
					cp = gc.obtenerCursos(Integer.parseInt(listCursos.getSelectedValue().toString()));
					textFieldTasa.setText(Integer.toString(cp.gettasaMatricula()));
					textFieldECTS.setText(Integer.toString(cp.geteCTS()));

					String[] resultInicio = cp.getfechaInicio().toString().split("-");
					String[] solI = resultInicio[2].split(" ");
					String[] resultFin = cp.getfechaFin().toString().split("-");
					String[] solF = resultFin[2].split(" ");

					textFieldNombre.setText(cp.getnombre());
					textFieldEdicion.setText(Integer.toString(cp.getedicion()));
					textNombreCentro.setText(cp.getNombreCentro());
					textDirector.setText(cp.getIdDirector());
					textFieldSecretario.setText(cp.idSecretario);
					textFieldTipoCurso.setText(cp.gettipo().toString());
					textFieldEstadoCurso.setText(cp.getestado().toString());

					textFieldDiaInicio.setText(solI[0]);
					textFieldMesInicio.setText(Integer.toString(cp.getfechaInicio().getMonth() + 1));
					textFieldAnyoInicio.setText(Integer.toString(cp.getfechaInicio().getYear() + 1900));

					textFieldDiaFin.setText(solF[0]);
					textFieldMesFin.setText(Integer.toString(cp.getfechaFin().getMonth() + 1));
					textFieldAnyoFin.setText(Integer.toString(cp.getfechaFin().getYear() + 1900));
				}
			}
		});

	}
}
