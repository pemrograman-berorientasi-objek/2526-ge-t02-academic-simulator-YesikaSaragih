 /** 
 * @author 12S24024 Yesika Nadia Saragih
 * @author 12S24024 Yesika Nadia Saragih
 */

package academic.model;

public class Student {
    private String studentId;
    private String name;
    private String entryYear; // Tahun masuk
    private String major;     // Program studi

    // Konstruktor untuk inisialisasi objek Student
    public Student(String studentId, String name, String entryYear, String major) {
        this.studentId = studentId;
        this.name = name;
        this.entryYear = entryYear;
        this.major = major;
    }

    // Metode toString untuk menghasilkan format output yang diminta (menggunakan '|' sebagai separator)
    @Override
    public String toString() {
        return studentId + "|" + name + "|" + entryYear + "|" + major;
    }

    // Anda bisa menambahkan getter dan setter di sini jika diperlukan
    // public String getStudentId() { return studentId; }
    // public String getName() { return name; }
    // public String getEntryYear() { return entryYear; }
    // public String getMajor() { return major; }
}
