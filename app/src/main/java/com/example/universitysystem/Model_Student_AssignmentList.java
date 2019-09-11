package com.example.universitysystem;

public class Model_Student_AssignmentList {
    String assignmentName;
    int assignmentQuestionsNumber;

    public Model_Student_AssignmentList(String assignmentName, int assigmentQuestionsNumber) {
        this.assignmentName = assignmentName;
        this.assignmentQuestionsNumber = assigmentQuestionsNumber;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public int getAssignmentQuestionsNumber() {
        return assignmentQuestionsNumber;
    }

    public void setAssignmentQuestionsNumber(int assignmentQuestionsNumber) {
        this.assignmentQuestionsNumber = assignmentQuestionsNumber;
    }
}
