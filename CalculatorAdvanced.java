
/**
 * class CalculatorAdvanced
 *
 * @author dientaufan
 * @version 0.1
 */
public class CalculatorAdvanced extends Calculator
{
    

    /**
     * Constructor for objects of class CalculatorAdvanced
     */
    public CalculatorAdvanced()
    {
        // initialise instance variables
        super.opA = 7;
    }
    
    /**
     * factorial
     * 
     * @param  int operan 1
     *        
     *         
     * @return int hasil perhitungan factorial operan1 ! ex: 3! = 3x2x1
     */
    public int menghitungFactorial(int opA)
    {
        //int hasil = 0;
        // logic factorial () tugas    
        int hasil = super.penjumlahan(3,4);
        return opA + hasil;
    }

  
}
