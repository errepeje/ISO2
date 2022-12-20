package presentacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.Ignore;

import controllers.GestorConsultas;
import controllers.GestorLogin;
import controllers.GestorPropuestasCursos;
import entities.CursoPropio;

@Ignore
public class PantallaPadre extends JFrame{
	protected JPanel contentPane = new JPanel();
	protected JPanel panel;
	protected static JPanel contentPanel;
	protected JTextField textFieldDiaInicio = new JTextField();
	protected JTextField textFieldMesInicio = new JTextField();
	protected JTextField textFieldAnyoInicio = new JTextField();
	protected JTextField textFieldDiaFin = new JTextField();
	protected JTextField textFieldMesFin = new JTextField();
	protected JTextField textFieldAnyoFin = new JTextField();
	protected JTextField textFieldTasa = new JTextField();
	protected JTextField textFieldECTS = new JTextField();
	protected JTextField textFieldNombre = new JTextField();
	protected JTextField textFieldEdicion = new JTextField();
	protected JTextField textFieldTipoCurso = new JTextField();
	protected JTextField textFieldEstadoCurso = new JTextField();
	protected JTextField textNombreCentro = new JTextField();
	protected JTextField textDirector = new JTextField();
	protected JTextField textFieldSecretario = new JTextField();
	protected JTextField textCommentario = new JTextField();
	protected JTextField txtIngresos = new JTextField();
	
	protected final ButtonGroup buttonGroup = new ButtonGroup();
	protected JTextField prueba2;
	
	protected GestorPropuestasCursos gpc = new GestorPropuestasCursos();
	protected GestorConsultas gc = new GestorConsultas();
	protected GestorLogin gl;
	protected CursoPropio cp;
	
	protected String fuente = "Tahoma";
	
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
