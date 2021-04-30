
public class StudentManager extends UserManager {

    void doAssignment(Student student) {

        if (student.getAssignments() != null) {
            System.out.println("Assignment done!");
            student.setAssignments(null);
        } else {
            System.out.println("You have no assignment.");
        }

    }

    void seeProfile(Student student) {
        super.seeProfile(student);
        System.out.println("Assignments : " + student.getAssignments());

    }

}
