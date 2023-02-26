package co.supi.school.shared.domain.event;

import java.time.LocalDateTime;
import java.util.Map;

public interface Event {

    LocalDateTime moment();
    EventType eventType();
    Map<String, Object> information();
}
