package Vista;

import Modelo.MenuAcceso;
import static Vista.Login.acceso;
import static Vista.Login.idRolLogin;
import static Vista.Login.rolLogin;
import static Vista.Login.usuarioLogin;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author velez
 */
public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        JLWelCome.setText("Bienvenid@ "+usuarioLogin+" Su rol dentro del sistema es: "+rolLogin);
        DarAcceso();
    }
    public void DarAcceso(){
        
        for (int i = 0; i < acceso.size(); i++) {
            if(acceso.get(i).getIdRol()==idRolLogin){
                
                if(acceso.get(i).getIdOpcMenu()==1){
                    if(acceso.get(i).getMenuEstado()==true){
                        btnOpcPas.setEnabled(true);
                    }else{
                        btnOpcPas.setEnabled(false);
                    }
                }
                
                if(acceso.get(i).getIdOpcMenu()==2){
                    if(acceso.get(i).getMenuEstado()==true){
                        btnPasienteIn.setEnabled(true);
                    }else{
                        btnPasienteIn.setEnabled(false);
                    }
                }
                
                if(acceso.get(i).getIdOpcMenu()==3){                   
                    if(acceso.get(i).getMenuEstado()==true){
                        btnCRUD.setEnabled(true);
                    }else{
                        btnCRUD.setEnabled(false);
                    }        
                }
                
                if(acceso.get(i).getIdOpcMenu()==4){
                    if(acceso.get(i).getMenuEstado()==true){
                        btnReporte.setEnabled(true);
                    }else{
                        System.out.println("AR2");
                        btnReporte.setEnabled(false);
                    }   
                }
                
                if(acceso.get(i).getIdOpcMenu()==5){
                    if(acceso.get(i).getMenuEstado()==true){
                        btnSalir.setEnabled(true);
                    }else{
                        btnSalir.setEnabled(false);
                    }   
                }    
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        JLWelCome = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnOpcPas = new javax.swing.JMenu();
        btnPasienteIn = new javax.swing.JMenu();
        btnCRUD = new javax.swing.JMenuItem();
        btnReporte = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(JLWelCome, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(608, Short.MAX_VALUE)
                .addComponent(JLWelCome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnOpcPas.setBorder(null);
        btnOpcPas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_user_menu_male_40px.png"))); // NOI18N
        btnOpcPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcPasActionPerformed(evt);
            }
        });

        btnPasienteIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_cast_48px.png"))); // NOI18N
        btnPasienteIn.setText("Pasiente");
        btnPasienteIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPasienteInMouseClicked(evt);
            }
        });

        btnCRUD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_magazine_48px.png"))); // NOI18N
        btnCRUD.setText("CRUD PASIENTE");
        btnCRUD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCRUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCRUDMouseClicked(evt);
            }
        });
        btnCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCRUDActionPerformed(evt);
            }
        });
        btnPasienteIn.add(btnCRUD);

        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_graph_report_48px.png"))); // NOI18N
        btnReporte.setText("REPORTE");
        btnReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteMouseClicked(evt);
            }
        });
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        btnPasienteIn.add(btnReporte);

        btnOpcPas.add(btnPasienteIn);

        jMenuBar1.add(btnOpcPas);

        btnSalir.setBorder(null);
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icons8_exit_sign_48px.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpcPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcPasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnOpcPasActionPerformed

    private void btnPasienteInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasienteInMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPasienteInMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        int confirmar = JOptionPane.showOptionDialog(null, "Esta seguro que desea salir", "Confirmacion", JOptionPane.YES_NO_OPTION, 3, null,
                        new Object[]{"Si", "No"}, null);
        if(confirmar==0){
            this.dispose();
        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnReporteMouseClicked

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        new Reporte().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCRUDActionPerformed
        // TODO add your handling code here:
        new CrudPacientes().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCRUDActionPerformed

    private void btnCRUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCRUDMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnCRUDMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLWelCome;
    private javax.swing.JMenuItem btnCRUD;
    private javax.swing.JMenu btnOpcPas;
    private javax.swing.JMenu btnPasienteIn;
    private javax.swing.JMenuItem btnReporte;
    private javax.swing.JMenu btnSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
