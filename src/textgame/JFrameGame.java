package textgame;
 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class JFrameGame extends javax.swing.JFrame {

    int ทิศเดิน = 0;
    public JFrameGame() {
        initComponents();
        
   text.addKeyListener(new KeyListener() { 
        @Override
        public void keyTyped(KeyEvent e) { 
        }
 
        @Override
        public void keyReleased(KeyEvent e) {
        }
         @Override
        public void keyPressed(KeyEvent e) { 
              int keyCode = e.getKeyCode();
    switch( keyCode ) { 
        case KeyEvent.VK_W: 
            ทิศเดิน = 2;
            break;
        case KeyEvent.VK_S: 
            ทิศเดิน = 1;
            break;
        case KeyEvent.VK_A: 
            ทิศเดิน = 4 ;
            break;
        case KeyEvent.VK_D: 
           ทิศเดิน=3;
            break;
        case KeyEvent.VK_SPACE: 
            if (ระเบิด.วางแล้ว || ผู้เล่น.ตาย)
                return;  
            
            ระเบิด =   new Bome(ผู้เล่น.x, ผู้เล่น.y);
            ระเบิด.วาง();
            break;
            case KeyEvent.VK_N: 
           เริ่มเกมใหม่();
            break;
        }
    
     
        }
    });
          
        เริ่มเกม();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        b = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bomberman Text");

        text.setEditable(false);
        text.setColumns(20);
        text.setFont(new java.awt.Font("SimHei", 0, 18)); // NOI18N
        text.setRows(5);
        text.setTabSize(11);
        jScrollPane1.setViewportView(text);

        jLabel1.setText("W:ขึ้น   S:ลง   A:ซ้าย   D:ขวา   Space:วางระเบิด       N:เริ่มเกมใหม่");

        a.setText(".");
        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aKeyTyped(evt);
            }
        });

        b.setText("P");
        b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bKeyTyped(evt);
            }
        });

        c.setText("#");
        c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cKeyTyped(evt);
            }
        });

        e.setText("*");
        e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eKeyTyped(evt);
            }
        });

        d.setText("o");
        d.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dKeyTyped(evt);
            }
        });

        jButton1.setText("เริ่มเกมใหม่");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyTyped
       if(a.getText().length()>=1)  
        evt.consume(); 
    }//GEN-LAST:event_aKeyTyped

    private void bKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bKeyTyped
          if(b.getText().length()>=1)   
        evt.consume(); 
    }//GEN-LAST:event_bKeyTyped

    private void cKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cKeyTyped
         if(c.getText().length()>=1)  
          evt.consume(); 
    }//GEN-LAST:event_cKeyTyped

    private void dKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dKeyTyped
        if(d.getText().length()>=1)  
          evt.consume();
    }//GEN-LAST:event_dKeyTyped

    private void eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eKeyTyped
        if(e.getText().length()>=1)  
          evt.consume();
    }//GEN-LAST:event_eKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     พื้นที่  = " "+a.getText();
     ตำแหน่งผู้เล่น  = " "+b.getText();
     มอนเตอร์ = " "+c.getText();
     ลูกระเบิด = " "+d.getText();
     บูม     = " "+e.getText(); 
     เริ่มเกมใหม่();
    }//GEN-LAST:event_jButton1ActionPerformed
 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.JTextField c;
    private javax.swing.JTextField d;
    private javax.swing.JTextField e;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
     String เกม = null ;
     int เวลา  = 0;
     int กว้าง  = 15 ;
     int สูง    = 8 ;
     String  พื้นที่  = " .";
     String  ตำแหน่งผู้เล่น  = " P";
     String  มอนเตอร์ = " #";
     String  ลูกระเบิด = " o";
     String  บูม     = " *";
     Player  ผู้เล่น    = new Player(2, 2 , กว้าง , สูง);
     monster มอน1   = new monster(5, 5, กว้าง , สูง);
     Bome    ระเบิด   = new Bome(ผู้เล่น.x, ผู้เล่น.y); 
     Timer timer ;
      private void เริ่มเกมใหม่() {
          timer.cancel();
          timer.purge();
          เริ่มเกม();
      }

    private void เริ่มเกม() {
      ผู้เล่น    = new Player(2, 2 , กว้าง , สูง);
      มอน1   = new monster(5, 5, กว้าง , สูง);
      ผู้เล่น.ตาย = false;
      มอน1.ตาย = false;
      ระเบิด   = new Bome(ผู้เล่น.x, ผู้เล่น.y); 
        
        timer = new Timer();
        
        timer.schedule(new TimerTask() { 
        public void run() {  
            
            
            เกม = "  \n";
            if (ผู้เล่น.ตาย) {
            เกม = "Game Over. \n";  
            }
            if (มอน1.ตาย) {
            เกม = "Win. \n";  
            }
            if(!ผู้เล่น.ตาย && !มอน1.ตาย) {
            มอน1.เดิน();
            ผู้เล่น.เดิน(ทิศเดิน);  
            ระเบิด.รอ();
            }
            
            for(int ไอ = 1; ไอ<=สูง; ไอ++){//สร้างสูง
     for(int ไ = 1; ไ<=กว้าง; ไ++)//สร้างกว้าง
     {          
         
        if(ระเบิด.วางแล้ว && !ระเบิด.ทำงาน && ไอ ==ระเบิด.y && ไ == ระเบิด.x){
            เกม += ลูกระเบิด ; 
        }
         else
          if(ระเบิด.ทำงาน && ระเบิด.ระเบิด(ไ, ไอ))
          {
         เกม += บูม; 
            if(ระเบิด.ระเบิด(ผู้เล่น.x,ผู้เล่น.y)){
                ผู้เล่น.ตาย(); 
            }
            else if(ระเบิด.ระเบิด(มอน1.x,มอน1.y)){
                มอน1.ตาย();
            }
          }
         else
         if(ไอ == ผู้เล่น.y && ไ == ผู้เล่น.x && !ผู้เล่น.ตาย) 
         { 
           เกม += ตำแหน่งผู้เล่น; 
           if(ผู้เล่น.y == มอน1.y && ผู้เล่น.x == มอน1.x) {
               ผู้เล่น.ตาย();
           }
         }
         else 
         if(ไอ == มอน1.y && ไ == มอน1.x)          
         {
           เกม += มอนเตอร์; 
         }
         else
              เกม += พื้นที่; 
     }
              เกม += "\n"; 
     }
             text.setText(เกม);
              
             ทิศเดิน = 0 ;
             
             เวลา++;
        }
         
        
          }, 0 , 300);
        
       
    }
     
}
