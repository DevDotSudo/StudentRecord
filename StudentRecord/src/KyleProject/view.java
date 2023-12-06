
package KyleProject;

import java.sql.Statement;
import java.util.Vector;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class view extends javax.swing.JFrame {

    static Add add = new Add();
    public view() {
        initComponents();
        add = new Add();
        add.connect();
        showStudent();
    }
     public void showStudent(){
        
        try{
        DefaultTableModel det =  (DefaultTableModel) jTable1.getModel();
        det.setRowCount(0);
        
        Statement s = add.con.createStatement();
        add.rs = s.executeQuery("SELECT * FROM kylestudentrecord");
        
        while(add.rs.next()){
            Vector vec = new Vector();
            
            vec.add(add.rs.getString(1));
            vec.add(add.rs.getString(2));
            vec.add(add.rs.getString(3));
            vec.add(add.rs.getString(4));
            vec.add(add.rs.getString(5));
            vec.add(add.rs.getString(6));
            vec.add(add.rs.getString(7));
            vec.add(add.rs.getString(8));
            vec.add(add.rs.getString(9));
            vec.add(add.rs.getString(10));
            
            det.addRow(vec);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backBtn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "FirstName", "MiddleName", "LastName", "Course", "Gender", "Age", "Address", "Co#", "Position"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 136, 751, 320));

        backBtn.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("< Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VIEW STUDENTS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 200, 40));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 91, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 470));

        setSize(new java.awt.Dimension(763, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
         DefaultTableModel def = (DefaultTableModel) jTable1.getModel();
        final TableRowSorter<TableModel> sor = new TableRowSorter<>(def);
          
          jTable1.setRowSorter(sor);
          
          String model = searchField.getText();
          if(model.length() == 0)
          {
              sor.setRowFilter(null);
          }
          else{
              sor.setRowFilter(RowFilter.regexFilter(model));
          }
    }//GEN-LAST:event_searchFieldKeyPressed

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
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
