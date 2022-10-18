package objectExercise.exercise4;

public class Main {
    public static void main(String[] args) {
        Examiner teacher = new Teacher("Jan", "Kowalski");
        Examinated[] students = new Student[]{
                new Student("Rafał", "Kowalski"),
                new Student("Roman", "Nowak"),
                new Student("Michał", "Warszawiak")
        };
        System.out.println();

        Exam[] exams = teacher.createExam(students.length);

        for (int i = 0; i < students.length; i++) {
            students[i].writeExam(exams[i]);
        }
        System.out.println();

        teacher.evaluateExams(exams);
    }
}
