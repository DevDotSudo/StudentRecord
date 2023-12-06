
package KyleProject;

import javax.swing.JOptionPane;


public class Delete extends javax.swing.JFrame {

   static Add add;
    public Delete() {
        initComponents();
        add = new Add();
        add.connect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        firstnameFld = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("< Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        exit.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 20, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DELETE STUDENT");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, 24));
        jPanel1.add(firstnameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 215, 35));

        deleteBtn.setBackground(new java.awt.Color(204, 204, 204));
        deleteBtn.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 290));

        setSize(new java.awt.Dimension(380, 281));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try
        {
           String fname = firstnameFld.getText();
                   
           add.ps = add.con.prepareStatement("Delete from kylestudentrecord where FirstName = ?");
           add.ps.setString(1, fname);
           
           int check = add.ps.executeUpdate();
           
           if(check == 1)
           {
              JOptionPane.showMessageDialog(null, "Successfully deleted!!!");
              
              firstnameFld.setText("");
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Not deleted!!","Message",JOptionPane.ERROR_MESSAGE);
           }
           
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        AdminFrame admin = new AdminFrame();
        this.dispose();
        admin.setVisible(true);
    }//GEN-LAST:event_backBtnMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField firstnameFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
