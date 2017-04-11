package behavioral.pattern;
public interface CourseManagementSystemState
{
    String uploadAssignment(String courseNumber);
    String viewCourseNotes(String courseNumber);

    String uploadCourseMaterial(String courseNumber);
    String postCourseAnnouncement(String courseNumber);

    String updateCourseInformation(String courseNumber);
    String removeCourse(String courseNumber);
    
    String closeCourseManagementSystem();
    String openCourseManagementSystem();
    String putCourseManageMentSystemIntoMaintenance();
}
