
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class UpdateCourse extends JFrame 
{
    Conection con = new Conection();
    ArrayList<CourseData> updatedCourse = new ArrayList<>();
    String []day,time;
    int hour;
    
     
    public UpdateCourse()
    {
        initComponents();
        setLocation(500, 150);
        setSize(800, 430);
        setResizable(false);
        setDefaultCloseOperation(0);
        
        //عملية القراءة من ملف الكورس وإظهار الأسماء على القائمة المنسدلة
        con.addCourseToComboBox(ccn);
         
        // عملية القراءة والتخزين في المصفوفة
        updatedCourse = con.courseReader();
         
        String days[] = {"Satrday","Sunday","Monday","Tuesday","Wednsday","Thuesday"};
        for(int i=0 ; i<days.length ; ++i)
        {
            cd1.addItem(days[i]);
            cd2.addItem(days[i]);
            cd3.addItem(days[i]);
            cd4.addItem(days[i]);
        }
        cd1.setSelectedIndex(0);
        cd2.setSelectedIndex(1);
        cd3.setSelectedIndex(2);
        cd4.setSelectedIndex(3);
        String times[] = {"8-9","9-10","10-11","11-12","12-13","13-14","14-15"};
        for(int i=0 ; i<times.length ; ++i)
        {
            ct1.addItem(times[i]);
            ct2.addItem(times[i]);
            ct3.addItem(times[i]);
            ct4.addItem(times[i]);
        }
        ct1.setSelectedIndex(0);
        ct2.setSelectedIndex(1);
        ct3.setSelectedIndex(2);
        ct4.setSelectedIndex(3);
        
        for(int c=1 ; c<5 ; ++c)
        {
            cch.addItem(c);
        }
        cch.setSelectedIndex(0);
        
        ccm.addItem("Engineering");
        ccm.addItem("Medicine");
        ccm.addItem("Pharmacy");
        ccm.addItem("Education");
        ccm.setSelectedIndex(0);
        
        updateCourse.setEnabled(false);
        
        cd1.setVisible(false);
        cd2.setVisible(false);
        cd3.setVisible(false);
        cd4.setVisible(false);
        ct1.setVisible(false);
        ct2.setVisible(false);
        ct3.setVisible(false);
        ct4.setVisible(false);
        lt1.setVisible(false);
        lt2.setVisible(false);
        lt3.setVisible(false);
        lt4.setVisible(false);
        
        updateCourse.setIcon(new ImageIcon("up.png"));
        cancel.setIcon(new ImageIcon("can.png"));
        bct.setIcon(new ImageIcon("time.png"));
        background.setIcon(new ImageIcon("updateCourseNew.jpg"));
        
         
   }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancel = new javax.swing.JButton();
        updateCourse = new javax.swing.JButton();
        ccn = new javax.swing.JComboBox();
        tcno = new javax.swing.JTextField();
        ccm = new javax.swing.JComboBox();
        tcn = new javax.swing.JTextField();
        cch = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bct = new javax.swing.JButton();
        cd2 = new javax.swing.JComboBox();
        lt4 = new javax.swing.JLabel();
        ct2 = new javax.swing.JComboBox();
        lt3 = new javax.swing.JLabel();
        lt2 = new javax.swing.JLabel();
        cd1 = new javax.swing.JComboBox();
        cd4 = new javax.swing.JComboBox();
        ct1 = new javax.swing.JComboBox();
        lt1 = new javax.swing.JLabel();
        ct4 = new javax.swing.JComboBox();
        cd3 = new javax.swing.JComboBox();
        ct3 = new javax.swing.JComboBox();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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
        cancel.setBounds(210, 320, 130, 30);

        updateCourse.setBackground(new java.awt.Color(51, 51, 51));
        updateCourse.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        updateCourse.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\up.png")); // NOI18N
        updateCourse.setText("Update ");
        updateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCourseActionPerformed(evt);
            }
        });
        getContentPane().add(updateCourse);
        updateCourse.setBounds(60, 320, 130, 30);

        getContentPane().add(ccn);
        ccn.setBounds(200, 110, 150, 30);

        tcno.setForeground(new java.awt.Color(153, 153, 153));
        tcno.setText("Course No");
        tcno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tcnoMouseClicked(evt);
            }
        });
        getContentPane().add(tcno);
        tcno.setBounds(200, 150, 150, 30);

        ccm.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        getContentPane().add(ccm);
        ccm.setBounds(200, 230, 150, 30);

        tcn.setForeground(new java.awt.Color(153, 153, 153));
        tcn.setText("Course Name");
        tcn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tcnMouseClicked(evt);
            }
        });
        getContentPane().add(tcn);
        tcn.setBounds(50, 150, 150, 30);

        cch.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        cch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cchActionPerformed(evt);
            }
        });
        getContentPane().add(cch);
        cch.setBounds(200, 190, 150, 30);

        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Select Course Major ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 230, 150, 30);

        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Select Course credit hours ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 190, 150, 30);

        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Choose course to update ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 110, 150, 30);

        bct.setBackground(new java.awt.Color(51, 51, 51));
        bct.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        bct.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\time.png")); // NOI18N
        bct.setText("Course Time");
        bct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bctActionPerformed(evt);
            }
        });
        getContentPane().add(bct);
        bct.setBounds(120, 280, 160, 30);

        cd2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(cd2);
        cd2.setBounds(550, 160, 100, 30);

        lt4.setForeground(new java.awt.Color(255, 0, 0));
        lt4.setText("Select Time 4");
        getContentPane().add(lt4);
        lt4.setBounds(470, 240, 80, 30);

        ct2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(ct2);
        ct2.setBounds(660, 160, 80, 30);

        lt3.setForeground(new java.awt.Color(255, 0, 0));
        lt3.setText("Select Time 3");
        getContentPane().add(lt3);
        lt3.setBounds(470, 200, 80, 30);

        lt2.setForeground(new java.awt.Color(255, 0, 0));
        lt2.setText("Select Time 2");
        getContentPane().add(lt2);
        lt2.setBounds(470, 160, 80, 30);

        cd1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(cd1);
        cd1.setBounds(550, 120, 100, 30);

        cd4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(cd4);
        cd4.setBounds(550, 240, 100, 30);

        ct1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(ct1);
        ct1.setBounds(660, 120, 80, 30);

        lt1.setForeground(new java.awt.Color(255, 0, 0));
        lt1.setText("Select Time 1");
        getContentPane().add(lt1);
        lt1.setBounds(470, 120, 80, 30);

        ct4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(ct4);
        ct4.setBounds(660, 240, 80, 30);

        cd3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(cd3);
        cd3.setBounds(550, 200, 100, 30);

        ct3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(ct3);
        ct3.setBounds(660, 200, 80, 30);

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\updateCourse.jpg")); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(0, 0, 800, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
         //عملية التعديل على الملف
        if(updatedCourse.isEmpty()==false)
        {
            con.courseWriter(updatedCourse);
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

    private void updateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCourseActionPerformed
      //عملية التعديل على المصفوفة
        String name = tcn.getText();
        String no = tcno.getText();
        int hour = (int)cch.getSelectedItem();
        String major = (String)ccm.getSelectedItem();
        String updatedName = (String)ccn.getSelectedItem();
        if(hour==1)
       {
          day[0]=(String)cd1.getSelectedItem();
          time[0]=(String)ct1.getSelectedItem();
       }
       else
       if(hour==2)
       {
          day[0]=(String)cd1.getSelectedItem();
          time[0]=(String)ct2.getSelectedItem();
          day[1]=(String)cd1.getSelectedItem();
          time[1]=(String)ct3.getSelectedItem();
       }
       else
       if(hour==3)
       {
          day[0]=(String)cd1.getSelectedItem();
          time[0]=(String)ct1.getSelectedItem();
          day[1]=(String)cd2.getSelectedItem();
          time[1]=(String)ct2.getSelectedItem();
          day[2]=(String)cd3.getSelectedItem();
          time[2]=(String)ct3.getSelectedItem();
       }
       else
       if(hour==4)
       {
          day[0]=(String)cd1.getSelectedItem();
          time[0]=(String)ct1.getSelectedItem();
          day[1]=(String)cd2.getSelectedItem();
          time[1]=(String)ct2.getSelectedItem();
          day[2]=(String)cd3.getSelectedItem();
          time[2]=(String)ct3.getSelectedItem();
          day[3]=(String)cd4.getSelectedItem();
          time[3]=(String)ct4.getSelectedItem();
       }
        //فكرة حذف العنصر المحدث
        for(int i=0 ; i<updatedCourse.size() ; ++i)
        {
           if(updatedName.equals(updatedCourse.get(i).getCourseName()))
           {
              CourseData course  = new CourseData(name,no,hour,major,day,time);
              updatedCourse.set(i,course);
              JOptionPane.showMessageDialog(null, "Change information has been successfully", "", 1); 
           }
        }
        ccn.removeAllItems();
        for(int i=0 ; i<updatedCourse.size() ; ++i)
        {
           ccn.addItem(updatedCourse.get(i).getCourseName());
        }
        ccn.setSelectedIndex(0);
        
        background.setIcon(new ImageIcon("updateCourseNew.jpg"));
        cd1.setVisible(false);
        cd2.setVisible(false);
        cd3.setVisible(false);
        cd4.setVisible(false);
        ct1.setVisible(false);
        ct2.setVisible(false);
        ct3.setVisible(false);
        ct4.setVisible(false);
        lt1.setVisible(false);
        lt2.setVisible(false);
        lt3.setVisible(false);
        lt4.setVisible(false);
        
        updateCourse.setEnabled(false);

        
    }//GEN-LAST:event_updateCourseActionPerformed

    private void tcnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcnoMouseClicked
        tcno.setText(null);
        tcno.setForeground(Color.black);
    }//GEN-LAST:event_tcnoMouseClicked

    private void tcnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcnMouseClicked
        tcn.setText(null);
        tcn.setForeground(Color.black);
    }//GEN-LAST:event_tcnMouseClicked

    private void cchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cchActionPerformed

    }//GEN-LAST:event_cchActionPerformed

    private void bctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bctActionPerformed
        hour = (int)cch.getSelectedItem();
        day=new String[hour];
        time=new String[hour];
        updateCourse.setEnabled(true);
        background.setIcon(new ImageIcon("updateCourse.jpg"));
        setSize(800, 430);
        if(hour==1)
        {
            cd1.setVisible(true);
            cd2.setVisible(false);
            cd3.setVisible(false);
            cd4.setVisible(false);
            ct1.setVisible(true);
            ct2.setVisible(false);
            ct3.setVisible(false);
            ct4.setVisible(false);
            lt1.setVisible(true);
            lt2.setVisible(false);
            lt3.setVisible(false);
            lt4.setVisible(false);
        }
        else
        if(hour==2)
        {
            cd1.setVisible(true);
            cd2.setVisible(true);
            cd3.setVisible(false);
            cd4.setVisible(false);
            ct1.setVisible(true);
            ct2.setVisible(true);
            ct3.setVisible(false);
            ct4.setVisible(false);
            lt1.setVisible(true);
            lt2.setVisible(true);
            lt3.setVisible(false);
            lt4.setVisible(false);
        }
        else
        if(hour==3)
        {
            cd1.setVisible(true);
            cd2.setVisible(true);
            cd3.setVisible(true);
            cd4.setVisible(false);
            ct1.setVisible(true);
            ct2.setVisible(true);
            ct3.setVisible(true);
            ct4.setVisible(false);
            lt1.setVisible(true);
            lt2.setVisible(true);
            lt3.setVisible(true);
            lt4.setVisible(false);
        }
        else
        if(hour==4)
        {
            cd1.setVisible(true);
            cd2.setVisible(true);
            cd3.setVisible(true);
            cd4.setVisible(true);
            ct1.setVisible(true);
            ct2.setVisible(true);
            ct3.setVisible(true);
            ct4.setVisible(true);
            lt1.setVisible(true);
            lt2.setVisible(true);
            lt3.setVisible(true);
            lt4.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erorr in time","Erorr",0);
        }
    }//GEN-LAST:event_bctActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UpdateCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton bct;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox cch;
    private javax.swing.JComboBox ccm;
    private javax.swing.JComboBox ccn;
    private javax.swing.JComboBox cd1;
    private javax.swing.JComboBox cd2;
    private javax.swing.JComboBox cd3;
    private javax.swing.JComboBox cd4;
    private javax.swing.JComboBox ct1;
    private javax.swing.JComboBox ct2;
    private javax.swing.JComboBox ct3;
    private javax.swing.JComboBox ct4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lt1;
    private javax.swing.JLabel lt2;
    private javax.swing.JLabel lt3;
    private javax.swing.JLabel lt4;
    private javax.swing.JTextField tcn;
    private javax.swing.JTextField tcno;
    private javax.swing.JButton updateCourse;
    // End of variables declaration//GEN-END:variables
}
