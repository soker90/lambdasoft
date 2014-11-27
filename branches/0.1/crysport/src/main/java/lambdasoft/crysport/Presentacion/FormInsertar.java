package lambdasoft.crysport.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FormInsertar {

	private JFrame frame;
	private final JLabel lblModalidad = new JLabel("Modalidad");
	private final JLabel lblLocalidad = new JLabel("Localidad");
	private final JLabel lblOrganizador = new JLabel("Organizador");
	private final JTextField txtModalidad = new JTextField();
	private final JTextField txtLocalidad = new JTextField();
	private final JTextField txtOrganizador = new JTextField();
	private final JButton btnInsertar = new JButton("Insertar");
	private final JLabel lblFecha = new JLabel("Fecha");
	private final JTextField txtFecha = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormInsertar window = new FormInsertar();
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
	public FormInsertar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtFecha.setBounds(128, 139, 114, 19);
		txtFecha.setColumns(10);
		txtOrganizador.setBounds(128, 99, 114, 19);
		txtOrganizador.setColumns(10);
		txtLocalidad.setBounds(128, 60, 114, 19);
		txtLocalidad.setColumns(10);
		txtModalidad.setBounds(128, 23, 114, 19);
		txtModalidad.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		{
			lblModalidad.setBounds(12, 25, 98, 15);
			frame.getContentPane().add(lblModalidad);
		}
		{
			lblLocalidad.setBounds(12, 62, 70, 15);
			frame.getContentPane().add(lblLocalidad);
		}
		{
			lblOrganizador.setBounds(12, 101, 98, 15);
			frame.getContentPane().add(lblOrganizador);
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
			btnInsertar.setBounds(147, 235, 117, 25);
			frame.getContentPane().add(btnInsertar);
		}
		{
			lblFecha.setBounds(12, 141, 70, 15);
			frame.getContentPane().add(lblFecha);
		}
		{
			frame.getContentPane().add(txtFecha);
		}
		
		btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });
	}
}