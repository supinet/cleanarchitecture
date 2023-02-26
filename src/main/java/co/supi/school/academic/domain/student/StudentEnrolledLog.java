package co.supi.school.academic.domain.student;

import java.time.format.DateTimeFormatter;

import co.supi.school.shared.domain.event.Event;
import co.supi.school.shared.domain.event.Listener;

public class StudentEnrolledLog extends Listener {

    public void reactFrom(Event event) {
        String formatedMoment = event.moment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(String.format("Student with UUI %s enrolled on: %s",
            ((StudentEnrolled) event).getUuiStudent(), formatedMoment));
    }

    @Override
    protected boolean mustProcess(Event event) {
        return event instanceof StudentEnrolled;
    }

}