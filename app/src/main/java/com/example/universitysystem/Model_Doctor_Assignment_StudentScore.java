package com.example.universitysystem;

public class Model_Doctor_Assignment_StudentScore {
    String studentName,studentID,studentScore;

    public Model_Doctor_Assignment_StudentScore(String studentName, String studentID, String studentScore) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentScore = studentScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentScore() {
        return studentScore;
    }
}
