package concurrent_assignment1.A;

/**
 * Get the reference of the main thread */

public class Reference{
    
    public static void main(String[] args) {
        Thread h = Thread.currentThread ();  
        
    for (int i=1; i<100; i=i+2){
            System.out.println(i);
        }
    }
}
