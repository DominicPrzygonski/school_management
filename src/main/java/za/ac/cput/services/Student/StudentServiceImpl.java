package za.ac.cput.services.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Student;
import za.ac.cput.repository.iStudentRepository;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired

    @Override
    public Student save(Student student) {
        return student;
    }

    @Override
    public Optional<Student> read(String s) {
        return Optional.empty();
    }

    @Override
    public void delete(Student student) {

    }
}
