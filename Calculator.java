
/**
 * class Calculator
 * 
 * @author dientaufan 
 * @version 0.1
 */
public class Calculator
{
    //operand 1 dan 2 untuk aplikasi calculator
    public int opA=0, opB=0;
    
    // 0-> 10, 1-> 2, 3-> 16
    public int basis;
    
    // informasi tentang class
    public static final String info="Aplikasi Kalkulator by dien";

    /**
     * Constructor untuk obyek Calculator dengan parameter
     */
    public Calculator(int opA, int opB)
    {   
        this.opA = opA;
        this.opB = opB;
        System.out.println("Obyek Calculator dengan parameter telah dibuat");
    }
    
    
    /**
     * Constructor untuk obyek calculator tanpa parameter
     */
    public Calculator()
    {   
        System.out.println("Obyek Calculator tanpa parameter telah dibuat");
            
    }

    /**
     * penjumlahan
     * 
     * @param  int operan 1
     *         int operan 2
     *         
     * @return int hasil penjumalahan operan 1 + operan 2
     */
    public int penjumlahan(int opA, int opB)
    {
        return opA + opB;
    }
    
    
    /**
     * penjumlahan tanpa parameter
     * 
     * @param  int operan 1
     *         int operan 2
     *         
     * @return int hasil penjumalahan operan 1 + operan 2
     */
    public int penjumlahan()
    {
        return this.opA + this.opB;
    }
    
    
    
}
