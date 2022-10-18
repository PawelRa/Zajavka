package objectExercise.exercise4;

public class Exam {
    private Question[] questions;
    private int pointScored;
    private Examinated owner;

    public Exam(int size) {
        this.questions = new Question[size];
    }

    public Question[] getQuestions() {
        return questions;
    }

    public int getPointScored() {
        return pointScored;
    }

    public Examinated getOwner() {
        return owner;
    }

    public void setOwner(Examinated owner) {
        this.owner = owner;
    }

    void addQuestion(Question question) {
        int nextAvailable = -1;
        for (int i = 0; i < this.questions.length; i++) {
            if (this.questions[i] == null) {
                nextAvailable = i;
                break;
            }
        }

        if (nextAvailable == -1) {
            System.out.println("Too many questions added");
        } else {
            this.questions[nextAvailable] = question;
        }
    }

    void calculatePoints() {
        int points = 0;
        for (Question question : questions) {
            if (question.isCorrectlyAnswered()) {
                points++;
            }
        }
        this.pointScored = points;
    }
}
