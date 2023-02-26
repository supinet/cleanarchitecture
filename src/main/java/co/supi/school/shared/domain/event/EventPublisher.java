package co.supi.school.shared.domain.event;

import java.util.ArrayList;
import java.util.List;

public class EventPublisher {
    
    private List<Listener> listeners = new ArrayList<>();

    public void add(Listener listener) {
        listeners.add(listener);
    }

    public void publish(Event envent) {
        listeners.forEach(l -> l.process(envent));
    }
}
