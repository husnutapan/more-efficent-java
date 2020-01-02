package multitenancy.controller;

import multitenancy.entity.MyEntity;
import multitenancy.repo.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyRepository myRepository;

    @PostMapping("myEntitySave")
    public MyEntity save(@RequestBody MyEntity myEntity) {
        return myRepository.save(myEntity);
    }
}
