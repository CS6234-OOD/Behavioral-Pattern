package behavioral.pattern;
public class Closed implements CourseManagementSystemState
{
    CourseManagementSystem courseManagementSystem;

    public Closed(CourseManagementSystem system)
    {
        courseManagementSystem = system;
    }

    public void uploadAssignment(String courseNumber)
    {
        System.out.println("You can't upload an assignment to this course. The system is CLOSED!");
    }

    public void viewCourseNotes(String courseNumber)
    {
        System.out.println("You can't view course notes for this course. The system is CLOSED!");
    }

    public void uploadCourseMaterial(String courseNumber)
    {
        System.out.println("The course notes for " + courseNumber + " has been uploaded.");
    }

    public void postCourseAnnouncement(String courseNumber)
    {
        System.out.println("An announcement for " + courseNumber + " has been posted.");
    }

    public void updateCourseInformation(String courseNumber)
    {
        System.out.println("You can't update the course. The system is CLOSED!");
    }

    public void removeCourse(String courseNumber)
    {
        System.out.println("You can't remove the course. The system is CLOSED!");
    }
}
