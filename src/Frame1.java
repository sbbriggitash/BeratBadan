
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Briggita
 */
public class Frame1 extends javax.swing.JFrame {
    String temp = "";
    Double t1, bt, h1;
    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Tinggi = new javax.swing.JTextField();
        Berat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdb2 = new javax.swing.JRadioButton();
        rdb1 = new javax.swing.JRadioButton();
        BtnExit = new javax.swing.JButton();
        BtnHitung = new javax.swing.JButton();
        BtnCoba = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TF2 = new javax.swing.JTextField();
        TF1 = new javax.swing.JTextField();
        Ideal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 30, 160, 22);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 90, 50, 20);

        jLabel3.setText("Tinggi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 130, 50, 20);

        jLabel4.setText("Berat Badan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 170, 70, 14);

        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 200, 80, 20);
        getContentPane().add(Nama);
        Nama.setBounds(200, 80, 220, 30);
        getContentPane().add(Tinggi);
        Tinggi.setBounds(200, 120, 70, 30);
        getContentPane().add(Berat);
        Berat.setBounds(200, 160, 70, 30);

        jLabel6.setText("kg");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 170, 30, 20);

        jLabel7.setText("cm");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 130, 30, 20);

        buttonGroup1.add(rdb2);
        rdb2.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        rdb2.setText("Laki-laki");
        rdb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb2);
        rdb2.setBounds(330, 200, 100, 23);

        buttonGroup1.add(rdb1);
        rdb1.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        rdb1.setText("Perempuan");
        rdb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb1);
        rdb1.setBounds(200, 200, 110, 23);

        BtnExit.setText("Keluar");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(BtnExit);
        BtnExit.setBounds(440, 270, 100, 30);

        BtnHitung.setText("Hitung");
        BtnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(BtnHitung);
        BtnHitung.setBounds(190, 270, 100, 30);

        BtnCoba.setText("Coba Lagi");
        BtnCoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCobaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCoba);
        BtnCoba.setBounds(320, 270, 100, 30);

        jLabel8.setFont(new java.awt.Font("Meiryo", 0, 14)); // NOI18N
        jLabel8.setText("Berat badan ideal anda adalah");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 340, 220, 14);

        jLabel9.setFont(new java.awt.Font("Clarendon Lt BT", 1, 18)); // NOI18N
        jLabel9.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(230, 390, 280, 22);
        getContentPane().add(TF2);
        TF2.setBounds(180, 470, 380, 30);
        getContentPane().add(TF1);
        TF1.setBounds(180, 430, 380, 30);
        getContentPane().add(Ideal);
        Ideal.setBounds(420, 330, 80, 30);

        jLabel10.setText("kg");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(510, 340, 30, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1ActionPerformed
        // TODO add your handling code here:
        rdb1.setSelected(false);
    }//GEN-LAST:event_rdb1ActionPerformed

    private void BtnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHitungActionPerformed
        // TODO add your handling code here:
        if (Nama.getText().equals("")||Tinggi.getText().equals("")||Berat.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data inputan harus diisi");
        }
        else if (rdb1.isSelected()||rdb2.isSelected())
        {
            try{
                Proses();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Data inputan salah");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Jenis Kelamin belum dipilih");
        }
    }//GEN-LAST:event_BtnHitungActionPerformed

    private void rdb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb2ActionPerformed
        // TODO add your handling code here:
        rdb2.setSelected(false);
    }//GEN-LAST:event_rdb2ActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnCobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCobaActionPerformed
        // TODO add your handling code here:
        Nama.setText("");
        Tinggi.setText("");
        Berat.setText("");
        Ideal.setText("");
        TF1.setText("");
        TF2.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_BtnCobaActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Berat;
    private javax.swing.JButton BtnCoba;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnHitung;
    private javax.swing.JTextField Ideal;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TF2;
    private javax.swing.JTextField Tinggi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
        t1 = Double.valueOf(Tinggi.getText());
        bt = Double.valueOf(Berat.getText());
        
        if (rdb1.isSelected())
        {
            h1 = (t1 - 110) * 1;
        }
        else if (rdb2.isSelected())
        {
            h1 = (t1 - 120) * 1;
        }
        
        temp = Double.toString(h1.intValue());
        
        if (h1 < bt)
        {
            Ideal.setText(temp);
            TF1.setText("Maaf " + Nama.getText() + " , Sepertinya anda underweight ): ");
            TF2.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
        }
        else
        {
            Ideal.setText(temp);
            TF1.setText("Halo " + Nama.getText() + ", Berat badan anda sudah ideal (: ");
            TF2.setText("Lanjutkan pola makan teratur dan gaya hidup sehat (: ");
        }
    }
}
