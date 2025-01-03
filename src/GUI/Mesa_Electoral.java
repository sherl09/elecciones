
package GUI;

import GUI.Candidatos;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import Gestion_votos.*;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author sherlock
 */
public class Mesa_Electoral extends javax.swing.JFrame {

    /**
     * Creates new form Mesa_Electoral
     */
    private int fila;
    private Eleccion elec;
    private Mesa_Electoral mesa; 
    public void setdatos(int fila){
        this.fila=fila;
        this.elec=Gestion_votos.Datos.data.eleccion_pos(fila);
        mostrarMesas();
    }
    public Mesa_Electoral() {
        initComponents();
        setDefaultCloseOperation(Mesa_Electoral.DISPOSE_ON_CLOSE);
    }
    public void mostrarMesas() {
        DefaultTableModel model = (DefaultTableModel) Mesa_Table.getModel();
        model.setRowCount(0);
        String[][] mesas = elec.mostrarMesa();
        JButton boton1=new JButton("Miembros Mesa");
        boton1.setName("Miembros Mesa");
        JButton boton2=new JButton("Votos");
        boton2.setName("Votos");
        JButton boton3=new JButton("Acta Electoral");
        boton3.setName("Acta Electoral");
        // JButton btnCandidatos = new JButton("candidatos");
        // insertarIcon(btnCandidatos,"/imagen/imagen2.png");
        for (String[] mesa : mesas) {    
            System.out.println(Arrays.toString(mesa));
            
            model.addRow(new Object[]{mesa[0], mesa[1], false,boton1,boton2,boton3});
    }
        System.out.println(Gestion_votos.Datos.data.tama()); 
        
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mesa_Table = new javax.swing.JTable();
        Agregar_Button = new javax.swing.JButton();
        EliminarButton = new javax.swing.JButton();
        Editar_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("MESA ELECTORAL");

        Mesa_Table.setDefaultRenderer(Object.class, new Render());
        Mesa_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ubicacion", "Numero de mesa", "Seleccionar", "Miembros de mesa","Votos","Acta Electoral"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
                , java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false,false,false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Mesa_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Mesa_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Mesa_Table);
        Mesa_Table.getColumnModel().getColumn(3).setCellRenderer(new Render());
        Mesa_Table.getColumnModel().getColumn(4).setCellRenderer(new Render());
        Mesa_Table.getColumnModel().getColumn(5).setCellRenderer(new Render());

        Agregar_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/votacion-online.png"))); // NOI18N
        Agregar_Button.setText("Agregar");
        Agregar_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_ButtonActionPerformed(evt);
            }
        });

        EliminarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/eliminar.png"))); // NOI18N
        EliminarButton.setText("Eliminar");
        EliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarButtonActionPerformed(evt);
            }
        });

        Editar_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/editar.png"))); // NOI18N
        Editar_Button.setText("Editar");
        Editar_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Agregar_Button)
                                .addGap(53, 53, 53)
                                .addComponent(Editar_Button)
                                .addGap(85, 85, 85)
                                .addComponent(EliminarButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(238, 238, 238))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EliminarButton)
                    .addComponent(Editar_Button)
                    .addComponent(Agregar_Button))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Agregar_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_ButtonActionPerformed
        // TODO add your handling code here:
        Agregar_mesa formulario = new Agregar_mesa();
        formulario.setDatos(elec);
        formulario.setVisible(true);
        formulario.addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosed(java.awt.event.WindowEvent windowEvent) {
          mostrarMesas();
        }
    });
    }//GEN-LAST:event_Agregar_ButtonActionPerformed
    private void eliminarFila() {
            DefaultTableModel model = (DefaultTableModel)Mesa_Table.getModel();
        for (int i = model.getRowCount()-1; i >= 0; i--) {
            Boolean selec = (Boolean) model.getValueAt(i, 2); 
            if (selec != null && selec) {
                System.out.println(i);
                elec.eliminar_mesa(i+1);
                mostrarMesas();
            }
            
        }
        mostrarMesas();
    }
    private void EliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarButtonActionPerformed
        // TODO add your handling code here:
        eliminarFila();
        mostrarMesas();
    }//GEN-LAST:event_EliminarButtonActionPerformed

    private void Editar_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editar_ButtonActionPerformed
        // TODO add your handling code here:
        Editar_mesa formulario = new Editar_mesa();
        int selec = Mesa_Table.getSelectedRow();
        if (selec != -1) {
            Boolean bol = (Boolean) Mesa_Table.getValueAt(selec, 2);
            if (bol != null && bol) {
            String DNI = (String) Mesa_Table.getValueAt(selec, 0);
            String Nombre = (String) Mesa_Table.getValueAt(selec, 1);
            formulario.setDatos(elec,selec);
            formulario.setVisible(true);
            formulario.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
            mostrarMesas();
        }});           
            }}
    }//GEN-LAST:event_Editar_ButtonActionPerformed

    private void Mesa_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Mesa_TableMouseClicked
                                         
        // TODO add your handling code here:
        int row = Mesa_Table.rowAtPoint(evt.getPoint());
        int colum = Mesa_Table.columnAtPoint(evt.getPoint());
        if(row<Mesa_Table.getRowCount() && row>=0 && colum<Mesa_Table.getColumnCount() &&colum>=0){
            Object value=Mesa_Table.getValueAt(row, colum);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton=(JButton) value;
                
                if(boton.getName().equals("Miembros Mesa")){
                    if(elec.isEstado()){
                    System.out.println("click Miembros Mesa");
                    Miembro_Mesa mesa = new Miembro_Mesa();
                    Gestion_votos.Mesa mesa1 = elec.mesa_pos(row);
                    
                    mesa.setdatos(mesa1);
                    mesa.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "La eleccion acabo", "Error", JOptionPane.ERROR_MESSAGE);
                }
                }
                if(boton.getName().equals("Votos")){
                    if(elec.isEstado()){
                    System.out.println("Votos");
                    Gestion_votos.Mesa mesa1 = elec.mesa_pos(row);

                if (mesa1.encontrarTipo("Presidente") && mesa1.encontrarTipo("Vocal") && mesa1.encontrarTipo("Secretario")) {
                    Registrar_voto mesa = new Registrar_voto();
                    mesa.setdatos(mesa1, elec);
                    mesa.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "No se puede votar sin los 3 miembros de mesa", "Error", JOptionPane.ERROR_MESSAGE);
    }
                   }else{
                    JOptionPane.showMessageDialog(this, "La eleccion acabo", "Error", JOptionPane.ERROR_MESSAGE);
                }}
                if(boton.getName().equals("Acta Electoral")){
                    System.out.println("click Acta Electoral");
                    
                    Gestion_votos.Mesa mesa1 = elec.mesa_pos(row);
                    if (mesa1.encontrarTipo("Presidente") && mesa1.encontrarTipo("Vocal") && mesa1.encontrarTipo("Secretario")){
                        Acta_electoral acta = new Acta_electoral();
                        acta.setdatos(mesa1,elec);
                        acta.setVisible(true);
                    }else {
                    JOptionPane.showMessageDialog(this, "No se puede abrir acta", "Error", JOptionPane.ERROR_MESSAGE);
    }                }
        }
    }                                             
    
    }//GEN-LAST:event_Mesa_TableMouseClicked

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
            java.util.logging.Logger.getLogger(Mesa_Electoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa_Electoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa_Electoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa_Electoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa_Electoral().setVisible(true);
            }
        });
    }
        public class Render extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof JButton) {
                JButton button = (JButton) value;
                button.setOpaque(true);
                button.setBackground(Color.CYAN);
                return button;
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_Button;
    private javax.swing.JButton Editar_Button;
    private javax.swing.JButton EliminarButton;
    private javax.swing.JTable Mesa_Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
