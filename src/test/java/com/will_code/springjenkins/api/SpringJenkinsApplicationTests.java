package com.will_code.springjenkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsApplicationTests {

    static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

    @Test
    void contextLoads() {
        logger.info("Test execution started...");
        assertEquals(true, true);
    }

}
