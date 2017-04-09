package behavioral.pattern;
public interface CourseManagementSystemState
{
    void uploadAssignment(String courseNumber);
    void viewCourseNotes(String courseNumber);

    void uploadCourseMaterial(String courseNumber);
    void postCourseAnnouncement(String courseNumber);

    void updateCourseInformation(String courseNumber);
    void removeCourse(String courseNumber);
}
