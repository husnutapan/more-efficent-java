package com.java.efficent.integration.async;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.efficent.integration.consts.Constants;
import com.java.efficent.integration.model.Contact;
import com.java.efficent.integration.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class CreateBulk implements Runnable {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public void run() {
        ObjectMapper mapper = new ObjectMapper();
        List<IndexQuery> queryList = new ArrayList<>();
        List<Person> persons = createPersons();
        for (Person person : persons) {
            IndexQuery indexQuery = new IndexQuery();
            try {
                indexQuery.setSource(mapper.writeValueAsString(person));
                indexQuery.setIndexName(Constants.indexName);
                indexQuery.setType(Constants.indexType);
                queryList.add(indexQuery);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }

        if (queryList.size() > 0) {
            elasticsearchTemplate.bulkIndex(queryList);
        }
        elasticsearchTemplate.refresh(Constants.indexName);
    }

    public synchronized List<Person> createPersons() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Random r = new Random();
            Person person = new Person();
            person.setName("Husnu" + r.nextInt(1000));
            person.setAge(r.nextInt(1000));
            Contact contact = new Contact((long) r.nextInt(1000), UUID.randomUUID().toString() + "@test.com", String.format("%040d", new BigInteger(UUID.randomUUID().toString().replace("-", ""), 16)));
            person.setContact(contact);
            personList.add(person);
        }
        return personList;
    }
}
