package com.subra.springjunit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
// @SpringBootTest is used for loading an ApplicationContext, if no explicit classes are defined (classes={}) the test will look for nested @Configuration classes
// @ExtendWith(SpringExtension.class) //when to use it. Not needed ?! Answer: Either this annotation or used @SpringbootTest
public class HelloServiceMockTest {
    @Mock
    HelloRepostory hrepo;

    @InjectMocks //auto inject hrepo mock
    HelloService hservice = new HelloServiceImpl();

    @BeforeEach
    void initMock(){
        Mockito.when(hrepo.getFromDB()).thenReturn("DB Output Recived ");
    }

    @Test
    void testGetByMock(){
        String serviceString = "Hello Jupiter api Junit-5";
        String expected =  hrepo.getFromDB() + serviceString; // "DB Output Recived ";
        String actual = hservice.get();
        System.out.println("actual=" + actual);
        Assertions.assertEquals(expected, actual);
    }
}
