package com.example.Demo.buoi2;

public class StudentGrader {
    public String grading(int score) {
        String classify = "";
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Diem khong hop le");
        } else {
            if (score <= 40) {
                classify = "F";
            } else if (score <= 60) {
                classify = "D";
            } else if (score <= 70) {
                classify = "C";
            } else if (score <= 80) {
                classify = "B";
            } else if (score <= 100) {
                classify = "A";
            }
        }
        return classify;
    }
}
