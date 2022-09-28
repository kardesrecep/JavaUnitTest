package day01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day01Test03_BeforeEach_AfterEach {

    String str;
    @BeforeEach
    void beforEach(){
      str="JUnit5 is better than JUnit4" ;
        System.out.println("beforeEach() calisti");
    }
    @AfterEach
    void afterEach(){
        str=null;
        System.out.println("afterEach() calisti");
    }
    @Test
    void testArrays(TestInfo info){
        String[]anlikDizi=str.split(" ");
        String[]beklenenDizi={"JUnit5","is","better","than","JUnit4"};
        System.out.println(info.getDisplayName()+"calisti");
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }

    @Test
    void testStringLength(TestInfo info){
        int anlikDeger=str.length();
        int beklenenDeger=28;
        assertEquals(beklenenDeger,anlikDeger);
        System.out.println(info.getDisplayName()+" calisti");
    }

}
