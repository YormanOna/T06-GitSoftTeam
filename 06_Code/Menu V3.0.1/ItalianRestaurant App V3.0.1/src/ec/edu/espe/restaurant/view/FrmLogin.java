package ec.edu.espe.restaurant.view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class FrmLogin extends javax.swing.JFrame {


    public FrmLogin() {
        initComponents();
        this.setTitle("Italian Restaurant Di Tutto`s");
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/logoSinFondo.png"));
        return retValue;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_help = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_username1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(740, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(740, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setText("Welcome to \"Di Tutto`s\" Restaurant");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoRestaurant-removebg1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 290, 280));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 20, 420));

        btn_help.setBackground(new java.awt.Color(255, 102, 102));
        btn_help.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_help.setText("Help");
        btn_help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_helpActionPerformed(evt);
            }
        });
        jPanel1.add(btn_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 70, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/enter.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 40, 40));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setText("Username:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 100, 20));

        txt_username1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txt_username1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_username1MousePressed(evt);
            }
        });
        txt_username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_username1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 230, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jPassword.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordMousePressed(evt);
            }
        });
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 230, 30));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 90, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Help1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 40, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 90, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 90, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //private FrmInterface frmIS;
    private void btn_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_helpActionPerformed
        /*FrmHelp FrmHelp = new FrmHelp();
        this.setVisible(false);
        FrmHelp.setVisible(true);*/
    }//GEN-LAST:event_btn_helpActionPerformed

    private void txt_username1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_username1MousePressed
        if(txt_username1.getText().equals("Enter your username")){
            txt_username1.setText("");
            txt_username1.setForeground(Color.black);
        }
        if(String.valueOf(jPassword.getPassword()).isEmpty() ){
            jPassword.setText("***********");
            jPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_username1MousePressed

    private void jPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordMousePressed
        if(String.valueOf(jPassword.getPassword()).equals("***********")){
            jPassword.setText("");
            jPassword.setForeground(Color.black);
        }
        if(txt_username1.getText().isEmpty() ){
            txt_username1.setText("Enter your username");
            txt_username1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jPasswordMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       /*// char clave[]=jPassword.getPassword();
    //String clavedef=new String(clave);

   // if (txt_username1.getText().equals("italian") && clavedef.equals("lasagna123")){

           // this.dispose();
            frmIS = new FrmInterface();
            frmIS.setVisible(true);

    }else {
            JOptionPane.showMessageDialog(null, "USER OR PASSWORD INVALID:\n"
            + "Enter the username or password again", "Access denied",
            JOptionPane.ERROR_MESSAGE);
            txt_username1.setText("");
            jPassword.setText("");
    }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_username1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_help;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txt_username1;
    // End of variables declaration//GEN-END:variables
}
