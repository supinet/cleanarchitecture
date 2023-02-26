package co.supi.school.shared.domain.event;

public abstract class Listener {

    public void process(Event event) {
        if (this.mustProcess(event)) {
            this.reactFrom(event);
        }
    }

    protected abstract void reactFrom(Event event);
    protected abstract boolean mustProcess(Event event);
    
}
