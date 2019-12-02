import java.util.ArrayList;
import org.joda.time.DateTime;


public class Student {

    private String name;
    private int age;
    private DateTime DOB;
    private int ID;
    private String userName;
    private ArrayList<Module> Modules = new ArrayList();
    private ArrayList<Course> courses = new ArrayList();


    public Student(String name, int age, int ID, DateTime DOB) {
        this.name = name;
        this.DOB = DOB;
        this.ID = ID;
        this.age = this.getAge();
        this.userName = this.getUserName();
    }

    String getUserName() {
        return name + age;
    }


    public int getAge() {
    	return age;
        
    }

     // Adds the current student to the passed module if they haven't already
     //been added
    public void addModule(Module module) {
        if (!Modules.contains(module)) {
            Modules.add(module);
            module.addStudent(this);
        }
    }

    // Adds the current student to the passed course if they haven't already
    //been added
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void printStudentDetails() {

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + ID);
        System.out.println("Username: " + userName);
        System.out.println("Courses: ");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
        System.out.println("Modules: ");
        for (Module module : Modules) {
            System.out.println(module.getModuleDetails());
        }
        System.out.println("------------------");
    }
}