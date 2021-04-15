
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
        /*
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
        
        System.out.println();
        
         
        CalculatorAdvanced calculator3 = new CalculatorAdvanced();
        System.out.println(calculator3.opA);
        System.out.println(calculator3.opB);
        System.out.println(calculator3.info);
        hasil = calculator3.penjumlahan();        
        System.out.println(hasil);
        hasil = calculator3.penjumlahan(2,3);        
        System.out.println(hasil);
        hasil = calculator3.menghitungFactorial(4) + calculator3.penjumlahan(3,4);
        System.out.println(hasil);
        */
       
        double hasilSin = 0;
        int hasiljumlah=0;
        double der = 30;
        double rad = 0.5235987755982988;
        
        CalculatorTrigonometri ct1 = new CalculatorTriDeg();
        //CalculatorTrigonometri ct1 = new CalculatorTrigonometri();
        hasiljumlah = ct1.penjumlahan(3,4);
        System.out.println("Nilai op awal = "+ct1.op);
        ct1.konversi(der);
        System.out.println("Nilai derajat = "+der+ " setelah konversi = "+ ct1.op);
        hasilSin = ct1.menghitungSin();
        System.out.println("Nilai sin = "+der+ " derajat adalah = "+ hasilSin);
        
        System.out.println("");
        System.out.println("");
        
        CalculatorTrigonometri ct2 = new CalculatorTriRad();
        //CalculatorTrigonometri ct1 = new CalculatorTrigonometri();
        hasiljumlah = ct2.penjumlahan(3,4);
        System.out.println("Nilai op awal = "+ct2.op);
        ct2.konversi(rad);
        System.out.println("Nilai rad = "+rad+ " setelah konversi = "+ ct2.op);
        hasilSin = ct2.menghitungSin();
        System.out.println("Nilai sin = "+rad+ " radian  adalah = "+ hasilSin);
        
        
    }
}
