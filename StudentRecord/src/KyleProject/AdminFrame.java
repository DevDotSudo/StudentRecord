
package KyleProject;

import javax.swing.JOptionPane;


public class AdminFrame extends javax.swing.JFrame {

   
    public AdminFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        deleteStudentBtn = new javax.swing.JButton();
        addStudentBtn = new javax.swing.JButton();
        updateStudent = new javax.swing.JButton();
        updateStudentBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteStudentBtn.setBackground(new java.awt.Color(51, 51, 51));
        deleteStudentBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        deleteStudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteStudentBtn.setText("Delete Student");
        deleteStudentBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        deleteStudentBtn.setFocusable(false);
        deleteStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteStudentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 170, 50));

        addStudentBtn.setBackground(new java.awt.Color(51, 51, 51));
        addStudentBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        addStudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        addStudentBtn.setText("Add Student");
        addStudentBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addStudentBtn.setFocusable(false);
        addStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addStudentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 170, 50));

        updateStudent.setBackground(new java.awt.Color(51, 51, 51));
        updateStudent.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        updateStudent.setForeground(new java.awt.Color(255, 255, 255));
        updateStudent.setText("View  Student");
        updateStudent.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        updateStudent.setFocusable(false);
        updateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentActionPerformed(evt);
            }
        });
        jPanel1.add(updateStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 170, 50));

        updateStudentBtn.setBackground(new java.awt.Color(51, 51, 51));
        updateStudentBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        updateStudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateStudentBtn.setText("Update Student");
        updateStudentBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        updateStudentBtn.setFocusable(false);
        updateStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateStudentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 170, 50));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT RECORD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AND");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGEMENT");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SYSTEM");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 30, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 220));

        exitBtn.setBackground(new java.awt.Color(51, 51, 51));
        exitBtn.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        exitBtn.setFocusable(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 170, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        setSize(new java.awt.Dimension(630, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBtnActionPerformed
        Add add = new Add();
        this.dispose();
        add.setVisible(true);
    }//GEN-LAST:event_addStudentBtnActionPerformed

    private void deleteStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentBtnActionPerformed
        this.dispose();
        Delete d = new Delete();
        
        d.setVisible(true);
    }//GEN-LAST:event_deleteStudentBtnActionPerformed

    private void updateStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentBtnActionPerformed
        this.dispose();
        Update up = new Update();
        up.setVisible(true);
        
    }//GEN-LAST:event_updateStudentBtnActionPerformed

    private void updateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentActionPerformed
        this.dispose();
        view v = new view();
        v.setVisible(true);
    }//GEN-LAST:event_updateStudentActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Message", JOptionPane.OK_CANCEL_OPTION);
        
        if(choice == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentBtn;
    private javax.swing.JButton deleteStudentBtn;
    private javax.swing.JLabel exit;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton updateStudent;
    private javax.swing.JButton updateStudentBtn;
    // End of variables declaration//GEN-END:variables
}
