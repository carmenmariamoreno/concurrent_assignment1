package concurrent_assignment1.D;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/** Lazy must:
 * - Extend Thread
 * - Enter in a loop which iterates a random number of times between 2 to 8.
 * - Sleep 1 second
 * - At each iteration, it displays a random message among: “I am dressing up…”, “Just a sec, please…”, or “These clothes do not suit me…”.
 * - If Hurry interrupts Lazy before it is finished, Lazy claims: “That’s not cricket, please play the game!”.
 * - If Lazy finishes before being interrupted, it says “I am ready, the early bird catches the worm!”.
 * 
 * @author yournamehere
 *
 */



public class Lazy extends Thread{
    
    /*int random = (int)((Math.random()*6) + 2);
    int randommessages = (int)((Math.random()*3));*/
    //Random nrandom = new Random(System.currentTimeMillis());
    //boolean exit=false;
    
    String[] messages = {"I am dressing up...", "Just a sec, please...","These clothes do not suit me..."};
    
    
    @Override
    public void run(){
        Random nrandom=new Random();
        int random = (nrandom.nextInt(6))+2;
        
        for (int i = 0; (i < random) && !Thread.currentThread().isInterrupted(); i++) {
            System.out.println(messages[nrandom.nextInt(3)]);
          //while (!exit){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
               this.interrupt();                    
            }        
            
        }
        
         if (Thread.currentThread().isInterrupted()){
        System.out.println("That's not cricket, please play the game!");
        }
         
        if(!Thread.currentThread().isInterrupted()){
            System.out.println("I am ready, the early bird catches the worm!");
        } 
        
        }
        
        
        
    }
    /*public static void main (String argsString[]){
        
        (new Thread(new Lazy())).start();
       
        
    }*/
