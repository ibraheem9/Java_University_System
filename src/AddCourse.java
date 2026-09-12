

import java.awt.BufferCapabilities;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class AddCourse extends JFrame
{  
    Conection con = new Conection();
    JTable table ;
    JScrollPane scrolPane;
    DefaultTableModel model;
    ArrayList<CourseData> addedCourse = new ArrayList<>();
    String []day,time;
    int hour;
    JLabel background;
    
    //==================Default Conctructor
    public AddCourse() 
    {   
        initComponents();
        setLocation(500, 150);
        setSize(800,530 );
        setResizable(false);
        setDefaultCloseOperation(0);
        
        String days[] = {"Satrday","Sunday","Monday","Tuesday","Wednsday","Thursday"};
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
        
        add.setEnabled(false);
        
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
        
        // عمليةالقراءة من ملف الكورس و الإضافة على المصفوفة 
           addedCourse = con.courseReader();
           
        String title[] = {"Course NO","Course Name","Course Credit","Course Major","Course Time"};
        model = new DefaultTableModel(null,title);
        table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(400,150));
        scrolPane = new JScrollPane(table);
        scrolPane.setBounds(70,330,650,150);  
        add(scrolPane);
        try
        {
            ArrayList<CourseData> c = con.courseReader();
            for(int i=0 ; i<c.size() ; ++i)
            {
                String no=c.get(i).getCourseId();
                String name=c.get(i).getCourseName() ;
                int hours=c.get(i).getCourseHour() ;
                String major=c.get(i).getCourseMajor();
                String daySave[]=c.get(i).getCourseDay();
                String timeSave[]=c.get(i).getCourseTime();
                String timesSave = "";
                for (int a=0 ; a<hours ; ++a) 
                {
                   timesSave+="**"+daySave[a]+"/"+timeSave[a];
                }
                model.addRow(new Object[]{no,name,hours,major,timesSave});
            }
        }
        catch(NullPointerException e)
        {
            
        }
        
        bct.setIcon(new ImageIcon("time.png"));
        cancel.setIcon(new ImageIcon("can.png"));
        add.setIcon(new ImageIcon("add.png"));
        background = new JLabel();
        background.setBounds(0, 0, 800, 500);
        background.setIcon(new ImageIcon("addCourseNew.jpg"));
        add(background);
        
          
     }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        tcn = new javax.swing.JTextField();
        ccm = new javax.swing.JComboBox();
        tcno = new javax.swing.JTextField();
        cch = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lt1 = new javax.swing.JLabel();
        ct4 = new javax.swing.JComboBox();
        cd4 = new javax.swing.JComboBox();
        ct1 = new javax.swing.JComboBox();
        lt2 = new javax.swing.JLabel();
        cd1 = new javax.swing.JComboBox();
        ct2 = new javax.swing.JComboBox();
        lt3 = new javax.swing.JLabel();
        cd2 = new javax.swing.JComboBox();
        ct3 = new javax.swing.JComboBox();
        cd3 = new javax.swing.JComboBox();
        lt4 = new javax.swing.JLabel();
        bct = new javax.swing.JButton();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Course");
        getContentPane().setLayout(null);

        add.setBackground(new java.awt.Color(51, 51, 51));
        add.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\add.png")); // NOI18N
        add.setText("Add Course");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(80, 260, 150, 30);

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
        cancel.setBounds(260, 260, 110, 30);

        tcn.setForeground(new java.awt.Color(153, 153, 153));
        tcn.setText("Course Name");
        tcn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tcnMouseClicked(evt);
            }
        });
        getContentPane().add(tcn);
        tcn.setBounds(70, 100, 165, 30);

        ccm.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        getContentPane().add(ccm);
        ccm.setBounds(240, 180, 130, 30);

        tcno.setForeground(new java.awt.Color(153, 153, 153));
        tcno.setText("Course No");
        tcno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tcnoMouseClicked(evt);
            }
        });
        getContentPane().add(tcno);
        tcno.setBounds(240, 100, 130, 30);

        cch.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        cch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cchActionPerformed(evt);
            }
        });
        getContentPane().add(cch);
        cch.setBounds(240, 140, 130, 30);

        jLabel2.setText("Select Course credit hours :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 140, 165, 30);

        jLabel3.setText("Select Course Major :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 180, 165, 30);

        lt1.setText("Select Time 1");
        getContentPane().add(lt1);
        lt1.setBounds(480, 110, 80, 30);

        ct4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(ct4);
        ct4.setBounds(670, 240, 80, 30);

        cd4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(cd4);
        cd4.setBounds(560, 240, 100, 30);

        ct1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(ct1);
        ct1.setBounds(670, 110, 80, 30);

        lt2.setText("Select Time 2");
        getContentPane().add(lt2);
        lt2.setBounds(480, 160, 80, 30);

        cd1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(cd1);
        cd1.setBounds(560, 110, 100, 30);

        ct2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(ct2);
        ct2.setBounds(670, 160, 80, 30);

        lt3.setText("Select Time 3");
        getContentPane().add(lt3);
        lt3.setBounds(480, 200, 80, 30);

        cd2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(cd2);
        cd2.setBounds(560, 160, 100, 30);

        ct3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(ct3);
        ct3.setBounds(670, 200, 80, 30);

        cd3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(cd3);
        cd3.setBounds(560, 200, 100, 30);

        lt4.setText("Select Time 4");
        getContentPane().add(lt4);
        lt4.setBounds(480, 240, 80, 30);

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
        bct.setBounds(140, 220, 160, 30);

        print.setBackground(new java.awt.Color(51, 51, 51));
        print.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\print.png")); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print);
        print.setBounds(420, 290, 120, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       // عملية الإضافة على المصفوفة 
       String name = tcn.getText();
       String no = tcno.getText();
       if(con.IsIdCourseExist(addedCourse, no))
       {
           JOptionPane.showMessageDialog(null, "This id is already exists,"
                        + "Please try again!!!!!","Warning",2);
                return;
       }
       hour = (int)cch.getSelectedItem();
       String major = (String)ccm.getSelectedItem();
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
       String times = "";
       for (int i=0 ; i <hour ; i++) 
       {
            times+=day[i]+"/"+time[i]+"**";
       }
       CourseData course  = new CourseData(name,no,hour,major,day,time);
       addedCourse.add(course);
       model.addRow(new Object[]{no,name,hour,major,times});
       background.setIcon(new ImageIcon("addCourseNew.jpg"));
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
       JOptionPane.showMessageDialog(null, "Add information has been successfully", "", 1);
       add.setEnabled(false);
    }//GEN-LAST:event_addActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
     //عملية الإضافة على الملف
        if(addedCourse.isEmpty()==false)
        {
            con.courseWriter(addedCourse);
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

    private void cchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cchActionPerformed
       
              
    }//GEN-LAST:event_cchActionPerformed

    private void tcnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcnMouseClicked
        tcn.setText(null);
        tcn.setForeground(Color.black);
    }//GEN-LAST:event_tcnMouseClicked

    private void tcnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcnoMouseClicked
        tcno.setText(null);
        tcno.setForeground(Color.black);
    }//GEN-LAST:event_tcnoMouseClicked

    private void bctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bctActionPerformed
        hour = (int)cch.getSelectedItem();
        day= new String[hour];
        time= new String[hour];
        add.setEnabled(true);
        background.setIcon(new ImageIcon("addCourse.jpg"));
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

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try
        {
            MessageFormat header = new MessageFormat("**page**");
            MessageFormat footer = new MessageFormat("no[1]");
            table.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        }
        catch(PrinterException ex)
        {
             JOptionPane.showMessageDialog(null, "Can not print","Warning",1);
        }
    }//GEN-LAST:event_printActionPerformed

   
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
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton bct;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox cch;
    private javax.swing.JComboBox ccm;
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
    private javax.swing.JLabel lt1;
    private javax.swing.JLabel lt2;
    private javax.swing.JLabel lt3;
    private javax.swing.JLabel lt4;
    private javax.swing.JButton print;
    private javax.swing.JTextField tcn;
    private javax.swing.JTextField tcno;
    // End of variables declaration//GEN-END:variables
}
