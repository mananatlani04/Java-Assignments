import java.util.ArrayList;
import java.util.Scanner;

class School {
    private String name;
    private ArrayList<String> students = new ArrayList<String>();
    private ArrayList<String> teachers = new ArrayList<String>();
    private ArrayList<String> classes = new ArrayList<String>();

    public School(String name) {
        this.name = name;
    }

    public School() {}

    public void addStudent(String student) {
        students.add(student);
    }

    public void removeStudent(String student) {
        students.remove(student);
    }

    public void addTeacher(String teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(String teacher) {
        teachers.remove(teacher);
    }

    public void createClass(String classname) {
        classes.add(classname);
    }

    public void displayDetails() {
        System.out.println("School: " + name);
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
        System.out.println("Classes: " + classes);
    }
}

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        School s = new School("Greenwood High");
        s.addStudent("Manan");
        s.addStudent("Aryan");
        s.addTeacher("Mrs. Sharma");
        s.addTeacher("Mr. Verma");
        s.createClass("Math");
        s.createClass("Science");
        s.displayDetails();
        System.out.println("-------------------------------------");
        s.removeStudent("Aryan");
        s.removeTeacher("Mr. Verma");
        s.displayDetails();
    }
}