package co.supi.school.academic.application.student.enroll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.supi.school.academic.domain.student.Student;
import co.supi.school.academic.infra.student.StudentRepositoryMemory;
import co.supi.school.shared.domain.UUI;
import co.supi.school.shared.domain.event.EventPublisher;

public class StudentEnrollTest {

    @Test
    void studentShouldBeSaved() {
        StudentRepositoryMemory repository = new StudentRepositoryMemory();
        EventPublisher eventPublisher = new EventPublisher();
        StudentEnroll useCase = new StudentEnroll(repository, eventPublisher);

        String name = "John Dee";
        String uui = "99999999999";
        String email = "jhon.dee@mail.com";
        StudentEnrollDTO studentEnrollDTO = new StudentEnrollDTO(name, uui, email);
        useCase.execute(studentEnrollDTO);

        Student findByUUI = repository.findByUUI(new UUI(uui));
        assertEquals(findByUUI.getName(), name);
        assertEquals(findByUUI.getUui().getNumber(), uui);
        assertEquals(findByUUI.getEmail(), email);
    }
}
