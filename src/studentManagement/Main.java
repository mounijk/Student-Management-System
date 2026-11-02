
package studentManagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int id;
        boolean added = false;

        StudentService service = new StudentService();

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (!added) {
                        Student s1 = new Student(1, "Ramu", 21, "ECE", 90);
                        Student s2 = new Student(2, "Sita", 22, "CSE", 85);
                        Student s3 = new Student(3, "Ravi", 21, "IT", 78);

                        service.addStudent(s1);
                        service.addStudent(s2);
                        service.addStudent(s3);

                        added = true;
                    } else {
                        System.out.println("Students are already added!");
                    }
                    break;

                case 2:
                    service.DisplayStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();
                    service.searchStudent(id);
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();
                    service.updateStudent(id);
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();
                    service.deleteStudent(id);
                    break;

                case 6:
                    System.out.println("Exiting Student Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}

//package studentManagement;
//
//import java.util.Scanner;
//
//public class Main {
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int choice;
//	StudentService service = new StudentService();
//	do {
//
//        System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
//        System.out.println("1. Add Student");
//        System.out.println("2. Display Students");
//        System.out.println("3. Search Student");
//        System.out.println("4. Update Student");
//        System.out.println("5. Delete Student");
//        System.out.println("6. Exit");
//
//        System.out.print("Enter your choice: ");
//        choice = sc.nextInt();
//
//        switch (choice) {
//
//            case 1:
//
////	StudentService service = new StudentService();
//            
//
//                if (!added) {
//
//                    Student s1 = new Student(1, "Ramu", 21, "ECE", 90);
//                    Student s2 = new Student(2, "Sita", 22, "CSE", 85);
//                    Student s3 = new Student(3, "Ravi", 21, "IT", 78);
//
//                    service.addStudent(s1);
//                    service.addStudent(s2);
//                    service.addStudent(s3);
//
//                    added = true;
//
//                } else {
//                    System.out.println("Students are already added!");
//                }
//
//                break;
//            case 2:
//            	service.DisplayStudents();
//            	break;
//            case 3:
//            	System.out.print("Enter Student ID: ");
//                choice= sc.nextInt();
//            	service.searchStudent(choice);
//            	break;
//            case 4:
//                System.out.print("Enter Student ID: ");
//                choice = sc.nextInt();
//                service.updateStudent(choice);
//
//                break;
//            case 5:
//                System.out.print("Enter Student ID: ");
//                choice = sc.nextInt();
//                service.deleteStudent(choice);
//                break;
//            case 6:
//                System.out.println("Exiting Student Management System!");
//                break;
//
//            default:
//
//                System.out.println("Invalid choice! Try again.");
//
//        }
//
//    } while (choice != 6);
//
//    sc.close();
////	service.addStudent(s1);
////	service.addStudent(s2);
////	service.addStudent(s3);
////	
////	service.DisplayStudents();
////	service.searchStudent(2);
////	service.updateStudent(3);
////	service.deleteStudent(1);
////	service.DisplayStudents();
////	System.out.println(s1.getName());
////	System.out.println(s1.getBranch());
////	s1.displayDetails();
////	System.out.println();
////	s2.displayDetails();
////	System.out.println();
////	s3.displayDetails();
//	
//	
//	}
//}
