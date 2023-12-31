/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Modelo.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo
 */
public class PorNombre extends javax.swing.JInternalFrame {
    DefaultTableModel modelo=new DefaultTableModel(){
        public boolean editar(int f, int c){
            return false;
        }
    };

    /**
     * Creates new form PorNombre
     */
    public PorNombre() {
        initComponents();        
        String cabecera[]={"Código","Descripcion","Precio","Stock"};
        modelo.setColumnIdentifiers(cabecera);
        jtTabla.setModel(modelo);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jlIndicador = new javax.swing.JLabel();
        jtfCaracter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jlTitulo.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jlTitulo.setText("Listado por Nombre");

        jlIndicador.setText("Escriba los primeros caracteres:");

        jtfCaracter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCaracterKeyReleased(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTabla.setSelectionBackground(new java.awt.Color(51, 255, 0));
        jtTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabla);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel1.setText("- by Romero Arnaldo -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jlTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jlIndicador)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIndicador)
                    .addComponent(jtfCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCaracterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCaracterKeyReleased
        // TODO add your handling code here:
        borrarFila();
        for (Producto prodBuscar : DemoModulo.productos) {
            if(prodBuscar.getDescripcion().toLowerCase().startsWith(jtfCaracter.getText().toLowerCase())){
                modelo.addRow(new Object[]{prodBuscar.getCodigo(),prodBuscar.getDescripcion(),prodBuscar.getPrecio(),prodBuscar.getStock()});
            }
            
        }
    }//GEN-LAST:event_jtfCaracterKeyReleased

    private void jtTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMouseClicked
        // TODO add your handling code here:
        int filaselec=jtTabla.getSelectedRow();
        JOptionPane.showMessageDialog(this,"No se pueden modificar datos");
    }//GEN-LAST:event_jtTablaMouseClicked

    private void borrarFila(){
        int a=modelo.getRowCount()-1;
        for(int i=a;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlIndicador;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtfCaracter;
    // End of variables declaration//GEN-END:variables
}
