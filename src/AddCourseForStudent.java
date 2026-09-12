
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AddCourseForStudent extends javax.swing.JFrame 
{
    Conection con = new Conection();
    JTable table ;
    JScrollPane scrolPane;
    DefaultTableModel model;
    ArrayList<CourseData> majorCourseList,studentCourseList;
    ArrayList<StudentData> savedStudentCourses,savedStudents;
    int ids;
    public AddCourseForStudent() 
    {
        initComponents();
        setSize(800,530);
        setLocation(500, 150);
        setResizable(false);
        setDefaultCloseOperation(0);
        
        savedStudents = con.studentReader();
        savedStudentCourses = con.studentCourseReader();
        majorCourseList=new ArrayList<>();
        
        String title[] = {"Course NO","Course Name","Course Credit","Course Major","Course Time","Is Register"};
        model = new DefaultTableModel(null,title);
        table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(400,150));
        scrolPane = new JScrollPane(table);
        scrolPane.setBounds(100,160,600,200);
        add(scrolPane);
        
        delete.setIcon(new ImageIcon("del.png"));
        add.setIcon(new ImageIcon("add.png"));
        save.setIcon(new ImageIcon("save.png"));
        back.setIcon(new ImageIcon("back.png"));
        JLabel background = new JLabel();
        background.setBounds(0,0,800,500);
        background.setIcon(new ImageIcon("courseStudent.jpg"));
        add(background);
        
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        display = new javax.swing.JButton();
        tid = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        tnhr = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        save = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display.setBackground(new java.awt.Color(51, 51, 51));
        display.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        display.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\dis.png")); // NOI18N
        display.setText("Display");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        tid.setForeground(new java.awt.Color(153, 153, 153));
        tid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tid.setText("Enter here your id");
        tid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tidMouseClicked(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\back.png")); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        tnhr.setForeground(new java.awt.Color(255, 0, 0));
        tnhr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tnhr.setEnabled(false);

        add.setBackground(new java.awt.Color(51, 51, 51));
        add.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\add.png")); // NOI18N
        add.setText("add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\del.png")); // NOI18N
        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(51, 51, 51));
        save.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\save.png")); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(tnhr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(tnhr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tidMouseClicked
        tid.setText(null);
        tid.setForeground(Color.black);
    }//GEN-LAST:event_tidMouseClicked

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        if(con.studentReader()==null)
        {
            JOptionPane.showMessageDialog(null, "No student added",
                   "Warning",2 );
            return;
        }
        if(con.courseReader()==null)
        {
           JOptionPane.showMessageDialog(null, "No Course added",
                   "Warning",2 ); 
           return;
        }
        ids = Integer.parseInt(tid.getText());
        if(!con.IsIdStudentExist(savedStudents, ids))
        {
            JOptionPane.showMessageDialog(null, "This Id is not found,Please try again!!",
                   "Warning",2 );
        }
        else
        {
            studentCourseList=con.getCousrseListForStudent(ids);
            tnhr.setText(con.getNoHoursRegisteration(studentCourseList)+" Registered Hours");
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
        
        }
        
    }//GEN-LAST:event_displayActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Main.frame.setEnabled(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_backActionPerformed

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
      //  JOptionPane.showMessageDialog(null, studentCourseList.size());
        con.refrech(ids, model, studentCourseList, majorCourseList);
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(AddCourseForStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCourseForStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCourseForStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCourseForStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourseForStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton save;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tnhr;
    // End of variables declaration//GEN-END:variables
}
