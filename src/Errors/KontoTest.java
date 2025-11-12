package Errors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {



    @Test
    void testKonstruktorMitNameUndKontostand_Test1() {
        Konto testKonto = new Konto("Konto 1", 100.00);
        assertNotNull(testKonto);
        assertEquals("Konto 1", testKonto.getKontoname());
        assertEquals(100.00, testKonto.getKontostand());
        //assertEquals(-1000.00, testKonto.abbuchen(1100.00));
        testKonto.verzinse(0.01, 1);
        assertEquals(101.00, testKonto.getKontostand());
        
        
    }

    }