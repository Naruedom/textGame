package textgame;

import java.util.Random;

public class Player {
   int กว้าง ,   สูง ;
   int x , y ;
   int x2 , y2;
   Bome b ;
   boolean ตาย = false;
public Player(int x , int y ,int กว้าง ,int สูง) {
   this.x = x ;
   this.y = y ;
   this.กว้าง = กว้าง;
   this.สูง  = สูง;
    }
    
    void เดิน(  int  ทิศ ){
        y2=y;
        x2=x;
        
        if(ทิศ == 0)
            return;
        else if(ทิศ == 1)
            y+=1;
        else  if(ทิศ == 2)
            y-=1;
        else  if(ทิศ == 3)
            x+=1;
        else  
            x-=1; 
        
        while (x==0||x==กว้าง+1||y==0||y==สูง+1) {       
        ไม่เดิน();      
        }   
    }
     
   void ไม่เดิน(){
        y=y2;
        x=x2;
   }
    
   void วางระเบิด(int x,int y){
       
       b =new Bome(x, y);
       
   }
   
   void ตาย(){
       ตาย = true;
   }
    
    
}