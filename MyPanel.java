package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel{

	public MyPanel()
	{
		this.setLayout(null);  //�����Ҫ�õ�setLocation() setBounds() ����Ҫ���ò���Ϊnull
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		//super.paintComponent(arg0);
		
		
		Image image=new ImageIcon("images/bg/bg1.png").getImage();
		
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
		
		
	}
	
	   	  
	

}