import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GraphicsPanel extends JPanel implements KeyListener{

	// default constructor
	public GraphicsPanel() {
		setPreferredSize(new Dimension(1280,720));  
		this.setFocusable(true);					    
		this.addKeyListener(this);
	}


	//add your draw methods here
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.RED);
		
		g2.drawRect(100, 100, 100, 100);
		
		g2.setFont(new Font("Arial", 1, 50));
		g2.drawString("TEXT", 50,50);
			   
	}


	@Override
	//triggers when a key is typed 
	public void keyTyped(KeyEvent e) {
			//gets character data and stores in char c
		        char c = e.getKeyChar();
			System.out.println("The key you pressed was " + c );

	}

	@Override
	//triggers once when a key is pressed, it retriggers when it is released then repressed
	// method: keyPressed()
	// description: This method is called when a key is pressed. You can determine which key is pressed using the 
	//		KeyEvent object.  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
	//		the left key was pressed.
	// parameters: KeyEvent e
	public void keyPressed(KeyEvent e) {
			
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
				System.out.printLn("You pressed the right arrow");
		

	}

	@Override
	//triggers once when a key is released
	public void keyReleased(KeyEvent e) {
		
	}

}
