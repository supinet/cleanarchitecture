package co.supi.school.academic.infra.student;

import co.supi.school.academic.domain.PasswordCipher;

public class PasswordCipherMD5 implements PasswordCipher {

    @Override
    public String cipherPassword(String password) {
        System.out.println("ciphering password " + password);
        return password + 1;
    }

    @Override
    public boolean passwordCipherValidate(String cipherPassword, String pawwsord) {
        return cipherPassword.equals(cipherPassword(pawwsord));
    }
    
}
