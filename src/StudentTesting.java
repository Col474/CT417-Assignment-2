import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;

class StudentTesting {
	    DateTime sampleDOB = new DateTime(1996, 07, 22, 4, 20);
	    
	    DateTime startDate = new DateTime(2017, 9, 1, 0, 0);
	    DateTime endDate = new DateTime(2018, 4, 30, 0, 0);
	    
	    Student student1 = new Student("Rick Sanchez",21, 18, sampleDOB);
	    Student student2 = new Student("Morty Smith",22, 12, sampleDOB);
	    Student student3 = new Student("Jerry Smith",19, 90, sampleDOB);
	    
	    Module module1 = new Module("Programming 3", "CT101");
	    Module module2 = new Module("Software Engineering 3", "CS102");
	    
	    Course course1 = new Course("CS&IT", startDate, endDate);
	    Course course2 = new Course("BCT", startDate, endDate);
	    
	    public StudentTesting() {
	    }
	    
	    /**
	     * Test of getUserName method, of class Student.
	     */
	    @org.junit.Test
	    public void testGetUserName() {
	        System.out.println("getUserName");
	        Student instance = student1;
	        String expResult = "Rick Sanchez18";
	        String result = instance.getUserName();
	        assertEquals(expResult, result);
	    }

	    
	    // Test of getAge method, of class Student.
	    public void testGetAge() {
	        System.out.println("getAge");
	        Student instance = student1;
	        int expResult = 21;
	        int result = instance.getAge();
	        assertEquals(expResult, result);
	    }

	    //Test of addModule method, of class Student.
	    public void testAddModule() {
	        System.out.println("addModule");
	        Module module = module1;
	        Student instance = student1;
	        instance.addModule(module);
	    }

	     //Test of addCourse method, of class Student.
	    public void testAddCourse() {
	        System.out.println("addCourse");
	        Course course = course1;
	        Student instance = student1;
	        instance.addCourse(course);
	    }

	     // Test of printStudentDetails method, of class Student.
	    public void testPrintStudentDetails() {
	        System.out.println("printStudentDetails");
	        Student instance = student1;
	        student1.addCourse(course1);
	        student1.addModule(module1);
	        instance.printStudentDetails();
	    }
	}
