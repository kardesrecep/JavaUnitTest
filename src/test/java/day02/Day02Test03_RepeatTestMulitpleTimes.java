package day02;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test03_RepeatTestMulitpleTimes {
    //testi tekrarlatmak istedigimizde

    @RepeatedTest(5)
    void  testSubstring(){
        assertEquals("Java","Java is an OOP language".substring(0,4));
        System.out.println("test calisti");
    }
    //@Disabled --> calistirmak istemedigimiz durumda bu annotation'u kullaniriz(uzerine yazarak)
    @RepeatedTest(3)
void testRepeated(){
        assertEquals(2,Math.addExact(1,1));
        System.out.println("test calisti");
    }
    Random rnd=new Random();
    @RepeatedTest(5)

    void testMathExact(){
        int num1=rnd.nextInt(10);
        int num2=rnd.nextInt(10);
        assertEquals(num1+num2,Math.addExact(num1,num2));
        System.out.println("num1 = " + num1 + " num2 = "+ num2);
    }
}
