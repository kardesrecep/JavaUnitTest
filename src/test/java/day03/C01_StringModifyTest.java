package day03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_StringModifyTest {
    C01_StringModify strModifier;

    @BeforeEach
    void setup() {
        strModifier = new C01_StringModify();
        System.out.println("@BeforeEach calisti");
    }

    @AfterEach
    void tearDown() {
        strModifier = null;
        System.out.println("@AfterEach calisti");
    }
    @ParameterizedTest
    @CsvSource(value = {"BC,AABC","BC,ABC","BC,BAC"})

    void deleteAIfItIsinFirstTwoPositionTest( String expected, String param){
        assertEquals(expected,strModifier.deleteAIfItIsinFirstTwoPosition(param));


    }
}
