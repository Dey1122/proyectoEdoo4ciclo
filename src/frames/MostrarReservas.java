/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;
import com.formdev.flatlaf.FlatIntelliJLaf;
import entidades.Habitaciones;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author danie
 */
public class MostrarReservas extends javax.swing.JFrame {

    /**
     * Creates new form MostrarReservas
     */
    private ReservasHabitacion reserva;
    public MostrarReservas() {
        initComponents();
        Habitaciones.crearHabitaciones();
    }
    public void crearFrameReserva(int num){
        reserva = new ReservasHabitacion(Habitaciones.getHabitaciones(num),num);
        reserva.setVisible(true);
        this.setVisible(false);
        reserva.addWindowListener(new WindowAdapter() {
            @Override
                            public void windowClosed(WindowEvent e) {
                                MostrarReservas.this.setVisible(true);
                                jPanel1.requestFocus();
                            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnOp3 = new javax.swing.JButton();
        btnOp1 = new javax.swing.JButton();
        btnOp2 = new javax.swing.JButton();
        btnOp6 = new javax.swing.JButton();
        btnOp5 = new javax.swing.JButton();
        btnOp4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOp3.setBackground(new java.awt.Color(40, 75, 99));
        btnOp3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnOp3.setForeground(new java.awt.Color(255, 255, 255));
        btnOp3.setText("Seleccionar");
        btnOp3.setBorderPainted(false);
        btnOp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOp3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnOp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 140, 50));

        btnOp1.setBackground(new java.awt.Color(40, 75, 99));
        btnOp1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnOp1.setForeground(new java.awt.Color(255, 255, 255));
        btnOp1.setText("Seleccionar");
        btnOp1.setBorderPainted(false);
        btnOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOp1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnOp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 140, 50));

        btnOp2.setBackground(new java.awt.Color(40, 75, 99));
        btnOp2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnOp2.setForeground(new java.awt.Color(255, 255, 255));
        btnOp2.setText("Seleccionar");
        btnOp2.setBorderPainted(false);
        btnOp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOp2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnOp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 140, 50));

        btnOp6.setBackground(new java.awt.Color(40, 75, 99));
        btnOp6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnOp6.setForeground(new java.awt.Color(255, 255, 255));
        btnOp6.setText("Seleccionar");
        btnOp6.setBorderPainted(false);
        btnOp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOp6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnOp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 140, 50));

        btnOp5.setBackground(new java.awt.Color(40, 75, 99));
        btnOp5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnOp5.setForeground(new java.awt.Color(255, 255, 255));
        btnOp5.setText("Seleccionar");
        btnOp5.setBorderPainted(false);
        btnOp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOp5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnOp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, 140, 50));

        btnOp4.setBackground(new java.awt.Color(40, 75, 99));
        btnOp4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnOp4.setForeground(new java.awt.Color(255, 255, 255));
        btnOp4.setText("Seleccionar");
        btnOp4.setBorderPainted(false);
        btnOp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOp4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnOp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, 140, 50));

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 400, 20));

        jPanel3.setBackground(new java.awt.Color(217, 217, 217));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 400, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 320, 250));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 320, 250));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 320, 250));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        jPanel10.setBackground(new java.awt.Color(217, 217, 217));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 1030, 20));

        btnAtras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAtras.setText("←");
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOp1ActionPerformed
        crearFrameReserva(1);
    }//GEN-LAST:event_btnOp1ActionPerformed

    private void btnOp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOp4ActionPerformed
        crearFrameReserva(4);
    }//GEN-LAST:event_btnOp4ActionPerformed

    private void btnOp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOp2ActionPerformed
        crearFrameReserva(2); 
    }//GEN-LAST:event_btnOp2ActionPerformed

    private void btnOp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOp3ActionPerformed
        crearFrameReserva(3);
    }//GEN-LAST:event_btnOp3ActionPerformed

    private void btnOp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOp5ActionPerformed
        crearFrameReserva(5);
    }//GEN-LAST:event_btnOp5ActionPerformed

    private void btnOp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOp6ActionPerformed
        crearFrameReserva(6);
    }//GEN-LAST:event_btnOp6ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
    this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

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
           FlatIntelliJLaf.registerCustomDefaultsSource("style");  
           FlatIntelliJLaf.setup();
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnOp1;
    private javax.swing.JButton btnOp2;
    private javax.swing.JButton btnOp3;
    private javax.swing.JButton btnOp4;
    private javax.swing.JButton btnOp5;
    private javax.swing.JButton btnOp6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
