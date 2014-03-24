package Dev;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

class GoTime extends Thread {
	Framer teMain;
	
	public GoTime(Framer m){
		
		teMain = m;
	}
//	스래드{  while(true) {  갱신 } }
   // Framer test = new Framer("c");
    
	   public void run() {
		  // System.out.println(new Date());
		   
		   Timer time = new Timer();
			time.schedule(new GoTimen(teMain), 1000,1000);
			try {
		         Thread.sleep(20000000);
		      } catch(InterruptedException ex) {
		         //
		      }
		    time.cancel();
			
		   
		   
	   }
	}
class GoTimen extends TimerTask {
	//Main teMain = new Main();
	
   // Framer test = new Framer("c");
	
	
	Framer teMain;
	
	public GoTimen(Framer m){
		
		
		teMain = m;
	}
	   public void run() {
		   Random valRandom = new Random();
		   
		   int val = valRandom.nextInt(150);
		   
		   if(teMain.hungry_i > 0){
			   teMain.hungry_i-=2;
		   }
		   if(teMain.dirty_i > 0){
				   teMain.dirty_i-=1;
		   }
		   if(teMain.happy_i > 0){
			   teMain.happy_i-=4;
		   }
		   if(teMain.dirty_i == 800 || teMain.dirty_i == 600 || teMain.dirty_i == 400 || teMain.dirty_i == 200){
				
				teMain.ddong.setBounds(val, 250, 150, 150);
				teMain.ddong.setVisible(true);
				teMain.center.add(teMain.ddong, new Integer(3));
		   }
		   
		   if(teMain.hungry_i < 500 || teMain.hungry_i < 500){
			   if(teMain.dirty_i < 500 && teMain.hungry_i < 500){
				   teMain.sick_i-=2;
			   }
			   else{
				   teMain.sick_i-=1;
				   
			   }
		   }
		   
		   
		   if(teMain.active_i == 1000){
				JPanel frontp2 = new JPanel() {
					public void paintComponent(Graphics g) {
						g.drawImage(teMain.activeImage, 0, 0, 300, 300, this);
					}
				};
				
				frontp2.setBounds(180, 130, 300, 300);
				teMain.center.add(frontp2, new Integer(3));
				teMain.add(teMain.center);
			   
		   }
		   if(teMain.smart_i == 1000){
				JPanel frontp2 = new JPanel() {
					public void paintComponent(Graphics g) {
						g.drawImage(teMain.smartImage, 0, 0, 300, 300, this);
					}
				};
				
				frontp2.setBounds(180, 130, 300, 300);
				teMain.center.add(frontp2, new Integer(3));
				teMain.add(teMain.center);
				
		   }
		   if(teMain.hungry_i == 0){
				JPanel frontp2 = new JPanel() {
					public void paintComponent(Graphics g) {
						g.drawImage(teMain.skullImage, 0, 0, 300, 300, this);
					}
				};
				teMain.display.setText("너의 개가 죽었어!");
				frontp2.setBounds(300, 0, 300, 300);
				teMain.center.add(frontp2, new Integer(3));
				teMain.add(teMain.center);
				
		   }
		   
		   //teMain.textArea.replaceRange(teMain.content, 0, teMain.content.length());
		   String content = "청    결: "+teMain.dirty_i+
					"/1000\n포만감 : "+teMain.hungry_i+ 
					"/1000\n활동성 : "+teMain.active_i+ 
					"/1000\n지    식 : "+teMain.smart_i+
					"/1000\n체    력 : "+teMain.energy_i+ 
					"/1000\n건    강 : "+teMain.sick_i+ 
					"/1000\n기    분 : "+teMain.happy_i+"/1000";
			
		   teMain.textArea.setText(content);
		  // System.out.println(new Date());
		   
		  /* teMain.mFrame.hungry_i++;
		   teMain.mFrame.left.remove(teMain.mFrame.textArea);
		   teMain.mFrame.data();
		   teMain.mFrame.left.revalidate(); 
		  */ 
		   
	   }
	}