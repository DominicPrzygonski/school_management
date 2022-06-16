package za.ac.cput.services.Student;

import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public interface iService <T, Id>{
    T save (T t);
    Optional <T> read (Id id);
    void delete(T t);
}
