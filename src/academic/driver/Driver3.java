 /** 
 * @author 12S24024 Yesika Nadia Saragih
 * @author 12S24024 Yesika Nadia Saragih
 */

package academic.driver;

import academic.model.Enrollment; // Import kelas Enrollment dari paket academic.model
import java.util.ArrayList;
import java.util.Scanner;

public class Driver3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Enrollment> enrollmentList = new ArrayList<>(); // Menggunakan ArrayList untuk penyimpanan dinamis

        System.out.println("Masukkan data pendaftaran (Kode Mata Kuliah#NIM Mahasiswa#Tahun Akademik#Semester).");
        // Tidak ada prompt khusus untuk '---' tetapi fungsionalitasnya tetap ada.

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
                String courseId = segments[0].trim();
                String studentId = segments[1].trim();
                String academicYear = segments[2].trim();
                String semester = segments[3].trim();

                // Membuat objek Enrollment dan menambahkannya ke ArrayList
                Enrollment enrollment = new Enrollment(courseId, studentId, academicYear, semester);
                enrollmentList.add(enrollment);
            } else {
                System.out.println("Format input tidak valid. Harap gunakan: Kode Mata Kuliah#NIM Mahasiswa#Tahun Akademik#Semester");
            }
        }

        System.out.println("\n--- Data Pendaftaran yang Tersimpan ---");
        if (enrollmentList.isEmpty()) {
            System.out.println("Tidak ada data pendaftaran yang dimasukkan.");
        } else {
            for (Enrollment enrollment : enrollmentList) {
                System.out.println(enrollment); // Mencetak setiap objek Enrollment menggunakan toString() yang sudah diperbarui
            }
        }

        scanner.close(); // Menutup scanner
    }
}