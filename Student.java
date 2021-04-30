
public class Student extends User {

    private String assignments;
    private int studentId;

    public Student(String assignments, int studentId) {
        this.assignments = assignments;
        this.studentId = studentId;
    }

    public String getAssignments() {
        if (this.assignments == null) {
            return "There is no assignment";
        }
        return assignments;
    }

    public void setAssignments(String assignments) {
        this.assignments = assignments;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
