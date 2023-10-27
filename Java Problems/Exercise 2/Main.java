package isp.lab6.exercise1;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int id;
        int newGrade;
        String subject;


        System.out.println("Enter 1 to add a student.");
        System.out.println("Enter 2 to remove a student.");
        System.out.println("Enter 3 to update a student's information.");
        System.out.println("Enter 4 to calculate the average grade.");
        System.out.println("Enter 5 to display the list of students.");
        System.out.println("Enter 6 to exit.");
        int choice = -1;
        while (choice != 6) {
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner, students);
                    System.out.println("Student added.");
                    break;
                case 2:
                    System.out.println("Introduce the key: ");
                    id = scanner.nextInt();
                    removeStudentFromList(students, id);
                    System.out.println("Student removed.");
                    break;
                case 3:
                    System.out.println("Enter the id of the student: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the new grade: ");
                    newGrade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the subject: ");
                    subject = scanner.nextLine();
                    updateStudentGrade(students, id, subject, newGrade);
                    System.out.println("Infomation updated.");
                    break;
                case 4:
                    System.out.println("Enter the id of the student: ");
                    id = scanner.nextInt();
                    getAverageGrade(students,id);
                    break;
                case 5:
                    displayStudentList(students);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    break;

            }
        }
    }


        public static void addStudent (Scanner scanner, ArrayList < Student > students){
            System.out.print("Enter the name of the student: ");
            String name = scanner.next();

            System.out.print("Enter the ID of the student: ");
            int id = scanner.nextInt();

            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            Student student = new Student(name, id);

            for (int i = 0; i < numSubjects; i++) {
                System.out.printf("Enter the name of subject %d: ", i + 1);
                String subject = scanner.next();

                System.out.printf("Enter the grade for subject %d: ", i + 1);
                int grade = scanner.nextInt();

                student.addGrade(subject, grade);
            }

            students.add(student);
            System.out.println("Student added successfully.\n");
        }
        public static void removeStudentFromList (List < Student > studentList,int id){
            // Iterate through the list to find the student with the given ID
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getId() == id) {
                    studentList.remove(i);
                    break;
                }
            }
        }
        public static void displayStudentList (List < Student > studentList) {
            System.out.println("List of Students:");
            for (Student student : studentList) {
                System.out.println("Name: " + student.getName() + ", ID: " + student.getId() + ", Grade: " + student.getGrades());
            }
        }
        public static void updateStudentGrade (List < Student > studentList,int id, String subject,int newGrade){
            // Iterate through the list to find the student with the given ID
            for (Student student : studentList) {
                if (student.getId() == id) {
                    // Update the student's grade for the given subject and exit the loop
                    student.getGrades().put(subject, newGrade);
                    break;
                }
            }
        }
    public static double getAverageGrade(List < Student > studentList,int id) {
        double sum = 0;
        int count = 0;

        for (Student student : studentList)  {
            if (student.getId() == id) {
                {   for (int grade : student.grades.values()) {
                    sum += grade;
                    count++;
                }}
            }
    }
       double avg = sum / count;
        System.out.println("The average grade: " + avg);
        return 0;
    }


}
