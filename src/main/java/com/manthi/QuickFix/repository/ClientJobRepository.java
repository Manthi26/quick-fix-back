package com.manthi.QuickFix.repository;

import com.manthi.QuickFix.model.ClientJob;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientJobRepository extends CrudRepository<ClientJob, Integer> {

    List<ClientJob> findAll();

}
