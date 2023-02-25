package co.supi.school.application.recommendation;

import co.supi.school.domain.student.Student;

public interface SendEmailRecommendation {
    void sendEmail(Student indicated);
}
