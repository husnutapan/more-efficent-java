package aop.controller;

import aop.component.Model;
import aop.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ModelController {
    @Autowired
    private ModelService modelService;

    @RequestMapping(value = "/models", method = RequestMethod.GET)
    public List models() {
        return modelService.getModels();

    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Boolean add() {
        return modelService.add(new Model("Test4", 14));
    }


}
