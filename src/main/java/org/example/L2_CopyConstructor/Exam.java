package org.example.L2_CopyConstructor;

public class Exam {
    private int examId;
    private String examName;
    private ReExam reAttempt;

    public Exam(int examId, String examName) {
        this.examId = examId;
        this.examName = examName;
        this.reAttempt = new ReExam(examId);
    }

    // copy constructor
    public Exam(Exam exam) {
        this.examId = exam.getExamId();
        this.examName = exam.getExamName();

        // shallow copy
        this.reAttempt = exam.reAttempt;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }
}
