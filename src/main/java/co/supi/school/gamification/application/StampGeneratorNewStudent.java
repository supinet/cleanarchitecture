package co.supi.school.gamification.application;

import co.supi.school.gamification.domain.stamp.Stamp;
import co.supi.school.gamification.domain.stamp.StampRepository;
import co.supi.school.shared.domain.UUI;
import co.supi.school.shared.domain.event.Event;
import co.supi.school.shared.domain.event.EventType;
import co.supi.school.shared.domain.event.Listener;

public class StampGeneratorNewStudent extends Listener {

    private final StampRepository stampRepository;

    public StampGeneratorNewStudent(StampRepository stampRepository) {
        this.stampRepository = stampRepository;
    }

    @Override
    protected void reactFrom(Event event) {
        UUI uui = (UUI) event.information().get("uui");
        Stamp fresherStudent = new Stamp(uui, "Mike Dow");
        this.stampRepository.add(fresherStudent);
    }

    @Override
    protected boolean mustProcess(Event event) {
        return event.eventType() == EventType.STUDENT_ENROLLED;
    }
    
}
