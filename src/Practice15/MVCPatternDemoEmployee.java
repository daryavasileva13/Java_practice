package Practice15;

public class MVCPatternDemoEmployee {
    public static void main(String[] args) {
        Employee model = retriveCourseFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new
                EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeSalary("0");
        System.out.println("\nДанные после обновления:");
        controller.updateView();
    }
    private static Employee retriveCourseFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Ваня");
        employee.setSalary("60000");
        return employee;
    }
}
