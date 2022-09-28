package day01;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Day01Test04_BeforeAll_AfterAll {
    @BeforeAll
    static void beforeAll(TestInfo info){
        System.out.println(info.getDisplayName()+" open a file");
    }
      @AfterAll
    static void afterAll(TestInfo info){
          System.out.println(info.getDisplayName()+" close a file");
      }
      @Test
    void testWithArrays(){
        String str="Unit test with JUnit";
        String[] anlikDizi=str.split(" ");
        String[]beklenenDizi={"Unit", "test", "with", "JUnit"};
        assertArrayEquals(beklenenDizi,anlikDizi,"diziler esit degil");
      }
}
