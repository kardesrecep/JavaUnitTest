package day03;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class C05_Mock_OkulTest {
    @Test
    void islemler() {
        C05_Mock_Islemler dummyObject = mock(C05_Mock_Islemler.class);
        dummyObject.guncelleOgrenci("Ziya");
        dummyObject.silOgrenci("Hakim");
        dummyObject.ekleOgrenci("John");

        //Methodlar cagrılmis mi kontrol edelim
        verify(dummyObject).ekleOgrenci("John");
        verify(dummyObject).silOgrenci("Hakim");
        verify(dummyObject).guncelleOgrenci("Ziya");


    }
    //methodlar kac defa cagrildi test edelim.
    @Test
    void testkacKereCagrildi(){
        C05_Mock_Islemler dummyObject2 = mock(C05_Mock_Islemler.class);
        dummyObject2.ekleOgrenci("Ali");
        dummyObject2.ekleOgrenci("Ali");
        dummyObject2.ekleOgrenci("Veli");
        // acaba Ali par. ile ekleOgrenci() methodu iki defa cagrildi

        verify(dummyObject2,times(2)).ekleOgrenci("Ali");

        verify(dummyObject2,times(0)).ekleOgrenci("Buse");




    }


}
