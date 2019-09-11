package com.example.universitysystem;

public class Model_Doctor_LecturesList {
    String lectureNumber;
    String topic,date;

    public Model_Doctor_LecturesList(String lectureNumber, String topic, String date) {
        this.lectureNumber = lectureNumber;
        this.topic = topic;
        this.date = date;
    }

    public String getLectureNumber() {
        return lectureNumber;
    }

    public String getTopic() {
        return topic;
    }

    public String getDate() {
        return date;
    }
}
