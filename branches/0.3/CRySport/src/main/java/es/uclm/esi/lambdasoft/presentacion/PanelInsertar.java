package es.uclm.esi.lambdasoft.presentacion;

import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import  es.uclm.esi.lambdasoft.dominio.Competicion;

@SuppressWarnings("serial")
public class PanelInsertar extends javax.swing.JPanel {

    /**
     * Creates new form PanelInsertar
     */
    JPanel pnlPadre;
    public PanelInsertar(JPanel pnlInicio) {
        initComponents();
        pnlPadre = pnlInicio;
    }

    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtOrganizador = new javax.swing.JTextField();
        txtModalidad = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        jLabel1.setText("Insertar Competición");

        jLabel2.setText("Modalidad");

        jLabel4.setText("Organizador");

        jLabel5.setText("Fecha");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(303, 303, 303))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(67, 67, 67)
                        .addComponent(txtFecha))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModalidad)
                            .addComponent(txtOrganizador))))
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addComponent(txtOrganizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }

    @SuppressWarnings("unused")
	private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        PanelMostrar pnlMostrar = new PanelMostrar(pnlPadre);
        pnlPadre.add(pnlMostrar,"menu3");
        CardLayout paletas = (CardLayout)(pnlPadre.getLayout());
        pnlPadre.remove(this);
    }

    @SuppressWarnings("unused")
	private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {
        if(setRow())
        {
            PanelMostrar pnlMostrar = new PanelMostrar(pnlPadre);
            pnlPadre.add(pnlMostrar,"menu3");
            CardLayout paletas = (CardLayout)(pnlPadre.getLayout());
            pnlPadre.remove(this);
        }
    }

    private boolean setRow() {
        Competicion c=new Competicion(Integer.toString(getMayorId()+1),txtFecha.getText(),txtOrganizador.getText(),txtModalidad.getText());	
        if(c.insert()){
                JOptionPane.showMessageDialog(null, "Competición añadida correctamente", "CRySPORT " , JOptionPane.INFORMATION_MESSAGE);
                return true;
        }else{
                JOptionPane.showMessageDialog(null, "No se puede añadir la competción indicada", "CRySPORT " , JOptionPane.INFORMATION_MESSAGE);
                return false;
        }
    }
    
    private int getMayorId(){
        Competicion c=new Competicion("0");
        ResultSet r=c.selectAll();
        int max = -1;
        try {
            while(r.next()){
                if(Integer.parseInt(r.getString(1)) > max)
                {
                    max = Integer.parseInt(r.getString(1));
                }
                        
                }
        } catch (SQLException e1) {
                e1.printStackTrace();
        }

        return max;
    }

    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtModalidad;
    private javax.swing.JTextField txtOrganizador;

}
