package com.baeldung.lsso.persistence.repository;

import com.baeldung.lsso.persistence.model.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ITaskRepository extends PagingAndSortingRepository<Task, Long> {

    Iterable<Task> findByProjectId(Long id);
}
