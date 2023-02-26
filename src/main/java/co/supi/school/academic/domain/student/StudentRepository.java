package co.supi.school.academic.domain.student;

import java.util.List;

import co.supi.school.shared.domain.UUI;

public interface StudentRepository {

    void enroll(Student student);

    Student findByUUI(UUI uui);

    List<Student> listAllStudentsEnrolled();
    
}
