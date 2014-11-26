package lambdasoft.crysport.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class FormularioLogin {

	private JFrame frame;
	private final JButton btnAceptar = new JButton("Aceptar");
	private final JTextField txtUsuario = new JTextField();
	private final JTextField txtPassword = new JTextField();
	private final JLabel lblUsuario = new JLabel("Usuario");
	private final JLabel lblContrasenia = new JLabel("Contraseña");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioLogin window = new FormularioLogin();
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
	public FormularioLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtPassword.setBounds(251, 145, 114, 19);
		txtPassword.setColumns(10);
		txtUsuario.setBounds(251, 68, 114, 19);
		txtUsuario.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		{
			btnAceptar.setBounds(251, 204, 117, 25);
			frame.getContentPane().add(btnAceptar);
		}
		{
			frame.getContentPane().add(txtUsuario);
		}
		
		frame.getContentPane().add(txtPassword);
		lblUsuario.setBounds(57, 70, 70, 15);
		
		frame.getContentPane().add(lblUsuario);
		lblContrasenia.setBounds(57, 147, 100, 15);
		
		frame.getContentPane().add(lblContrasenia);
	}

}
