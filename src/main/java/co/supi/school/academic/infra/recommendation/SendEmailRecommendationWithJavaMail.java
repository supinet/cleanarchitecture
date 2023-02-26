package co.supi.school.academic.infra.recommendation;

import co.supi.school.academic.application.recommendation.SendEmailRecommendation;
import co.supi.school.academic.domain.student.Student;

public class SendEmailRecommendationWithJavaMail implements SendEmailRecommendation {

    @Override
    public void sendEmail(Student indicated) {
        System.out.println("sending email " + indicated.getEmail());
    }
    
}
