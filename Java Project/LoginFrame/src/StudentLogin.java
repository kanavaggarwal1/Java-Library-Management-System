
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */ 
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class StudentLogin extends javax.swing.JFrame {

    /**
     * Creates new form StudentLogin
     */
    public StudentLogin() {
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

        pBackground = new javax.swing.JPanel();
        lLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbPRN = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        btLogin = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jprn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pBackground.setBackground(new java.awt.Color(0, 153, 153));
        pBackground.setBorder(new javax.swing.border.MatteBorder(null));

        lbPRN.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        lbPRN.setText("Enter Name");

        jname.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        btLogin.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        btReset.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        jLabel1.setText("Enter PRN");

        jprn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jprn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jButton1.setText("Dashboard");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(btLogin)
                        .addGap(28, 28, 28)
                        .addComponent(btReset)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPRN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jname)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jprn))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbPRN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jprn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLogin)
                    .addComponent(btReset)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout pBackgroundLayout = new javax.swing.GroupLayout(pBackground);
        pBackground.setLayout(pBackgroundLayout);
        pBackgroundLayout.setHorizontalGroup(
            pBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pBackgroundLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        pBackgroundLayout.setVerticalGroup(
            pBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBackgroundLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lLogo)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
static int init() {
		Connection con=connect();
		try {
			Statement statement=con.createStatement();

        int resultSet = statement.executeUpdate(
            "create database IF NOT EXISTS library ;");
        resultSet = statement.executeUpdate("use library;");
        resultSet = statement.executeUpdate(
                "create table IF NOT EXISTS books(sl_no int PRIMARY KEY auto_increment,title varchar(50) Unique,Total_Copies int, Available_Copies int) ;");
//we cant add books and students name here. because the table wont be created if it already exists. but the same records will be added even 
        //exists
        resultSet = statement.executeUpdate(
                "create table IF NOT EXISTS students(PRN int PRIMARY KEY, Name varchar(100), Branch char(10), Borrowed int, Fine int ) ;");
        resultSet = statement.executeUpdate(
                "create table IF NOT EXISTS borrowed(PRN int,sl_no int,DOI date,FOREIGN KEY(PRN) REFERENCES students(PRN),FOREIGN KEY (sl_no) REFERENCES books(sl_no));");
        resultSet = statement.executeUpdate(
                "create table IF NOT EXISTS date(updatedate date);");
        resultSet=statement.executeUpdate(
                "create table IF NOT EXISTS pwd(pswd varchar(20));");
        statement.executeUpdate(
                "delete from pwd;");
        statement.executeUpdate(
                "insert into pwd values('123456');");
        
        ResultSet r;
        r=statement.executeQuery("select prn from students;");
        int rno[]= new int[10];
        int i=0;
        while(r.next()) {
        	rno[i]=r.getInt("prn");
        	
        	i++;
        }
		for(int a=0;a<i+1;a++) {
			resultSet=statement.executeUpdate("Update students,date,borrowed set fine=fine+100 where students.prn="+rno[a]+" and borrowed.prn="+rno[a]+" and updatedate<curdate() and DATEDIFF(curdate(),DOI)>7; ");
        }
        r=statement.executeQuery("Select * from date;");
        java.sql.Date da = null;
        while(r.next()) {
        	da = r.getDate("updatedate");
        }
        
        System.out.println(da);
        resultSet=statement.executeUpdate("delete from date;");
        resultSet = statement.executeUpdate(
                "insert into date values(Curdate() ) ;");
        resultSet=statement.executeUpdate("insert ignore into books(title,Total_Copies,Available_Copies) values('Percy Jackson and the Lightning Thief',3,3);");
        resultSet=statement.executeUpdate("insert ignore into books(title,Total_Copies,Available_Copies) values('Percy Jackson and the Sea of Monsters',1,1);");
        resultSet=statement.executeUpdate("insert ignore into students values(72,'Kandarp','CS',0,0);");
        resultSet=statement.executeUpdate("insert ignore into students values(66,'Jeff','CS',0,0);");
        
        
		}catch (Exception ex) {
			ex.printStackTrace();
			//throw new RuntimeException("unhandled", ex);
        }
		
		return 0;
	}
    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        
        int flag1=0;
        boolean result=jname.getText().matches("[a-zA-Z]+");
        if(!((result) ||(jname.getText().isEmpty()))){
            JOptionPane.showMessageDialog(this, "Name should be alphabetic.");
            jname.setText("");
            flag1=1;

        }
        try{
            String PRN=jprn.getText();
            if(!PRN.isEmpty()){
                int rn=Integer.parseInt(PRN);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"PRN SHOULD BE A NUMBER");
            jprn.setText("");
            flag1=1;
        }
        int flag=0;
        String prn=jprn.getText();
        String name=jname.getText();
        
        Connection con=connect();
        Statement statement = null;
        try {
            statement = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(flag1==0){
            while(flag==0){
                try {
                    int rs=statement.executeUpdate("use library;");
                    ResultSet resultSet=statement.executeQuery("select NAME from students where PRN="+prn+";");

                    while (resultSet.next()) {
                        String name1;
                        name1=resultSet.getString("Name").trim();
                        if(name1.toLowerCase().equals(name.toLowerCase())){
                            System.out.println( " Name : "+name1);
                            flag=1;
                            StudentDashBoard stu=new StudentDashBoard();
                            this.dispose();
                            stu.main(Integer.parseInt(prn),name);
                        }
                    }
                    if(flag==0) {
                        System.out.println("NOT FOUND!!!!!!");
                        jprn.setText("");
                        jname.setText("");
                        break;
                        //here, automatically ask password for registration?

                    }
                    resultSet.close();
                    //statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
                        }
        }
        
        
    }//GEN-LAST:event_btLoginActionPerformed

    private void jprnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jprnActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginDashboard ld=new LoginDashboard();
        ld.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        });
    }
public static Connection connect() {
        //Making Database Connection once & using multiple times whenever required.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306", 
            		"root", "root");
            Statement s=con.createStatement();
            
            int rs=s.executeUpdate("Create database if not exists library ;");
            rs=s.executeUpdate("Use library;");
            return con;
        } catch (Exception ex) {
			ex.printStackTrace();
			//throw new RuntimeException("unhandled", ex);
        }
        return null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jname;
    private javax.swing.JTextField jprn;
    private javax.swing.JLabel lLogo;
    private javax.swing.JLabel lbPRN;
    private javax.swing.JPanel pBackground;
    // End of variables declaration//GEN-END:variables
}
