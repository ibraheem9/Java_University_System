
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class DeleteStudent extends JFrame
{
      Conection con = new Conection() ;
      ArrayList <StudentData> studentDelete= new ArrayList <>()  ;
    
//=============================Defualt Constructor==============================    
    public DeleteStudent() 
    {
        initComponents();
        setLocation(500, 150);
        setSize(600, 415);
        setResizable(false);
        setDefaultCloseOperation(0);
        
        cancel.setIcon(new ImageIcon("can.png"));
        deleteStudent.setIcon(new ImageIcon("del.png"));
        background.setIcon(new ImageIcon("deleteStudent.jpg"));
        
        // عملية القراءة والتخزين في المصفوفة
        studentDelete = con.studentReader();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JTextField();
        lu = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        removeAll = new javax.swing.JButton();
        deleteStudent = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(id);
        id.setBounds(310, 150, 101, 24);

        lu.setForeground(new java.awt.Color(153, 255, 0));
        lu.setText("Student Id");
        getContentPane().add(lu);
        lu.setBounds(200, 150, 91, 24);

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
        cancel.setBounds(310, 190, 100, 30);

        removeAll.setBackground(new java.awt.Color(255, 51, 51));
        removeAll.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        removeAll.setText("Remove All");
        removeAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllActionPerformed(evt);
            }
        });
        getContentPane().add(removeAll);
        removeAll.setBounds(240, 240, 140, 30);

        deleteStudent.setBackground(new java.awt.Color(51, 51, 51));
        deleteStudent.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        deleteStudent.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\del.png")); // NOI18N
        deleteStudent.setText("Delete ");
        deleteStudent.setBorder(null);
        deleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentActionPerformed(evt);
            }
        });
        getContentPane().add(deleteStudent);
        deleteStudent.setBounds(200, 190, 100, 30);

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\deleteStudent.jpg")); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
      //عملية التعديل على الملف
        if(studentDelete.isEmpty()== false)
        {
            con.studentWriter(studentDelete);
            Main.frame.setEnabled(true);
            setVisible(false);
            dispose();
        }
        else
        {
            new File("addStudent.txt").delete();
            Main.frame.setEnabled(true);
            setVisible(false);
            dispose();  
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void deleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentActionPerformed
        
        
        //عملية التعديل على المصفوفة
         try
         {
             int sid = (int)Integer.parseInt(id.getText());
             if(!con.IsIdStudentExist(studentDelete, sid))
             {
                  JOptionPane.showMessageDialog(null, "Student Id Not Found Try Again", "Error", 0);
                  return;
             }
             if(studentDelete.size()==1)
             {
                if(studentDelete.get(0).getStudentId()==sid)
                {
                    studentDelete.set(0,null);
                    JOptionPane.showMessageDialog(null, "Information has been deleted successfully", "", 1);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Student Id Not Found Try Again", "Error", 0);
                }
            }
            else
            {
               for(int i=0 ; i<studentDelete.size() ; ++i)
               {
                   if(studentDelete.get(i).getStudentId()==sid)
                   {
                      studentDelete.remove(i);
                      JOptionPane.showMessageDialog(null, "Information has been deleted successfully", "", 1);
                   }
               }
            }
         }
         catch(NullPointerException  np )
         {
              JOptionPane.showMessageDialog(null, "No Students Add", "Warning", 2);
         }
         catch(NumberFormatException nfe)
         {
              JOptionPane.showMessageDialog(null, "Id Of Student Can not Be String ", "Erorr ", 0);
         }
         
    }//GEN-LAST:event_deleteStudentActionPerformed

    private void removeAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllActionPerformed
        if(new File("addStudent.txt").delete())
        {
        JOptionPane.showMessageDialog(null, "Information has been deleted successfully", "", 1);
        }
       
            
    }//GEN-LAST:event_removeAllActionPerformed


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
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton cancel;
    private javax.swing.JButton deleteStudent;
    private javax.swing.JTextField id;
    private javax.swing.JLabel lu;
    private javax.swing.JButton removeAll;
    // End of variables declaration//GEN-END:variables
}
