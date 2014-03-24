package Dev;

import java.util.Timer;
import java.util.TimerTask;

public class BackTime extends Thread{ 
	Main teMain = new Main();
	
	
    Gox test = new Gox(teMain.mFrame);
	
	public void run(){ 
    
		Timer time2 = new Timer();
	    
	    time2.schedule(test, 5000,1000);
		try {
	         Thread.sleep(200000);
	      } catch(InterruptedException ex) {
	         //
	      }
	    time2.cancel();
    }
}

class Gox extends TimerTask {
	Framer teMain = new Framer("");
	
	public Gox(Framer m){
		
		teMain = m;
	}
	
   // Framer test = new Framer("c");
    
	   public void run() {
		  // System.out.println(new Date());
		   
		   //teMain.god_num++;
		   if(teMain.dirty_i == 800 || teMain.dirty_i == 600 || teMain.dirty_i == 400 || teMain.dirty_i == 200){
				
			   teMain.god_num=3;
		   }
		   if(teMain.hungry_i == 0){
			   
			   teMain.god_num=6;
		   }
		   if(teMain.sick_i == 300 || teMain.sick_i == 299){
			   
			   teMain.god_num=9;
		   }
		   if(teMain.happy_i == 988 || teMain.happy_i == 198){
			   
			   teMain.god_num=12;
		   }
		   teMain.scene();
		   
		   
	   }
	}