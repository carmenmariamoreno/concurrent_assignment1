package concurrent_assignment1.A;

import static java.lang.Thread.sleep;

/**
 * Get the reference of the main thread */

public class Reference{
    
    public static void main(String[] args) throws InterruptedException {
        Thread h = Thread.currentThread ();  
        System.out.println("ID:"+h.getName());
        h.setName("mainT");
        System.out.println("ID:"+h.getName());

        
    for (int i=1; i<100; i=i+2){
            System.out.println(i);
            sleep(2000); //miliseconds
        }
    }
}
