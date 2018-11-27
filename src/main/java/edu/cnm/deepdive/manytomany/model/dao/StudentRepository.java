package edu.cnm.deepdive.manytomany.model.dao;

import edu.cnm.deepdive.manytomany.model.entity.Student;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

  List<Student> findAllByOrderByNameAsc();

}
