package behavioral.pattern;
public class Open implements CourseManagementSystemState
{
    CourseManagementSystem courseManagementSystem;

    public Open(CourseManagementSystem system)
    {
        courseManagementSystem = system;
    }

    public String uploadAssignment(String courseNumber)
    {
        System.out.println("Student assignment for " + courseNumber + " has been uploaded.");
        return "Student assignment for " + courseNumber + " has been uploaded.";
    }

    public String viewCourseNotes(String courseNumber)
    {
        System.out.println("The course notes for " + courseNumber + " is being displayed.");
        return "The course notes for " + courseNumber + " is being displayed.";
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
        System.out.println("You can't update the course. The system is OPEN!");
        return "You can't update the course. The system is OPEN!";
    }

    public String removeCourse(String courseNumber)
    {
        System.out.println("You can't remove the course. The system is OPEN!");
        return "You can't remove the course. The system is OPEN!";
    }
    
    public String closeCourseManagementSystem()
    {
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getClosedState());
        return "The system is now CLOSED!";
    }
    public String openCourseManagementSystem()
    {
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getOpenState());
        return "The system is already OPEN!";
    }
    public String putCourseManageMentSystemIntoMaintenance()
    {
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getMaintenanceState());
        return "The System is Under Maintenance!";
    }
}
