https://www.mkyong.com/spring-boot/spring-boot-junit-5-mockito/

chrome testing:
http://localhost:8080/val
DBHello Jupiter api Junit-5

@SpringBootTest is used for loading an ApplicationContext, if no explicit classes are defined (classes={}) the test will look for nested @Configuration classes.
@ExtendWith(SpringExtension.class) //when to use it? Not needed ?! Answer: Either this annotation or use @SpringbootTest