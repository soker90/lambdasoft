package es.uclm.esi.lambdasoft.presentacion;

import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import es.uclm.esi.lambdasoft.dominio.Competicion;

@SuppressWarnings("serial")
public class PanelModificar extends javax.swing.JPanel {

    /**
     * Creates new form PanelInsertar
     */
    JPanel pnlPadre;
    int id;
    public PanelModificar(JPanel pnlInicio, int id) {
        initComponents();
        pnlPadre = pnlInicio;
        this.id = id;
        getDatos();
    }
    
    private boolean setModificar(){
    	boolean retorno = false;
        try{
        	Competicion c=new Competicion(Integer.toString(id),txtFecha.getText(),txtOrganizador.getText(),txtModalidad.getText());	
            if(c.update()){
                    JOptionPane.showMessageDialog(null, "Competición modificada correctamente", "CRySPORT " , JOptionPane.INFORMATION_MESSAGE);
                    retorno = true;
            }else{
                    JOptionPane.showMessageDialog(null, "No se puede modificar la competción indicada", "CRySPORT " , JOptionPane.INFORMATION_MESSAGE);
                    retorno = false;

            }	
	    } catch (Exception e) {
	    	
	    }
        return retorno;
    }
    
    private void getDatos(){
        try {
	            Competicion c=new Competicion(Integer.toString(id));
	            ResultSet r=c.selectAll();
                while(r.next()){
                    if(Integer.parseInt(r.getString(1)) == id)
                    {
                        txtFecha.setText(r.getString(2));
                        txtOrganizador.setText(r.getString(3));
                        txtModalidad.setText(r.getString(4));
                    }
                        
                }
	    } catch (Exception e) {
	    	
	    }
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

        jLabel1.setText("Modificar Competición");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addGap(27, 27, 27)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrganizador)
                            .addComponent(txtFecha)
                            .addComponent(txtModalidad))))
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }

    @SuppressWarnings("unused")
	private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(setModificar())
        {
            PanelMostrar pnlMostrar = new PanelMostrar(pnlPadre);
            pnlPadre.add(pnlMostrar,"menu3");
            CardLayout paletas = (CardLayout)(pnlPadre.getLayout());
            pnlPadre.remove(this);
        }
    }

    @SuppressWarnings("unused")
	private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        PanelMostrar pnlMostrar = new PanelMostrar(pnlPadre);
        pnlPadre.add(pnlMostrar,"menu3");
        CardLayout paletas = (CardLayout)(pnlPadre.getLayout());
        pnlPadre.remove(this);
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
