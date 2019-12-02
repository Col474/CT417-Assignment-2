import org.joda.time.DateTime;

public class Course {
	private String name;
	private Module modules[];
	private Student students[];
	private DateTime startDate;
	private DateTime endDate;
	
	public Course(String name,DateTime starDate,DateTime endDate, DateTime startDate){
	this.name  = name;
	this.startDate = startDate;
	this.endDate = endDate;
	}
	
	public String getName() {
		return name;
	}
	public Module[] getModules() {
		return modules;
	}
	public Student[] getStudents() {
		return students;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
}


