// Student class - Handles student data only
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

// Report class - Handles printing only
class Report {
    void print(Student student) {
        System.out.println("Student Name: " + student.name);
    }
}

public class SRPDemo {
    public static void main(String[] args) {
        Student s = new Student("Nithin");

        Report report = new Report();
        report.print(s);
    }
}