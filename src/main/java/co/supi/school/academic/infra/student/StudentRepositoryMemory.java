package co.supi.school.academic.infra.student;

import java.util.ArrayList;
import java.util.List;

import co.supi.school.academic.domain.student.Student;
import co.supi.school.academic.domain.student.StudentRepository;
import co.supi.school.shared.domain.UUI;

public class StudentRepositoryMemory implements StudentRepository {

    private List<Student> enrolleds = new ArrayList<>();

    @Override
    public void enroll(Student student) {
        this.enrolleds.add(student);
    }

    @Override
    public Student findByUUI(UUI uui) {
        return this.enrolleds.stream()
            .filter(s -> s.getUui().getNumber().equals(uui.getNumber()))
            .findFirst()
            .orElseThrow(() -> new StudentNotFound(uui));
    }

    @Override
    public List<Student> listAllStudentsEnrolled() {
        return this.enrolleds;
    }
    
}
