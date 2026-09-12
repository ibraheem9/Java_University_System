
import java.io.* ;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Conection 
{
    FileInputStream fis;
    ObjectInputStream ois;
    FileOutputStream fos;
    ObjectOutputStream oos;
    
     
 //=========================== Admin ====================================
   
   // دالة لجلب بيانات الطالب من خلال رقمه
   public StudentData getStudentData(int id)
   {
       StudentData s = null;
       ArrayList<StudentData> studentSave = studentReader();
       for (int i=0; i < studentSave.size() ; i++) 
       {
           if(id==studentSave.get(i).getStudentId())
           {
               s=studentSave.get(i);
           }
       }
        return s;
   }
   
   
   
   //دالة لجلب مواد التخصص للطالب 
   public ArrayList<CourseData> getCousrseListForMajor(int id)
   {
       String major = getStudentData(id).getStudentMajor();
       ArrayList<CourseData> courseSave = courseReader();
       ArrayList<CourseData> courseList = new ArrayList<>();
       for (int i=0; i<courseSave.size() ; ++i) 
       {
          if(courseSave.get(i).getCourseMajor().equals(major)) 
          {
             courseList.add(courseSave.get(i)); 
          }
       }
       return courseList;
   }
   
   //دالة لجلب مواد التخصص 
   public ArrayList<CourseData> getCousrseListForMajor(String major)
   {
       ArrayList<CourseData> courseSave = courseReader();
       ArrayList<CourseData> courseList = new ArrayList<>();
       for (int i=0; i<courseSave.size() ; ++i) 
       {
          if(courseSave.get(i).getCourseMajor().equals(major)) 
          {
             courseList.add(courseSave.get(i)); 
          }
       }
       return courseList;
   }
   
   // دالة لجلب مواد الطالب
   public ArrayList<CourseData> getCousrseListForStudent(int id)
   {
       ArrayList<StudentData> savedCourses = studentCourseReader();
       ArrayList<CourseData> courseList =new ArrayList<>();
       for (int i=0; i < savedCourses.size() ; i++) 
       {
          if(savedCourses.get(i).getStudentId()==id) 
          {
             courseList=savedCourses.get(i).getStudentCourseList(); 
          }
       }
       return courseList;
   }
   
   // دالة لجلب بيانات المادة
   public CourseData getCourseData(String id)
   {
       CourseData c = null;
       ArrayList<CourseData> courseSave = courseReader();
       for (int i=0; i < courseSave.size() ; i++) 
       {
           if(id.equals(courseSave.get(i).getCourseId()))
           {
               c=courseSave.get(i);
           }
       }
       return c;
   }
   // دالة فحص تسجيل المواد
   public String[] isRegister(int id,ArrayList<CourseData> c)
   {
       ArrayList<CourseData> majorCourse = getCousrseListForMajor(id);
       
       String r[] = new String[majorCourse.size()];
       
       for(int i=0 ; i<majorCourse.size() ; ++i)
       {
           boolean b=true;
           for(int j=0 ; j<c.size() ; ++j)
           {
               if(majorCourse.get(i).getCourseId().equals(c.get(j).getCourseId()))
               { r[i]="Register"; b=false; }   
           }
           if(b){ r[i]="Not Register"; }
       }
       return r;
   }
   // دالة لتحديث جدول التسجيل لدى الطالب فور الضغط على أزرار الإضافة والحدف
   public void refrech(int ids,DefaultTableModel model,ArrayList<CourseData> s,ArrayList<CourseData> m)
   {
       String r[] = isRegister(ids, s);
        int c=0;
        while(model.getRowCount()!=0)
        {
            model.removeRow(c);
        }
        m= getCousrseListForMajor(ids);
        for(int i=0 ; i<m.size() ; ++i)
        {
            String idc=m.get(i).getCourseId();
            String name=m.get(i).getCourseName() ;
            int hour=m.get(i).getCourseHour() ;
            String major=m.get(i).getCourseMajor();
            String day[]=m.get(i).getCourseDay();
            String time[]=m.get(i).getCourseTime();
            String times = "";
            for (int t=0 ; t<hour ; ++t) 
            {
               times+="**"+day[t]+"/"+time[t];
            }
            model.addRow(new Object[]{idc,name,hour,major,times,r[i]});
        }
   }
   
   // دالة لجلب عدد ساعات المواد المسجلة
   public int getNoHoursRegisteration(ArrayList<CourseData> courseList)
   {
       int nh = 0;
       for(int i=0 ; i<courseList.size() ; ++i)
       {
           nh+=courseList.get(i).getCourseHour();
       }
       return nh;
   }
   
   // دالة جلب الجدول للطالب
   public String[][] getTable(int id)
   {
       String table[][]=new String[6][7];
       String days[] = {"Satrday","Sunday","Monday","Tuesday","Wednsday","Thursday"};
       String times[] = {"8-9","9-10","10-11","11-12","12-13","13-14","14-15"};
       ArrayList<CourseData> courseList = getCousrseListForStudent(id);
       for(int i=0 ; i<courseList.size() ; ++i)
       {
           int c=0;
           String t[]= courseList.get(i).getCourseTime();
           String d[]= courseList.get(i).getCourseDay();
           while(c<courseList.get(i).getCourseHour())
           {
                for(int da=0 ; da<6 ; ++da)
                {
                    for(int ti=0 ; ti<7 ; ++ti)
                    {
                        if(t[c].equals(times[ti])&&d[c].equals(days[da]))
                        {
                           table[da][ti]=courseList.get(i).getCourseName();
                        }
                    }
                }
                ++c;
           }
       }
       return table;
   }
   
   // جلب مكان تخزين مواد الطالب في المصفوفة
   public int getIndexForStudentCourses(int id)
   {
       ArrayList<StudentData> savedCourses = studentCourseReader();
       for (int i=0; i < savedCourses.size() ; i++) 
       {
          if(savedCourses.get(i).getStudentId()==id) 
          {
             return i; 
          }
       }
       return -1;
   }
   
   // جلب مكان المادة في مصفوفة مواد الطالب
   public int getIndexForMajorCourse(String id,int ids,ArrayList<CourseData> c)
   {
       for (int i=0; i < c.size() ; ++i) 
       {
          if(c.get(i).getCourseId().equals(id)) 
          {
             return i; 
          }
       }
       return -1;
   }
   
   // للتحكم بقابلية الأزرار للتأثر بالحدث 
   /*public void control()
   {
       if(isFileExist("addStudent.txt"))
       {
            Admin.registerStudent.setEnabled(true);
            Admin.updateStudent.setEnabled(true);
            Admin.deleteStudent.setEnabled(true);
            Admin.searchStudent.setEnabled(true);
            Admin.courseForStudent.setEnabled(true);
       }
       if(isFileExist("addCourse.txt"))
       {
            Admin.addCourse.setEnabled(true);
            Admin.updateCourse.setEnabled(true);
            Admin.deleteCourse.setEnabled(true);
            Admin.searchCourse.setEnabled(true);
       }
       if(!isFileExist("addStudent.txt"))
       {
            Admin.registerStudent.setEnabled(true);
            Admin.updateStudent.setEnabled(false);
            Admin.deleteStudent.setEnabled(false);
            Admin.searchStudent.setEnabled(false);
            Admin.courseForStudent.setEnabled(false);
       }
       if(!isFileExist("addCourse.txt"))
       {
            Admin.addCourse.setEnabled(true);
            Admin.updateCourse.setEnabled(false);
            Admin.deleteCourse.setEnabled(false);
            Admin.searchCourse.setEnabled(false);
       }
    }*/
   
  
   
//=========================== student ========================================= 
   /* public boolean isFileExist(String fileName)
    { 
        try
        {  
             fis = new FileInputStream(fileName);
             ois= new ObjectInputStream(fis);
             while(true)
             {
                 try
                 {
                     Object read = ois.readObject();
                 }
                 catch (EOFException endException){ ois.close(); break ; }
             }
         } 
         catch (IOException | ClassNotFoundException ex) 
         {
            return false;
         }
         return true;
    }*/
    
    public ArrayList<StudentData> studentReader()
    { 
        ArrayList<StudentData> rs = new ArrayList<>(); 
        try
        {  
             fis = new FileInputStream("addStudent.txt");
             ois= new ObjectInputStream(fis);
             while(true)
             {
                 try
                 {
                     StudentData readStudent = (StudentData)ois.readObject();
                     rs.add(readStudent);  
                 }
                 catch (EOFException endException){ ois.close(); break ; }
             }
         } 
         catch (IOException | ClassNotFoundException ex) 
         {
             //JOptionPane.showMessageDialog(null, "File not Found","Erorr",0);
             //rs=null;
         }
         return rs ;
    }
    public void studentWriter(ArrayList<StudentData> ws)
    {
        try 
        {
            fos = new FileOutputStream("addStudent.txt");
            try 
            {
                oos = new ObjectOutputStream(fos);
                for(int s=0 ; s<ws.size() ; ++s)
                {
                    oos.writeObject(ws.get(s));
                    oos.flush();
                }
            }
            catch (IOException e){ }   
        }
        catch (FileNotFoundException e){}
    }

    public void addStudentToComboBox(JComboBox cb)
    {
       cb.removeAllItems();

       try
         {    
               fis = new FileInputStream("addStudent.txt");
               ois= new ObjectInputStream(fis);
               while(true)
               {
                   try
                   {
                       StudentData readStudent = (StudentData)ois.readObject();
                       cb.addItem(readStudent.getStudentId());  
                   }
                   catch (EOFException endException){ ois.close(); break ; }
               }
          } 
          catch (IOException | ClassNotFoundException | NullPointerException ex) 
          {
                cb.addItem("No Student Added");
                cb.setSelectedItem("No Student Added");
          }
    }

    public boolean IsIdStudentExist(ArrayList<StudentData> s,int id)
    {
       for(int i=0 ; i<s.size() ; ++i)
       {
           if(s.get(i).getStudentId()==id)
             return true;
       }
       return false; 
    }
    
    
   
//=========================== student Course ===================================  
    public ArrayList<StudentData> studentCourseReader()
    {
        ArrayList<StudentData> studentCourseList = new ArrayList<>(); 
        try
        {  
             fis = new FileInputStream("studentCourseList.txt");
             ois= new ObjectInputStream(fis);
             while(true)
             {
                 try
                 {
                     StudentData readStudent = (StudentData)ois.readObject();
                     studentCourseList.add(readStudent);  
                 }
                 catch (EOFException endException){/*ois.close();*/ break; }
             }
         } 
         catch (IOException | ClassNotFoundException ex) 
         {
             //JOptionPane.showMessageDialog(null, "File not Found","Erorr",0);
             //studentCourseList=null;
         }
         return studentCourseList ;
    }

    public void studentCourseWriter(ArrayList<StudentData> studentCourseList)
    {
        try 
        {
            fos = new FileOutputStream("studentCourseList.txt");
            try 
            {
                oos = new ObjectOutputStream(fos);
                for(int s=0 ; s<studentCourseList.size() ; ++s)
                {
                    oos.writeObject(studentCourseList.get(s));
                    oos.flush();
                }
            }
            catch (IOException e){ }   
        }
        catch (FileNotFoundException e){}
         
    }    

    
//=========================== course ===========================================   
    public ArrayList<CourseData> courseReader()
    {
        ArrayList<CourseData> rc = new ArrayList<>();
        try
          {  
               fis = new FileInputStream("addCourse.txt");
               ois= new ObjectInputStream(fis);
               while(true)
               {
                   try
                   {
                       CourseData readCourse = (CourseData)ois.readObject();
                       rc.add(readCourse);  
                   }
                   catch (EOFException endException){ /*ois.close();*/ break; }
               }
           } 
           catch (IOException | ClassNotFoundException ex) 
           {
               //rc=null;
           }

        return rc ;
    }

    public void courseWriter(ArrayList<CourseData> wc)
    {
         try 
           {
               fos = new FileOutputStream("addCourse.txt");
               try 
               {
                   oos = new ObjectOutputStream (fos);
                   for(int s=0 ; s<wc.size() ; ++s)
                   {
                       oos.writeObject(wc.get(s));
                       oos.flush();
                   }
               }
               catch (IOException e){  }   
           }
           catch (FileNotFoundException e){}
    }

    public void addCourseToComboBox(JComboBox cb)
    {
       cb.removeAllItems();
       try
         {    
               fis = new FileInputStream("addCourse.txt");
               ois= new ObjectInputStream(fis);

               while(true)
               {
                   try
                   {
                       CourseData readCourse = (CourseData)ois.readObject();
                       cb.addItem(readCourse.getCourseName());  
                   }
                   catch (EOFException endException){  break; }
               }
         } 
         catch (IOException | ClassNotFoundException | NullPointerException ex ) 
         {
             cb.addItem("No Course Added");
             cb.setSelectedItem("No Course Added");
         }
    }
    
    public boolean IsIdCourseExist(ArrayList<CourseData> c,String id)
    {
       try
       {
           for(int i=0 ; i<c.size() ; ++i)
           {
               if(c.get(i).getCourseId().equals(id))
               return true;
           }
           
       }
       catch(NullPointerException e){}
       return false; 
    }
     
 }
 
 
 