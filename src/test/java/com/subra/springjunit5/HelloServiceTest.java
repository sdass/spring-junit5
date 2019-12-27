package com.subra.springjunit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {
    @Autowired
    HelloService helloService;

    @Test
    void testGet(){
        String expected = "DBHello Jupiter api Junit-5";
        String actual =   helloService.get();
        Assertions.assertEquals(expected, actual);
    }
}
