package presentacion;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import org.junit.Ignore;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;

@Ignore
@SuppressWarnings("serial")
public class PantallaDireccionCursos extends PantallaPadre {
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void crearMainFrame() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Dirección Cursos");
                frame.setResizable(false);
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
                
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        		frame.setBounds(100, 100, 299, 194);
        		contentPanel = new JPanel();
        		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
                
                frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        		frame.getContentPane().setLayout(null);
        		
        		JLabel lblTitulo = new JLabel("¿QUÉ DESEA HACER?");
        		lblTitulo.setBackground(SystemColor.activeCaption);
        		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 17));
        		lblTitulo.setBounds(0, 0, 280, 36);
        		frame.getContentPane().add(lblTitulo);
        		
        		JButton btnRealizarPropuesta = new JButton("REALIZAR PROPUESTA");
        		btnRealizarPropuesta.setBounds(67, 47, 153, 23);
        		frame.getContentPane().add(btnRealizarPropuesta);
        		btnRealizarPropuesta.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				crearAltaCursoFrame();
        			}
        		});
        		
        		JButton btnEditarCurso = new JButton("EDITAR CURSO");
        		btnEditarCurso.setBounds(67, 81, 153, 23);
        		frame.getContentPane().add(btnEditarCurso);
        		
        		JButton btnVisualizar = new JButton("VISUALIZAR PROPUESTA");
        		btnVisualizar.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent arg0) {
        				visualizarPropuesta();
        			}
        		});
        		btnVisualizar.setBounds(67, 115, 153, 23);
        		frame.getContentPane().add(btnVisualizar);
        		btnEditarCurso.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				crearEdicionCursoFrame();
        			}
        		});
  
            }
        });
    }
	
	public static void crearAltaCursoFrame() {
		PantallaAltaCurso.main(null);
    }
	
	public static void crearEdicionCursoFrame() {
       PantallaEditarCurso.main(null);
    }
	
	public static void visualizarPropuesta() {
		 PantallaVisualizarPropuesta.main(null);
    }
}