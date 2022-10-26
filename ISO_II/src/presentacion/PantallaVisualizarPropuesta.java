package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;

public class PantallaVisualizarPropuesta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaVisualizarPropuesta frame = new PantallaVisualizarPropuesta();
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
	public PantallaVisualizarPropuesta() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 612, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		DefaultListModel listModel = new DefaultListModel() ;
		//--------------------------------------------------------------


		String prueba2[] = {"uno","dos"};
		class Prueba{
			public int getUno() {
				return uno;
			}
			public void setUno(int uno) {
				this.uno = uno;
			}
			public String getUno1() {
				return uno1;
			}
			public void setUno1(String uno1) {
				this.uno1 = uno1;
			}
			private int uno = 1;
			private String uno1 = "uno";
		}
		Prueba test = new Prueba();

		//--------------------------------

		JList listVisualizar = new JList(listModel);
		listVisualizar.setBackground(Color.WHITE);
		listVisualizar.setBounds(10, 11, 259, 239);
		listVisualizar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		contentPane.add(listVisualizar);

		//--------------------------------
		listModel.add(0,prueba2[0]);
		listModel.add(1,prueba2[1]);
		listModel.addElement(test.uno);
		//--------------------------------


		//	Recoger los elementos de la base de datos en forma de objetos y meter solo el nombre
		// 	una vez seleccionas realizas un bucle mostrando toda la info del objeto

		JButton btnAceptarVisualizar = new JButton("Aceptar");
		JLabel InformacionSeleccionado = new JLabel("Informacion de la propuesta seleccionada: ");
		btnAceptarVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//añadir la informacion del objeto seleccionado de la base de datos

				InformacionSeleccionado.setText((String)listModel.getElementAt(listVisualizar.getSelectedIndex()));

			}
		});

		btnAceptarVisualizar.setBounds(10, 261, 145, 23);
		contentPane.add(btnAceptarVisualizar);

		InformacionSeleccionado.setBounds(279, 11, 307, 64);
		contentPane.add(InformacionSeleccionado);
	}
}
