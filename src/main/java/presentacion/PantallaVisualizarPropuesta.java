package presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JList;
import javax.swing.DefaultListModel;

import javax.swing.JLabel;

public class PantallaVisualizarPropuesta extends PantallaPadre {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				PantallaVisualizarPropuesta frame = new PantallaVisualizarPropuesta();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public PantallaVisualizarPropuesta() {
		setTitle("Edición de un curso");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 455, 597);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane); 
		contentPane.setLayout(null);

		DefaultListModel listModel = new DefaultListModel();
		int[] idCursosDenegados = gpc.obtenerCursosDenegados();
		for(int i=0; i<idCursosDenegados.length; i++)
			listModel.addElement(idCursosDenegados[i]);

		JList listCursos = new JList(listModel);
		listCursos.setBounds(10, 11, 166, 525);
		contentPane.add(listCursos);
		listCursos.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (listCursos.getSelectedValue() != null) {
					cp = gpc.obtenerCurso(Integer.parseInt(listCursos.getSelectedValue().toString()));
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
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font(fuente, Font.PLAIN, 15));
		lblNombre.setBounds(186, 11, 279, 19);
		contentPane.add(lblNombre);
		textFieldNombre.setToolTipText("");
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(186, 29, 239, 20);
		contentPane.add(textFieldNombre);
		
		JLabel lblEdicion = new JLabel("Edicion:");
		lblEdicion.setFont(new Font(fuente, Font.PLAIN, 15));
		lblEdicion.setBounds(186, 60, 279, 19);
		contentPane.add(lblEdicion);
		textFieldEdicion.setToolTipText("");
		textFieldEdicion.setEditable(false);
		textFieldEdicion.setColumns(10);
		textFieldEdicion.setBounds(186, 82, 239, 20);
		contentPane.add(textFieldEdicion);

		JLabel lblTipoDeCurso = new JLabel("Tipo de curso:");
		lblTipoDeCurso.setFont(new Font(fuente, Font.PLAIN, 15));
		lblTipoDeCurso.setBounds(186, 115, 279, 19);
		contentPane.add(lblTipoDeCurso);
		textFieldTipoCurso.setToolTipText("");
		textFieldTipoCurso.setEditable(false);
		textFieldTipoCurso.setColumns(10);
		textFieldTipoCurso.setBounds(186, 134, 239, 20);
		contentPane.add(textFieldTipoCurso);
		
		JLabel lblEstadoCurso = new JLabel("Estado del curso:");
		lblEstadoCurso.setFont(new Font(fuente, Font.PLAIN, 15));
		lblEstadoCurso.setBounds(185, 160, 279, 19);
		contentPane.add(lblEstadoCurso);
		textFieldEstadoCurso.setToolTipText("");
		textFieldEstadoCurso.setEditable(false);
		textFieldEstadoCurso.setColumns(10);
		textFieldEstadoCurso.setBounds(185, 178, 239, 20);
		contentPane.add(textFieldEstadoCurso);
		
		JLabel lblFechaInicio = new JLabel("Fecha de inicio (dd-mm-yyyy): ");
		lblFechaInicio.setFont(new Font(fuente, Font.PLAIN, 15));
		lblFechaInicio.setBounds(186, 199, 279, 19);
		contentPane.add(lblFechaInicio);
		textFieldDiaInicio.setEditable(false);
		textFieldDiaInicio.setToolTipText("");
		textFieldDiaInicio.setColumns(10);
		textFieldDiaInicio.setBounds(186, 221, 66, 20);
		contentPane.add(textFieldDiaInicio);
		JLabel lblg1 = new JLabel("-");
		lblg1.setHorizontalAlignment(SwingConstants.CENTER);
		lblg1.setFont(new Font(fuente, Font.PLAIN, 24));
		lblg1.setBounds(253, 224, 16, 14);
		contentPane.add(lblg1);
		textFieldMesInicio.setEditable(false);
		textFieldMesInicio.setColumns(10);
		textFieldMesInicio.setBounds(273, 221, 66, 20);
		contentPane.add(textFieldMesInicio);
		JLabel lblg2 = new JLabel("-");
		lblg2.setHorizontalAlignment(SwingConstants.CENTER);
		lblg2.setFont(new Font(fuente, Font.PLAIN, 24));
		lblg2.setBounds(338, 221, 22, 20);
		contentPane.add(lblg2);
		textFieldAnyoInicio.setEditable(false);
		textFieldAnyoInicio.setColumns(10);
		textFieldAnyoInicio.setBounds(359, 220, 66, 20);
		contentPane.add(textFieldAnyoInicio);

		JLabel lblFechaFin = new JLabel("Fecha de fin (dd-mm-yyyy): ");
		lblFechaFin.setFont(new Font(fuente, Font.PLAIN, 15));
		lblFechaFin.setBounds(186, 252, 279, 19);
		contentPane.add(lblFechaFin);
		textFieldDiaFin.setEditable(false);
		textFieldDiaFin.setToolTipText("");
		textFieldDiaFin.setColumns(10);
		textFieldDiaFin.setBounds(186, 276, 66, 20);
		contentPane.add(textFieldDiaFin);
		JLabel lblg11 = new JLabel("-");
		lblg11.setHorizontalAlignment(SwingConstants.CENTER);
		lblg11.setFont(new Font(fuente, Font.PLAIN, 24));
		lblg11.setBounds(253, 279, 16, 14);
		contentPane.add(lblg11);
		textFieldMesFin = new JTextField();
		textFieldMesFin.setEditable(false);
		textFieldMesFin.setColumns(10);
		textFieldMesFin.setBounds(273, 276, 66, 20);
		contentPane.add(textFieldMesFin);
		JLabel lblg21 = new JLabel("-");
		lblg21.setHorizontalAlignment(SwingConstants.CENTER);
		lblg21.setFont(new Font(fuente, Font.PLAIN, 24));
		lblg21.setBounds(338, 276, 22, 20);
		contentPane.add(lblg21);
		textFieldAnyoFin.setEditable(false);
		textFieldAnyoFin.setColumns(10);
		textFieldAnyoFin.setBounds(359, 275, 66, 20);
		contentPane.add(textFieldAnyoFin);

		JLabel lblTasaMatricula = new JLabel("Tasa: ");
		lblTasaMatricula.setFont(new Font(fuente, Font.PLAIN, 15));
		lblTasaMatricula.setBounds(186, 307, 279, 19);
		contentPane.add(lblTasaMatricula);
		textFieldTasa = new JTextField();
		textFieldTasa.setEditable(false);
		textFieldTasa.setBounds(186, 326, 239, 20);
		contentPane.add(textFieldTasa);
		textFieldTasa.setColumns(10);

		JLabel lblEditaLosEcts = new JLabel("ECTS: ");
		lblEditaLosEcts.setFont(new Font(fuente, Font.PLAIN, 15));
		lblEditaLosEcts.setBounds(186, 357, 279, 19);
		contentPane.add(lblEditaLosEcts);

		textFieldECTS = new JTextField();
		textFieldECTS.setEditable(false);
		textFieldECTS.setColumns(10);
		textFieldECTS.setBounds(186, 377, 239, 20);
		contentPane.add(textFieldECTS);

		JLabel lblNombreCentro = new JLabel("Nombre del centro:");
		lblNombreCentro.setFont(new Font(fuente, Font.PLAIN, 15));
		lblNombreCentro.setBounds(185, 402, 279, 19);
		contentPane.add(lblNombreCentro);
		textNombreCentro.setEditable(false);
		textNombreCentro.setColumns(10);
		textNombreCentro.setBounds(188, 424, 239, 20);
		contentPane.add(textNombreCentro);

		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setFont(new Font(fuente, Font.PLAIN, 15));
		lblDirector.setBounds(184, 452, 279, 19);
		contentPane.add(lblDirector);
		textDirector.setEditable(false);
		textDirector.setColumns(10);
		textDirector.setBounds(186, 473, 239, 20);
		contentPane.add(textDirector);
		JLabel lblSecretario = new JLabel("Secretario:");
		lblSecretario.setFont(new Font(fuente, Font.PLAIN, 15));
		lblSecretario.setBounds(181, 497, 279, 19);
		contentPane.add(lblSecretario);
		textFieldSecretario.setEditable(false);
		textFieldSecretario.setColumns(10);
		textFieldSecretario.setBounds(186, 516, 239, 20);
		contentPane.add(textFieldSecretario);
	}
}
