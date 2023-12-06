package KyleProject;

import java.sql.*;
import javax.swing.JOptionPane;
public class Add extends javax.swing.JFrame {

    
    public Add() {
        initComponents();
        connect();
    }
    
    Connection con=null;
    PreparedStatement ps;
    ResultSet rs;
    String drive = "com.mysql.cj.jdbc.Driver";
    public void connect(){
        try {
            Class.forName(drive);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeffersondb?useSSL=false","root","jeffersonbsit123");
            
            if(con!=null){
                System.out.println("Connected");
            }
            
           
        } catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
            
        } 
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        submitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lNameFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        fnameFld = new javax.swing.JTextField();
        mNameFld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        positionFld = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ageFld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addressFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contactNumFld = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        courseFld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idFld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        genderFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitBtn.setBackground(new java.awt.Color(204, 204, 204));
        submitBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(0, 0, 0));
        submitBtn.setText("Add Student");
        submitBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        submitBtn.setFocusable(false);
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 160, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FirstName");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, -1));
        jPanel1.add(lNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 160, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LastName");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 110, -1));

        exit.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 20, -1));

        backBtn.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backBtn.setText("< Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel1.add(fnameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 170, 40));
        jPanel1.add(mNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 180, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MiddleName");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 110, -1));
        jPanel1.add(positionFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 170, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Regular/Irrig/Returning");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        jPanel1.add(ageFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 170, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, -1));
        jPanel1.add(addressFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 180, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 90, -1));
        jPanel1.add(contactNumFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 160, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ContactNumber");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 120, -1));

        courseFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseFldActionPerformed(evt);
            }
        });
        jPanel1.add(courseFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 170, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Course&Year");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel1.add(idFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 180, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Id");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 70, -1));
        jPanel1.add(genderFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 160, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gender");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 70, -1));

        jLabel13.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ADD STUDENTS");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 490));

        setSize(new java.awt.Dimension(610, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        try
        {
            String first = fnameFld.getText();
            String middle = mNameFld.getText();
            String last = lNameFld.getText();
            String course = courseFld.getText();
            String id = idFld.getText();
            String gender = genderFld.getText();
            int age = Integer.parseInt(ageFld.getText());
            String address = addressFld.getText();
            String conNum = contactNumFld.getText();
            String regular = positionFld.getText();
            
            ps = con.prepareStatement("INSERT INTO kylestudentrecord (IdNumber,FirstName,MiddleName,LastName,CourseAndYr,Gender,Age,Address,ContactNum,Position) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, first);
            ps.setString(3, middle);
            ps.setString(4, last);
            ps.setString(5, course);
            ps.setString(6, gender);
            ps.setInt(7, age);
            ps.setString(8, address);
            ps.setString(9, conNum);
            ps.setString(10, regular);
            
            int check = ps.executeUpdate();
            
            if(check == 1)
            {
                JOptionPane.showMessageDialog(null,"Successfully added!!");
                
                fnameFld.setText("");
                mNameFld.setText("");
                lNameFld.setText("");
                courseFld.setText("");
                idFld.setText("");
                ageFld.setText("");
                addressFld.setText("");
                contactNumFld.setText("");
                positionFld.setText("");
                genderFld.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Not Added!!","Message",JOptionPane.PLAIN_MESSAGE);
            }
            
            
        }
        catch(Exception e)
        {
          System.out.println("Error occured!1" + e.getMessage()); 
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void courseFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseFldActionPerformed

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        AdminFrame admin = new AdminFrame();
        this.dispose();
        admin.setVisible(true);
    }//GEN-LAST:event_backBtnMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressFld;
    private javax.swing.JTextField ageFld;
    private javax.swing.JLabel backBtn;
    private javax.swing.JTextField contactNumFld;
    private javax.swing.JTextField courseFld;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField fnameFld;
    private javax.swing.JTextField genderFld;
    private javax.swing.JTextField idFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lNameFld;
    private javax.swing.JTextField mNameFld;
    private javax.swing.JTextField positionFld;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
