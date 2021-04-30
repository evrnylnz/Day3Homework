
public class Main {

    public static void main(String[] args) {

        Instructor instructor = new Instructor("Java,C#", 1);
        instructor.setFirstName("Evren");
        instructor.setLastName("Yalnız");
        instructor.setBirthday("15.02.1999");
        instructor.setEmail("abc@gmail.com");
        instructor.setId(1);
        instructor.setPhoneNumber("05448889910");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCourse(instructor);
        instructorManager.seeProfile(instructor);

        System.out.println("*********************************");
        
        Student student = new Student("Camp day 3", 12);
        student.setFirstName("Ahmet");
        student.setLastName("Yıldız");
        student.setBirthday("15.02.1989");
        student.setEmail("abcd@gmail.com");
        student.setId(2);
        student.setPhoneNumber("05448852635");

        StudentManager studentManager = new StudentManager();
        studentManager.doAssignment(student);

        studentManager.seeProfile(student);

    }

}
