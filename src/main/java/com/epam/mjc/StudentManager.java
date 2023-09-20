package com.epam.mjc;


import javax.swing.plaf.IconUIResource;

public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) throws StudentNotFoundException {
//        Student studentToFind = Student.getValueOf(studentID);
        if (Student.getValueOf(studentID) != null) {
            return Student.getValueOf(studentID);
        } else {
            throw new StudentNotFoundException("Could not find student with ID " + studentID);
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        for (int i = 0; i < IDs.length; i++) {
            Student student = null;
            try {
                student = manager.find(IDs[i]);
            } catch (StudentNotFoundException e) {
                System.err.print(e);
            }
            if (student != null) {
                System.out.println("Student name " + student.getName());
            }
        }

    }
}