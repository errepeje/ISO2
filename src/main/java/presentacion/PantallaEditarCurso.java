package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.w3c.dom.Node;

import controllers.GestorPropuestasCursos;
import entities.CursoPropio;
import entities.TipoCurso;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PantallaEditarCurso extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDiaInicio;
	private JTextField textFieldMesInicio;
	private JTextField textFieldAnyoInicio;
	private JTextField textFieldDiaFin;
	private JTextField textFieldMesFin;
	private JTextField textFieldAnyoFin;
	private JTextField textFieldTasa;
	private JTextField textFieldECTS;
	private GestorPropuestasCursos GPC = new GestorPropuestasCursos();
	private CursoPropio cp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaEditarCurso frame = new PantallaEditarCurso();
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
	public PantallaEditarCurso() {
		setTitle("Edición de un curso");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane); 
		contentPane.setLayout(null);

		JButton btnCambios = new JButton("Aplicar cambios");
		btnCambios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCambios.setBounds(10, 221, 426, 36);
		contentPane.add(btnCambios);

		DefaultListModel listModel = new DefaultListModel();
		int[] idCursosDenegados = GPC.obtenerCursosDenegados();
		for(int i=0; i<idCursosDenegados.length; i++)
			listModel.addElement(idCursosDenegados[i]);

		JList listCursos = new JList(listModel);
		listCursos.setBounds(10, 11, 166, 199);
		contentPane.add(listCursos);

		JLabel lblFechaInicio = new JLabel("Edita la fecha de inicio (dd-mm-yyyy): ");
		lblFechaInicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaInicio.setBounds(186, 12, 279, 19);
		contentPane.add(lblFechaInicio);

		JLabel lblFechaFin = new JLabel("Edita la fecha de fin (dd-mm-yyyy): ");
		lblFechaFin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaFin.setBounds(186, 65, 279, 19);
		contentPane.add(lblFechaFin);

		JLabel lblTasaMatricula = new JLabel("Edita la tasa: ");
		lblTasaMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTasaMatricula.setBounds(186, 120, 279, 19);
		contentPane.add(lblTasaMatricula);

		JLabel lblEditaLosEcts = new JLabel("Edita los ECTS: ");
		lblEditaLosEcts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEditaLosEcts.setBounds(186, 170, 279, 19);
		contentPane.add(lblEditaLosEcts);

		textFieldDiaInicio = new JTextField();
		textFieldDiaInicio.setToolTipText("");
		textFieldDiaInicio.setColumns(10);
		textFieldDiaInicio.setBounds(186, 34, 66, 20);
		contentPane.add(textFieldDiaInicio);

		JLabel lblg1 = new JLabel("-");
		lblg1.setHorizontalAlignment(SwingConstants.CENTER);
		lblg1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg1.setBounds(253, 37, 16, 14);
		contentPane.add(lblg1);

		textFieldMesInicio = new JTextField();
		textFieldMesInicio.setColumns(10);
		textFieldMesInicio.setBounds(273, 34, 66, 20);
		contentPane.add(textFieldMesInicio);

		JLabel lblg2 = new JLabel("-");
		lblg2.setHorizontalAlignment(SwingConstants.CENTER);
		lblg2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg2.setBounds(338, 34, 22, 20);
		contentPane.add(lblg2);

		textFieldAnyoInicio = new JTextField();
		textFieldAnyoInicio.setColumns(10);
		textFieldAnyoInicio.setBounds(359, 33, 66, 20);
		contentPane.add(textFieldAnyoInicio);

		textFieldDiaFin = new JTextField();
		textFieldDiaFin.setToolTipText("");
		textFieldDiaFin.setColumns(10);
		textFieldDiaFin.setBounds(186, 89, 66, 20);
		contentPane.add(textFieldDiaFin);

		JLabel lblg1_1 = new JLabel("-");
		lblg1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblg1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg1_1.setBounds(253, 92, 16, 14);
		contentPane.add(lblg1_1);

		textFieldMesFin = new JTextField();
		textFieldMesFin.setColumns(10);
		textFieldMesFin.setBounds(273, 89, 66, 20);
		contentPane.add(textFieldMesFin);

		JLabel lblg2_1 = new JLabel("-");
		lblg2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblg2_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg2_1.setBounds(338, 89, 22, 20);
		contentPane.add(lblg2_1);

		textFieldAnyoFin = new JTextField();
		textFieldAnyoFin.setColumns(10);
		textFieldAnyoFin.setBounds(359, 88, 66, 20);
		contentPane.add(textFieldAnyoFin);

		textFieldTasa = new JTextField();
		textFieldTasa.setBounds(186, 139, 239, 20);
		contentPane.add(textFieldTasa);
		textFieldTasa.setColumns(10);

		textFieldECTS = new JTextField();
		textFieldECTS.setColumns(10);
		textFieldECTS.setBounds(186, 190, 239, 20);
		contentPane.add(textFieldECTS);
		
		/* ACCIONES */
		listCursos.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (listCursos.getSelectedValue() != null) {
					cp = GPC.obtenerCurso(Integer.parseInt(listCursos.getSelectedValue().toString()));
					textFieldTasa.setText(Integer.toString(cp.get_tasaMatricula()));
					textFieldECTS.setText(Integer.toString(cp.get_eCTS()));
					
					String[] resultInicio = cp.get_fechaInicio().toString().split("-");
					String[] solI = resultInicio[2].split(" ");
					String[] resultFin = cp.get_fechaFin().toString().split("-");
					String[] solF = resultFin[2].split(" ");
					
					textFieldDiaInicio.setText(solI[0]);
					textFieldMesInicio.setText(Integer.toString(cp.get_fechaInicio().getMonth() + 1));
					textFieldAnyoInicio.setText(Integer.toString(cp.get_fechaInicio().getYear() + 1900));
					
					textFieldDiaFin.setText(solF[0]);
					textFieldMesFin.setText(Integer.toString(cp.get_fechaFin().getMonth() + 1));
					textFieldAnyoFin.setText(Integer.toString(cp.get_fechaFin().getYear() + 1900));
				}
			}
		});
		
		btnCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cp.set_eCTS(Integer.parseInt(textFieldECTS.getText().toString()));
				cp.set_tasaMatricula(Integer.parseInt(textFieldTasa.getText().toString()));
				cp.set_fechaInicio(darFormatoFecha(textFieldDiaInicio.getText().toString() + "/" + textFieldMesInicio.getText().toString() + "/" + textFieldAnyoInicio.getText().toString()));
				cp.set_fechaFin(darFormatoFecha(textFieldDiaFin.getText().toString() + "/" + textFieldMesFin.getText().toString() + "/" + textFieldAnyoFin.getText().toString()));
				
				GPC.editarPropuestaCurso(cp);
			}	
		});
	}
	
	public Date darFormatoFecha(String cadena) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date fecha = null;
		try {
			fecha = formato.parse(cadena);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return fecha;
	}
}
