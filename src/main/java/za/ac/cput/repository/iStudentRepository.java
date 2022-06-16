/*
 * iStudentRepository.java
 * entity class for student with a builder
 * Rhegan Albert Fortuin 219273693
 * Date of last edit:2022/06/15
 */

package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.StudentFactory;

import java.util.List;

@Repository
public interface iStudentRepository extends JpaRepository<Student, String> {
    public List<Student> findStudentByStudentId();
}
