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

import controllers.GestorMatriculacion;
import entities.Matricula;
import javax.swing.JComboBox;





public class PantallaMatriculacionSistemaBancario extends JFrame {

	private JPanel contentPane;
	private GestorMatriculacion GM = new GestorMatriculacion();
	private Matricula m;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaMatriculacionSistemaBancario frame = new PantallaMatriculacionSistemaBancario();
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
	public PantallaMatriculacionSistemaBancario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCambios = new JButton("Pagar matrícula");
		btnCambios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCambios.setBounds(221, 182, 182, 31);
		contentPane.add(btnCambios);
	
		DefaultListModel listModel = new DefaultListModel();
		int[] idMatriculas = GM.obtenerMatriculasSinPagar();
		for(int i=0; i<idMatriculas.length; i++) {
			listModel.addElement(idMatriculas[i]);
		}
		
		JList listMatriculas = new JList(listModel);
		listMatriculas.setBounds(20, 34, 166, 199);
		contentPane.add(listMatriculas);
		
		
		
		
		
		
		
		btnCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.set_pagado(true);
				listModel.removeAllElements();
				int[] idMatriculas = GM.obtenerMatriculasSinPagar();
				for(int i=0; i<idMatriculas.length; i++) {
					listModel.addElement(idMatriculas[i]);
				}
				
				
		
				
			}	
		});
		
		
		
		
	}
}
