package com.example.universitysystem;

public class Model_Student_CourseList {
   private String courseName;
   private String courseCode;
   private String lectureDate;
   private String lectureHall;

    public Model_Student_CourseList(String courseName, String courseCode, String lectureDate, String lectureHall) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lectureDate = lectureDate;
        this.lectureHall = lectureHall;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getLectureDate() {
        return lectureDate;
    }

    public String getLectureHall() {
        return lectureHall;
    }
}
