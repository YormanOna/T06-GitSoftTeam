package ec.edu.espe.restaurant.view;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.restaurant.controller.CustomerController;
import ec.edu.espe.restaurant.controller.ServiceController;
import ec.edu.espe.restaurant.model.Customer;
import ec.edu.espe.restaurant.model.MongoDBConnection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class PanelUpdateOrder extends javax.swing.JPanel {

    public PanelUpdateOrder() {
        initComponents();
        MongoDBConnection MongoDB;
        MongoDB = new MongoDBConnection();
        MongoDB.connectDatabase();
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
        txt_identification = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_FullNames = new javax.swing.JTextField();
        txt_Surnames = new javax.swing.JTextField();
        txt_Id = new javax.swing.JTextField();
        txt_Cellphone = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_Type = new javax.swing.JTextField();
        txt_Cost = new javax.swing.JTextField();
        txt_paymentMethod = new javax.swing.JTextField();
        txt_Date = new javax.swing.JTextField();
        txt_Hour = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txt_identification, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 200, 30));

        btn_Search.setBackground(new java.awt.Color(255, 102, 102));
        btn_Search.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_Search.setText("SEARCH");
        btn_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SearchMouseExited(evt);
            }
        });
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, 30));

        btn_Update.setBackground(new java.awt.Color(255, 102, 102));
        btn_Update.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btn_Update.setText("UPDATE");
        btn_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UpdateMouseExited(evt);
            }
        });
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 120, 30));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel10.setText("Email:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel11.setText("Full Names:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel12.setText("Last Names:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel13.setText("ID:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel14.setText("Hour of attention:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel15.setText("Cellphone:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel16.setText("Food:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel17.setText("Cost:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 40, 20));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel18.setText("Payment Method:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel19.setText("Date:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        txt_FullNames.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_FullNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FullNamesActionPerformed(evt);
            }
        });
        txt_FullNames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_FullNamesKeyTyped(evt);
            }
        });
        jPanel1.add(txt_FullNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 200, 20));

        txt_Surnames.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Surnames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_SurnamesKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Surnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 200, 20));

        txt_Id.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_IdKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 200, 20));

        txt_Cellphone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Cellphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_CellphoneKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Cellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 200, 20));

        txt_Email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 200, 20));

        txt_Type.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 200, -1));

        txt_Cost.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_Cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_CostKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 110, -1));

        txt_paymentMethod.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_paymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 160, 20));

        txt_Date.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txt_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 160, -1));

        try {
            txt_Hour.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_Hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HourActionPerformed(evt);
            }
        });
        txt_Hour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_HourKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_HourKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 50, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setText("Enter CUSTOMER ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("UPDATE DATA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 30));

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 10, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 190, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 93, 590, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 640, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_HourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HourKeyTyped

    }//GEN-LAST:event_txt_HourKeyTyped

    private void txt_HourKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HourKeyPressed
        ServiceController h;
        h = new ServiceController();
        if(h.Validar_CampoHora(txt_Hour.getText())== false){

        }
    }//GEN-LAST:event_txt_HourKeyPressed

    private void txt_HourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HourActionPerformed
        
    }//GEN-LAST:event_txt_HourActionPerformed

    private void txt_CostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CostKeyTyped
        char character = evt.getKeyChar();

        if(((character < '0' || character > '9')) && (character != KeyEvent.VK_BACK_SPACE)
            && (character != '.' || txt_Cost.getText().contains(".") )){
            evt.consume();
        }
    }//GEN-LAST:event_txt_CostKeyTyped

    private void txt_CellphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CellphoneKeyPressed
        String value = txt_Cellphone.getText();
        int legth = value.length(); 
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            txt_Cellphone.setEditable(true);
            if(legth>=10){

                JOptionPane.showMessageDialog(this, "Cellphone number must have 10 digits","Warning",JOptionPane.WARNING_MESSAGE);
                txt_Cellphone.setText("");

            }
        }else {
            JOptionPane.showMessageDialog(this, "Enter only numbers","Warning",JOptionPane.WARNING_MESSAGE);
            txt_Cellphone.setText("");
        }
    }//GEN-LAST:event_txt_CellphoneKeyPressed

    private void txt_IdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IdKeyPressed
        String value = txt_Id.getText();
        int legth = value.length(); 
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            txt_Id.setEditable(true);
            if(legth>=10){

                JOptionPane.showMessageDialog(this, "ID must have 10 digits","Warning",JOptionPane.WARNING_MESSAGE);
                txt_Id.setText("");

            }
        }else {
            JOptionPane.showMessageDialog(this, "Enter only numbers","Warning",JOptionPane.WARNING_MESSAGE);
            txt_Id.setText("");
        }
    }//GEN-LAST:event_txt_IdKeyPressed

    private void txt_SurnamesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SurnamesKeyTyped

        char validateLetters = evt.getKeyChar();
        if(Character.isDigit(validateLetters)){
            evt.consume();
            JOptionPane.showMessageDialog(txt_Surnames, "Enter only letters","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_SurnamesKeyTyped

    private void txt_FullNamesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FullNamesKeyTyped

        char validateLetters = evt.getKeyChar();
        if(Character.isDigit(validateLetters)){
            evt.consume();
            JOptionPane.showMessageDialog(txt_FullNames, "Enter only letters","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txt_FullNamesKeyTyped

    private void txt_FullNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FullNamesActionPerformed
        //
    }//GEN-LAST:event_txt_FullNamesActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed

        MongoCollection<Document> collection = MongoDBConnection.database.getCollection("Orders");
        Document doc = collection.find(eq("identification",txt_identification.getText())).first();

        CustomerController customerController = new CustomerController("Orders");

        int i =  JOptionPane.showConfirmDialog(this,"Update Data Customer?","Warning",JOptionPane.WARNING_MESSAGE);

        if(i==0){
            customerController.uploadToDatabase(doc, customerController.RegisterAndBuildDocument(txt_FullNames.getText(),
                txt_Surnames.getText(),
                txt_Id.getText(),
                txt_Cellphone.getText(),
                txt_Email.getText(),
                txt_Type.getText(),
                txt_Cost.getText(),
                txt_paymentMethod.getText(),
                txt_Date.getText(),
                txt_Hour.getText()));
        JOptionPane.showMessageDialog(this, "Data updated successfully");
        }else if(i==1){
            this.setVisible(true);
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateMouseExited
        btn_Update.setBackground(Color.cyan);
    }//GEN-LAST:event_btn_UpdateMouseExited

    private void btn_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpdateMouseEntered
        btn_Update.setBackground(Color.green);
    }//GEN-LAST:event_btn_UpdateMouseEntered

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed

        CustomerController customerC;
        customerC = new CustomerController("Orders");
        MongoCollection<Document> collection = MongoDBConnection.database.getCollection("Orders");

        Document doc = collection.find(eq("identification", txt_identification.getText())).first();
        Gson gson = new Gson();
        Customer customer = gson.fromJson(doc.toJson(), Customer.class);

        txt_FullNames.setText(customer.getFullNames());
        txt_Surnames.setText(customer.getSurnames());
        txt_Id.setText(customer.getIdentification());
        txt_Cellphone.setText(customer.getCellphone());
        txt_Email.setText(customer.getEmail());
        txt_Cost.setText(customer.getCost());
        txt_paymentMethod.setText(customer.getPaymentMethod());
        txt_Type.setText(customer.getFood());
        txt_Date.setText(customer.getDate());
        txt_Hour.setText(customer.getHourOfAttention());

    }//GEN-LAST:event_btn_SearchActionPerformed

    private void btn_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseExited
        btn_Search.setBackground(Color.cyan);
    }//GEN-LAST:event_btn_SearchMouseExited

    private void btn_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseEntered
        btn_Search.setBackground(Color.green);
    }//GEN-LAST:event_btn_SearchMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Update;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txt_Cellphone;
    private javax.swing.JTextField txt_Cost;
    private javax.swing.JTextField txt_Date;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_FullNames;
    private javax.swing.JFormattedTextField txt_Hour;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Surnames;
    private javax.swing.JTextField txt_Type;
    private javax.swing.JTextField txt_identification;
    private javax.swing.JTextField txt_paymentMethod;
    // End of variables declaration//GEN-END:variables
}
