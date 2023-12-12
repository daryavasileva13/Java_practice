package Practice11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student2 student1 = new Student2("Петя", 4.8);
        Student2 student2 = new Student2("Вася", 3.9);
        Student2 student3 = new Student2("Коля", 4.5);

        Student2[] students = {student1, student2, student3};

        System.out.println("Студенты до сортировки:");
        for(Student2 student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("\nСтуденты после сортировки:");
        for(Student2 student : students) {
            System.out.println(student);
        }
    }
}
