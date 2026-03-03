 /** 
 * @author 12S24024 Yesika Nadia Saragih
 * @author 12S24024 Yesika Nadia Saragih
 */

package academic.model;

public class Enrollment {
    private String courseId;
    private String studentId;
    private String academicYear;
    private String semester;
    private String grade; // Nilai, default 'None'

    // Konstruktor untuk inisialisasi objek Enrollment
    public Enrollment(String courseId, String studentId, String academicYear, String semester) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.academicYear = academicYear;
        this.semester = semester;
        this.grade = "None"; // Inisialisasi grade default
    }

    // Metode untuk mengatur grade (jika nanti ada fungsionalitas update)
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Metode toString untuk menghasilkan format output yang diminta (menggunakan '|' sebagai separator)
    @Override
    public String toString() {
        return courseId + "|" + studentId + "|" + academicYear + "|" + semester + "|" + grade;
    }

    // Anda bisa menambahkan getter di sini jika diperlukan
    // public String getCourseId() { return courseId; }
    // public String getStudentId() { return studentId; }
    // public String getAcademicYear() { return academicYear; }
    // public String getSemester() { return semester; }
    // public String getGrade() { return grade; }
}
