package Practice11;

import java.util.Arrays;
import java.util.Comparator;

class Student2 {
    String name;
    double gpa;

    public Student2(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + ": " + gpa;
    }
}



