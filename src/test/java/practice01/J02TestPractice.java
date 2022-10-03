package practice01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class J02TestPractice {
    String str;

    //    @Test
//    void testArray(TestInfo info) {
//        //testini yaptiginiz array in test ismini konsola yazidiriniz
//        String []actualArr=str.split(" ");
//
//        String[] expextedArr={"hibernate", "mvc" ,"boot", "junit" ,"mongodb"};
//        System.out.println("info.getDisplayName() = " + info.getDisplayName()+" basladi");
//
//        assertTrue(Arrays.equals(actualArr,expextedArr));
//
//
//    }
    @BeforeEach
    void beforeEach() {
        str="hibernate";
        System.out.println("beforeeach calisti");
    }
    @AfterEach
    void afterEach(){
        str=null;
        System.out.println("aftereach calisti");
    }


    @Test
    void testStringLength(TestInfo info){
        int actualLength=str.length();//hibernate in length ini aliyor
        int expectedLength=9;

        assertEquals(expectedLength,actualLength);
        System.out.println("info.getDisplayName() = " + info.getDisplayName()+" basladi");

    }




}