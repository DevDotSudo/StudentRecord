
package KyleProject;

import javax.swing.JOptionPane;


public class Update extends javax.swing.JFrame {

    static Add add;
    public Update() {
        initComponents();
        add = new Add();
        add.connect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchBtn = new javax.swing.JButton();
        lastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        positionFld = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        idFld = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        courseFld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fnameFld = new javax.swing.JTextField();
        addressFld = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        genderFld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mnameFLd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lnameFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ageFld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contactFld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchBtn.setBackground(new java.awt.Color(204, 204, 204));
        searchBtn.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 0, 0));
        searchBtn.setText("Search");
        searchBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 120, 40));
        jPanel1.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 160, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Last Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 90, 30));

        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 138, 530, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("< Back");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("X");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 30, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("UPDATE STUDENT");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        updateBtn.setBackground(new java.awt.Color(204, 204, 204));
        updateBtn.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(0, 0, 0));
        updateBtn.setText("Update");
        updateBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 140, 40));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 20));
        jPanel1.add(positionFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 150, 40));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Position");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, -1));
        jPanel1.add(idFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, 40));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, 20));

        courseFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseFldActionPerformed(evt);
            }
        });
        jPanel1.add(courseFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, 20));
        jPanel1.add(fnameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 40));
        jPanel1.add(addressFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 170, 40));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 80, 20));
        jPanel1.add(genderFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 170, 40));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 80, 20));
        jPanel1.add(mnameFLd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 170, 40));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Middle Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 110, 20));
        jPanel1.add(lnameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 150, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 100, 20));
        jPanel1.add(ageFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 150, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 80, 20));
        jPanel1.add(contactFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 150, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 140, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 510));

        setSize(new java.awt.Dimension(523, 504));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
       String last = lastName.getText();
       try
       {
           add.ps = add.con.prepareStatement("Select * from kylestudentrecord where LastName = ?");
           
           add.ps.setString(1, last);
           
           add.rs = add.ps.executeQuery();
           
           while(add.rs.next()){
               idFld.setText(add.rs.getString(1));
               fnameFld.setText(add.rs.getString(2));
               mnameFLd.setText(add.rs.getString(3));
               lnameFld.setText(add.rs.getString(4));
               courseFld.setText(add.rs.getString(5));
               genderFld.setText(add.rs.getString(6));
               ageFld.setText(add.rs.getString(7));
               addressFld.setText(add.rs.getString(8));
               contactFld.setText(add.rs.getString(9));
               positionFld.setText(add.rs.getString(10));
           }
       }
       catch(Exception e)
       {
           System.out.println("Error Occured!!" + e.getMessage());
       }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void courseFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseFldActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String fname = fnameFld.getText();
        String mname = mnameFLd.getText();
        String lname = lnameFld.getText();
        String course = courseFld.getText();
        String gender = genderFld.getText();
        String ageText = ageFld.getText();
        String address = addressFld.getText();
        String id = idFld.getText();
        String contact = contactFld.getText();
        String position = positionFld.getText();
        
        try
        {
            int age = Integer.parseInt(ageText);
            add.ps = add.con.prepareStatement("Update kylestudentrecord set IdNumber = ?, MiddleName = ?, LastName = ?, CourseAndYr = ?, Gender = ?, Age = ?,Address = ?, ContactNum = ?, Position = ? where FirstName = ?");
            add.ps.setString(1, id);
            add.ps.setString(2, mname);
            add.ps.setString(3, lname);
            add.ps.setString(4, course);
            add.ps.setString(5, gender);
            add.ps.setInt(6, age);
            add.ps.setString(7, address);
            add.ps.setString(8, contact);
            add.ps.setString(9, position);
            add.ps.setString(10, fname);
            
            int check = add.ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Update!!");
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Not Update info!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException i) {
            JOptionPane.showMessageDialog(null, "Invalid input for age or contact number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!1" + e.getMessage());
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        AdminFrame admin = new AdminFrame();
        this.dispose();
        admin.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel14MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressFld;
    private javax.swing.JTextField ageFld;
    private javax.swing.JTextField contactFld;
    private javax.swing.JTextField courseFld;
    private javax.swing.JTextField fnameFld;
    private javax.swing.JTextField genderFld;
    private javax.swing.JTextField idFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField lnameFld;
    private javax.swing.JTextField mnameFLd;
    private javax.swing.JTextField positionFld;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
