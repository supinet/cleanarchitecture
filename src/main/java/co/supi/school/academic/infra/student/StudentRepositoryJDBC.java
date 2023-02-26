package co.supi.school.academic.infra.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import co.supi.school.academic.domain.student.Student;
import co.supi.school.academic.domain.student.StudentRepository;
import co.supi.school.academic.domain.student.Telephone;
import co.supi.school.shared.domain.UUI;

public class StudentRepositoryJDBC implements StudentRepository {

    private final Connection connection;

    public StudentRepositoryJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void enroll(Student student) {
        try {
            String sql = "INSERT INTO STUDENT VALUES(?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, student.getUui().getNumber());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.execute();

            sql = "INSERT INTO TELEPHONE VALUES (?, ?)";
            ps = connection.prepareStatement(sql);
            for (Telephone telephone : student.getTelephones()) {
                ps.setString(1, telephone.getPrefix());
                ps.setString(2, telephone.getNumber());
                ps.execute();
            }
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student findByUUI(UUI uui) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByUUI'");
    }

    @Override
    public List<Student> listAllStudentsEnrolled() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listAllStudentsEnrolled'");
    }
    
}
