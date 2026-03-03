 /** 
 * @author 12S24024 Yesika Nadia Saragih
 * @author 12S24024 Yesika Nadia Saragih
 */

package academic.model;

public class Course {
    private String nim;
    private String courseName;
    private String semester;
    private String grade;

    // Konstruktor untuk inisialisasi objek Course
    public Course(String nim, String courseName, String semester, String grade) {
        this.nim = nim;
        this.courseName = courseName;
        this.semester = semester;
        this.grade = grade;
    }

    // Metode toString untuk menghasilkan format output yang diminta (menggunakan '|' sebagai separator)
    @Override
    public String toString() {
        return nim + "|" + courseName + "|" + semester + "|" + grade;
    }

    // Anda bisa menambahkan getter dan setter di sini jika diperlukan
    // public String getNim() { return nim; }
    // public String getCourseName() { return courseName; }
    // public String getSemester() { return semester; }
    // public String getGrade() { return grade; }
}
