package com.example.universitysystem;

public class Model_Lecture_AttendedStudents {
    String studentName,studentID;

    public Model_Lecture_AttendedStudents(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }
}
