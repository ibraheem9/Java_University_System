
import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class Student extends javax.swing.JFrame  {
     
    public Student() {
        initComponents();
        setSize(605,427);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
        
        message.setText("Welcome "+Main.studentName);
        
        background.setIcon(new ImageIcon("student.jpg"));
        back.setIcon(new ImageIcon("back.png"));
        printTable.setIcon(new ImageIcon("print.png"));
        addCourses.setIcon(new ImageIcon("add.png"));
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCourses = new javax.swing.JButton();
        printTable = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        addCourses.setBackground(new java.awt.Color(51, 51, 51));
        addCourses.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        addCourses.setText("Add Course");
        addCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoursesActionPerformed(evt);
            }
        });
        getContentPane().add(addCourses);
        addCourses.setBounds(360, 270, 200, 29);

        printTable.setBackground(new java.awt.Color(51, 51, 51));
        printTable.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        printTable.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\print.png")); // NOI18N
        printTable.setText("Print Table");
        printTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTableActionPerformed(evt);
            }
        });
        getContentPane().add(printTable);
        printTable.setBounds(360, 220, 200, 29);

        message.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        message.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(message);
        message.setBounds(10, 10, 250, 40);

        back.setBackground(new java.awt.Color(255, 0, 0));
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\back.png")); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(520, 0, 70, 60);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\ho.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 320, 60, 60);

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\student.jpg")); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
      JFrame frame = new Main();
      frame.setVisible(true);
      setVisible(false);
      dispose();
    }//GEN-LAST:event_backActionPerformed

    private void printTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTableActionPerformed
        new Table().setVisible(true);
        setVisible(false);
        dispose();
        
      
    }//GEN-LAST:event_printTableActionPerformed

    private void addCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoursesActionPerformed
        new StudentCourseUpdate().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_addCoursesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new DOB().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
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
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCourses;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel message;
    public static javax.swing.JButton printTable;
    // End of variables declaration//GEN-END:variables
}
