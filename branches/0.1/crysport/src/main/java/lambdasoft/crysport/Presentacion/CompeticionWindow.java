package lambdasoft.crysport.Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import lambdasoft.crysport.Dominio.Usuario;

public class CompeticionWindow {

	private JFrame frame;
	private final JPanel pnlLogin = new JPanel();
	private final JPanel pnlInsertar = new JPanel();
	private final JPanel pnlBorrar = new JPanel();
	private final JPanel pnlModificar = new JPanel();
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JLabel lblUsuario = new JLabel("Usuario");
	private final JLabel lblContrasea = new JLabel("Contraseña");
	private final JTextField txtUsuario = new JTextField();
	private final JTextField txtContrasenia = new JTextField();
	private final JButton btnAceptar = new JButton("Aceptar");
	private final JLabel lblId = new JLabel("Id");
	private final JLabel lblModalidad = new JLabel("Modalidad");
	private final JLabel lblFecha = new JLabel("Fecha");
	private final JLabel lblOrganizador = new JLabel("Organizador");
	private final JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JTextField textField_2 = new JTextField();
	private final JTextField textField_3 = new JTextField();
	private final JButton btnInsertare = new JButton("Insertar");
	private final JLabel lblId_1 = new JLabel("Id");
	private final JTextField textField_4 = new JTextField();
	private final JButton btnBoorar = new JButton("Borrar");
	private final JLabel lblId_2 = new JLabel("Id");
	private final JLabel lblModalidad_1 = new JLabel("Modalidad");
	private final JLabel lblFecha_1 = new JLabel("Fecha");
	private final JLabel lblOrganizador_1 = new JLabel("Organizador");
	private final JTextField textField_5 = new JTextField();
	private final JTextField textField_6 = new JTextField();
	private final JTextField textField_7 = new JTextField();
	private final JTextField textField_8 = new JTextField();
	private final JButton btnModificar = new JButton("Modificar");
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompeticionWindow window = new CompeticionWindow();
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
	public CompeticionWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField_8.setBounds(183, 132, 114, 19);
		textField_8.setColumns(10);
		textField_7.setBounds(183, 105, 114, 19);
		textField_7.setColumns(10);
		textField_6.setBounds(183, 74, 114, 19);
		textField_6.setColumns(10);
		textField_5.setBounds(183, 47, 114, 19);
		textField_5.setColumns(10);
		textField_4.setBounds(185, 69, 114, 19);
		textField_4.setColumns(10);
		textField_3.setBounds(162, 127, 114, 19);
		textField_3.setColumns(10);
		textField_2.setBounds(162, 100, 114, 19);
		textField_2.setColumns(10);
		textField_1.setBounds(162, 73, 114, 19);
		textField_1.setColumns(10);
		textField.setBounds(162, 46, 114, 19);
		textField.setColumns(10);
		txtContrasenia.setBounds(200, 108, 114, 19);
		txtContrasenia.setColumns(10);
		txtUsuario.setBounds(200, 64, 114, 19);
		txtUsuario.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		}
		tabbedPane.addTab("Login", null, pnlLogin, null);
		pnlLogin.setLayout(null);
		{
			lblUsuario.setBounds(51, 66, 70, 15);
			pnlLogin.add(lblUsuario);
		}
		{
			lblContrasea.setBounds(51, 110, 92, 15);
			pnlLogin.add(lblContrasea);
		}
		{
			pnlLogin.add(txtUsuario);
		}
		{
			pnlLogin.add(txtContrasenia);
		}
		{
			btnAceptar.addMouseListener(new BtnAceptarMouseListener());
			btnAceptar.setBounds(200, 178, 117, 25);
			pnlLogin.add(btnAceptar);
		}
		tabbedPane.addTab("Insertar", null, pnlInsertar, null);
		pnlInsertar.setLayout(null);
		{
			lblId.setBounds(45, 48, 70, 15);
			pnlInsertar.add(lblId);
		}
		{
			lblModalidad.setBounds(45, 75, 106, 15);
			pnlInsertar.add(lblModalidad);
		}
		{
			lblFecha.setBounds(45, 102, 70, 15);
			pnlInsertar.add(lblFecha);
		}
		{
			lblOrganizador.setBounds(45, 129, 106, 15);
			pnlInsertar.add(lblOrganizador);
		}
		{
			pnlInsertar.add(textField);
		}
		{
			pnlInsertar.add(textField_1);
		}
		{
			pnlInsertar.add(textField_2);
		}
		{
			pnlInsertar.add(textField_3);
		}
		{
			btnInsertare.setBounds(162, 182, 117, 25);
			pnlInsertar.add(btnInsertare);
		}
		tabbedPane.addTab("Borrar", null, pnlBorrar, null);
		pnlBorrar.setLayout(null);
		{
			lblId_1.setBounds(86, 71, 70, 15);
			pnlBorrar.add(lblId_1);
		}
		{
			pnlBorrar.add(textField_4);
		}
		{
			btnBoorar.setBounds(138, 140, 117, 25);
			pnlBorrar.add(btnBoorar);
		}
		tabbedPane.addTab("Modificar", null, pnlModificar, null);
		pnlModificar.setLayout(null);
		{
			lblId_2.setBounds(61, 49, 70, 15);
			pnlModificar.add(lblId_2);
		}
		{
			lblModalidad_1.setBounds(61, 76, 84, 15);
			pnlModificar.add(lblModalidad_1);
		}
		{
			lblFecha_1.setBounds(61, 107, 70, 15);
			pnlModificar.add(lblFecha_1);
		}
		{
			lblOrganizador_1.setBounds(61, 134, 100, 15);
			pnlModificar.add(lblOrganizador_1);
		}
		{
			pnlModificar.add(textField_5);
		}
		{
			pnlModificar.add(textField_6);
		}
		{
			pnlModificar.add(textField_7);
		}
		{
			pnlModificar.add(textField_8);
		}
		{
			btnModificar.setBounds(180, 177, 117, 25);
			pnlModificar.add(btnModificar);
		}
		{
			tabbedPane.addTab("Consultar", null, panel, null);
		}
	}
	private class BtnAceptarMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			Usuario u=new Usuario(txtUsuario.getText(),txtContrasenia.getText());
			u.select();
		}
	}
}
