package org.example.L2_CopyConstructor;

public class Student {
    private String name;
    private int age;
    private Exam enrollmentExam;


    Student() {
        this.name = "temp";
        this.age = 1;
        enrollmentExam = new Exam(age * 100 + 200, name + "_enrollmentExam");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        enrollmentExam = new Exam(age * 100 + 200, name + "_enrollmentExam");
    }

    // Copy Constructor
    Student(Student student) {
        this.name = student.name;
        this.age = student.age;

        // v0: Shallow Copy
        this.enrollmentExam = student.enrollmentExam;

        // v1: Deep Copy
        this.enrollmentExam = new Exam(
                student.enrollmentExam.getExamId(),
                student.enrollmentExam.getExamName());
        // v1 is redundent so use copy constructor of exam

        // v2: DeepCopy using copy constructor
        this.enrollmentExam = new Exam(student.enrollmentExam);
    }

    public void showDetails() {
        System.out.println("Details: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
