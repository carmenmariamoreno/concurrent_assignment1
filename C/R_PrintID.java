package concurrent_assignment1.C;
/**
 * Modify class concurrent_assignment1.B.TPrintID so that it is created implementing Runnable 
 * (call the new class R_PrintID). 
 * And now the loop sleeps the thread a random time between 0 and 1.
 * 
 * @author yournamehere
 *
 */

import static java.lang.Thread.sleep;
import java.util.Random;


public class R_PrintID implements Runnable {

    int ID;
    Random nrandom = new Random(System.currentTimeMillis());
    
    
    public R_PrintID(){
        ID=10;
    }
    
    public R_PrintID(int n){
        ID=n;
    }
    
    public void run(){
        
        for (int i =0; i<10; i++){
            //System.out.println(ID);
            
            try{
                Thread.sleep(nrandom.nextInt(1000));
                System.out.println(ID);
                
            } catch(InterruptedException ex){
                System.out.println("Interrupted Exception " +ex);
            }
        }
    }
    public static void main (String argsString[]){
        
        (new Thread(new R_PrintID())).start();
       
        
    }
}
