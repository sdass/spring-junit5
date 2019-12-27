package com.subra.springjunit5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepoImpl implements HelloRepostory {
    Logger log = LoggerFactory.getLogger(HelloService.class);

    @Override
    public String getFromDB(){
        log.info("HelloRepo getFromDB()...");
        return "DB";
    }

}
