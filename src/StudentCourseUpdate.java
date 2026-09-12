
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class StudentCourseUpdate extends javax.swing.JFrame 
{ 
    Conection con = new Conection();
    JTable table ;
    JScrollPane scrolPane;
    DefaultTableModel model;
    ArrayList<CourseData> majorCourseList,studentCourseList;
    ArrayList<StudentData> savedStudentCourses,savedStudents;
    int ids;
    
    public StudentCourseUpdate() 
    {
        initComponents();
        setSize(805,525);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
        
        savedStudents = con.studentReader();
        savedStudentCourses = con.studentCourseReader();
        majorCourseList=new ArrayList<>();
        ids=Main.studentId;
        String title[] = {"Course NO","Course Name","Course Credit","Course Major","Course Time","Is Register"};
        model = new DefaultTableModel(null,title);
        table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(400,150));
        scrolPane = new JScrollPane(table);
        scrolPane.setBounds(60,160,670,170);
        add(scrolPane);
        
        delete.setIcon(new ImageIcon("del.png"));
        save.setIcon(new ImageIcon("save.png"));
        add.setIcon(new ImageIcon("add.png"));
        back.setIcon(new ImageIcon("back.png"));
        
        JLabel background = new JLabel();
        background.setBounds(0, 0, 800, 500);
        background.setIcon(new ImageIcon("studentCourses.jpg"));
        add(background);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        display = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        tnhr = new javax.swing.JTextField();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        back.setBackground(new java.awt.Color(51, 51, 51));
        back.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\back.png")); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(670, 370, 70, 60);

        display.setBackground(new java.awt.Color(102, 102, 102));
        display.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        display.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\dis.png")); // NOI18N
        display.setText("Display");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        getContentPane().add(display);
        display.setBounds(260, 100, 120, 30);

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\del.png")); // NOI18N
        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(330, 420, 120, 30);

        add.setBackground(new java.awt.Color(51, 51, 51));
        add.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\add.png")); // NOI18N
        add.setText("add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(200, 420, 120, 30);

        tnhr.setEnabled(false);
        getContentPane().add(tnhr);
        tnhr.setBounds(270, 380, 250, 30);

        save.setBackground(new java.awt.Color(51, 51, 51));
        save.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\save.png")); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(460, 420, 120, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
      
           new Student().setVisible(true);
            setVisible(false);
            dispose(); 
       
        
    }//GEN-LAST:event_backActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        try
        {
           studentCourseList=con.getCousrseListForStudent(ids);
           tnhr.setText("["+con.getNoHoursRegisteration(studentCourseList)+"] Registered Hours"); 
        }
        catch(NullPointerException e){ tnhr.setText("0 Registered Hours");}
        if(con.courseReader()==null)
        {
            JOptionPane.showMessageDialog(null, "No Course Added","Warning",2);
        }
        else
        {
            String r[] = con.isRegister(ids, studentCourseList);
            int c=0;
            while(model.getRowCount()!=0)
            {
                model.removeRow(c);
            }
            majorCourseList=con.getCousrseListForMajor(ids);
            for(int i=0 ; i<majorCourseList.size() ; ++i)
            {
                String idc=majorCourseList.get(i).getCourseId();
                String name=majorCourseList.get(i).getCourseName() ;
                int hour=majorCourseList.get(i).getCourseHour() ;
                String major=majorCourseList.get(i).getCourseMajor();
                String day[]=majorCourseList.get(i).getCourseDay();
                String time[]=majorCourseList.get(i).getCourseTime();
                String times = "";
                for (int a=0 ; a<hour ; ++a)
                {
                    times+="**"+day[a]+"/"+time[a];
                }
                model.addRow(new Object[]{idc,name,hour,major,times,r[i]});
            }
        }

        

    }//GEN-LAST:event_displayActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int a[]=table.getSelectedRows();
        int nh=0;
        for(int i=0 ; i<a.length ; ++i)
        {
            int ind= con.getIndexForMajorCourse(majorCourseList.get(a[i]).getCourseId(), ids,studentCourseList);
            studentCourseList.remove(ind);
        }
        if(studentCourseList.isEmpty())
        {
            int index=con.getIndexForStudentCourses(ids);
            savedStudentCourses.remove(index);
        }
        nh=con.getNoHoursRegisteration(studentCourseList);
        tnhr.setText("["+nh+"] Registered Hours");
      // JOptionPane.showMessageDialog(null, studentCourseList.size());
        con.refrech(ids, model, studentCourseList, majorCourseList);
    }//GEN-LAST:event_deleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        int a[]=table.getSelectedRows();
        int nh=0;
        for(int i=0 ; i<a.length ; ++i)
        {
            studentCourseList.add(majorCourseList.get(a[i]));
        }
        nh=con.getNoHoursRegisteration(studentCourseList);
        if(nh>21)
        {
            JOptionPane.showMessageDialog(null, "You must register less than 22 hours","Warning",2);
            return;
        }
        tnhr.setText("["+nh+"] Registered Hours");
        con.refrech(ids, model, studentCourseList, majorCourseList);

    }//GEN-LAST:event_addActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        StudentData sc = new StudentData(ids,studentCourseList);
        savedStudentCourses.add(sc);
        con.studentCourseWriter(savedStudentCourses);
    }//GEN-LAST:event_saveActionPerformed

   
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
            java.util.logging.Logger.getLogger(StudentCourseUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentCourseUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentCourseUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentCourseUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentCourseUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JButton save;
    private javax.swing.JTextField tnhr;
    // End of variables declaration//GEN-END:variables
}
