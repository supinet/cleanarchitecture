package co.supi.school.infra.student;

import java.io.Serializable;

import co.supi.school.domain.student.UUI;

public class StudentNotFound extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public StudentNotFound(UUI uui) {
        super("Student not found with the UUI " + uui.getNumber());
    }

}
