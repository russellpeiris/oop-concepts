package Inheritance;

class Student extends User{
    private String studentId;
    private String course;

    public Student(String username, String password, String studentId, String course) {
        super(username, password);
        this.studentId = studentId;
        this.course = course;
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}
