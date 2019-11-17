package aop.service;

import aop.component.Model;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.*;

@Service
public class ModelService {

    List<Model> models;

    @PostConstruct
    public void init() {
        models = new ArrayList<Model>() {{
            add(new Model("Test", 23));
            add(new Model("Test1", 24));
            add(new Model("Test2", 25));
        }};
    }

    public List<Model> getModels() {
        return models;
    }

    public Boolean add(Model model) {
        return models.add(model);
    }
}
