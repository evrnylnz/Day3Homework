
import java.util.Scanner;

public class InstructorManager extends UserManager {

    void addCourse(Instructor instructor) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Add the course : ");
        String course = sc.nextLine();
        instructor.setCourses(instructor.getCourses() + "," + course);
    }

    void seeProfile(Instructor instructor) {
        super.seeProfile(instructor);
        System.out.println("Courses : " + instructor.getCourses());
    }

}
