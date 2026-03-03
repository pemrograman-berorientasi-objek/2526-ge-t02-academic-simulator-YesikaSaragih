 /** 
 * @author 12S24024 Yesika Nadia Saragih
 * @author 12S24024 Yesika Nadia Saragih
 */

package academic.driver;

import academic.model.Student; // Import kelas Student dari paket academic.model
import java.util.ArrayList;
import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>(); // Menggunakan ArrayList untuk penyimpanan dinamis

        System.out.println("Masukkan data mahasiswa (NIM#Nama#Tahun Masuk#Program Studi).");
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
                String studentId = segments[0].trim();
                String name = segments[1].trim();
                String entryYear = segments[2].trim();
                String major = segments[3].trim();

                // Membuat objek Student dan menambahkannya ke ArrayList
                Student student = new Student(studentId, name, entryYear, major);
                studentList.add(student);
            } else {
                System.out.println("Format input tidak valid. Harap gunakan: NIM#Nama#Tahun Masuk#Program Studi");
            }
        }

        System.out.println("\n--- Data Mahasiswa yang Tersimpan ---");
        if (studentList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa yang dimasukkan.");
        } else {
            for (Student student : studentList) {
                System.out.println(student); // Mencetak setiap objek Student menggunakan toString() yang sudah diperbarui
            }
        }

        scanner.close(); // Menutup scanner
    }
}