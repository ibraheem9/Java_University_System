
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;




public class Admin extends JFrame 
{
    Conection con = new Conection();
    
 
//=============================Defualt Constructor==============================    
    public Admin() 
    {
        initComponents();
        setSize(550, 480);
        setLocation(150, 70);
        setResizable(false);
        setDefaultCloseOperation(0);
        
        background.setIcon(new ImageIcon("admin.jpg"));
        back.setIcon(new ImageIcon("back.png"));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        top = new javax.swing.JTextField();
        click = new javax.swing.JButton();
        change = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        pnp = new javax.swing.JPasswordField();
        pcnp = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        student = new javax.swing.JMenu();
        registerStudent = new javax.swing.JMenuItem();
        updateStudent = new javax.swing.JMenuItem();
        deleteStudent = new javax.swing.JMenuItem();
        searchStudent = new javax.swing.JMenuItem();
        courseForStudent = new javax.swing.JMenuItem();
        course = new javax.swing.JMenu();
        addCourse = new javax.swing.JMenuItem();
        updateCourse = new javax.swing.JMenuItem();
        deleteCourse = new javax.swing.JMenuItem();
        searchCourse = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(250, 330, 70, 60);

        jLabel1.setText("Old Password");
        jLabel1.setVisible(false);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 180, 110, 24);

        jLabel2.setText("New Password");
        jLabel2.setVisible(false);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 220, 110, 24);

        jLabel3.setText("Confirm New Password");
        jLabel3.setVisible(false);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 260, 140, 24);

        top.setVisible(false);
        getContentPane().add(top);
        top.setBounds(300, 180, 127, 24);

        click.setBackground(new java.awt.Color(0, 255, 255));
        click.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        click.setForeground(new java.awt.Color(255, 0, 0));
        click.setText("Click here to change your data");
        click.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        click.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickActionPerformed(evt);
            }
        });
        getContentPane().add(click);
        click.setBounds(180, 70, 230, 30);

        change.setBackground(new java.awt.Color(0, 255, 255));
        change.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        change.setForeground(new java.awt.Color(0, 153, 0));
        change.setText("Change");
        change.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        change.setVisible(false);
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        getContentPane().add(change);
        change.setBounds(150, 300, 80, 30);

        cancel.setBackground(new java.awt.Color(0, 255, 255));
        cancel.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 0, 0));
        cancel.setText("Cancel");
        cancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel.setVisible(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(350, 300, 80, 30);

        pnp.setVisible(false);
        getContentPane().add(pnp);
        pnp.setBounds(300, 220, 127, 24);

        pcnp.setVisible(false);
        getContentPane().add(pcnp);
        pcnp.setBounds(300, 260, 127, 24);

        jLabel4.setVisible(false);
        jLabel4.setText("User Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 140, 110, 24);

        un.setVisible(false);
        getContentPane().add(un);
        un.setBounds(300, 140, 127, 24);

        background.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(background);
        background.setBounds(0, -20, 800, 460);

        jMenuBar.setToolTipText("");

        student.setText("Student");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });

        registerStudent.setText("Register Student");
        registerStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerStudentActionPerformed(evt);
            }
        });
        student.add(registerStudent);

        updateStudent.setText("Update Student");
        updateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentActionPerformed(evt);
            }
        });
        student.add(updateStudent);

        deleteStudent.setText("Delete Student");
        deleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentActionPerformed(evt);
            }
        });
        student.add(deleteStudent);

        searchStudent.setText("Search Student");
        searchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentActionPerformed(evt);
            }
        });
        student.add(searchStudent);

        courseForStudent.setText("Add Or Delete Course For Student");
        courseForStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseForStudentActionPerformed(evt);
            }
        });
        student.add(courseForStudent);

        jMenuBar.add(student);

        course.setText("Course");
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });

        addCourse.setText("Add Course");
        addCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseActionPerformed(evt);
            }
        });
        course.add(addCourse);

        updateCourse.setText("Update Course");
        updateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCourseActionPerformed(evt);
            }
        });
        course.add(updateCourse);

        deleteCourse.setText("Delete Course");
        deleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCourseActionPerformed(evt);
            }
        });
        course.add(deleteCourse);

        searchCourse.setText("Search Course");
        searchCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCourseActionPerformed(evt);
            }
        });
        course.add(searchCourse);

        jMenuBar.add(course);

        setJMenuBar(jMenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerStudentActionPerformed
        JFrame frame = new RegisterStudent();
        frame.setVisible(true);
        setEnabled(false);
    }//GEN-LAST:event_registerStudentActionPerformed

    private void deleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentActionPerformed
        JFrame frame = new DeleteStudent();
        frame.setVisible(true);
        setEnabled(false);
    }//GEN-LAST:event_deleteStudentActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        JFrame frame = new Main();
        frame.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void clickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickActionPerformed
       setSize(550, 480);
       jLabel1.setVisible(true);
       jLabel2.setVisible(true);
       jLabel3.setVisible(true);
       jLabel4.setVisible(true);
       un.setVisible(true);
       top.setVisible(true);
       pnp.setVisible(true);
       pcnp.setVisible(true);
       change.setVisible(true);
       cancel.setVisible(true);
       
    }//GEN-LAST:event_clickActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // عملية قرأة المدخلات
            String saveOldPass = Main.passAdmin ;
            String user= un.getText() ;
            String oldPass= top.getText() ;
            String newPass = pnp.getText() ;
            String confirmNewPass = pcnp.getText() ;
       // عملية قرأة البيانات من الملف    
        try {
            BufferedReader inputStream  ;
            PrintWriter outPutStream = null ;
             
            inputStream= new BufferedReader(new FileReader("admin.txt"));
             
              while((inputStream.readLine())!=null)
              {
                 user  = inputStream.readLine();
                 saveOldPass = inputStream.readLine();
              }
      //     عملية كتابة البيانات على الملف
            if(oldPass.equals(saveOldPass)&&newPass.equals(confirmNewPass))
            {
                try
                {
                    outPutStream= new PrintWriter(new FileWriter("admin.txt"));
                    outPutStream.println(un.getText());
                    outPutStream.println(oldPass);
                    outPutStream.println(newPass);
                }
                catch (FileNotFoundException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }            
                finally
                {
                    if(outPutStream!=null)
                    {
                        outPutStream.close();
                    }
                }
                JOptionPane.showMessageDialog(null, "Password was changed successfully", "Confirmation message",1);
            }
            if(!oldPass.equals(saveOldPass))
            {
                 JOptionPane.showMessageDialog(null, "The old password is incorrect", "Error message",0);
            }
            else
            if(!newPass.equals(confirmNewPass))
            {
                 JOptionPane.showMessageDialog(null, "No match in the new password", "Error message",0);
            }
         
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
       un.setText(null);
       top.setText(null);
       pnp.setText(null);
       pcnp.setText(null);
    }//GEN-LAST:event_changeActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       jLabel1.setVisible(false);
       jLabel2.setVisible(false);
       jLabel3.setVisible(false);
       jLabel4.setVisible(false);
       un.setVisible(false);
       top.setVisible(false);
       pnp.setVisible(false);
       pcnp.setVisible(false);
       change.setVisible(false);
       cancel.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void updateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCourseActionPerformed
        JFrame frame = new UpdateCourse();
        frame.setVisible(true);
        setEnabled(false);
    }//GEN-LAST:event_updateCourseActionPerformed

    private void addCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseActionPerformed
      JFrame frame = new AddCourse();
      frame.setVisible(true);
      setEnabled(false);
    }//GEN-LAST:event_addCourseActionPerformed

    private void deleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCourseActionPerformed
      JFrame frame = new DeleteCourse();
      frame.setVisible(true);
      setEnabled(false);
    }//GEN-LAST:event_deleteCourseActionPerformed

    private void updateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentActionPerformed
        new UpdateStudent().setVisible(true);
        setEnabled(false);
      
    }//GEN-LAST:event_updateStudentActionPerformed

    private void courseForStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseForStudentActionPerformed
       new AddCourseForStudent().setVisible(true);
       setEnabled(false);
    }//GEN-LAST:event_courseForStudentActionPerformed

    private void searchCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCourseActionPerformed
       new SearchCourse().setVisible(true);
       setEnabled(false);
    }//GEN-LAST:event_searchCourseActionPerformed

    private void searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentActionPerformed
       new SearchStudent().setVisible(true);
       setEnabled(false);
    }//GEN-LAST:event_searchStudentActionPerformed
    
    
    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        //con.control();
    }//GEN-LAST:event_studentActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
       // con.control();
    }//GEN-LAST:event_courseActionPerformed
   
   
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuItem addCourse;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JButton cancel;
    private javax.swing.JButton change;
    private javax.swing.JButton click;
    private javax.swing.JMenu course;
    public static javax.swing.JMenuItem courseForStudent;
    public static javax.swing.JMenuItem deleteCourse;
    public static javax.swing.JMenuItem deleteStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPasswordField pcnp;
    private javax.swing.JPasswordField pnp;
    public static javax.swing.JMenuItem registerStudent;
    public static javax.swing.JMenuItem searchCourse;
    public static javax.swing.JMenuItem searchStudent;
    private javax.swing.JMenu student;
    private javax.swing.JTextField top;
    private javax.swing.JTextField un;
    public static javax.swing.JMenuItem updateCourse;
    public static javax.swing.JMenuItem updateStudent;
    // End of variables declaration//GEN-END:variables
}
