package day02;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Day02Test04_PerformanceTest {
    @Test
    void testPrintPerformonce(){
        assertTimeout(Duration.ofSeconds(3),()-> IntStream.rangeClosed(1,100000)
                .forEach(System.out::println));

    }
    @Test
    void testPrintPerformance2(){
        assertTimeout(Duration.ofSeconds(2),()->IntStream.rangeClosed(1,9999).reduce((x,y)->Math.addExact(x,y)));
    }
    //bu test yapisini task olarak verilen sorunun cozumu icin yazilan kodun max = ? saniye icinde
    // vermesini istiyorsak bu yapiyi kullaniriz
}
