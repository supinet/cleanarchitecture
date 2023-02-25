package co.supi.school.infra.student;

import java.util.ArrayList;
import java.util.List;

import co.supi.school.domain.student.Student;
import co.supi.school.domain.student.StudentRepository;
import co.supi.school.domain.student.UUI;

public class StudentRepositoryMemory implements StudentRepository {

    private List<Student> enrolleds = new ArrayList<>();

    @Override
    public void enroll(Student student) {
        this.enrolleds.add(student);
    }

    @Override
    public Student findByUUI(UUI uui) {
        return this.enrolleds.stream()
            .filter(s -> s.getUui().equals(uui.getNumber()))
            .findFirst()
            .orElseThrow(() -> new StudentNotFound(uui));
    }

    @Override
    public List<Student> listAllStudentsEnrolled() {
        return this.enrolleds;
    }
    
}
