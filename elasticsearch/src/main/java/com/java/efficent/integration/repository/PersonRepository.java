package com.java.efficent.integration.repository;

import com.java.efficent.integration.model.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ElasticsearchCrudRepository<Person, Long> {
}
