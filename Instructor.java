
public class Instructor extends User {

    private String courses;
    private int instructorId;

    public Instructor(String courses, int instructorId) {
        this.courses = courses;
        this.instructorId = instructorId;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

}
