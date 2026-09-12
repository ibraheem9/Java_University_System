import java.io.Serializable;
import java.util.ArrayList;


public class StudentData implements Serializable 
{
     int id ;
     String firstName;
     String lastName;
     String pass;
     int year;
     int month;
     int day;
     String studentMajor;
     int mobile;
     String tabel[][];
     
     ArrayList<CourseData> courseList= new ArrayList<>();
    
    public StudentData(int id,String firstName,String lastName,String pass,
            int year,int month,int day ,String studentMajor,int mobile) 
    {
        this.id = id;
        this.firstName=firstName;
        this.lastName =lastName;
        this.pass=pass;
        this.year=year;
        this.month=month;
        this.day=day;
        this.studentMajor=studentMajor;
        this.mobile=mobile;
    }
    public StudentData(int id, ArrayList<CourseData> courseList) 
    {
        this.id = id ;
        this.courseList = courseList;
    }
    
    
    
//=================================Seter Method=================================
     public void setStudentFirstName(String n)
     {
          firstName=n ;
     }
     public void setStudentId(int i)
     {
          id=i ;
     }
     public void setStudentPass(String p)
     {
         pass = p;
     }
 //=================================Geter Method=================================
     
    public String getStudentFirstName() 
    {
       return firstName; 
    }
    public String getStudentLastName() 
    {
       return lastName; 
    }
    public int getStudentId() 
    {
       return id ; 
    }
    public String getStudentPass() 
    {
       return pass ; 
    }
    public ArrayList getStudentCourseList() 
    {
       return courseList ; 
    }
    public String getStudentMajor() 
    {
       return studentMajor; 
    }
    public int getStudentMobile() 
    {
       return mobile; 
    }
    public String getStudentDOB() 
    {
       return year+"/"+month+"/"+day; 
    }
   
    
     
}
