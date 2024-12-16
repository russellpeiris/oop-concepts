package Inheritance;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("johndoe", "password", "123456", "Computer Science");
        student.login("johndoe", "password");
        student.displayStudentDetails();
        student.logout();
    }
}
