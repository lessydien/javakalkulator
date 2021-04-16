
import java.lang.Math;
/**
 * class CalculatorTrigonometri 
 *
 * @author dientaufan
 * @version 0.1
 */
public abstract class CalculatorTrigonometri extends Calculator
{
    // instance variables - replace the example below with your own
    public double op=0;
    //public abstract void konversi(double op);
    public abstract double konversi(double op);
    public double menghitungSin(double op)
    {   
        double hasil = konversi(op);
        return Math.sin(hasil);
    }
}
