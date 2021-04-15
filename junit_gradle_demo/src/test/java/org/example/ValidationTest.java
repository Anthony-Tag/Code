package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ValidationTest {
    private static Validation validation;

    @BeforeAll
    public static void setupValidation(){
        validation=new Validation();
    }

    @Test
    public void testIsPrimeNumberValid(){
        int n=5;
        Assertions.assertEquals(true,validation.isPrimeNumber(n));
    }

    @Test
    public void testIsPrimeNumberInValid(){
        int n=6;
        Assertions.assertEquals(false,validation.isPrimeNumber(n));
    }

    @Test
    public void testIsValidContactNumberForNull(){
        Assertions.assertEquals(false,validation.isValidContactNumber(null));
    }

    @Test
    public void testIsValidContactNumberForNegative(){
        Assertions.assertEquals(false,validation.isValidContactNumber("afdafafafafa"));
    }
    @Test
    public void testIsValidContactNumberForValid(){
        Assertions.assertEquals(true,validation.isValidContactNumber("+1-1234567890"));
    }
}
//Task -> Test exceptions using Junit
// what is Mockito? Why we need Mockito?