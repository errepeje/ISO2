package presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controllers.GestorConsultas;
import controllers.GestorPropuestasCursos;
import entities.CursoPropio;
import entities.TipoCurso;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.swing.JLabel;

public class PantallaConsultarCursos_Ingresos extends JFrame {
	private JTextField txtIngresos = new JTextField();
	private JTextField textFieldNombre = new JTextField();
	private JTextField textFieldEdicion = new JTextField();
	private JTextField textFieldTipoCurso = new JTextField();
	private JTextField textFieldEstadoCurso = new JTextField();
	private JTextField textFieldDiaInicio = new JTextField();
	private JTextField textFieldMesInicio = new JTextField();
	private JTextField textFieldAnyoInicio = new JTextField();
	private JTextField textFieldDiaFin = new JTextField();
	private JTextField textFieldMesFin = new JTextField();
	private JTextField textFieldAnyoFin = new JTextField();
	private JTextField textFieldTasa = new JTextField();
	private JTextField textFieldECTS = new JTextField();
	private JTextField textNombreCentro = new JTextField();
	private JTextField textDirector = new JTextField();
	private JTextField textFieldSecretario = new JTextField();
	
	private GestorConsultas GC = new GestorConsultas();
	private CursoPropio cp;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				PantallaConsultarCursos_Ingresos frame = new PantallaConsultarCursos_Ingresos();
				frame.setVisible(true);
			}
		});
	}

	@SuppressWarnings("deprecation")
	public PantallaConsultarCursos_Ingresos() {
		setTitle("Seleccion cursos estados");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 728, 597);
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel); 
		panel.setLayout(null);
		
		JComboBox tiposBox = new JComboBox(TipoCurso.values());
		tiposBox.setBounds(10, 28, 166, 21);
		panel.add(tiposBox);
		
		JLabel lblTipoDeCurso1 = new JLabel("Tipo de curso:");
		lblTipoDeCurso1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoDeCurso1.setBounds(10, 11, 279, 19);
		panel.add(lblTipoDeCurso1);
		
		DefaultListModel listModel = new DefaultListModel();
		JList listCursos = new JList(listModel);
		listCursos.setBounds(10, 109, 166, 427);
		panel.add(listCursos);
		listCursos.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (listCursos.getSelectedValue() != null) {
					cp = GC.obtenerCursos(Integer.parseInt(listCursos.getSelectedValue().toString()));

					textFieldNombre.setText(cp.getnombre());
					textFieldEdicion.setText(Integer.toString(cp.getedicion()));
					textFieldTipoCurso.setText(cp.gettipo().toString());
					textFieldEstadoCurso.setText(cp.getestado().toString());
					
					String[] resultInicio = cp.getfechaInicio().toString().split("-");
					String[] solI = resultInicio[2].split(" ");
					textFieldDiaInicio.setText(solI[0]);
					textFieldMesInicio.setText(Integer.toString(cp.getfechaInicio().getMonth() + 1));
					textFieldAnyoInicio.setText(Integer.toString(cp.getfechaInicio().getYear() + 1900));
					
					String[] resultFin = cp.getfechaFin().toString().split("-");
					String[] solF = resultFin[2].split(" ");
					textFieldDiaFin.setText(solF[0]);
					textFieldMesFin.setText(Integer.toString(cp.getfechaFin().getMonth() + 1));
					textFieldAnyoFin.setText(Integer.toString(cp.getfechaFin().getYear() + 1900));
					
					textFieldTasa.setText(Integer.toString(cp.gettasaMatricula()));
					textFieldECTS.setText(Integer.toString(cp.geteCTS()));
					textNombreCentro.setText(cp.getNombreCentro());
					textDirector.setText(cp.getIdDirector());
					textFieldSecretario.setText(cp.idSecretario);
				}
			}
		});
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(186, 11, 279, 19);
		panel.add(lblNombre);
		textFieldNombre.setToolTipText("");
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(186, 29, 239, 20);
		panel.add(textFieldNombre);

		JLabel lblEdicion = new JLabel("Edicion:");
		lblEdicion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdicion.setBounds(186, 60, 279, 19);
		panel.add(lblEdicion);
		textFieldEdicion.setToolTipText("");
		textFieldEdicion.setEditable(false);
		textFieldEdicion.setColumns(10);
		textFieldEdicion.setBounds(186, 82, 239, 20);
		panel.add(textFieldEdicion);

		JLabel lblTipoDeCurso = new JLabel("Tipo de curso:");
		lblTipoDeCurso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoDeCurso.setBounds(186, 115, 279, 19);
		panel.add(lblTipoDeCurso);
		textFieldTipoCurso.setToolTipText("");
		textFieldTipoCurso.setEditable(false);
		textFieldTipoCurso.setColumns(10);
		textFieldTipoCurso.setBounds(186, 134, 239, 20);
		panel.add(textFieldTipoCurso);
		
		JLabel lblEstadoCurso = new JLabel("Estado del curso:");
		lblEstadoCurso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEstadoCurso.setBounds(185, 160, 279, 19);
		panel.add(lblEstadoCurso);
		textFieldEstadoCurso.setToolTipText("");
		textFieldEstadoCurso.setEditable(false);
		textFieldEstadoCurso.setColumns(10);
		textFieldEstadoCurso.setBounds(185, 178, 239, 20);
		panel.add(textFieldEstadoCurso);
		
		JLabel lblFechaInicio = new JLabel("Fecha de inicio (dd-mm-yyyy): ");
		lblFechaInicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaInicio.setBounds(186, 199, 279, 19);
		panel.add(lblFechaInicio);
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
		textFieldMesInicio.setEditable(false);
		textFieldMesInicio.setColumns(10);
		textFieldMesInicio.setBounds(273, 221, 66, 20);
		panel.add(textFieldMesInicio);
		JLabel lblg2 = new JLabel("-");
		lblg2.setHorizontalAlignment(SwingConstants.CENTER);
		lblg2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg2.setBounds(338, 221, 22, 20);
		panel.add(lblg2);
		textFieldAnyoInicio.setEditable(false);
		textFieldAnyoInicio.setColumns(10);
		textFieldAnyoInicio.setBounds(359, 220, 66, 20);
		panel.add(textFieldAnyoInicio);

		JLabel lblFechaFin = new JLabel("Fecha de fin (dd-mm-yyyy): ");
		lblFechaFin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaFin.setBounds(186, 252, 279, 19);
		panel.add(lblFechaFin);
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
		textFieldMesFin.setEditable(false);
		textFieldMesFin.setColumns(10);
		textFieldMesFin.setBounds(273, 276, 66, 20);
		panel.add(textFieldMesFin);
		JLabel lblg21 = new JLabel("-");
		lblg21.setHorizontalAlignment(SwingConstants.CENTER);
		lblg21.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg21.setBounds(338, 276, 22, 20);
		panel.add(lblg21);
		textFieldAnyoFin.setEditable(false);
		textFieldAnyoFin.setColumns(10);
		textFieldAnyoFin.setBounds(359, 275, 66, 20);
		panel.add(textFieldAnyoFin);

		JLabel lblTasaMatricula = new JLabel("Tasa: ");
		lblTasaMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTasaMatricula.setBounds(186, 307, 279, 19);
		panel.add(lblTasaMatricula);
		textFieldTasa.setEditable(false);
		textFieldTasa.setBounds(186, 326, 239, 20);
		panel.add(textFieldTasa);
		textFieldTasa.setColumns(10);

		JLabel lblEditaLosEcts = new JLabel("ECTS: ");
		lblEditaLosEcts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEditaLosEcts.setBounds(186, 357, 279, 19);
		panel.add(lblEditaLosEcts);
		textFieldECTS.setEditable(false);
		textFieldECTS.setColumns(10);
		textFieldECTS.setBounds(186, 377, 239, 20);
		panel.add(textFieldECTS);

		JLabel lblNombreCentro = new JLabel("Nombre del centro:");
		lblNombreCentro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreCentro.setBounds(185, 402, 279, 19);
		panel.add(lblNombreCentro);
		textNombreCentro.setEditable(false);
		textNombreCentro.setColumns(10);
		textNombreCentro.setBounds(188, 424, 239, 20);
		panel.add(textNombreCentro);

		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDirector.setBounds(184, 452, 279, 19);
		panel.add(lblDirector);
		textDirector.setEditable(false);
		textDirector.setColumns(10);
		textDirector.setBounds(186, 473, 239, 20);
		panel.add(textDirector);

		JLabel lblSecretario = new JLabel("Secretario:");
		lblSecretario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSecretario.setBounds(181, 497, 279, 19);
		panel.add(lblSecretario);
		textFieldSecretario.setEditable(false);
		textFieldSecretario.setColumns(10);
		textFieldSecretario.setBounds(186, 516, 239, 20);
		panel.add(textFieldSecretario);

		JLabel lblIngresosTotales = new JLabel("Ingresos totales:");
		lblIngresosTotales.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIngresosTotales.setBounds(10, 59, 279, 19);
		panel.add(lblIngresosTotales);
		txtIngresos.setBounds(10, 82, 96, 19);
		panel.add(txtIngresos);
		txtIngresos.setColumns(10);

		tiposBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent itemEvent) {
				txtIngresos.setText(null);
				listModel.removeAllElements();
				int ingresosTotales = 0;

				int[] idCursos = GC.obtenerCursos();
				int[] ingresosCursos = GC.obtenerIngresos();
				String[] tipoCursos = GC.obtenerTipoCurso();
				
				for(int j=0; j<ingresosCursos.length; j++) {
					if (tipoCursos[j].equals(tiposBox.getSelectedItem().toString())){
						listModel.addElement(idCursos[j]);
						ingresosTotales = ingresosTotales + ingresosCursos[j];
					}
				}
				listCursos.updateUI();
				txtIngresos.setText(Integer.toString(ingresosTotales));
			}
		});	
	}
	
	public Date darFormatoFecha(String cadena) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date fecha = null;
		try {
			fecha = formato.parse(cadena);
		} catch (ParseException e) {
			Logger logger = Logger.getLogger(GestorPropuestasCursos.class.getName());
			logger.log(null, "Error Fecha");
		}
		return fecha;
	}
}

