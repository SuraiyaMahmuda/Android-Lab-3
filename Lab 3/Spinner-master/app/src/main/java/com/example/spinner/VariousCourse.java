package com.example.spinner;

import java.util.ArrayList;
import java.util.List;

public class VariousCourse {

    List<String> getMenu(String course) {
        List<String> Course = new ArrayList<>();
        if (course.equals("1st Year")) {
            Course.add("SPL");
            Course.add("OOP");
            Course.add("Data Structures");
        }
        else if (course.equals("2nd Year")) {
            Course.add("JAVA");
            Course.add("Algorithms");
            Course.add("DBMS");
        }
        else if (course.equals("3rd Year")) {
            Course.add("HTML");
            Course.add("CSS");
            Course.add("Django");
        }
        else {
            Course.add("SWE");
            Course.add("Android");
            Course.add("DIP");
        }
        return Course;
    }
}
