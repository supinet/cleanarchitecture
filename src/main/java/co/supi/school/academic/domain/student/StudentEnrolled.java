package co.supi.school.academic.domain.student;

import java.time.LocalDateTime;
import java.util.Map;

import co.supi.school.shared.domain.UUI;
import co.supi.school.shared.domain.event.Event;
import co.supi.school.shared.domain.event.EventType;

public class StudentEnrolled implements Event {

    private final UUI uuiStudent;
    private final LocalDateTime moment;

    public StudentEnrolled(UUI uuiStudent) {
        this.uuiStudent = uuiStudent;
        this.moment = LocalDateTime.now();
    }

    @Override
    public LocalDateTime moment() {
        return this.moment;
    }

    public UUI getUuiStudent() {
        return uuiStudent;
    }

    @Override
    public EventType eventType() {
        return EventType.STUDENT_ENROLLED;
    }

    @Override
    public Map<String, Object> information() {
        return Map.of("uui", uuiStudent);
    }
}
