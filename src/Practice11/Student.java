package Practice11;

public class Student {
    private int iDNumber;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(5),
                new Student(2),
                new Student(9),
                new Student(1),
                new Student(7)
        };


        // Сортировка массива students по iDNumber с использованием сортировки вставками
        for (int i = 1; i < students.length; i++) {
            Student currentStudent = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > currentStudent.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = currentStudent;
        }

        // Вывод отсортированного массива
        for (Student student : students) {
            System.out.println(student.getIDNumber());
        }
    }
}
