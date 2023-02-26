package co.supi.school.academic.infra.student;

import co.supi.school.shared.domain.UUI;

public class StudentNotFound extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public StudentNotFound(UUI uui) {
        super("Student not found with the UUI " + uui.getNumber());
    }

}
