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
}
