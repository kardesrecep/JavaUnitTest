package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day01Test01_Assertions {
    @Test
    public void test(){

    }
    @Test
    public void testLength(){
        String cumle="Merhaba Dunya";
        int anlikDeger=cumle.length();
        int beklenenDeger=13;
       assertEquals(beklenenDeger,anlikDeger);
        // esit olma durumunda kullanilir--> assertEquals();
       //assertEquals(beklenenDeger,anlikDeger, "length ayni degil");
    }
    @Test
    public void testUppercase(){
        String anlikDeger="Merhaba".toUpperCase();
        String beklenenDeger="MERHABA";
        assertEquals(beklenenDeger,anlikDeger,"UpperCase duzgun calismiyor");
    }
    @Test
    public void testToplama(){
        int num1=10;
        int num2=5;
        int anlikDeger= Math.addExact(num1,num2);
        int beklenenDeger=15;
        assertEquals(beklenenDeger,anlikDeger);
    }
    @Test
    void testContains(){
        assertEquals(true,"Mirac".contains("z"));


    }

}
