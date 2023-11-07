import project.dbc;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Devesh
 */
public class addmem extends javax.swing.JFrame {

    /**
     * Creates new form addmem
     */
    public addmem() {
        initComponents();{
         try
        {
            int id=1;
            String str1=String.valueOf(id);
            jLabel8.setText(str1);
            Connection con=dbc.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select max(id) from member");
            while(rs.next())    
            {
                id=rs.getInt(1);
                id=id+1;
                String str=String.valueOf(id);      //automatically alloting id nos to members by using while loop
                jLabel8.setText(str);
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel1.setText("Name ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(38, 124, 58, 17);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(38, 158, 194, 30);

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel2.setText("DOB");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(38, 213, 37, 17);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(38, 247, 194, 30);

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel3.setText("Age");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(38, 297, 37, 17);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(38, 331, 71, 30);

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 290, 56, 17);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(380, 320, 62, 24);

        jLabel5.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel5.setText("Contact");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(380, 120, 64, 17);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(380, 149, 153, 30);

        jLabel6.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel6.setText("Amount Paid");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 210, 195, 17);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(380, 239, 145, 30);

        jLabel7.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel7.setText("Member ID:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(174, 46, 106, 17);

        jLabel8.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel8.setText("00");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(298, 46, 37, 17);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 455, 70, 25);

        jLabel11.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel11.setText("Membership expiring on");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(38, 398, 190, 17);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(250, 399, 85, 30);

        jButton2.setText("Edit / Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 455, 100, 25);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(335, 32, 650, 590);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back-arrow s.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(95, 486, 47, 24);

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add ");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(160, 110, 70, 44);

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("New Member");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(84, 153, 180, 44);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Agency FB", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/membership.png"))); // NOI18N
        jButton6.setText("Membership");
        jPanel2.add(jButton6);
        jButton6.setBounds(84, 259, 130, 40);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Agency FB", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/member.png"))); // NOI18N
        jButton3.setText("Add member");
        jPanel2.add(jButton3);
        jButton3.setBounds(84, 397, 130, 40);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Agency FB", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fitness .png"))); // NOI18N
        jButton5.setText("Add Trainer");
        jPanel2.add(jButton5);
        jButton5.setBounds(84, 351, 130, 40);

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Agency FB", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/barbell.png"))); // NOI18N
        jButton7.setText("Add Equipments");
        jPanel2.add(jButton7);
        jButton7.setBounds(84, 305, 130, 39);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user (1).png"))); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(60, 70, 80, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
   
    String name=jTextField1.getText();
    String contact=jTextField4.getText();
    String age=jTextField3.getText();
    String gender= (String)jComboBox1.getSelectedItem();
    String dob=jTextField2.getText();
    String amountpaid=jTextField5.getText();
    String expire=jTextField6.getText();
        try 
        { 
        Connection con=dbc.getCon();    // Obtain a database connection using the `getCon` method from the `dbc` class. 
        PreparedStatement ps=con.prepareStatement("insert into member (name, contact, gender, dob, age, amountpaid, expire) values(?,?,?,?,?,?,?)");
             // Create a prepared statement for inserting data into the 'member' table.
             // The '?' placeholders in the SQL statement will be replaced with values before executing the statement.
        ps.setString(1,name);
        ps.setString(2,contact);
        ps.setString(3,gender);
        ps.setString(4,dob);
        ps.setString(5,age);
        ps.setString(6,amountpaid);
        ps.setString(7,expire);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Succesfully Saved");
        setVisible(false);
        new addmem().setVisible(true);
        }
        catch (Exception e)
    { 
        JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        adhome adhomeFrame = new adhome();
        adhomeFrame.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        updmem updmemFrame = new updmem();
    
    // Set the login frame to be visible
    updmemFrame.setVisible(true);
    
    // Close the current introductory frame
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(addmem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addmem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addmem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addmem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addmem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}