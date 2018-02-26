package concurrent_assignment1.B;

/**
 * Create class Numbers which instantiates 5 T_PrintID objects (with ID 1 to 5) and runs them.
 * Can you detect some problem? Can you explain the reason?
 * 
 * @author yournamehere
 *
 */

public class Numbers extends Thread{

    int id;
    
        @Override
    public void run(){
       for (int i = 1; i<6; i++){
       (new Thread (new T_PrintID (i))).start();
       }
    }
     
    public static void main (String args[]){
       
       (new Numbers()).start();
    }

}
