package presentacion;
//	public void evaluarCurso() {
//		throw new UnsupportedOperationException();
//	}
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controllers.GestorPropuestasCursos;
import entities.CursoPropio;
import entities.EstadoCurso;

import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;


public class PantallaEmpleadosVicerrectorado extends JFrame {
	private static JPanel contentPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaEmpleadosVicerrectorado frame = new PantallaEmpleadosVicerrectorado();
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
	public PantallaEmpleadosVicerrectorado() {
	     EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                JFrame frame = new JFrame("Vicerrectorado");
	                frame.setResizable(false);
	                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                frame.setVisible(true);
	                
	                try  {
	                   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	                } catch (Exception e) {
	                   e.printStackTrace();
	                }
	                
	                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        		frame.setBounds(100, 100, 299, 194);
	        		contentPanel = new JPanel();
	        		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	                
	                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        		frame.getContentPane().setLayout(null);
	        		
	        		JLabel lblTitulo = new JLabel("¿QUÉ DESEA HACER?");
	        		lblTitulo.setBackground(SystemColor.activeCaption);
	        		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
	        		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 17));
	        		lblTitulo.setBounds(0, 0, 280, 36);
	        		frame.getContentPane().add(lblTitulo);
	        		
	        		
	        		JButton btnRealizarPropuesta = new JButton("Evaluar propuesta");
	        		btnRealizarPropuesta.setBounds(67, 47, 153, 23);
	        		frame.getContentPane().add(btnRealizarPropuesta);
	        		btnRealizarPropuesta.addActionListener(new ActionListener() {
	        			public void actionPerformed(ActionEvent e) {
	        				 PantallaEvaluarPropuesta.main(null);
	        			}
	        		});
	        		
	        		JButton btnEditarCurso = new JButton("OP2");
	        		btnEditarCurso.setBounds(67, 81, 153, 23);
	        		frame.getContentPane().add(btnEditarCurso);
	        		
	        		JButton btnVisualizar = new JButton("OP3");
	        		btnVisualizar.setBounds(67, 115, 153, 23);
	        		frame.getContentPane().add(btnVisualizar);
	        		btnEditarCurso.addActionListener(new ActionListener() {
	        			public void actionPerformed(ActionEvent e) {
	        			}
	        		});
	  
	            }
	        });
	    }
}
