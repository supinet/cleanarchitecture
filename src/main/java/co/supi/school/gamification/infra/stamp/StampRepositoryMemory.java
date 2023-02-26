package co.supi.school.gamification.infra.stamp;

import java.util.ArrayList;
import java.util.List;

import co.supi.school.gamification.domain.stamp.Stamp;
import co.supi.school.gamification.domain.stamp.StampRepository;
import co.supi.school.shared.domain.UUI;

public class StampRepositoryMemory implements StampRepository {

    private List<Stamp> stamps = new ArrayList<>();

    @Override
    public void add(Stamp stamp) {
        stamps.add(stamp);

    }

    @Override
    public Stamp stampsOfStudentByUUI(UUI uui) {
        return this.stamps.stream()
            .filter(s -> s.getUui().equals(uui))
            .findFirst()
            .orElseThrow(() -> new StampNotFound(uui));
    }

    @Override
    public List<Stamp> findAllStamps() {
      return this.stamps;
    }
    
}
