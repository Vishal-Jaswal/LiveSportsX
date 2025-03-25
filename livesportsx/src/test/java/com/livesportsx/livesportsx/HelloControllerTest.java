//import org.junit.jupiter.api.BeforeEach;  // JUnit 5
//import org.junit.jupiter.api.Test;       // JUnit 5
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import static io.restassured.RestAssured.*;
//import static org.hamcrest.CoreMatchers.*;
//
//@ExtendWith(SpringExtension.class)  // Replaces @RunWith
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) // Replaces @SpringApplicationConfiguration + @IntegrationTest
//public class HelloControllerTest {
//    @LocalServerPort  // Replaces @Value("${local.server.port}")
//    int port;
//
//    @BeforeEach  // JUnit 5 (no "value" needed)
//    public void setUp() {
//        RestAssured.port = port;
//    }
//
//    @Test
//    public void testHello() {
//        when().get("/").then()
//                .body(is("Hello World!"));
//    }
//
//    @Test
//    public void testCalc() {
//        given().param("left", 100)
//                .param("right", 200)
//                .get("/calc")
//                .then()
//                .body("left", is(100))
//                .body("right", is(200))
//                .body("answer", is(300));
//    }
//}