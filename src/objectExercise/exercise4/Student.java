package objectExercise.exercise4;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String lastName;
    private Exam exam;

    public Student(int id, String name, String lastName, Exam exam) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.exam = exam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name) && lastName.equals(student.lastName) && Objects.equals(exam, student.exam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, exam);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
