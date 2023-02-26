package co.supi.school.gamification.infra.stamp;

import co.supi.school.shared.domain.UUI;

public class StampNotFound extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public StampNotFound(UUI uui) {
        super("Stamp not found with name " + uui.getNumber());
    }
}
