package practice01;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class J03TestPractice {
    @BeforeAll
    static void beforeAll(TestInfo info){
        System.out.println("info.getDisplayName() = " + info.getDisplayName()+" calisti");
    }
    @AfterAll
    static void afterAll(TestInfo info){
        System.out.println("info.getDisplayName() = " + info.getDisplayName()+" calisti");
    }
    @Test
    void testArray(TestInfo info){
        String str="hibernate mvc boot junit mongodb";
        String [] actualArr=str.split(" ");
     String[] expextedArr={"hibernate", "mvc" ,"boot", "junit" ,"mongodb"};
     assertArrayEquals(expextedArr,actualArr,"array eslesmedi");
        System.out.println("info.getDisplayName() = " + info.getDisplayName());
    }

}
