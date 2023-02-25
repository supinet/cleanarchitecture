package co.supi.school.domain.student;

public class Telephone {

    private String prefix;
    private String number;

    public Telephone(String prefix, String number) {
        this.prefix = prefix;
        this.number = number;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getNumber() {
        return number;
    }

    
}
