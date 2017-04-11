/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.pattern;

/**
 *
 * @author richardhsu
 */
public class Course {
    
    int courseNumber;
    String courseName;
    
    public Course(int courseNumber, String courseName)
    {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
    }
    
    public int getCourseNumber()
    {
        return courseNumber;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    
}
