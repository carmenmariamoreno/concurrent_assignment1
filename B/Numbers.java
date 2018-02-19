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
       id=5; 
    }
     
    public static void main (String args[]){
       
       (new Numbers()).start();
       (new T_PrintID (id)).start();
    }

}
