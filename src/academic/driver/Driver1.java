 /** 
 * @author 12S24024 Yesika Nadia Saragih
 * @author 12S24024 Yesika Nadia Saragih
 */

package academic.driver;

import academic.model.Course; // Import kelas Course dari paket academic.model
import java.util.ArrayList;
import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Course> courseList = new ArrayList<>(); // Menggunakan ArrayList untuk penyimpanan dinamis

        System.out.println("Masukkan data course (nim#nama mata kuliah#semester#grade nilai).");
        // Baris berikut telah dihapus: System.out.println("Ketik '---' untuk berhenti.");

        while (true) {
            System.out.print("> ");
            String inputLine = scanner.nextLine();

            if (inputLine.equals("---")) {
                break; // Keluar dari loop jika input adalah "---"
            }

            // Memecah baris input berdasarkan delimiter '#'
            String[] segments = inputLine.split("#");

            // Memastikan format input benar (memiliki 4 segmen)
            if (segments.length == 4) {
                String nim = segments[0].trim();
                String courseName = segments[1].trim();
                String semester = segments[2].trim();
                String grade = segments[3].trim();

                // Membuat objek Course dan menambahkannya ke ArrayList
                Course course = new Course(nim, courseName, semester, grade);
                courseList.add(course);
            } else {
                System.out.println("Format input tidak valid. Harap gunakan: nim#nama mata kuliah#semester#grade nilai");
            }
        }

        System.out.println("\n--- Data Course yang Tersimpan ---");
        if (courseList.isEmpty()) {
            System.out.println("Tidak ada data course yang dimasukkan.");
        } else {
            for (Course course : courseList) {
                System.out.println(course); // Mencetak setiap objek Course menggunakan toString() yang sudah diperbarui
            }
        }

        scanner.close(); // Menutup scanner
    }
}
