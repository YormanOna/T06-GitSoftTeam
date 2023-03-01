package campo_hora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class InicioTest {
    
    public InicioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Inicio.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Inicio.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Validar_CampoHora method, of class Inicio.
     */
    @Test
    public void testValidar_CampoHora() {
        System.out.println("Validar_CampoHora");
        String Hora = "";
        Inicio instance = new Inicio();
        Boolean expResult = null;
        Boolean result = instance.Validar_CampoHora(Hora);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInteger method, of class Inicio.
     */
    @Test
    public void testGetInteger() {
        System.out.println("getInteger");
        String valor = "";
        Inicio instance = new Inicio();
        int expResult = 0;
        int result = instance.getInteger(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
