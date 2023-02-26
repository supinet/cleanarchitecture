package co.supi.school.academic.domain;

public interface PasswordCipher {

    String cipherPassword(String password);
    boolean passwordCipherValidate(String cipherPassword, String pawwsord);
    
}
