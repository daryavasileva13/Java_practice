package Practice15;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveCourseFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new
                StudentController(model, view);
        controller.updateView();
        controller.setStudentRollNo("2");
        System.out.println("\nДанные студента после обновления номера: ");
        controller.updateView();
    }
    private static Student retriveCourseFromDatabase(){
        Student student = new Student();
        student.setName("Петя");
        student.setRollNo("1");
        return student;
    }
}
