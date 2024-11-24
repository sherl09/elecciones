
package GUI;
import Gestion_votos.*;
import java.util.Date;
import javax.swing.JTextField;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
public class Editar_miembro extends javax.swing.JFrame {
    /** Creates new form Agregar */
    private Mesa mesa;
    public Editar_miembro() {
        initComponents();
        setDefaultCloseOperation(Editar_miembro.DISPOSE_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        guardar_Button = new javax.swing.JButton();
        cancelar_Button = new javax.swing.JButton();
        DNI_TextField = new javax.swing.JTextField();
        Nombre_TextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tipo_ComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Apellido_TextField = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DNI");

        guardar_Button.setText("Guardar");
        guardar_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_ButtonActionPerformed(evt);
            }
        });

        cancelar_Button.setText("Cancelar");
        cancelar_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_ButtonActionPerformed(evt);
            }
        });

        DNI_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNI_TextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        jLabel4.setText("Tipo");

        Tipo_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Presidente", "Secretario", "Vocal" }));
        Tipo_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_ComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre ");

        Apellido_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apellido_TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardar_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(cancelar_Button))
                    .addComponent(Nombre_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DNI_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tipo_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Apellido_TextField))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DNI_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Nombre_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tipo_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar_Button)
                    .addComponent(cancelar_Button))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setDatos(Mesa mesa){
        this.mesa=mesa;
    }
    private void guardar_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_ButtonActionPerformed
        // TODO add your handling code here:
    String texto = DNI_TextField.getText();
    if(texto.length()!=8 || texto.matches("d+")){
        JOptionPane.showMessageDialog(this, "Por favor, escriba correctamente el DNI8 del candidato", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String texto2 = Nombre_TextField.getText();
    if(texto2.isEmpty()){
        JOptionPane.showMessageDialog(this, "Por favor, escriba el nombre del miembro de mesa", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    String texto3 = Apellido_TextField.getText();
    if(texto2.isEmpty()){
        JOptionPane.showMessageDialog(this, "Por favor, escriba el apellido del miembro de mesa", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String valor = (String) Tipo_ComboBox.getSelectedItem();
    if (valor.equals("----------")) {
        // Si el JComboBox está vacío o no tiene un valor seleccionado
        JOptionPane.showMessageDialog(this, "Por favor, seleccione algun tipo", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (mesa.encontrarTipo(valor)) {
        // Si el JComboBox está vacío o no tiene un valor seleccionado
        JOptionPane.showMessageDialog(this, "Por favor, seleccione otro tipo", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
   
    mesa.modificarMiembro(texto,texto2,texto3,valor);
    this.dispose();
    
    ///JOptionPane.showMessageDialog(this, "Fecha: " + fechaStr + "\nTipo de Elección: " + valorcombo_box);
    }//GEN-LAST:event_guardar_ButtonActionPerformed

    private void cancelar_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_ButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelar_ButtonActionPerformed

    private void Tipo_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tipo_ComboBoxActionPerformed

    private void Apellido_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apellido_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Apellido_TextFieldActionPerformed

    private void DNI_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNI_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNI_TextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_miembro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_miembro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_miembro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_miembro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_miembro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido_TextField;
    private javax.swing.JTextField DNI_TextField;
    private javax.swing.JTextField Nombre_TextField;
    private javax.swing.JComboBox<String> Tipo_ComboBox;
    private javax.swing.JButton cancelar_Button;
    private javax.swing.JButton guardar_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}