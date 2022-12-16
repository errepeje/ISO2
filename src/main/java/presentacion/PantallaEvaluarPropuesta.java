package presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controllers.GestorPropuestasCursos;
import entities.CursoPropio;
import entities.EstadoCurso;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PantallaEvaluarPropuesta extends JFrame {
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
	private JTextField textFieldNombre;
	private JTextField textFieldEdicion;
	private JTextField textFieldTipoCurso;
	private JTextField textFieldEstadoCurso;
	private JTextField textNombreCentro;
	private JTextField textDirector;
	private JTextField textFieldSecretario;
	private JTextField textCommentario;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaEvaluarPropuesta frame = new PantallaEvaluarPropuesta();
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
	@SuppressWarnings("deprecation")
	public PantallaEvaluarPropuesta() {
		setTitle("Edición de un curso");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 456, 802);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane); 
		contentPane.setLayout(null);

		DefaultListModel listModel = new DefaultListModel();
		int[] idCursosDenegados = GPC.obtenerCursosDenegados();
		for(int i=0; i<idCursosDenegados.length; i++)
			listModel.addElement(idCursosDenegados[i]);

		JList listCursos = new JList(listModel);
		listCursos.setBounds(10, 11, 166, 525);
		contentPane.add(listCursos);

		JLabel lblFechaInicio = new JLabel("Fecha de inicio (dd-mm-yyyy): ");
		lblFechaInicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaInicio.setBounds(186, 199, 279, 19);
		contentPane.add(lblFechaInicio);

		JLabel lblFechaFin = new JLabel("Fecha de fin (dd-mm-yyyy): ");
		lblFechaFin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaFin.setBounds(186, 252, 279, 19);
		contentPane.add(lblFechaFin);

		JLabel lblTasaMatricula = new JLabel("Tasa: ");
		lblTasaMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTasaMatricula.setBounds(186, 307, 279, 19);
		contentPane.add(lblTasaMatricula);

		JLabel lblEditaLosEcts = new JLabel("ECTS: ");
		lblEditaLosEcts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEditaLosEcts.setBounds(186, 357, 279, 19);
		contentPane.add(lblEditaLosEcts);

		textFieldDiaInicio = new JTextField();
		textFieldDiaInicio.setEditable(false);
		textFieldDiaInicio.setToolTipText("");
		textFieldDiaInicio.setColumns(10);
		textFieldDiaInicio.setBounds(186, 221, 66, 20);
		contentPane.add(textFieldDiaInicio);

		JLabel lblg1 = new JLabel("-");
		lblg1.setHorizontalAlignment(SwingConstants.CENTER);
		lblg1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg1.setBounds(253, 224, 16, 14);
		contentPane.add(lblg1);

		textFieldMesInicio = new JTextField();
		textFieldMesInicio.setEditable(false);
		textFieldMesInicio.setColumns(10);
		textFieldMesInicio.setBounds(273, 221, 66, 20);
		contentPane.add(textFieldMesInicio);

		JLabel lblg2 = new JLabel("-");
		lblg2.setHorizontalAlignment(SwingConstants.CENTER);
		lblg2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg2.setBounds(338, 221, 22, 20);
		contentPane.add(lblg2);

		textFieldAnyoInicio = new JTextField();
		textFieldAnyoInicio.setEditable(false);
		textFieldAnyoInicio.setColumns(10);
		textFieldAnyoInicio.setBounds(359, 220, 66, 20);
		contentPane.add(textFieldAnyoInicio);

		textFieldDiaFin = new JTextField();
		textFieldDiaFin.setEditable(false);
		textFieldDiaFin.setToolTipText("");
		textFieldDiaFin.setColumns(10);
		textFieldDiaFin.setBounds(186, 276, 66, 20);
		contentPane.add(textFieldDiaFin);

		JLabel lblg1_1 = new JLabel("-");
		lblg1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblg1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg1_1.setBounds(253, 279, 16, 14);
		contentPane.add(lblg1_1);

		textFieldMesFin = new JTextField();
		textFieldMesFin.setEditable(false);
		textFieldMesFin.setColumns(10);
		textFieldMesFin.setBounds(273, 276, 66, 20);
		contentPane.add(textFieldMesFin);

		JLabel lblg2_1 = new JLabel("-");
		lblg2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblg2_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblg2_1.setBounds(338, 276, 22, 20);
		contentPane.add(lblg2_1);

		textFieldAnyoFin = new JTextField();
		textFieldAnyoFin.setEditable(false);
		textFieldAnyoFin.setColumns(10);
		textFieldAnyoFin.setBounds(359, 275, 66, 20);
		contentPane.add(textFieldAnyoFin);

		textFieldTasa = new JTextField();
		textFieldTasa.setEditable(false);
		textFieldTasa.setBounds(186, 326, 239, 20);
		contentPane.add(textFieldTasa);
		textFieldTasa.setColumns(10);

		textFieldECTS = new JTextField();
		textFieldECTS.setEditable(false);
		textFieldECTS.setColumns(10);
		textFieldECTS.setBounds(186, 377, 239, 20);
		contentPane.add(textFieldECTS);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(186, 11, 279, 19);
		contentPane.add(lblNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setToolTipText("");
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(186, 29, 239, 20);
		contentPane.add(textFieldNombre);

		textFieldEdicion = new JTextField();
		textFieldEdicion.setToolTipText("");
		textFieldEdicion.setEditable(false);
		textFieldEdicion.setColumns(10);
		textFieldEdicion.setBounds(186, 82, 239, 20);
		contentPane.add(textFieldEdicion);

		JLabel lblEdicion = new JLabel("Edicion:");
		lblEdicion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdicion.setBounds(186, 60, 279, 19);
		contentPane.add(lblEdicion);

		JLabel lblTipoDeCurso = new JLabel("Tipo de curso:");
		lblTipoDeCurso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoDeCurso.setBounds(186, 115, 279, 19);
		contentPane.add(lblTipoDeCurso);

		textFieldTipoCurso = new JTextField();
		textFieldTipoCurso.setToolTipText("");
		textFieldTipoCurso.setEditable(false);
		textFieldTipoCurso.setColumns(10);
		textFieldTipoCurso.setBounds(186, 134, 239, 20);
		contentPane.add(textFieldTipoCurso);

		JLabel lblEstadoCurso = new JLabel("Estado del curso:");
		lblEstadoCurso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEstadoCurso.setBounds(185, 160, 279, 19);
		contentPane.add(lblEstadoCurso);

		textFieldEstadoCurso = new JTextField();
		textFieldEstadoCurso.setToolTipText("");
		textFieldEstadoCurso.setEditable(false);
		textFieldEstadoCurso.setColumns(10);
		textFieldEstadoCurso.setBounds(185, 178, 239, 20);
		contentPane.add(textFieldEstadoCurso);

		JLabel lblNombreCentro = new JLabel("Nombre del centro:");
		lblNombreCentro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreCentro.setBounds(185, 402, 279, 19);
		contentPane.add(lblNombreCentro);

		textNombreCentro = new JTextField();
		textNombreCentro.setEditable(false);
		textNombreCentro.setColumns(10);
		textNombreCentro.setBounds(188, 424, 239, 20);
		contentPane.add(textNombreCentro);

		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDirector.setBounds(184, 452, 279, 19);
		contentPane.add(lblDirector);

		textDirector = new JTextField();
		textDirector.setEditable(false);
		textDirector.setColumns(10);
		textDirector.setBounds(186, 473, 239, 20);
		contentPane.add(textDirector);

		JLabel lblSecretario = new JLabel("Secretario:");
		lblSecretario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSecretario.setBounds(181, 497, 279, 19);
		contentPane.add(lblSecretario);

		textFieldSecretario = new JTextField();
		textFieldSecretario.setEditable(false);
		textFieldSecretario.setColumns(10);
		textFieldSecretario.setBounds(186, 516, 239, 20);
		contentPane.add(textFieldSecretario);
		
		JButton btnAprobarPropuesta = new JButton("Aprobar");
		btnAprobarPropuesta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAprobarPropuesta.setEnabled(false);
		btnAprobarPropuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GPC.evaluarPropuesta(cp.get_id(),EstadoCurso.VALIDADO, null); //Curso aceptado
			}
		});
		btnAprobarPropuesta.setBounds(10, 729, 199, 23);
		contentPane.add(btnAprobarPropuesta);
		
		
		JButton btnEnviarComentario = new JButton("Enviar");
		btnEnviarComentario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEnviarComentario.setVisible(false);
		btnEnviarComentario.setEnabled(false);
		btnEnviarComentario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GPC.evaluarPropuesta(cp.get_id(),EstadoCurso.PROPUESTA_RECHAZADA, textCommentario.getText().toString()); //Curso rechazado
			}
		});
		btnEnviarComentario.setBounds(231, 729, 199, 23);
		contentPane.add(btnEnviarComentario);
		
		
		JButton btnRechazarPropuesta = new JButton("Rechazar");
		btnRechazarPropuesta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRechazarPropuesta.setEnabled(false);
		btnRechazarPropuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Activamos y Desactivamos los botones para permitir enviar el comentario al rechazar
				btnAprobarPropuesta.setEnabled(false);
				btnRechazarPropuesta.setEnabled(false);
				btnRechazarPropuesta.setVisible(false);
				btnEnviarComentario.setVisible(true);
				btnEnviarComentario.setEnabled(true);
				textCommentario.setEnabled(true);
				textCommentario.setText("Razon del rechazo:");
			}
		});
		btnRechazarPropuesta.setBounds(231, 729, 199, 23);
		contentPane.add(btnRechazarPropuesta);
		
		textCommentario = new JTextField();
		textCommentario.setToolTipText("Razon del rechazo:");
		textCommentario.setEnabled(false);
		textCommentario.setHorizontalAlignment(SwingConstants.LEFT);
		textCommentario.setText("");
		textCommentario.setBounds(10, 584, 417, 134);
		contentPane.add(textCommentario);
		textCommentario.setColumns(10);
		
		JLabel lblInformes = new JLabel("Informe de subsanaciones y recomendaciones:");
		lblInformes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInformes.setBounds(10, 552, 415, 32);
		contentPane.add(lblInformes);

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
					
					textFieldNombre.setText(cp.get_nombre().toString());
					textFieldEdicion.setText(Integer.toString(cp.get_edicion()));
					textNombreCentro.setText(cp.getNombreCentro().toString());
					textDirector.setText(cp.getIdDirector().toString());
					textFieldSecretario.setText(cp.idSecretario.toString());
					textFieldTipoCurso.setText(cp.get_tipo().toString());
					textFieldEstadoCurso.setText(cp.get_estado().toString());
					
					textFieldDiaInicio.setText(solI[0]);
					textFieldMesInicio.setText(Integer.toString(cp.get_fechaInicio().getMonth() + 1));
					textFieldAnyoInicio.setText(Integer.toString(cp.get_fechaInicio().getYear() + 1900));

					textFieldDiaFin.setText(solF[0]);
					textFieldMesFin.setText(Integer.toString(cp.get_fechaFin().getMonth() + 1));
					textFieldAnyoFin.setText(Integer.toString(cp.get_fechaFin().getYear() + 1900));
					//Activamos los botones de Aprobar y Rechazar propuesta
					btnAprobarPropuesta.setEnabled(true);
					btnRechazarPropuesta.setEnabled(true);
					btnRechazarPropuesta.setVisible(true);
					//Desactivamos el botón de enviar y la textbox si se cambia de propuesta
					btnEnviarComentario.setVisible(false);
					btnEnviarComentario.setEnabled(false);
					textCommentario.setEnabled(false);
				}
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
