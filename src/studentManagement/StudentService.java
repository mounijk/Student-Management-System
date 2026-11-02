package studentManagement;
import java.util.ArrayList;
//stores the indivisual student info like add,disp,search,update,delete
public class StudentService {
	ArrayList<Student> students = new ArrayList<>();
	
	public void addStudent(Student s) {

	    students.add(s);

	    System.out.println("Student added successfully!");

	}
	public void DisplayStudents() {
		//students.size arraylist
		for(int i=0;i<students.size();i++) {
			Student s = students.get(i);
			//s means index 0 daggara unna ramu ni tiskoni vadi details ni access chesthadi
	        System.out.println("Student ID: " + s.getStudentId());
	        System.out.println("Name: " + s.getName());
	        System.out.println("Age: " + s.getAge());
	        System.out.println("Branch: " + s.getBranch());
	        System.out.println("Marks: " + s.getMarks());

	        System.out.println("-------------------");

		}
	}
	public void searchStudent(int id) {

	    for (int i = 0; i < students.size(); i++) {

	        Student s = students.get(i);

	        if (s.getStudentId() == id) {

	            System.out.println("Student Found!");
	            s.displayDetails();
	            return;
	        }
	    }

	    System.out.println("Student not found!");
	}
	public void updateStudent(int id) {

	    for (int i = 0; i < students.size(); i++) {

	        Student s = students.get(i);

	        if (s.getStudentId() == id) {

	            s.setName("New Name");
	            s.setAge(23);
	            s.setBranch("CSE");
	            s.setMarks(95);

	            System.out.println("Student updated successfully!");

	            s.displayDetails();
	            return;
	        }
	    }

	    System.out.println("Student not found!");
	}
	public void deleteStudent(int id) {

	    for (int i = 0; i < students.size(); i++) {

	        Student s = students.get(i);

	        if (s.getStudentId() == id) {

	            students.remove(i);

	            System.out.println("Student deleted successfully!");

	            return;
	        }
	    }

	    System.out.println("Student not found!");
	}
}
