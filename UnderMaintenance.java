package behavioral.pattern;
public class UnderMaintenance implements CourseManagementSystemState
{
    CourseManagementSystem courseManagementSystem;

    public UnderMaintenance(CourseManagementSystem system)
    {
        courseManagementSystem = system;
    }

    public String uploadAssignment(String courseNumber)
    {
        System.out.println("You can't upload an assignment to this course. The system is Under Maintenane!");
        return "You can't upload an assignment to this course. The system is Under Maintenane!";
    }

    public String viewCourseNotes(String courseNumber)
    {
        System.out.println("You can't view course notes for this course. The system is Under Maintenane!");
        return "You can't view course notes for this course. The system is Under Maintenane!";
    }

    public String uploadCourseMaterial(String courseNumber)
    {
        System.out.println("You can't upload course materials to this course. The system is Under Maintenane!");
        return "You can't upload course materials to this course. The system is Under Maintenane!";
    }

    public String postCourseAnnouncement(String courseNumber)
    {
        System.out.println("You can't post an annoucement for this course. The system is Under Maintenane!");
        return "You can't post an annoucement for this course. The system is Under Maintenane!";
    }

    public String updateCourseInformation(String courseNumber)
    {
        System.out.println("The course information for " + courseNumber + " has been updated.");
        //return "The course information for " + courseNumber + " has been updated.";
        return "The course information for " + courseNumber + " has been updated.";
    }

    public String removeCourse(String courseNumber)
    {
        System.out.println("The course --- " + courseNumber + " has been removed from the system.");
        //return "The course --- " + courseNumber + " has been removed from the system.";
        return "The course --- " + courseNumber + " has been removed from the system.";
    }
    
    public String closeCourseManagementSystem()
    {
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getClosedState());
        return "The system is now CLOSED!";
    }
    public String openCourseManagementSystem()
    {
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getOpenState());
        return "The system is now OPEN!";
    }
    public String putCourseManageMentSystemIntoMaintenance()
    {
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getMaintenanceState());
        return "The system is already Under Maintenance!";
    }
}
