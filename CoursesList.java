/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.pattern;

import javax.swing.DefaultListModel;

/**
 *
 * @author richardhsu
 */
public class CoursesList {
    
    public DefaultListModel CoursesList()
    {
        DefaultListModel courses = new DefaultListModel();
        
        Course [] coursesList = {new Course(6234, "Object-Oriented-Design"), new Course(6112, "Algorithms"), new Course(6351, "AI"), new Course(1011, "Big Data"), new Course(1113, "Discrete Math"), new Course(6331, "Cryptography"), new Course(6221, "Software Paradigms")};
        
        for (int i = 0; i < coursesList.length; i++)
        {
            courses.add(i, coursesList[i].courseNumber + ": " + coursesList[i].courseName);
        }
        return courses;
    }
    
}
