package behavioral.pattern;
public class Closed implements CourseManagementSystemState
{
    CourseManagementSystem courseManagementSystem;

    public Closed(CourseManagementSystem system)
    {
        courseManagementSystem = system;
    }

    public String uploadAssignment(String courseNumber)
    {
        System.out.println("You can't upload an assignment to this course. The system is CLOSED!");
        return "You can't upload an assignment to this course. The system is CLOSED!";
    }

    public String viewCourseNotes(String courseNumber)
    {
        System.out.println("You can't view course notes for this course. The system is CLOSED!");
        return "You can't view course notes for this course. The system is CLOSED!";
    }

    public String uploadCourseMaterial(String courseNumber)
    {
        System.out.println("The course notes for " + courseNumber + " has been uploaded.");
        return "The course notes for " + courseNumber + " has been uploaded.";
    }

    public String postCourseAnnouncement(String courseNumber)
    {
        System.out.println("An announcement for " + courseNumber + " has been posted.");
        return "An announcement for " + courseNumber + " has been posted.";
    }

    public String updateCourseInformation(String courseNumber)
    {
        System.out.println("You can't update the course. The system is CLOSED!");
        return "You can't update the course. The system is CLOSED!";
    }

    public String removeCourse(String courseNumber)
    {
        System.out.println("You can't remove the course. The system is CLOSED!");
        return "You can't remove the course. The system is CLOSED!";
    }
    
    public String closeCourseManagementSystem()
    {
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getClosedState());
        return "The system is already CLOSED!";
    }
    public String openCourseManagementSystem()
    {
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getOpenState());
        return "The system is now OPEN!";
    }
    public String putCourseManageMentSystemIntoMaintenance()
    {
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getMaintenanceState());
        return "The System is now Under Maintenance!";
    }
}
