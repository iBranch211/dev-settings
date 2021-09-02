package com.baeldung.lsso.persistence.repository;

import com.baeldung.lsso.persistence.model.Project;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProjectRepository extends PagingAndSortingRepository<Project, Long> {
}
