package Dev;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ClearTextArea extends JFrame {  
    
    public ClearTextArea() {
    	
        super( "ClearTextArea" );  
        getContentPane().setBackground( Color.green );  
        JPanel p = new JPanel();  
        BoxLayout layout = new BoxLayout( p, BoxLayout.Y_AXIS );  
        p.setLayout( layout );  
        p.setOpaque( false );  
        JTextArea ta = new JTextArea();  
        ta.setOpaque( false );  
        JScrollPane scroll = new JScrollPane( ta );  
        scroll.getViewport().setOpaque( false );  
        scroll.setOpaque( false );  
        p.add( scroll );  
        getContentPane().add( p );  
        
    }  
     
}  