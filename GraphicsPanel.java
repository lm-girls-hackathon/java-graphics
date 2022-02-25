import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GraphicsPanel extends JPanel implements KeyListener{

	// default constructor
	public GraphicsPanel() {
		setPreferredSize(new Dimension(1280,720));  
	}


	//add your draw methods here
	public void paint(Graphics g){
		//sample drawing
		g.drawRect(100, 100, 100, 100);
	}


	@Override
	//triggers when a key is typed 
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	//triggers once when a key is pressed, it retriggers when it is released then repressed
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	//triggers once when a key is released
	public void keyReleased(KeyEvent e) {
		
	}

}