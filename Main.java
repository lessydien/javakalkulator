
/**
 * class Main
 * 
 * @author dientaufan 
 * @version 0.1
 */
public class Main
{
    public static void main(String args[])
    {
        int hasil;
        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.opA);
        System.out.println(calculator1.opB);
        System.out.println(calculator1.info);
        hasil = calculator1.penjumlahan();        
        System.out.println(hasil);
        hasil = calculator1.penjumlahan(2,3);        
        System.out.println(hasil);
        
            
        System.out.println();
        
        
        Calculator calculator2 = new Calculator(4,5);
        System.out.println(calculator2.opA);
        System.out.println(calculator2.opB);
        System.out.println(calculator2.info);
        hasil = calculator2.penjumlahan();        
        System.out.println(hasil);
        hasil = calculator2.penjumlahan(2,3);        
        System.out.println(hasil);
        
    }
}
