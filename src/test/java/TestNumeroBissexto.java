import org.junit.Assert;
import org.junit.Test;

public class TestNumeroBissexto {
    @Test
    public void testBissexto()
    {
        int year = 2016;
        Assert.assertTrue(new NumeroBissexto().ehBissexto(year));
    }

    @Test
    public void testBissextoMultiplos()
    {
        Assert.assertTrue(new NumeroBissexto().ehBissexto(800));

        Assert.assertFalse(new NumeroBissexto().ehBissexto(1000));
    }

    @Test
    public void testNaoBissexto()
    {
        int anoNaoBissexto = 2017;
        Assert.assertFalse(new NumeroBissexto().ehBissexto(anoNaoBissexto));
    }
}
