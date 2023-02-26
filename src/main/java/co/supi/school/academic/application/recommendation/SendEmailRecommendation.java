package co.supi.school.academic.application.recommendation;

import co.supi.school.academic.domain.student.Student;

public interface SendEmailRecommendation {
    void sendEmail(Student indicated);
}
