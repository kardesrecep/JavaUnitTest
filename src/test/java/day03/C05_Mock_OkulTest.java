package day03;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

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
        verify(dummyObject2,never()).silOgrenci(anyString());
        // metodhun en az 2 defa cagrildigini test etmek istersek:
        verify(dummyObject2,atLeast(2)).ekleOgrenci("Ali");
        verify(dummyObject2,atMost(2)).ekleOgrenci("Ali");

        //methodlarin cagrilma sirasini test etmek istersek



        }
    @Test
    void testSiralama(){
        C05_Mock_Islemler dummyObject3=mock(C05_Mock_Islemler.class);
        dummyObject3.ekleOgrenci("Ali");
        dummyObject3.ekleOgrenci("Salim");
        dummyObject3.silOgrenci("Ali");
        //inOrder classi siralama yapmak icin kullanilir
        InOrder inOrder=inOrder(dummyObject3);
        inOrder.verify(dummyObject3).ekleOgrenci("Ali");
        inOrder.verify(dummyObject3).ekleOgrenci("Salim");
        inOrder.verify(dummyObject3).silOgrenci("Ali");




    }


}
