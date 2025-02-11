/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.university.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.university.model.Course;
import com.example.university.model.Student;

public interface StudentRepository {
    ArrayList<Student> getStudent();

    Student getStudentById(int studentId);

    Student addStudent(Student student);

    Student updateStudent(int studentId, Student student);

    void deleteStudent(int studentId);

    List<Course> getStudentCourses(int studentId);
}