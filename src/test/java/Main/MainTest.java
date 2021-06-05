package Main;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    
    public MainTest() {
    }

    /**
     * Test of unity3 method, of class Main.
     */
    @org.junit.jupiter.api.Test
    public void testUnidade3() {
        System.out.println("Teste unidade3");
        
        assertEquals(Main.unidade3("AbC", 'a'), "CBa");
        assertEquals(Main.unidade3("", 'a'), "cadeia vazia");
        assertEquals(Main.unidade3("a123", 'a'), "entrada incorreta");
        assertEquals(Main.unidade3("AbC", '2'), "entrada incorreta");
    }
    
    /**
     * Test of unity4 method, of class Main.
     */
    @org.junit.jupiter.api.Test
    public void testUnidade4() {
        System.out.println("Teste unidade4");
        
        assertEquals(Main.unidade4("AXYBE"), 1);
        assertEquals(Main.unidade4("BXYBEO"), 2);
        assertEquals(Main.unidade4("XCYBE"), -1);
    }
}
