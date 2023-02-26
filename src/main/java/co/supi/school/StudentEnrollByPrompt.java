package co.supi.school;

import co.supi.school.academic.application.student.enroll.StudentEnroll;
import co.supi.school.academic.application.student.enroll.StudentEnrollDTO;
import co.supi.school.academic.domain.student.StudentEnrolledLog;
import co.supi.school.academic.infra.student.StudentRepositoryMemory;
import co.supi.school.gamification.application.StampGeneratorNewStudent;
import co.supi.school.gamification.infra.stamp.StampRepositoryMemory;
import co.supi.school.shared.domain.event.EventPublisher;

public class StudentEnrollByPrompt {
    public static void main(String[] args) {
        String name = "John Dee";
        String uui = "99999999999";
        String email = "john.dee@mail.com";

        StudentEnrollDTO studentEnrollDTO = new StudentEnrollDTO(name, uui, email);
        EventPublisher eventPublisher = new EventPublisher();
        eventPublisher.add(new StudentEnrolledLog());
        eventPublisher.add(new StampGeneratorNewStudent(new StampRepositoryMemory()));

        StudentEnroll enroll = new StudentEnroll(new StudentRepositoryMemory(), eventPublisher);
        enroll.execute(studentEnrollDTO);

    }
}
