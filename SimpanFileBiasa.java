import java.io.*;

/**
 * class SimpanFileBiasa here.
 *
 * @author dientaufan
 * @version 0.1
 */
public class SimpanFileBiasa implements SimpanOperasiKalkulator
{
    
    // instance variables - replace the example below with your own
    
    //private int i=0;
    /**
     * Constructor for objects of class SimpanFileBiasa
     */
    public SimpanFileBiasa()
    {
        // initialise instance variables
      
    }

    /**
     * menyimpanKeFile
     *
     * @param  String
     * @return  void
     */
    public void simpanOperasi(String data) throws IOException
    {
        // put your code here
        //simpan ke file
        //System.out.println("ini dari file biasa");
         //char[] temp = new char[1024];
         File tempFile = new File("proses.txt");
         boolean exists = tempFile.exists();
         //System.out.println(exists);
         FileInputStream in = null;
         FileOutputStream out = null; 
         //int i=0;
         FileWriter fileWritter = null;
         
         try{
             if (exists) 
             {
                 fileWritter = new FileWriter("proses.txt",true);
                 BufferedWriter bw = new BufferedWriter(fileWritter);
                 bw.write("\n");
                 bw.write(data);
                 bw.close();
                 /*
                 in = new FileInputStream("proses.txt");
                 int c;
                 while ((c = in.read()) != -1) 
                 {
                    temp[i] = (char) c;
                    i = i + 1;
                 }
                 //System.out.println(temp);
                
                in.close();
                out = new FileOutputStream("proses.txt");
                for(int x=0; x< i; x++){
                    char c = data.charAt(x);
                    out.write(temp[x]);
                }
                
                int lg = data.length();
                for(int x=0; x< lg; x++){
                    char c = data.charAt(x);
                    out.write(c);
                 
                }
            
                 */
             }
            // else {
                 
            /*
               out = new FileOutputStream("proses.txt");
                int lg = data.length();
                 for(int x=0; x< lg; x++){
                    char c = data.charAt(x);
                    out.write(c);
                }
              */  
            // }
            
             
            
        } 
         
         finally {
                try{  
                    in.close();
                    out.close();
                }
                catch(Exception e){}
               
        }
    }

    
   
    
    
    /**
     * bacaOperasi
     *
     * @param  String
     * @return  void
     */
    public String bacaOperasi()
    {
        // put your code here
        //simpan ke file
        //System.out.println("ini dari file biasa");
        return "temp";
    }
}
