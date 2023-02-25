package co.supi.school.infra.student;

import co.supi.school.domain.PasswordCipher;

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
