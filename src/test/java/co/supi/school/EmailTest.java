package co.supi.school;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import co.supi.school.academic.domain.student.Email;

public class EmailTest {

    @Test
    public void shouldNotAcceptCreateInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("invalidemail"));
    } 
}
