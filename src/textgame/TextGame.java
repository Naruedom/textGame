package textgame;

import java.util.Timer;
import java.util.TimerTask;

public class TextGame {

    public static void main(String[] args) {
     int กว้าง  = 10 ;
     int สูง    = 6 ;
     String ก  = ".";
     String ข  = "P";
     String มอนเตอร์= "๑";
     
     int x = 5 ;
     int y = 2 ;
     
     //monster มอน1 = new monster(5, 5);
     
     for(int ไอ = 0; ไอ<สูง; ไอ++){
     for(int ไ = 0; ไ<กว้าง; ไ++)
     {
         if(ไอ+1 == y && ไ+1 == x)             
              System.out.print(ข);
         else
         System.out.print(ก);
         
         //if(ไอ+1 == มอน1.y && ไ+1 == มอน1.x)             
          //    System.out.print(มอนเตอร์);
       //  else
        // System.out.print(ก);
     }
       System.out.println();
     }
     
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
     
        
        Timer timer = new Timer();
        
        timer.schedule(new TimerTask() { 
        public void run() { 
            System.out.println("timer");
        }
          }, 1000);
        
    }
 
}

  
    