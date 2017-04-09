package behavioral.pattern;
public class UnderMaintenance implements CourseManagementSystemState
{
    CourseManagementSystem courseManagementSystem;

    public UnderMaintenance(CourseManagementSystem system)
    {
        courseManagementSystem = system;
    }

    public void uploadAssignment(String courseNumber)
    {
        System.out.println("You can't upload an assignment to this course. The system is Under Maintenane!");
    }

    public void viewCourseNotes(String courseNumber)
    {
        System.out.println("You can't view course notes for this course. The system is Under Maintenane!");
    }

    public void uploadCourseMaterial(String courseNumber)
    {
        System.out.println("You can't upload course materials to this course. The system is Under Maintenane!");
    }

    public void postCourseAnnouncement(String courseNumber)
    {
        System.out.println("You can't post an annoucement for this course. The system is Under Maintenane!");
    }

    public void updateCourseInformation(String courseNumber)
    {
        System.out.println("The course information for " + courseNumber + " has been updated.");
    }

    public void removeCourse(String courseNumber)
    {
        System.out.println("The course --- " + courseNumber + " has been removed from the system.");
    }
}
