
public class Module {
	String moduleName;
	String ID;
	Student students[];
	Course courses[];
	
	public Module(String moduleName,String ID) {
		this.moduleName = moduleName;
		this.ID = ID;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	
	public String getID() {
		return ID;
	}
	
	public Student[] getStudents() {
		return students;
	}

	public Course[] getCourses() {
		return courses;
	}
}
