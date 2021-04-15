package org.example;

import org.junit.jupiter.api.*;

public class HelloJunitTest {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Hello from BeforeAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("This method will be executed before each test case in this class");
    }

    @Test
    public void helloTest1(){
        System.out.println("Hello from Test-1");
    }

    @Test
    public void helloTest2(){
        System.out.println("Hello from Test-2");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Hello from afterEach this will be executed after each test case is executed in this class");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Hello form AfterAll");
    }
}
