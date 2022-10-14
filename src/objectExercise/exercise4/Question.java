package objectExercise.exercise4;

import java.util.Arrays;
import java.util.Objects;

public class Question {
    private int id;
    private String[] questions;
    private int correctAnswer;

    public Question(int id, String[] questions, int correctAnswer) {
        this.id = id;
        this.questions = questions;
        this.correctAnswer = correctAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return id == question.id && correctAnswer == question.correctAnswer && Arrays.equals(questions, question.questions);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, correctAnswer);
        result = 31 * result + Arrays.hashCode(questions);
        return result;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", questions=" + Arrays.toString(questions) +
                ", correctAnswer=" + correctAnswer +
                '}';
    }
}
