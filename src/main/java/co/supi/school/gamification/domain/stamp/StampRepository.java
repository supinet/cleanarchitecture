package co.supi.school.gamification.domain.stamp;

import java.util.List;

import co.supi.school.shared.domain.UUI;

public interface StampRepository {
    
    void add(Stamp stamp);

    Stamp stampsOfStudentByUUI(UUI uui);

    List<Stamp> findAllStamps();

}
