import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame
{
    Conection con = new Conection();
    
    public static JFrame frame = new Admin();
    public static String passAdmin = "" ;
    public static String userAdmin = "" ;
    public static String studentName ;
    public static String doctorName ;
    public static int studentId ;
    public static int doctorId ;
    
    ArrayList<StudentData> student = new ArrayList<>();
    
    
    public Main() 
    {
        initComponents();
        setSize(800, 500);
        setLocationRelativeTo(null);
        background.setIcon(new ImageIcon("main.jpg"));
        setResizable(false);
        setDefaultCloseOperation(0);
        student = con.studentReader();
       //عملية القراءة من ملف المدير
       try 
       {        
            BufferedReader inputStream ;
            inputStream= new BufferedReader(new FileReader("admin.txt"));
                
                userAdmin = inputStream.readLine();
                inputStream.readLine();
                passAdmin = inputStream.readLine();
       } 
       catch (FileNotFoundException ex) 
       {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       } 
       catch (IOException ex) 
       {
           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
       }
       
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JComboBox();
        password = new javax.swing.JPasswordField();
        exit = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Frame");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        user.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Student" }));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(340, 170, 150, 25);
        getContentPane().add(password);
        password.setBounds(340, 250, 150, 25);

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        exit.setText("EXIT");
        exit.setBorder(null);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(380, 300, 120, 30);

        login.setBackground(new java.awt.Color(0, 153, 51));
        login.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        login.setText("LOGIN");
        login.setBorder(null);
        login.setPreferredSize(new java.awt.Dimension(80, 60));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(220, 300, 120, 30);

        jLabel2.setForeground(new java.awt.Color(102, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("User Name");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 210, 66, 25);

        jLabel1.setForeground(new java.awt.Color(102, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("PassWord");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 250, 64, 25);

        jLabel3.setForeground(new java.awt.Color(102, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Rank");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 170, 66, 25);
        getContentPane().add(un);
        un.setBounds(340, 210, 150, 25);

        background.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\main.jpg")); // NOI18N
        background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(background);
        background.setBounds(0, 0, 800, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
     

    }//GEN-LAST:event_userActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
      
      String passEnter = password.getText();
      String userSelecte = (String)user.getSelectedItem();
      String userEnter = un.getText();
      String passStudent ;
      String passDoctor  ;
      String userDoctor   ;
      
            
        if(userSelecte.equalsIgnoreCase("admin"))
        {
            if(passEnter.equals(passAdmin)&&userAdmin.equals(userEnter))
            {
                frame.setVisible(true);
                setVisible(false);
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "An error in the password or username", "Error", 0); 
            }
        }
        else
        if(userSelecte.equalsIgnoreCase("student"))
        {
            for(int i=0 ; i<student.size() ; ++i )
            {
                passStudent = student.get(i).getStudentPass();
                if(passEnter.equals(passStudent))
                {
                   studentName = student.get(i).getStudentFirstName(); 
                   studentId = student.get(i).getStudentId();  
                   new Student().setVisible(true);
                   setVisible(false);
                   dispose();
                   return;
                }
           }
           JOptionPane.showMessageDialog(null, "An error in the password or username", "Error", 0); 
        }
            
    }//GEN-LAST:event_loginActionPerformed

    
    
        
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Icon icon = new ImageIcon("g.jpg");
        JOptionPane.showMessageDialog(null, "", "Prepared By", -1, icon );
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

  
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField un;
    private javax.swing.JComboBox user;
    // End of variables declaration//GEN-END:variables
}
