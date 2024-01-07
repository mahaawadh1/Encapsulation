public class App {

    public static void main(String[] args) {
        // Create a new Student instance
        Student student = new Student();

        // Set student information
        student.setName("maha awadh");
        student.setAge(25);
        student.setGpa(3.5);

        // Display student information and GPA status
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student GPA: " + student.getGpaStatus());
        System.out.println("GPA Status: " + student.getGpaStatus());

        // Test setting GPA outside the valid range
        student.setGpa(5.0);

        // Display updated GPA status
        System.out.println("Updated GPA: " + student.getGpaStatus());
        System.out.println("Updated GPA Status: " + student.getGpaStatus());
    }
}
