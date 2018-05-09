package com.o2o.cy.web;

import com.o2o.cy.dao.entity.User;
import com.o2o.cy.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public List<User> index() {


       return userMapper.findAll();

    }
}
