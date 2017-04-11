package behavioral.pattern;
import java.text.ParseException;


public class BehavioralPattern {

    /**
     * @param args the command line arguments
     * @throws ParseException 
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        System.out.println("Creating a new Course Management System");
        
        CourseManagementSystem courseManagementSystem = new CourseManagementSystem();
        
        courseManagementSystem.uploadAssignment("6234");
        courseManagementSystem.uploadCourseMaterial("6234");
        courseManagementSystem.updateCourseInformation("6234");
        
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getClosedState());
        
        courseManagementSystem.uploadAssignment("6234");
        courseManagementSystem.uploadCourseMaterial("6234");
        courseManagementSystem.updateCourseInformation("6234");
        
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getMaintenanceState());
        
        courseManagementSystem.uploadAssignment("6234");
        courseManagementSystem.uploadCourseMaterial("6234");
        courseManagementSystem.updateCourseInformation("6234");
        
        
        
    }
    
}