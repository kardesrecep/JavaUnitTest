package day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day02Test02_ParameterizedTest {
    @Test
    void testlength(){
        assertTrue("John".length()>0);
        assertTrue("Mary".length()>0);
        assertTrue("Osman".length()>0);
        assertTrue("Kemal".length()>0);

    }
    //yukardaki methodu daha kolay yazmak icin parametreli testler kullaniriz

    @ParameterizedTest
    @ValueSource(strings={"John","Mary","Osman","Kemal"})
    void testLength2(String str){
        assertTrue(str.length()>0);
    }
    @Test

    void tesUpperCase(){
        String str1="Merhaba";
        String str2="Java";
        String str3="Test";
        assertEquals("MERHABA",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }
    @ParameterizedTest
    @CsvSource(value =
            { "MERHABA,merhaba",
                    "JAVA, java",
                    "TEST, test"


            })
    void testUpperCase2(String str1,String str2){
        assertEquals(str1,str2.toUpperCase());
    }
    @ParameterizedTest
    @CsvSource(value ={"true,java,a","true,junit,u","false,hello,a"})
    void testContains(boolean b1, String str1,String str2){
        assertEquals(b1,str1.contains(str2));
    }
}
