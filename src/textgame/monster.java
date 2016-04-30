package textgame;

import java.util.Random;

public class monster {
   int กว้าง ,   สูง ;
   int x , y ;
   int x2 , y2;
   boolean ตาย = false;
public monster(int x , int y  ,int กว้าง ,int สูง) {
   this.x = x ;
   this.y = y ;
   this.กว้าง = กว้าง;
   this.สูง  = สูง;
}
    
    void เดิน( ){
        y2=y;
        x2=x;
        
        
        Random สุ่ม = new Random();
        int  ทิศ = สุ่ม.nextInt(4) + 1;
        if(ทิศ == 1)
            y+=1;
        else  if(ทิศ == 2)
            y-=1;
        else  if(ทิศ == 3)
            x+=1;
        else  
            x-=1; 
        
        while (x==0||x==กว้าง+1||y==0||y==สูง+1) {       
        ไม่เดิน();     
        สุ่ม = new Random();
        ทิศ = สุ่ม.nextInt(4) + 1;
        if(ทิศ == 1)
            y+=1;
        else  if(ทิศ == 2)
            y-=1;
        else  if(ทิศ == 3)
            x+=1;
        else  
            x-=1;  
        }   
    }
     
   void ไม่เดิน(){
        y=y2;
        x=x2;
   }
   
   void ตาย(){
       ตาย = true;
   }
    
    
}