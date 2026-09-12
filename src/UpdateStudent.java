
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class UpdateStudent extends JFrame 
{
    Conection con = new Conection() ;
    ArrayList <StudentData> updatedStudent = new ArrayList <>()  ;
    
    public UpdateStudent() {
        initComponents();
        setLocation(500, 150);
        setSize(605, 427);
        setResizable(false);
        setDefaultCloseOperation(0);
        // عملية إظهار أسماء الطلاب على القائمة المنسدلة
        con.addStudentToComboBox(csn);
        
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
        
        updateStudent.setIcon(new ImageIcon("up.png"));
        cancel.setIcon(new ImageIcon("can.png"));
        background.setIcon(new ImageIcon("updateStudent.jpg"));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateStudent = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        csn = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tm = new javax.swing.JTextField();
        cd = new javax.swing.JComboBox();
        cm = new javax.swing.JComboBox();
        cy = new javax.swing.JComboBox();
        tp = new javax.swing.JPasswordField();
        tfn = new javax.swing.JTextField();
        tid = new javax.swing.JTextField();
        ccm = new javax.swing.JComboBox();
        tln = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        updateStudent.setBackground(new java.awt.Color(51, 51, 51));
        updateStudent.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        updateStudent.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\up.png")); // NOI18N
        updateStudent.setText("Update ");
        updateStudent.setBorder(null);
        updateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentActionPerformed(evt);
            }
        });
        getContentPane().add(updateStudent);
        updateStudent.setBounds(160, 320, 120, 30);

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
        cancel.setBounds(300, 320, 100, 30);

        csn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        getContentPane().add(csn);
        csn.setBounds(200, 80, 150, 25);

        jLabel2.setForeground(new java.awt.Color(102, 255, 102));
        jLabel2.setText("DOB");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 270, 50, 30);

        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("Your Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 190, 130, 30);

        tm.setBackground(new java.awt.Color(0, 153, 255));
        tm.setForeground(new java.awt.Color(0, 0, 153));
        tm.setText("Mobile number");
        tm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmMouseClicked(evt);
            }
        });
        getContentPane().add(tm);
        tm.setBounds(280, 230, 130, 30);

        cd.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        getContentPane().add(cd);
        cd.setBounds(350, 270, 55, 30);

        cm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(cm);
        cm.setBounds(290, 270, 55, 30);

        cy.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        getContentPane().add(cy);
        cy.setBounds(200, 270, 80, 30);

        tp.setBackground(new java.awt.Color(0, 153, 255));
        tp.setForeground(new java.awt.Color(0, 0, 153));
        getContentPane().add(tp);
        tp.setBounds(280, 190, 130, 30);

        tfn.setBackground(new java.awt.Color(0, 153, 255));
        tfn.setForeground(new java.awt.Color(0, 0, 153));
        tfn.setText("First Name");
        tfn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfnMouseClicked(evt);
            }
        });
        getContentPane().add(tfn);
        tfn.setBounds(140, 150, 130, 30);

        tid.setBackground(new java.awt.Color(0, 153, 255));
        tid.setForeground(new java.awt.Color(0, 0, 153));
        tid.setText("Enter here your id");
        tid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tidMouseClicked(evt);
            }
        });
        getContentPane().add(tid);
        tid.setBounds(200, 110, 150, 30);

        ccm.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        getContentPane().add(ccm);
        ccm.setBounds(140, 230, 130, 30);

        tln.setBackground(new java.awt.Color(0, 153, 255));
        tln.setForeground(new java.awt.Color(0, 0, 153));
        tln.setText("Last Name");
        tln.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tlnMouseClicked(evt);
            }
        });
        getContentPane().add(tln);
        tln.setBounds(280, 150, 130, 30);

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\updateStudent.jpg")); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        //عملية التعديل على الملف
        if(updatedStudent.isEmpty()==false)
        {
            con.studentWriter(updatedStudent);
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

    private void updateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentActionPerformed
      // عملية القراءة والتخزين في المصفوفة
        updatedStudent = con.studentReader();
       
     //عملية التعديل على المصفوفة
         int ss = (int)csn.getSelectedItem();
         for(int i=0 ; i<updatedStudent.size() ; ++i)
         {
             if(ss==updatedStudent.get(i).getStudentId())
             {
                 try
                 {
                    int id=Integer.parseInt(tid.getText()) ;
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
                     updatedStudent.set(i,student);
                     JOptionPane.showMessageDialog(null, "Change information has been successfully", "", 1);  
                 }
                 catch(NumberFormatException | HeadlessException e)
                 {
                      JOptionPane.showMessageDialog(null, "Id Of Student Can not Be String ", "Erorr ", 0);
                      --i;
                 }
          
             }
         }
         csn.removeAllItems();
         for(int i=0 ; i<updatedStudent.size() ; ++i)
         {
             csn.addItem(updatedStudent.get(i).getStudentId());
         }
         csn.setSelectedIndex(0);
         
    }//GEN-LAST:event_updateStudentActionPerformed

    private void tmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmMouseClicked
        tm.setText(null);
        tm.setForeground(Color.black);
    }//GEN-LAST:event_tmMouseClicked

    private void tfnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfnMouseClicked
        tfn.setText(null);
        tfn.setForeground(Color.black);
    }//GEN-LAST:event_tfnMouseClicked

    private void tidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tidMouseClicked
        tid.setText(null);
        tid.setForeground(Color.black);
    }//GEN-LAST:event_tidMouseClicked

    private void tlnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tlnMouseClicked
        tln.setText(null);
        tln.setForeground(Color.black);
    }//GEN-LAST:event_tlnMouseClicked

  
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
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new UpdateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox ccm;
    private javax.swing.JComboBox cd;
    private javax.swing.JComboBox cm;
    public static javax.swing.JComboBox csn;
    private javax.swing.JComboBox cy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfn;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tln;
    private javax.swing.JTextField tm;
    private javax.swing.JPasswordField tp;
    private javax.swing.JButton updateStudent;
    // End of variables declaration//GEN-END:variables
}
