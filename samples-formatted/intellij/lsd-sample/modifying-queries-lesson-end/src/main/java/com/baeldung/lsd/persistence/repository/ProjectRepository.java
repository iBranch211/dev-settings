package com.baeldung.lsd.persistence.repository;

import com.baeldung.lsd.persistence.model.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    Iterable<Project> findByNameContaining(String name);
}
