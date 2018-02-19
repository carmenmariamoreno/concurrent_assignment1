package concurrent_assignment1.A;

/**
 * Get the reference of the main thread */

public class Reference {
    Thread h = Thread.currentThread ();
    int i;
    for(i=1;i<100;i=i+2){
        System.out.println(i);
    }
}
