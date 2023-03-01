
package campo_hora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class InicioTest {
    
    public InicioTest() {
    }

    /**
     * Test of main method, of class Inicio.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Inicio.main(args);
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
        
    }
    
}
