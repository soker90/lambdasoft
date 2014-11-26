package lambdasoft.crysport.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FormularioBorrar {

	private JFrame frame;
	private final JLabel lblModalidad = new JLabel("Modalidad");
	private final JLabel lblLocalidad = new JLabel("Localidad");
	private final JLabel lblFecha = new JLabel("Fecha");
	private final JTextField txtModalidad = new JTextField();
	private final JTextField txtLocalidad = new JTextField();
	private final JTextField txtFecha = new JTextField();
	private final JButton btnEliminar = new JButton("Eliminar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioBorrar window = new FormularioBorrar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormularioBorrar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtFecha.setBounds(175, 162, 114, 19);
		txtFecha.setColumns(10);
		txtLocalidad.setBounds(175, 122, 114, 19);
		txtLocalidad.setColumns(10);
		txtModalidad.setBounds(175, 82, 114, 19);
		txtModalidad.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		{
			lblModalidad.setBounds(46, 84, 100, 15);
			frame.getContentPane().add(lblModalidad);
		}
		{
			lblLocalidad.setBounds(46, 124, 70, 15);
			frame.getContentPane().add(lblLocalidad);
		}
		{
			lblFecha.setBounds(46, 164, 70, 15);
			frame.getContentPane().add(lblFecha);
		}
		{
			frame.getContentPane().add(txtModalidad);
		}
		{
			frame.getContentPane().add(txtLocalidad);
		}
		{
			frame.getContentPane().add(txtFecha);
		}
		{
			btnEliminar.setBounds(175, 218, 117, 25);
			frame.getContentPane().add(btnEliminar);
		}
	}

}