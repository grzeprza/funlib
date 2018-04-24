package com.grzeprza.funlib.funlib.repository;

import com.grzeprza.funlib.funlib.model.Publisher;
import org.springframework.data.repository.CrudRepository;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    Publisher findByName(String name);
}
