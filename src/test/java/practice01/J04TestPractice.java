package practice01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class J04TestPractice {
    //Test ettğimiz kodun bizim beklediğimiz excetionu fırlattigini gösteren test yaziniz
    @Test
    @DisplayName("testException hata kontrol edilmesi test ediliyor")
    void testException(){
        String str="Java";
        assertThrows(NumberFormatException.class,()->{
            Integer.valueOf(str);
        });
    }
    @Test
    @DisplayName("sifira bolme kontrol ediliyor")
    void testException01(){
        int x=24;
        int y=0;
        assertThrows(ArithmeticException.class,()-> bolumIslem(x,y));

    }

    private int bolumIslem(int x, int y) {
        return x/y;

    }
}
