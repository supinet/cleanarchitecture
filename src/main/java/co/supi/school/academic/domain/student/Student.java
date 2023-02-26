package co.supi.school.academic.domain.student;

import java.util.ArrayList;
import java.util.List;

import co.supi.school.shared.domain.UUI;

/*
 * AGGREGATE ROOT
 */
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

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public UUI getUui() {
        return uui;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email.getAddress();
    }


}
