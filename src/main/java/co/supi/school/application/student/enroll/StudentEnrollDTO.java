package co.supi.school.application.student.enroll;

import co.supi.school.domain.student.Email;
import co.supi.school.domain.student.Student;
import co.supi.school.domain.student.UUI;

public class StudentEnrollDTO {

    private String name;
    private String uui;
    private String email;

    public StudentEnrollDTO(String name, String uui, String email) {
        this.name = name;
        this.uui = uui;
        this.email = email;
    }

    public Student createStudent() {
        return new Student(name, new UUI(uui), new Email(email));
    }
}
