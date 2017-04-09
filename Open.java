package behavioral.pattern;
public class Open implements CourseManagementSystemState
{
    CourseManagementSystem courseManagementSystem;

    public Open(CourseManagementSystem system)
    {
        courseManagementSystem = system;
    }

    public void uploadAssignment(String courseNumber)
    {
        System.out.println("Student assignment for " + courseNumber + " has been uploaded.");
    }

    public void viewCourseNotes(String courseNumber)
    {
        System.out.println("The course notes for " + courseNumber + " is being displayed.");
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
        System.out.println("You can't update the course. The system is OPEN!");
    }

    public void removeCourse(String courseNumber)
    {
        System.out.println("You can't remove the course. The system is OPEN!");
    }
}
