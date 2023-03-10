package co.supi.school.academic.domain.student;

public class Email {

    private String address;

    public Email(String address) {
        if (address == null || !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
