package concurrent_assignment1.D;
/**
 * Hurry must:
 * - Be the main thread
 * - Create the Lazy thread.
 * - Wait for Lazy to finish. Each second it must print the message: “Aren’t you ready yet?” and checks if Lazy is finished.
 * - If Lazy isn’t finished after 5 seconds, Hurry will claim “You are resting in your laurels… and I am leaving!” and interrupts Lazy. Then it waits for Lazy to finish.
 * - However, if Lazy finishes before the 5 seconds deadline, Hurry says “At last, a turtle runs rings round you!”.
 * 
 * @author yournamehere
 *
 */


public class Hurry extends Thread{

    public static void main(String args[]) throws InterruptedException{
        
        Lazy t1 =new Lazy();
        t1.start();
        
        for (int i =0; i<5 && t1.isAlive(); i++){
            System.out.println("Aren't you ready yet?");
            
            Thread.sleep(1000); //It "stops" for 1 second, so for loop will be made each second
        }
        
        if (t1.isAlive()){
            System.out.println("You are resting in your laurels... and I am leaving!");
            t1.interrupt();
        }else{
            System.out.println("At last, a turtle runs rings round you!");
        }
        
        t1.join(); //to finish first Lazy thread
        
        
    }
}
    