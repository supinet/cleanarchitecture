package co.supi.school.shared.domain;

public class UUI {
    
    private String number;

    public UUI(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number;
    }

    
}
