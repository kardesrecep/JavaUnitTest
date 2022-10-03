package practice01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class J01TestPractice {
    //task length i test eden test method yaziniz
    @Test

    void testLength(){
        int actualLength= "Hello".length();
        int expectedLength=5;
       assertEquals(expectedLength,actualLength);
       // assertEquals(expectedLength,actualLength,"test failed");
        //assertTrue
        //assertFalse

    }
    @Test
    void testUpperCase(){
        String actualValue= "Hello".toUpperCase();
        String expectedValue="HELLO";
        assertEquals(expectedValue,actualValue);
       // assertEquals(expectedValue,actualValue,"test failed");
    }
    //task contains methodu ile test yaziniz
    @Test
    void testContains(){
       assertEquals(true,"junit".contains("un"));
    }
    @Test
    void testFindMin(){
        assertEquals(15.8,Math.min(15.8,26.98));
    }
    //task string bir objeyi array a cevirip stringin yeni create ettiginiz
// array ile uyusup uyusmadigini kontrol ediniz

    @Test
    void testArray(){
        String str="hibernate mvc boot junit mongodb";
        String[] actualArray=str.split(" ");
        String[] expectedArray={"hibernate", "mvc" ,"boot" ,"junit", "mongodb"};
        //assertArrayEquals(expectedArray,actualArray);
        assertTrue(Arrays.equals(expectedArray,actualArray));
    }

    }

