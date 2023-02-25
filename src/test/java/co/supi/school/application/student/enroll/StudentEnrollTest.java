package co.supi.school.application.student.enroll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.supi.school.domain.student.Student;
import co.supi.school.domain.student.UUI;
import co.supi.school.infra.student.StudentRepositoryMemory;

public class StudentEnrollTest {

    @Test
    void studentShouldBeSaved() {
        StudentRepositoryMemory repository = new StudentRepositoryMemory();
        StudentEnroll useCase = new StudentEnroll(repository);

        String name = "John Dee";
        String uui = "99999999999";
        String email = "jhon.dee@mail.com";
        StudentEnrollDTO studentEnrollDTO = new StudentEnrollDTO(name, uui, email);
        useCase.execute(studentEnrollDTO);

        Student findByUUI = repository.findByUUI(new UUI(uui));
        assertEquals(findByUUI.getName(), name);
        assertEquals(findByUUI.getUui(), uui);
        assertEquals(findByUUI.getEmail(), email);



    }
}
