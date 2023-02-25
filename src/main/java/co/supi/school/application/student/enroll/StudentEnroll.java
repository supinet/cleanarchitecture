package co.supi.school.application.student.enroll;

import co.supi.school.domain.student.Student;
import co.supi.school.domain.student.StudentRepository;

public class StudentEnroll {

    private final StudentRepository repository;

    public StudentEnroll(StudentRepository repository) {
        this.repository = repository;
    }

    public void execute(StudentEnrollDTO studentData) {
        Student student = studentData.createStudent();
        repository.enroll(student);
    }
    
}
