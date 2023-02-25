package co.supi.school.domain.student;

import java.util.List;

public interface StudentRepository {

    void enroll(Student student);

    Student findByUUI(UUI uui);

    List<Student> listAllStudentsEnrolled();
    
}
