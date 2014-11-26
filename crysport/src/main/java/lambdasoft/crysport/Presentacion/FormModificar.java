package lambdasoft.crysport.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FormModificar {

	private JFrame frame;
	private final JLabel lblModalidad = new JLabel("Modalidad");
	private final JLabel lblLocalidad = new JLabel("Localidad");
	private final JLabel lblOrganizador = new JLabel("Organizador");
	private final JLabel lblFecha = new JLabel("Fecha");
	private final JTextField txtModalidad = new JTextField();
	private final JTextField txtLocalidad = new JTextField();
	private final JTextField txtOrganizador = new JTextField();
	private final JTextField txtFecha = new JTextField();
	private final JButton btnModificar = new JButton("Modificar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormModificar window = new FormModificar();
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
	public FormModificar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtFecha.setBounds(153, 184, 114, 19);
		txtFecha.setColumns(10);
		txtOrganizador.setBounds(153, 135, 114, 19);
		txtOrganizador.setColumns(10);
		txtLocalidad.setBounds(153, 95, 114, 19);
		txtLocalidad.setColumns(10);
		txtModalidad.setBounds(153, 56, 114, 19);
		txtModalidad.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		{
			lblModalidad.setBounds(25, 58, 111, 15);
			frame.getContentPane().add(lblModalidad);
		}
		{
			lblLocalidad.setBounds(25, 97, 70, 15);
			frame.getContentPane().add(lblLocalidad);
		}
		{
			lblOrganizador.setBounds(25, 137, 111, 15);
			frame.getContentPane().add(lblOrganizador);
		}
		{
			lblFecha.setBounds(23, 184, 70, 15);
			frame.getContentPane().add(lblFecha);
		}
		{
			frame.getContentPane().add(txtModalidad);
		}
		{
			frame.getContentPane().add(txtLocalidad);
		}
		{
			frame.getContentPane().add(txtOrganizador);
		}
		{
			frame.getContentPane().add(txtFecha);
		}
		{
			btnModificar.setBounds(163, 215, 117, 25);
			frame.getContentPane().add(btnModificar);
		}
	}
}