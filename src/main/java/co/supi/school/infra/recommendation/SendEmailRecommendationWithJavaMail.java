package co.supi.school.infra.recommendation;

import co.supi.school.application.recommendation.SendEmailRecommendation;
import co.supi.school.domain.student.Student;

public class SendEmailRecommendationWithJavaMail implements SendEmailRecommendation {

    @Override
    public void sendEmail(Student indicated) {
        System.out.println("sending email " + indicated.getEmail());
    }
    
}
