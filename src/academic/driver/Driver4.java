 /** 
 * @author 12S24024 Yesika Nadia Saragih
 * @author 12S24024 Yesika Nadia Saragih
 */

package academic.driver;

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Course> courseList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Enrollment> enrollmentList = new ArrayList<>();

        System.out.println("Masukkan data (course-add#... atau student-add#... atau enrollment-add#...).");
        System.out.println("Ketik '---' untuk berhenti."); // Instruksi tetap ada untuk user baru

        while (true) {
            System.out.print("> ");
            String inputLine = scanner.nextLine();

            if (inputLine.equals("---")) {
                break; // Keluar dari loop jika input adalah "---"
            }

            // Memeriksa prefix input untuk menentukan jenis entitas
            if (inputLine.startsWith("course-add#")) {
                String data = inputLine.substring("course-add#".length());
                String[] segments = data.split("#");
                if (segments.length == 4) {
                    Course course = new Course(segments[0].trim(), segments[1].trim(), segments[2].trim(), segments[3].trim());
                    courseList.add(course);
                } else {
                    System.out.println("Format input Course tidak valid.");
                }
            } else if (inputLine.startsWith("student-add#")) {
                String data = inputLine.substring("student-add#".length());
                String[] segments = data.split("#");
                if (segments.length == 4) {
                    Student student = new Student(segments[0].trim(), segments[1].trim(), segments[2].trim(), segments[3].trim());
                    studentList.add(student);
                } else {
                    System.out.println("Format input Student tidak valid.");
                }
            } else if (inputLine.startsWith("enrollment-add#")) {
                String data = inputLine.substring("enrollment-add#".length());
                String[] segments = data.split("#");
                // Enrollment memiliki 4 segmen input, grade akan otomatis 'None'
                if (segments.length == 4) {
                    Enrollment enrollment = new Enrollment(segments[0].trim(), segments[1].trim(), segments[2].trim(), segments[3].trim());
                    enrollmentList.add(enrollment);
                } else {
                    System.out.println("Format input Enrollment tidak valid.");
                }
            } else {
                System.out.println("Perintah tidak dikenal atau format salah. Gunakan 'course-add#', 'student-add#', atau 'enrollment-add#'.");
            }
        }

        System.out.println("\n--- Data Tersimpan ---");

        // Menampilkan Courses
        for (Course course : courseList) {
            System.out.println(course);
        }

        // Menampilkan Students
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Menampilkan Enrollments
        for (Enrollment enrollment : enrollmentList) {
            System.out.println(enrollment);
        }

        scanner.close(); // Menutup scanner
    }
}