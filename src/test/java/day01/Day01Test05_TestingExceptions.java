package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day01Test05_TestingExceptions {
    @Test
    void testException() {
        String str = "merhaba Dunya";
        assertThrows(NullPointerException.class, () -> {
            System.out.println("testException is run");
            str.length();
        });


    }

    @Test
    void testExceptions2() {
        int num1 = 1;
        int num2 = 0;
        assertThrows(ArithmeticException.class, () -> {
            System.out.println(num1 / num2);

        });

    }
    @Test
    void testExceptions3() {
        int num1 = 1;
        int num2 = 0;
assertThrows(ArithmeticException.class,()->{
    divide(num1,num2);
});

    }
    private int divide(int a, int b){
        return a/b;
    }
}
