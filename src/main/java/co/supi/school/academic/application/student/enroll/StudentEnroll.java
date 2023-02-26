package co.supi.school.academic.application.student.enroll;

import co.supi.school.academic.domain.student.Student;
import co.supi.school.academic.domain.student.StudentEnrolled;
import co.supi.school.academic.domain.student.StudentRepository;
import co.supi.school.shared.domain.event.EventPublisher;

public class StudentEnroll {

    private final StudentRepository repository;
    private final EventPublisher eventPublisher;

    public StudentEnroll(StudentRepository repository, EventPublisher eventPublisher) {
        this.repository = repository;
        this.eventPublisher = eventPublisher;
    }

    /*
     * COMMAND
     */
    public void execute(StudentEnrollDTO studentData) {
        Student student = studentData.createStudent();
        repository.enroll(student);
        StudentEnrolled studentEnrolled = new StudentEnrolled(student.getUui());
        eventPublisher.publish(studentEnrolled);
    }
    
}
