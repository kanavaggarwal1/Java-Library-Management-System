
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class ReturnBook extends javax.swing.JFrame {

    /**
     * Creates new form BorrowBook
     */
    public ReturnBook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbPRN = new javax.swing.JLabel();
        tfPRN = new javax.swing.JTextField();
        lbBook = new javax.swing.JLabel();
        tfBook = new javax.swing.JTextField();
        btReturn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG.setBackground(new java.awt.Color(0, 153, 153));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/491-4910202_law-faculty-symbiosis-international-university-pune-symbiosis.png"))); // NOI18N
        Logo.setText("jLabel1");

        lbPRN.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        lbPRN.setText("Enter PRN");

        tfPRN.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        lbBook.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        lbBook.setText("Enter a Book to Return");

        tfBook.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        btReturn.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        btReturn.setText("Return");
        btReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReturnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jButton1.setText("Show Fine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jButton2.setText("Pay Fine");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPRN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfPRN)
                            .addComponent(lbBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfBook))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                        .addComponent(btReturn)
                        .addGap(184, 184, 184)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPRN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btReturn)
                            .addComponent(jButton3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jout.setColumns(20);
        jout.setRows(5);
        jScrollPane13.setViewportView(jout);

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane13))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReturnActionPerformed
        try {
            System.out.println("Return");
            Connection c=StudentLogin.connect();
            Statement statement=c.createStatement();
            ResultSet rse=statement.executeQuery("Select borrowed.Sl_no,title,prn from borrowed,books where books.sl_no=borrowed.sl_no;");
            String sl,title,str="";
            int prn;
            str+=("Sl_no\t\tTitle\t\tPrn\n");
            while(rse.next()) {
                sl=rse.getString("sl_no");
                title=rse.getString("title");
                prn=rse.getInt("prn");
                str+=sl+"\t\t"+title+"\t\t"+prn+"\n";
            }   jout.setText(str);
            
            String rn,serial;
            rn=tfPRN.getText();
            serial=tfBook.getText();
            int fla=0,flag2=0;
            if(rn.isEmpty()||serial.isEmpty()){
                JOptionPane.showMessageDialog(this, "DO NOT LEAVE FIELDS EMPTY");
                flag2=1;
            }
            if(flag2==0){
               rse=statement.executeQuery("Select sl_no from borrowed where sl_no="+serial+" and borrowed.prn="+rn+";");
                while(rse.next()) {
                    fla=1;
                }   
                if(fla==0) {
                    System.out.println("Record does not exist!!!\n###########Try Again##########");
                }
                else {

                    int r=statement.executeUpdate("Delete from borrowed where Sl_no="+serial+" and borrowed.prn="+rn+";");
                    r=statement.executeUpdate("Update students,books set borrowed=borrowed-1  where books.sl_no="+serial+" and students.prn="+rn+";");
                    r=statement.executeUpdate("Update students,books set books.available_copies=available_copies+1 where books.sl_no="+serial+" and students.prn="+rn+";");
                    System.out.println("#############Record Deleted######");
                    JOptionPane.showMessageDialog(jPanel1, "Book Returned");


                } 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btReturnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fine = 0;
        try {
            int prn=Integer.parseInt(tfPRN.getText());
            Connection con=StudentLogin.connect();
            ResultSet resultSet2;
            Statement statement=con.createStatement();
            resultSet2 = statement.executeQuery(
                    "select fine from students where prn="+prn);

            System.out.println("No worries");

            

            while (resultSet2.next()) {
                try {
                    fine = resultSet2.getInt("fine");
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(BookTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }catch (SQLException ex) {
            Logger.getLogger(BorrowBook.class.getName()).log(Level.SEVERE, null, ex);
                    }
        jout.setText("Fine:"+Integer.toString(fine));
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String prn=tfPRN.getText();
         try {
            Connection con=StudentLogin.connect();
            ResultSet resultSet2;
            Statement statement=con.createStatement();
            resultSet2 = statement.executeQuery(
                    "Update students set fine=0 where prn="+prn);

            JOptionPane.showMessageDialog(BG, "Fine Paid");
            tfPRN.setText("");
            tfBook.setText("");

            

            
        }catch (SQLException ex) {
            Logger.getLogger(BorrowBook.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AdminDashBoard ad=new AdminDashBoard();   
        ad.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            Connection con=StudentLogin.connect();
            ResultSet resultSet2;
            Statement statement=con.createStatement();
            resultSet2 = statement.executeQuery(
                    "select * from books");
            System.out.println("No worries");
            int sl_no,prn;
            String title1,name;
            String str="";
            int tot_copies;
            int av_copies;
            while (resultSet2.next()) {
                sl_no = resultSet2.getInt("sl_no");
                title1 = resultSet2.getString("title").trim();
                tot_copies = resultSet2.getInt("Total_Copies");
                av_copies = resultSet2.getInt("Available_Copies");
                str+="Sl_No : " + sl_no + "    "
                        + " Title : " + title1+"    "
                        + "Total Copies: "+ tot_copies+"    "
                        + "Available Copies: "+av_copies+"\n";
                
            }
            
            resultSet2=statement.executeQuery("select prn,name from students;");
            
            str+="\n\n";
            while(resultSet2.next()){
                prn=resultSet2.getInt("PRN");
                name=resultSet2.getString("Name");
                str+="Prn: "+prn+"\tName: "+name+"\n";
            }
            jout.setText(str);
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btReturn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane13;
    static final javax.swing.JTextArea jout = new javax.swing.JTextArea();
    private javax.swing.JLabel lbBook;
    private javax.swing.JLabel lbPRN;
    private javax.swing.JTextField tfBook;
    private javax.swing.JTextField tfPRN;
    // End of variables declaration//GEN-END:variables
}
