
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Student extends javax.swing.JFrame {

    /**
     * Creates new form Student
     */
     Connection conn =null;
    Statement stmt = null;
    ResultSet rs = null;
    
    
    public Student() throws ClassNotFoundException {
        super ("Student");
        initComponents();
        conn = databaseConnection.connection();
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
        jLabel3 = new javax.swing.JLabel();
        stdId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        stdName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        stdAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        stdGrade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stdAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        stdFatherName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        stdphone = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        update = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        stdGender = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Id");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(99, 126, 58, 31);

        stdId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(stdId);
        stdId.setBounds(210, 126, 260, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(99, 195, 80, 22);

        stdName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(stdName);
        stdName.setBounds(210, 195, 260, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Address");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(99, 265, 93, 22);

        stdAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(stdAddress);
        stdAddress.setBounds(210, 261, 260, 31);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Grade");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(98, 322, 58, 31);

        stdGrade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(stdGrade);
        stdGrade.setBounds(210, 309, 260, 31);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Age");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(126, 383, 30, 22);

        stdAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(stdAge);
        stdAge.setBounds(210, 383, 260, 31);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(89, 459, 56, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Guardian");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(89, 550, 70, 22);

        stdFatherName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(stdFatherName);
        stdFatherName.setBounds(210, 546, 260, 31);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Contact No.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(66, 622, 93, 22);

        stdphone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(stdphone);
        stdphone.setBounds(210, 618, 260, 31);

        delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(510, 340, 102, 36);

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(501, 628, 111, 36);

        update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(510, 240, 102, 36);

        search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(510, 123, 102, 36);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Student operate");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(224, 28, 209, 53);

        stdGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(stdGender);
        stdGender.setBounds(210, 459, 260, 44);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\aaaaaaaaa\\ble.jpg")); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 630, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(650, 817));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        try{
            stmt = conn.createStatement();
             int Id = Integer.parseInt(stdId.getText());
             String sql= "DELETE FROM student WHERE Id='"+Id+"' ";
             stmt.executeUpdate(sql);
             
              setVisible(false);
              showStudent object = new showStudent();
             object.setVisible(true);

        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home object = new Home();
        object.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{
             stmt = conn.createStatement();
             int Id = Integer.parseInt(stdId.getText());
             String name = stdName.getText();
             String address = stdAddress.getText();
             int grade = Integer.parseInt(stdGrade.getText());
             int age = Integer.parseInt(stdAge.getText());
             String gender =  stdGender.getText();
             String subjects = stdFatherName.getText();
             int contact = Integer.parseInt(stdphone.getText());
             
             String sql = "UPDATE STUDENT SET name ='"+name+"', address='"+address+"', grade='"+grade+"', age='"+age+"', gender='"+gender+"', subjects='"+subjects+"', contact='"+contact+"' WHERE Id= '"+Id+"' ";
             
                  stmt.executeUpdate(sql);
                  JOptionPane.showMessageDialog(null,"Update data succsessfully");
                  
         } catch (Exception e){
             JOptionPane.showMessageDialog(null,e);
         }
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
                try{
                    stmt = conn.createStatement();
                    int Id =  Integer.parseInt(stdId.getText());
                    
                    String sql = "SELECT * FROM STUDENT WHERE Id= '"+Id+"' ";
                    rs = stmt.executeQuery(sql);
                    
                    if (rs.next()){
                        stdName.setText(rs.getString("name"));
                        stdAddress.setText(rs.getString("address"));
                        stdGrade.setText(rs.getString("grade"));
                        stdAge.setText(String.format("%s",rs.getInt("age")));
                        stdGender.setText(rs.getString("gender"));
                        stdFatherName.setText(rs.getString("subjects"));
                        stdphone.setText(String.format("%s",rs.getInt("contact")));
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Record Not Found");
                    }
                }  
                  catch (Exception e){JOptionPane.showMessageDialog(null,e);}
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton search;
    private javax.swing.JTextField stdAddress;
    private javax.swing.JTextField stdAge;
    private javax.swing.JTextField stdFatherName;
    private javax.swing.JTextField stdGender;
    private javax.swing.JTextField stdGrade;
    private javax.swing.JTextField stdId;
    private javax.swing.JTextField stdName;
    private javax.swing.JTextField stdphone;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
