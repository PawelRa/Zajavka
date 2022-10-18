package objectExercise.exercise4;

public interface Examiner {
    Exam[] createExam(int numberOfStudents);

    void evaluateExams(Exam[] exams);
}
