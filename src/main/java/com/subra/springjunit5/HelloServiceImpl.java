package com.subra.springjunit5;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
    @Autowired
    HelloRepostory repo;
    Logger log = LoggerFactory.getLogger(HelloService.class);

    @Override
    public String get() {
        log.info("in HelloServiceImpl get()..");
        return repo.getFromDB() +    "Hello Jupiter api Junit-5";
    }
}
