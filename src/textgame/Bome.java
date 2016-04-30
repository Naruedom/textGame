package textgame;

public class Bome { 
   int x , y ; 
   int[][]bom = new int[9][2];
   int เวลาระเบิด = 5 ;
   int เวลาระเบิดหยุด = 8 ;
   int เวลา = 0;
   boolean ทำงาน = false;
   boolean วางแล้ว = false;
   
public Bome(int x , int y  ) {
   this.x = x ;
   this.y = y ; 
    }
    
void รอ( ){ 
    if(!วางแล้ว)return;
    เวลา++;
    if(เวลา==เวลาระเบิด){
        ทำงาน = true;  
    }else if(เวลา == เวลาระเบิดหยุด){
        ทำงาน = false;
        วางแล้ว = false;
    }
}
    
     void วาง(){
         
         วางแล้ว = true;
         เวลา = 0;
     }
    
     
    void พิกัด( ){ 
          
       
       bom[0][0]= x ;
       bom[0][1]= y ;
       
       bom[1][1]= y ;
       bom[1][0]= x-1 ;
       bom[2][1]= y ;
       bom[2][0]= x-2 ;
       
       bom[3][1]= y ;
       bom[3][0]= x+1;
       bom[4][1]= y ;
       bom[4][0]= x+2;
       
       bom[5][0]= x ;
       bom[5][1]= y-1 ;
       bom[6][0]= x ;
       bom[6][1]= y-2 ;
       
       bom[7][0]= x ;
       bom[7][1]= y+1;
       bom[8][0]= x ;
       bom[8][1]= y+2;
       
       
     //     *
     //     *
     //   *****
     //     *
     //     *
                 } 
    
   boolean ระเบิด(int x, int y){
     พิกัด();
    for (int i = 0; i < 9; i++) { 
   if( bom[i][0]== x &&  bom[i][1]== y ){
        return true;
   }
    
}
    return false;
}
      
   
  
    public static void main(String[] args) {
        Bome b = new Bome(5,5);
         b.รอ();
        System.out.println(b.ระเบิด(3, 5));
    }
    
}