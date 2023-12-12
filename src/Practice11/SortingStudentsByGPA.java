package Practice11;

import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Student2> {
    @Override
    public int compare(Student2 student1, Student2 student2) {
        if(student1.gpa < student2.gpa) {
            return 1;
        } else if(student1.gpa > student2.gpa) {
            return -1;
        } else {
            return 0;
        }
    }
}