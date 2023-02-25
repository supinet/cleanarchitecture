package co.supi.school;

import co.supi.school.application.student.enroll.StudentEnroll;
import co.supi.school.application.student.enroll.StudentEnrollDTO;
import co.supi.school.infra.student.StudentRepositoryMemory;

public class StudentEnrollByPrompt {
    public static void main(String[] args) {
        String name = "John Dee";
        String uui = "99999999999";
        String email = "john.dee@mail.com";

        StudentEnroll enroll = new StudentEnroll(new StudentRepositoryMemory());
        enroll.execute(new StudentEnrollDTO(name, uui, email));

    }
}
