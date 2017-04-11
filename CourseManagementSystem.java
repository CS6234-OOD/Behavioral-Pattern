package behavioral.pattern;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CourseManagementSystem
{
    CourseManagementSystemState open;
    CourseManagementSystemState closed;
    CourseManagementSystemState underMaintenance;

    CourseManagementSystemState systemState;
    final String registerationEndDate = "2017/05/10";

    public CourseManagementSystem( ) throws ParseException
    {
    	open = new Open(this);
        closed = new Closed(this);
        underMaintenance = new UnderMaintenance(this);
    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    	Date date = new Date();
    	Date date1 = dateFormat.parse(dateFormat.format(date));
    	Date date2 = dateFormat.parse(registerationEndDate);
    	if((date1.before(date2)) == true)
        {
            systemState = open;
            System.out.println("The Course Management System is Open!");
    	}
        else if ((date1.after(date2)) == true)
        {
            systemState = closed;
            System.out.println("The Course Management System is Closed!");
        }
        else if ((date1.equals(date2)) == true)
        {
            systemState = open;
            System.out.println("The Course Management System is Open! and it will close by the end of the day!");
        }
    }

    public void setCourseManagementSystemState(CourseManagementSystemState newSystemState)
    {
        systemState = newSystemState;
    }

    public String uploadAssignment(String courseNumber)
    {
        return systemState.uploadAssignment(courseNumber);
    }

    public String viewCourseNotes(String courseNumber)
    {
        return systemState.viewCourseNotes(courseNumber);
    }

    public String uploadCourseMaterial(String courseNumber)
    {
        return systemState.uploadCourseMaterial(courseNumber);
    }

    public String  postCourseAnnouncement(String courseNumber)
    {
        return systemState.postCourseAnnouncement(courseNumber);
    }
    
    
    public String updateCourseInformation(String courseNumber)
    {
        return systemState.updateCourseInformation(courseNumber);
    }
    
    public String removeCourse(String courseNumber)
    {
        return systemState.removeCourse(courseNumber);
    }
    
    public String closeCourseManagementSystem()
    {
        //systemState = closed;
        return systemState.closeCourseManagementSystem();
        //return "The system is now CLOSED!";
    }
    
    public String openCourseManagementSystem()
    {
        //systemState = open;
        return systemState.openCourseManagementSystem();
        //return "The system is now OPEN!";
    }
    public String putCourseManageMentSystemIntoMaintenance()
    {
        //systemState = underMaintenance;
        return systemState.putCourseManageMentSystemIntoMaintenance();
        //return "The system is already  Under Maintenance!";
    }
    
    // getters for the state
    public CourseManagementSystemState getOpenState()
    {
        return open;
    }
    
    public CourseManagementSystemState getClosedState()
    {
        return closed;
    }
    
    public CourseManagementSystemState getMaintenanceState()
    {
        return underMaintenance;
    }
   

}