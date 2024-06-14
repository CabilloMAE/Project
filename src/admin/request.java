/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sofia
 */
public class request extends javax.swing.JFrame {

    /**
     * Creates new form request
     */
    public request() {
        initComponents();
        display_product();
        dispay_referral();
        displayretailer();
        displaydataforreq();
    }
    
    
    public void displaydataforreq(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT * FROM request");
            reqtable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
       
        }
        
    }
    
    
     public void display_product(){

        dbConnector dbc = new dbConnector();
        
        try{
            
            String query = ("SELECT * FROM product WHERE p_stat ='Active' ");
            ResultSet rs = dbc.getData(query);
            Vector v = new Vector();
            
            while (rs.next()){
            v.add(rs.getString("p_name"));
            
            DefaultComboBoxModel com = new DefaultComboBoxModel (v);
            req_pname.setModel(com);
        
        }
            
        }catch(SQLException e){
            System.out.println(e);
        
        
        }   
      
        
        
}
     
     public void dispay_referral(){

        dbConnector dbc = new dbConnector();
        
        try{
            
            String query = ("SELECT * FROM referral WHERE r_status ='Active' ");
            ResultSet rs = dbc.getData(query);
            Vector v = new Vector();
            
            while (rs.next()){
            v.add(rs.getString("r_name"));
            
            DefaultComboBoxModel com = new DefaultComboBoxModel (v);
            req_ref.setModel(com);
        
        }
            
        }catch(SQLException e){
            System.out.println(e);
        
        
        }   
      
        
        
}
     
     public void displayretailer(){

        dbConnector dbc = new dbConnector();
        
        try{
            
            String query = ("SELECT * FROM retailer WHERE ret_status ='Active' ");
            ResultSet rs = dbc.getData(query);
            Vector v = new Vector();
            
            while (rs.next()){
            v.add(rs.getString("ret_name"));
            
            DefaultComboBoxModel com = new DefaultComboBoxModel (v);
            req_retail.setModel(com);
        
        }
            
        }catch(SQLException e){
            System.out.println(e);
        
        
        }   
      
        
        
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
        jPanel2 = new javax.swing.JPanel();
        req_ids = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        req_ref = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        req_status = new javax.swing.JComboBox<>();
        req_retail = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        req_pname = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        qty = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reqtable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        req_ids.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        req_ids.setText("ID  :");
        jPanel2.add(req_ids);
        req_ids.setBounds(110, 60, 100, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Referrals :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 180, 100, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Retailers :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 220, 100, 30);

        req_ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req_refActionPerformed(evt);
            }
        });
        jPanel2.add(req_ref);
        req_ref.setBounds(110, 180, 150, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Status :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 260, 100, 30);

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(20, 350, 100, 40);

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(20, 410, 100, 40);

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(150, 350, 100, 40);

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(150, 410, 100, 40);

        req_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approve", "Pending" }));
        jPanel2.add(req_status);
        req_status.setBounds(110, 260, 150, 30);

        req_retail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req_retailActionPerformed(evt);
            }
        });
        jPanel2.add(req_retail);
        req_retail.setBounds(110, 220, 150, 30);

        jLabel9.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel9.setText("Product List");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(290, 20, 310, 40);

        jLabel6.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel6.setText("Request Form");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 20, 180, 40);

        req_pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req_pnameActionPerformed(evt);
            }
        });
        jPanel2.add(req_pname);
        req_pname.setBounds(110, 100, 150, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Product Name :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 100, 100, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Request ID  :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 60, 100, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Product Qty :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 140, 100, 30);

        qty.setText("Qty");
        jPanel2.add(qty);
        qty.setBounds(110, 140, 150, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 280, 480);

        jPanel3.setLayout(null);

        reqtable.setModel(new javax.swing.table.DefaultTableModel(
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
        reqtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reqtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reqtable);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 600, 410);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(290, 70, 600, 410);

        jLabel10.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel10.setText("Request List");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(290, 20, 310, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        dbConnector dbc = new dbConnector();
        
        try{
            
            if(dbc.insertData("INSERT INTO request (req_name, req_qty, req_ref, req_ret, req_status) VALUES "
                    + " ('"+req_pname.getSelectedItem()+"', '"+qty.getText()+"', '"+req_ref.getSelectedItem()+"', '"+req_retail.getSelectedItem()+"', '"+req_status.getSelectedItem()+"' )")){
                
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                    
                    
                
            }
        
        
        }catch(Exception e){
            System.out.println(e);
        }
        
        req_ids.setText("");
        req_pname.setSelectedItem("");
        qty.setText("");
        req_ref.setSelectedItem(""); 
        req_retail.setSelectedItem("");
        req_status.setSelectedItem("");
        
        displaydataforreq();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void req_pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req_pnameActionPerformed
        // TODO add your handling code here:
        
         String names = req_pname.getSelectedItem().toString();

        dbConnector dbc = new dbConnector();

        try{

            String query =("SELECT * FROM product WHERE p_name ='"+names+"' AND p_stat ='Active' ");
            ResultSet rss = dbc.getData(query);

            if (rss.next()){
                qty.setText(rss.getString("p_qty"));
            }

        }catch(SQLException e){

            System.out.println(e);

        }
        
    }//GEN-LAST:event_req_pnameActionPerformed

    private void req_refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req_refActionPerformed
        // TODO add your handling code here:
        
        String names = req_ref.getSelectedItem().toString();

        dbConnector dbc = new dbConnector();

        try{

            String query =("SELECT * FROM referral WHERE r_name ='"+names+"' AND r_status ='Active' ");
            ResultSet rss = dbc.getData(query);

            if (rss.next()){
             
            }

        }catch(SQLException e){

            System.out.println(e);

        }
        
    }//GEN-LAST:event_req_refActionPerformed

    private void req_retailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req_retailActionPerformed
        // TODO add your handling code here:
        
        String names = req_retail.getSelectedItem().toString();

        dbConnector dbc = new dbConnector();

        try{

            String query =("SELECT * FROM retailer WHERE ret_name ='"+names+"' AND ret_status ='Active' ");
            ResultSet rss = dbc.getData(query);

            if (rss.next()){
             
            }

        }catch(SQLException e){

            System.out.println(e);

        }
        
        
    }//GEN-LAST:event_req_retailActionPerformed

    private void reqtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reqtableMouseClicked
        // TODO add your handling code here:
        
          // TODO add your handling code here:
          
          //Sa tabl ni Mouse click
          
          int r = reqtable.getSelectedRow();
        
        String pro_id = reqtable.getValueAt(r, 0).toString();
        String req_n = reqtable.getValueAt(r, 1).toString();
        String req_re = reqtable.getValueAt(r, 2).toString();
        String req_t = reqtable.getValueAt(r, 3).toString();
        String status = reqtable.getValueAt(r, 4).toString();
        
        
        
        req_ids.setText(pro_id);
        req_pname.setSelectedItem(req_n);
        req_ref.setSelectedItem(req_re);
        req_retail.setSelectedItem(req_t);
        req_status.setSelectedItem(status);
        
        
        
    }//GEN-LAST:event_reqtableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         String userid = req_ids.getText();
         
         dbConnector dbc = new dbConnector();
        
        try{
            if(dbc.deleteData("DELETE FROM request WHERE req_id = '"+userid+"' ")){
            
                JOptionPane.showMessageDialog(null, "Data Deleted");
            }
              
            
        } catch (Exception e){
            
            System.out.println(e);

        }
        req_ids.setText("");
        req_pname.setSelectedItem("");
        qty.setText("");
        req_ref.setSelectedItem("");
        req_retail.setSelectedItem("");
        req_status.setSelectedItem("");
        displaydataforreq();
 
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        // Update ni siya
         try{
            
             dbConnector dbc = new dbConnector();
       
            
            String query = "UPDATE request SET req_name ='"+req_pname.getSelectedItem()+"', "
                    + "req_ref ='"+req_ref.getSelectedItem()+"', req_ret ='"+req_retail.getSelectedItem()+"', "
                + " req_status ='"+req_status.getSelectedItem()+"' WHERE req_id ='"+req_ids.getText()+"' ";

            if (dbc.insertData(query)) {
            JOptionPane.showMessageDialog(null, "Data Updated");
            }
 
        } catch (HeadlessException e){
            
            System.out.println(e);
        }
         displaydataforreq();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         req_ids.setText("");
        req_pname.setSelectedItem("");
        qty.setText("");
        req_ref.setSelectedItem("");
        req_retail.setSelectedItem("");
        req_status.setSelectedItem("");
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel qty;
    private javax.swing.JLabel req_ids;
    private javax.swing.JComboBox<String> req_pname;
    private javax.swing.JComboBox<String> req_ref;
    private javax.swing.JComboBox<String> req_retail;
    private javax.swing.JComboBox<String> req_status;
    private javax.swing.JTable reqtable;
    // End of variables declaration//GEN-END:variables
}
