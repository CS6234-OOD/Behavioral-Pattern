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
public class BehavioralPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Creating a new Course Management System");
        
        CourseManagementSystem courseManagementSystem = new CourseManagementSystem();
        
        courseManagementSystem.uploadAssignment("6234");
        courseManagementSystem.uploadCourseMaterial("6234");
        courseManagementSystem.updateCourseInformation("6234");
        
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getClosedState());
        
        courseManagementSystem.uploadAssignment("6234");
        courseManagementSystem.uploadCourseMaterial("6234");
        courseManagementSystem.updateCourseInformation("6234");
        
        courseManagementSystem.setCourseManagementSystemState(courseManagementSystem.getMaintenanceState());
        
        courseManagementSystem.uploadAssignment("6234");
        courseManagementSystem.uploadCourseMaterial("6234");
        courseManagementSystem.updateCourseInformation("6234");
        
        
    }
    
}
