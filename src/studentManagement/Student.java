package studentManagement;

public class Student {
	
	private int studentId;
    private String name;
    private int age;
    private String branch;
    private double marks;
    
    public Student(int studentId, String name, int age, String branch, double marks) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.branch = branch;
		this.marks = marks;
	}
    
    public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	//Display method
	public void displayDetails() {

	    System.out.println("Student ID: " + studentId);
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Branch: " + branch);
	    System.out.println("Marks: " + marks);

	}

}