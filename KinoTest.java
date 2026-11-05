import static org.junit.Assert.*;
import org.junit.Test;

public class KinoTest
{
    @Test
    public void test_printKino()
    {
        Kino cineplexx;
        Kino stadtkino;
        cineplexx = new Kino("Cineplexx", 12, true);
        stadtkino = new Kino("Stadtkino", 3, false);
        cineplexx.printKino();
        stadtkino.printKino();
    }

    @Test
    public void test_getStadt()
    {
        Kino apollo;
        Kino annenhof;
        Kino city;
        apollo = new Kino("Wien Apollo", 12, true);
        annenhof = new Kino("Graz Annenhof", 7, false);
        city = new Kino("Linz City", 5, true);
        assertEquals("Wien", apollo.getStadt());
        assertEquals("Graz", annenhof.getStadt());
        assertEquals("Linz", city.getStadt());
    }

    @Test
    public void test_getKinoname()
    {
        Kino apollo;
        Kino annenhof;
        Kino city;
        apollo = new Kino("Wien Apollo", 12, true);
        annenhof = new Kino("Graz Annenhof", 7, false);
        city = new Kino("Linz City", 5, true);
        assertEquals("Apollo", apollo.getKinoname());
        assertEquals("Annenhof", annenhof.getKinoname());
        assertEquals("City", city.getKinoname());
    }

    @Test
    public void test_fehlerOhneLeerzeichen()
    {
        Kino apollo;
        apollo = new Kino("Apollo", 12, true);
        assertEquals("UNKN", apollo.getStadt());
        assertEquals("UNKN", apollo.getKinoname());
    }
}
