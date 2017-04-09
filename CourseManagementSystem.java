package behavioral.pattern;
public class CourseManagementSystem
{
    CourseManagementSystemState open;
    CourseManagementSystemState closed;
    CourseManagementSystemState underMaintenance;

    CourseManagementSystemState systemState;

    public CourseManagementSystem()
    {
        open = new Open(this);
        closed = new Closed(this);
        underMaintenance = new UnderMaintenance(this);

        systemState = open;
    }

    public void setCourseManagementSystemState(CourseManagementSystemState newSystemState)
    {
        systemState = newSystemState;
    }

    public void uploadAssignment(String courseNumber)
    {
        systemState.uploadAssignment(courseNumber);
    }

    public void viewCourseNotes(String courseNumber)
    {
        systemState.viewCourseNotes(courseNumber);
    }

    public void uploadCourseMaterial(String courseNumber)
    {
        systemState.uploadCourseMaterial(courseNumber);
    }

    public void postCourseAnnouncement(String courseNumber)
    {
        systemState.postCourseAnnouncement(courseNumber);
    }
    
    
    public void updateCourseInformation(String courseNumber)
    {
        systemState.updateCourseInformation(courseNumber);
    }
    
    public void removeCourse(String courseNumber)
    {
        systemState.removeCourse(courseNumber);
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
