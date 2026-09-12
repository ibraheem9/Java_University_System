
import java.awt.Color;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegisterStudent extends javax.swing.JFrame 
{
    Conection con = new Conection();
    ArrayList<StudentData> registeredStudents = new ArrayList<>();
    
    public RegisterStudent() 
    {
        initComponents();
        setLocation(500, 150);
        setSize(605, 427);
        setResizable(false);
        setDefaultCloseOperation(0);
        
        for(int i=1950 ; i<2000 ; ++i)
        {
            cy.addItem(i);
        }
        cy.setSelectedItem(1990);
        for(int i=1 ; i<12 ; ++i)
        {
            cm.addItem(i);
        }
        cm.setSelectedItem(1);
        for(int i=1 ; i<31 ; ++i)
        {
            cd.addItem(i);
        }
        cd.setSelectedItem(1);
        ccm.addItem("Select Major");
        ccm.addItem("Engineering");
        ccm.addItem("Medicine");
        ccm.addItem("Pharmacy");
        ccm.addItem("Education");
        ccm.setSelectedIndex(0);
        
        
        // عمليةالقراءة من الملف و الإضافة على المصفوفة 
         registeredStudents = con.studentReader();
       
       addStudent.setIcon(new ImageIcon("add.png"));
       cancel.setIcon(new ImageIcon("can.png"));
       background.setIcon(new ImageIcon("registerStudent.jpg"));
           
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancel = new javax.swing.JButton();
        addStudent = new javax.swing.JButton();
        tid = new javax.swing.JTextField();
        tfn = new javax.swing.JTextField();
        tp = new javax.swing.JPasswordField();
        tln = new javax.swing.JTextField();
        ccm = new javax.swing.JComboBox();
        cy = new javax.swing.JComboBox();
        cd = new javax.swing.JComboBox();
        cm = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        tm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cancel.setBackground(new java.awt.Color(51, 51, 51));
        cancel.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\can.png")); // NOI18N
        cancel.setText("Cancel");
        cancel.setBorder(null);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(330, 320, 100, 30);

        addStudent.setBackground(new java.awt.Color(51, 51, 51));
        addStudent.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        addStudent.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\add.png")); // NOI18N
        addStudent.setText("Add Student");
        addStudent.setBorder(null);
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });
        getContentPane().add(addStudent);
        addStudent.setBounds(160, 320, 150, 30);

        tid.setBackground(new java.awt.Color(51, 102, 255));
        tid.setForeground(new java.awt.Color(51, 0, 0));
        tid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tid.setText("Enter here your id");
        tid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tidMouseClicked(evt);
            }
        });
        getContentPane().add(tid);
        tid.setBounds(210, 100, 150, 30);

        tfn.setBackground(new java.awt.Color(51, 102, 255));
        tfn.setForeground(new java.awt.Color(51, 0, 0));
        tfn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfn.setText("First Name");
        tfn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfnMouseClicked(evt);
            }
        });
        getContentPane().add(tfn);
        tfn.setBounds(160, 140, 130, 30);

        tp.setBackground(new java.awt.Color(51, 102, 255));
        getContentPane().add(tp);
        tp.setBounds(290, 180, 130, 30);

        tln.setBackground(new java.awt.Color(51, 102, 255));
        tln.setForeground(new java.awt.Color(51, 0, 0));
        tln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tln.setText("Last Name");
        tln.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlnMouseClicked(evt);
            }
        });
        getContentPane().add(tln);
        tln.setBounds(290, 140, 130, 30);

        ccm.setForeground(new java.awt.Color(255, 51, 51));
        ccm.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        getContentPane().add(ccm);
        ccm.setBounds(160, 220, 130, 30);

        cy.setForeground(new java.awt.Color(255, 51, 51));
        cy.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        getContentPane().add(cy);
        cy.setBounds(220, 270, 70, 30);

        cd.setForeground(new java.awt.Color(255, 51, 51));
        cd.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        getContentPane().add(cd);
        cd.setBounds(370, 270, 60, 30);

        cm.setForeground(new java.awt.Color(255, 51, 51));
        cm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(cm);
        cm.setBounds(300, 270, 60, 30);

        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setText("Your Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 180, 130, 30);

        tm.setBackground(new java.awt.Color(51, 102, 255));
        tm.setForeground(new java.awt.Color(51, 0, 0));
        tm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tm.setText("Mobile number");
        tm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmMouseClicked(evt);
            }
        });
        getContentPane().add(tm);
        tm.setBounds(290, 220, 130, 30);

        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setText("DOB");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 270, 50, 30);

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\registerStudent.jpg")); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // عملية الكتابة على الملف
        if(registeredStudents.isEmpty()== false)
        {
            con.studentWriter(registeredStudents);
            Main.frame.setEnabled(true);
            setVisible(false);
            dispose();
        } 
        else 
        {
            Main.frame.setEnabled(true);
            setVisible(false);
            dispose(); 
        }
        
    }//GEN-LAST:event_cancelActionPerformed

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        // علملية الإضافة على المصفوفة
        try
        {
            int id=Integer.parseInt(tid.getText()) ;
            if(con.IsIdStudentExist(registeredStudents, id))
            {
                JOptionPane.showMessageDialog(null, "This id is already exists,"
                        + "Please try again!!!!!","Warning",2);
                return;
            }
            String firstName=tfn.getText();
            String lastName=tln.getText();
            String pass=tp.getText();
            int year=(int)cy.getSelectedItem();
            int month=(int)cm.getSelectedItem();
            int day=(int)cd.getSelectedItem();
            String couresMajor=(String)ccm.getSelectedItem();
            int mobile=Integer.parseInt(tm.getText());
            
            StudentData student  = new StudentData(id,firstName,lastName,pass,year,
                    month,day,couresMajor,mobile);
            
            registeredStudents.add(student);
            JOptionPane.showMessageDialog(null, "Add information has been successfully", "", 1);  
         }
         catch(NumberFormatException  e)
         {
            JOptionPane.showMessageDialog(null, "Id and mobile number of student can not be string  ", "Erorr ", 0);
         }
       
    }//GEN-LAST:event_addStudentActionPerformed

    private void tidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tidMouseClicked
        tid.setText(null);
        tid.setForeground(Color.black);
    }//GEN-LAST:event_tidMouseClicked

    private void tfnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfnMouseClicked
        tfn.setText(null);
        tfn.setForeground(Color.black);
    }//GEN-LAST:event_tfnMouseClicked

    private void tlnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlnMouseClicked
        tln.setText(null);
        tln.setForeground(Color.black);
    }//GEN-LAST:event_tlnMouseClicked

    private void tmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmMouseClicked
        tm.setText(null);
        tm.setForeground(Color.black);
    }//GEN-LAST:event_tmMouseClicked

    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(RegisterStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudent;
    private javax.swing.JLabel background;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox ccm;
    private javax.swing.JComboBox cd;
    private javax.swing.JComboBox cm;
    private javax.swing.JComboBox cy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfn;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tln;
    private javax.swing.JTextField tm;
    private javax.swing.JPasswordField tp;
    // End of variables declaration//GEN-END:variables
}
