package Dev;

import java.awt.BorderLayout;
import java.util.Timer;

import javax.swing.JFrame;


public class Main{
	
	
	static Framer mFrame;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			mFrame = new Framer("개 키우기");
			
		
			BackTime t = new BackTime(); 
			Thread thd = new Thread(t); 
		//	thd.start(); 
			
			mFrame.setLayout(new BorderLayout());
			
			
			mFrame.add(mFrame.low,BorderLayout.SOUTH);
			mFrame.add(mFrame.left,BorderLayout.EAST);
			mFrame.add(mFrame.center,BorderLayout.CENTER);
			
			
			mFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
			mFrame.pack();
			mFrame.setSize(800, 600);
			mFrame.setVisible(true);
			
			Timer time = new Timer();
			time.schedule(new GoTimen(mFrame), 1000,1000);
			try {
		         Thread.sleep(20000000);
		      } catch(InterruptedException ex) {
		         //
		      }
		    time.cancel();
			
		    /*GoTime gon = new GoTime(mFrame);
			Thread thd3 = new Thread(gon);
		    BackTime x = new BackTime(); 
			Thread thd2 = new Thread(x);
			
			thd3.start();
			thd2.start();
		    */
			
	}

}


