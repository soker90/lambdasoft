package es.uclm.esi.lambdasoft.presentacion;

import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import es.uclm.esi.lambdasoft.dominio.Competicion;
import es.uclm.esi.lambdasoft.dominio.GestorDeCredenciales;

@SuppressWarnings("serial")
public class PanelMostrar extends javax.swing.JPanel {
    JPanel pnlPadre;
    public PanelMostrar(JPanel pnlInicio) {
        initComponents();
        pnlPadre = pnlInicio;
        updateModel();
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        String fecha = GestorDeCredenciales.ultimaConexion();
        lblConexion.setText("Ultima Conexion: " + fecha);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblConexion = new JLabel();

        lista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        btnInsertar.setText("Insertar");
        btnInsertar.setMaximumSize(new java.awt.Dimension(30, 0));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setMaximumSize(new java.awt.Dimension(50, 0));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setMaximumSize(new java.awt.Dimension(50, 0));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(50, 0));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        
        lblConexion.setText("Ultima conexión: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblConexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10,10,10)
                .addComponent(lblConexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            	.addGap(115, 115, 115)
                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }

    @SuppressWarnings("unused")
	private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {
        PanelInsertar pnlInsertar = new PanelInsertar(pnlPadre);
        pnlPadre.add(pnlInsertar,"menu1");
        CardLayout paletas = (CardLayout)(pnlPadre.getLayout());
        pnlPadre.remove(this);
    }

    @SuppressWarnings("unused")
	private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {
    try{
        PanelModificar pnlModificar = new PanelModificar(pnlPadre,getId());
        pnlPadre.add(pnlModificar,"menu1");
        CardLayout paletas = (CardLayout)(pnlPadre.getLayout());
        pnlPadre.remove(this);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun registro", "Error " , JOptionPane.ERROR_MESSAGE);
    }
    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            Competicion c=new Competicion(Integer.toString(getId()));
            if(c.delete()){
                    JOptionPane.showMessageDialog(null, "Competición borrada correctamente", "CRySPORT " , JOptionPane.INFORMATION_MESSAGE);
                    updateModel();
            }else{
                    JOptionPane.showMessageDialog(null, "No se puede eliminar la competción seleccionada", "CRySPORT " , JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun registro", "Error " , JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private int getId(){
       String valor = lista.getSelectedValue().toString();
       String id = "";
       int i = 0;
       do{
           id += valor.charAt(i);
           i++;
       }while(valor.charAt(i) != ' ');
        return Integer.parseInt(id);
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	private void updateModel(){
        Competicion c=new Competicion("0");	
        DefaultListModel listModel = new DefaultListModel(); 
        listModel.clear();
        try {
            ResultSet r=c.selectAll();
            while(r.next()){
                    listModel.addElement(r.getString(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4)); 
            }
            lista.setModel(listModel);
                
        } catch (Exception e) {

        }
    }

    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConexion;
    @SuppressWarnings("rawtypes")
	private javax.swing.JList lista;
}
