package com.sprk.relationship_o_o;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sprk.relationship_o_o.entity.Instructor;
import com.sprk.relationship_o_o.repository.AppDao;

import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {

    private final AppDao appDao;

    @Autowired
    public DemoController(AppDao appDao) {
        this.appDao = appDao;
    }

    @GetMapping("/instructor/{id}")
    public Instructor getMethodName(@PathVariable int id) {
        return appDao.findByInstructorId(id);
    }

}
