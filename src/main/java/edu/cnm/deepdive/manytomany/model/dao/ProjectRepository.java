package edu.cnm.deepdive.manytomany.model.dao;

import edu.cnm.deepdive.manytomany.model.entity.Project;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {

  List<Project> findAllByOrderByNameAsc();

}
