package day03;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

public class C06_ErrorTest {
    @Test
    void simpleTest(){
        C06_Error testObj= Mockito.mock(C06_Error.class); //C06_Error'i mock'ladim
        testObj.divide(5,0); //test gecer cunku benim amacim main'de yazilanlari test ediyorum,
        // dogru calimasi onemli degil
        //eger divide method'unu(C06_Error'daki) test etseydik ama test gecmezdi
    }
}