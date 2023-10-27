package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

    public class Student {
        String name;
        int id;
        HashMap<String, Integer> grades;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
            this.grades = new HashMap<>();
        }

        public void addGrade(String subject, int grade) {
            grades.put(subject, grade);
        }

        public int getGrade(String subject) {
            return grades.get(subject);
        }

        public int getId()
        {
            return id;
        }
        public String getName(){
            return name;
        }
        public HashMap getGrades()
        {
            return grades;
        }

        public void setName(String name)
        {
            this.name=name;
        }
        public void setId(int id)
        {
            this.id=id;
        }



    }







