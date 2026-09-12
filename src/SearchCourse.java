
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class SearchCourse extends javax.swing.JFrame 
{
    Conection con = new Conection();
    JTable table ;
    JScrollPane scrolPane;
    DefaultTableModel model;

    public SearchCourse() 
    {
        initComponents();
        setSize(805, 430);
        setLocation(500, 150);
        setResizable(false);
        setDefaultCloseOperation(0);
        
        String title[] = {"Course NO","Course Name","Course Credit","Course Major","Course Time"};
        model = new DefaultTableModel(null,title);
        table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(400,150));
        scrolPane = new JScrollPane(table);
        scrolPane.setBounds(70,170,650,170);
        add(scrolPane);
        back.setIcon(new ImageIcon("back.png"));
        search.setIcon(new ImageIcon("search.png"));
        JLabel background = new JLabel();
        background.setBounds(0, 0, 800, 400);
        background.setIcon(new ImageIcon("searchCourse.jpg"));
        add(background);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search = new javax.swing.JButton();
        tcno = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        search.setBackground(new java.awt.Color(51, 51, 51));
        search.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\search.png")); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        tcno.setForeground(new java.awt.Color(102, 102, 102));
        tcno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tcno.setText("Enter here course No");
        tcno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tcnoMouseClicked(evt);
            }
        });

        back.setBackground(new java.awt.Color(51, 51, 51));
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZORRO\\Documents\\NetBeansProjects\\UniversitySystem\\back.png")); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(tcno, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(431, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(287, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {search, tcno});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tcnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcnoMouseClicked
        tcno.setForeground(Color.black);
        tcno.setText(null);
    }//GEN-LAST:event_tcnoMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        CourseData c = con.getCourseData(tcno.getText());
        if(c==null)
        {
            JOptionPane.showMessageDialog(null, "This Course is not exist, Please try again","Warning",2);
            return;
        }
        String idc=c.getCourseId();
        String name=c.getCourseName() ;
        int hour=c.getCourseHour() ;
        String major=c.getCourseMajor();
        String day[]=c.getCourseDay();
        String time[]=c.getCourseTime();
        String times = "";
        for (int a=0 ; a<hour ; ++a) 
        {
           times+="**"+day[a]+"/"+time[a];
        }
        model.addRow(new Object[]{idc,name,hour,major,times});
                 
    }//GEN-LAST:event_searchActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Main.frame.setEnabled(true);
        setVisible(false);
        dispose(); 
    }//GEN-LAST:event_backActionPerformed

  
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SearchCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton search;
    private javax.swing.JTextField tcno;
    // End of variables declaration//GEN-END:variables
}
