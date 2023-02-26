package co.supi.school.gamification.domain.stamp;

import co.supi.school.shared.domain.UUI;

public class Stamp {
    private UUI uui;
    private String name;

    
    public Stamp(UUI uui, String name) {
        this.uui = uui;
        this.name = name;
    }

    public UUI getUui() {
        return uui;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Stamp [uui=" + uui + ", name=" + name + "]";
    }
    
}
