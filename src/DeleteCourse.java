
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class DeleteCourse extends javax.swing.JFrame 
{
    Conection con = new Conection();
    ArrayList<CourseData> saveCourse = new ArrayList<>();

    public DeleteCourse() 
    {
        initComponents();
        setLocation(500, 150);
        setSize(615, 435);
        setResizable(false);
        setDefaultCloseOperation(0);
        
        cancel.setIcon(new ImageIcon("can.png"));
        deleteCourse.setIcon(new ImageIcon("del.png"));
        background.setIcon(new ImageIcon("deleteCourse.jpg"));
        
        saveCourse = con.courseReader();
        //عملية القراءة من ملف الكورس وإظهار الأسماء على القائمة المنسدلة
        con.addCourseToComboBox(ccn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteCourse = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ccn = new javax.swing.JComboBox();
        removeAll = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        deleteCourse.setBackground(new java.awt.Color(51, 51, 51));
        deleteCourse.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        deleteCourse.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\del.png")); // NOI18N
        deleteCourse.setText("Delete ");
        deleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCourseActionPerformed(evt);
            }
        });
        getContentPane().add(deleteCourse);
        deleteCourse.setBounds(150, 190, 120, 30);

        cancel.setBackground(new java.awt.Color(51, 51, 51));
        cancel.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\can.png")); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(310, 190, 120, 30);

        jLabel1.setText("Course Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 140, 100, 30);

        ccn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        getContentPane().add(ccn);
        ccn.setBounds(270, 140, 150, 30);

        removeAll.setBackground(new java.awt.Color(255, 51, 51));
        removeAll.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        removeAll.setText("Remove All");
        removeAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllActionPerformed(evt);
            }
        });
        getContentPane().add(removeAll);
        removeAll.setBounds(210, 240, 140, 30);

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\deleteCourse.jpg")); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       //عملية التعديل على الملف
        if(saveCourse.isEmpty()==false)
        {
            con.courseWriter(saveCourse);
            Main.frame.setEnabled(true);
            setVisible(false);
            dispose();
        }
        else
        {
            new File("addCourse.txt").delete();
            Main.frame.setEnabled(true);
            setVisible(false);
            dispose();  
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void removeAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllActionPerformed
        if(new File("addCourse.txt").delete())
        {
           JOptionPane.showMessageDialog(null, "Information has been deleted successfully", "", 1); 
           ccn.removeAllItems();
           ccn.addItem("No Course Added");
           ccn.setSelectedItem("No Course Added"); 
        }
        
    }//GEN-LAST:event_removeAllActionPerformed

    private void deleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCourseActionPerformed
        String deleteCourse = (String)ccn.getSelectedItem();
        for(int i=0 ; i<saveCourse.size() ; ++i)
        {
           if(deleteCourse.equals(saveCourse.get(i).getCourseName()))
           {
              saveCourse.remove(i);
              JOptionPane.showMessageDialog(null, "Delete information has been successfully", "", 1); 
           }
        }
        ccn.removeAllItems();
        for(int i=0 ; i<saveCourse.size() ; ++i)
        {
           ccn.addItem(saveCourse.get(i).getCourseName());
        }
        try
        {
           ccn.setSelectedIndex(0); 
        }
        catch(Exception e)
        {
           ccn.addItem("No Course Added");
           ccn.setSelectedItem("No Course Added"); 
        }
        
    }//GEN-LAST:event_deleteCourseActionPerformed

   
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
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox ccn;
    private javax.swing.JButton deleteCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton removeAll;
    // End of variables declaration//GEN-END:variables
}
