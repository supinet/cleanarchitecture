package co.supi.school.domain.student;

public class StudentFactory {

    private Student student;

    public StudentFactory withNameUUIEmail(String name, String uui, String email) {
        this.student = new Student(name, new UUI(uui), new Email(email));
        return this;
    }

    public StudentFactory withTelephone(String prefix, String number) {
        this.student.addTelephones(prefix, number);
        return this;
    }

    public Student create() {
        return this.student;
    }    
}
