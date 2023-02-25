package co.supi.school.domain.recommendation;

import java.time.LocalDateTime;

import co.supi.school.domain.student.Student;

public class Recommendation {

    private Student indicated;
    private Student indicative;
    private LocalDateTime indicationDate;

    public Recommendation(Student indicated, Student indicative) {
        this.indicated = indicated;
        this.indicative = indicative;
        this.indicationDate = LocalDateTime.now();
    }

    public Student getIndicated() {
        return indicated;
    }

    public Student getIndicative() {
        return indicative;
    }

    public LocalDateTime getIndicationDate() {
        return indicationDate;
    }
}
