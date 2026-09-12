
import java.io.Serializable;

public class CourseData implements Serializable 
{
    String name ;
    String id;
    int courseHours ;
    String courseMajor;
    String day[];
    String time[];
    
 //=============================Defualt Constructor==============================   
   public CourseData(String name,String id,int courseHours,
           String courseMajor,String day[],String time[])
   {
         this.name = name;
         this.id = id;
         this.courseHours = courseHours;
         this.courseMajor=courseMajor;
         this.day=day;
         this.time=time;
   }
    
//=================================Geter Method=================================
   public void setCourseTime(String day[],String time[])
   {
       this.day=day;
       this.time=time;
   }
   public String getCourseName()
   {
       return name;
   }
   public int getCourseHour()
   {
       return courseHours;
   }
   public String getCourseId()
   {
       return id;
   }
   public String getCourseMajor()
   {
       return courseMajor;
   }
   public String[] getCourseDay()
   {
       return day;
   }
   public String[] getCourseTime()
   {
       return time;
   }
   
   
  

}
