package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class loginPanel extends JPanel{
	
	protected void paintComponent(Graphics g)
	{
		Image image=new ImageIcon("images/login.png").getImage();
		g.drawImage(image, 0, 0,this.getWidth() ,this.getHeight(),null );
	}

}