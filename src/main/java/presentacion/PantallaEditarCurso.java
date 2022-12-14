package presentacion;

import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import entities.Generated;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

@Generated
public class PantallaEditarCurso extends PantallaPadre {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				PantallaEditarCurso frame = new PantallaEditarCurso();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaEditarCurso() {
		setTitle("Edición de un curso");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 465, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane); 
		contentPane.setLayout(null);

		JButton btnCambios = new JButton("Aplicar cambios");
		btnCambios.setFont(new Font(fuente, Font.PLAIN, 18));
		btnCambios.setBounds(10, 221, 426, 36);
		contentPane.add(btnCambios);

		DefaultListModel listModel = new DefaultListModel();
		int[] idCursosDenegados = gpc.obtenerCursosDenegados();
		for(int i=0; i<idCursosDenegados.length; i++)
			listModel.addElement(idCursosDenegados[i]);


		JLabel lblFechaInicio = new JLabel("Edita la fecha de inicio (dd-mm-yyyy): ");
		lblFechaInicio.setFont(new Font(fuente, Font.PLAIN, 15));
		lblFechaInicio.setBounds(186, 12, 279, 19);
		contentPane.add(lblFechaInicio);

		JList listCursos = new JList(listModel);
		listCursos.setBounds(10, 11, 166, 199);
		contentPane.add(listCursos);

		JLabel lblFechaFin = new JLabel("Edita la fecha de fin (dd-mm-yyyy): ");
		lblFechaFin.setFont(new Font(fuente, Font.PLAIN, 15));
		lblFechaFin.setBounds(186, 65, 279, 19);
		contentPane.add(lblFechaFin);

		JLabel lblTasaMatricula = new JLabel("Edita la tasa: ");
		lblTasaMatricula.setFont(new Font(fuente, Font.PLAIN, 15));
		lblTasaMatricula.setBounds(186, 120, 279, 19);
		contentPane.add(lblTasaMatricula);
		textFieldDiaInicio = new JTextField();
		textFieldDiaInicio.setToolTipText("");
		textFieldDiaInicio.setColumns(10);
		textFieldDiaInicio.setBounds(186, 34, 66, 20);
		contentPane.add(textFieldDiaInicio);

		JLabel lblEditaLosEcts = new JLabel("Edita los ECTS: ");
		lblEditaLosEcts.setFont(new Font(fuente, Font.PLAIN, 15));
		lblEditaLosEcts.setBounds(186, 170, 279, 19);
		contentPane.add(lblEditaLosEcts);
		JLabel lblg2 = new JLabel("-");
		lblg2.setHorizontalAlignment(SwingConstants.CENTER);
		lblg2.setFont(new Font(fuente, Font.PLAIN, 24));
		lblg2.setBounds(338, 34, 22, 20);
		contentPane.add(lblg2);


		JLabel lblg1 = new JLabel("-");
		lblg1.setHorizontalAlignment(SwingConstants.CENTER);
		lblg1.setFont(new Font(fuente, Font.PLAIN, 24));
		lblg1.setBounds(253, 37, 16, 14);
		contentPane.add(lblg1);

		textFieldMesInicio = new JTextField();
		textFieldMesInicio.setColumns(10);
		textFieldMesInicio.setBounds(273, 34, 66, 20);
		contentPane.add(textFieldMesInicio);


		textFieldAnyoInicio = new JTextField();
		textFieldAnyoInicio.setColumns(10);
		textFieldAnyoInicio.setBounds(359, 33, 66, 20);
		contentPane.add(textFieldAnyoInicio);
		JLabel lblg11 = new JLabel("-");
		lblg11.setHorizontalAlignment(SwingConstants.CENTER);
		lblg11.setFont(new Font(fuente, Font.PLAIN, 24));
		lblg11.setBounds(253, 92, 16, 14);
		contentPane.add(lblg11);
		textFieldTasa = new JTextField();
		textFieldTasa.setBounds(186, 139, 239, 20);
		contentPane.add(textFieldTasa);
		textFieldTasa.setColumns(10);

		textFieldDiaFin = new JTextField();
		textFieldDiaFin.setToolTipText("");
		textFieldDiaFin.setColumns(10);
		textFieldDiaFin.setBounds(186, 89, 66, 20);
		contentPane.add(textFieldDiaFin);


		textFieldMesFin = new JTextField();
		textFieldMesFin.setColumns(10);
		textFieldMesFin.setBounds(273, 89, 66, 20);
		contentPane.add(textFieldMesFin);

		JLabel lblg21 = new JLabel("-");
		lblg21.setHorizontalAlignment(SwingConstants.CENTER);
		lblg21.setFont(new Font(fuente, Font.PLAIN, 24));
		lblg21.setBounds(338, 89, 22, 20);
		contentPane.add(lblg21);

		textFieldAnyoFin = new JTextField();
		textFieldAnyoFin.setColumns(10);
		textFieldAnyoFin.setBounds(359, 88, 66, 20);
		contentPane.add(textFieldAnyoFin);


		textFieldECTS = new JTextField();
		textFieldECTS.setColumns(10);
		textFieldECTS.setBounds(186, 190, 239, 20);
		contentPane.add(textFieldECTS);
		
		/* ACCIONES */
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
					
					textFieldDiaInicio.setText(solI[0]);
					textFieldMesInicio.setText(Integer.toString(cp.getfechaInicio().getMonth() + 1));
					textFieldAnyoInicio.setText(Integer.toString(cp.getfechaInicio().getYear() + 1900));
					
					textFieldDiaFin.setText(solF[0]);
					textFieldMesFin.setText(Integer.toString(cp.getfechaFin().getMonth() + 1));
					textFieldAnyoFin.setText(Integer.toString(cp.getfechaFin().getYear() + 1900));
				}
			}
		});
		
		btnCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cp.seteCTS(Integer.parseInt(textFieldECTS.getText()));
				cp.settasaMatricula(Integer.parseInt(textFieldTasa.getText()));
				cp.setfechaInicio(darFormatoFecha(textFieldDiaInicio.getText() + "/" + textFieldMesInicio.getText() + "/" + textFieldAnyoInicio.getText()));
				cp.setfechaFin(darFormatoFecha(textFieldDiaFin.getText() + "/" + textFieldMesFin.getText() + "/" + textFieldAnyoFin.getText()));
				
				gpc.editarPropuestaCurso(cp);
			}	
		});
	}
}
