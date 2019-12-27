package com.subra.springjunit5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    HelloService svc;

    @RequestMapping(value = "/val", method = RequestMethod.GET)
    @ResponseBody
    String getFromEnd(){
        log.info("In getFromEnd()..." );
        String sr = svc.get();
        log.info("sr=" + sr);
        return  sr;
    }
}
