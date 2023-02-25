package co.supi.school.domain.student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private UUI uui;
    private String name;
    private Email email;

    private List<Telephone> telephones = new ArrayList<>();

    public Student(String name, UUI uui, Email email) {
        this.name = name;
        this.uui = uui;
        this.email = email;
    }

    public void addTelephones(String prefix, String number) {
        this.telephones.add(new Telephone(prefix, number));
    }

    public String getUui() {
        return uui.getNumber();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email.getAddress();
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    

}
