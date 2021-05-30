package view;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.Socket;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Login extends JFrame
{
	public loginPanel loginframe; 
	private JLabel unameJLableLabel;
	private JTextField unameJTextField;
	private JLabel upasswordJLabel;
	private JPasswordField upasswordLableField;
	private JButton button;

	public Login()
	{
		this.unameJLableLabel=new JLabel("username");
		this.unameJTextField=new JTextField();
		this.upasswordJLabel=new JLabel("password");
		this.upasswordLableField=new JPasswordField();
		this.button=new JButton("µÇÂ¼");
		
		this.setSize(400,300);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		loginframe=new loginPanel();
		loginframe.setBounds(0, 0, 400, 300);
		loginframe.setLayout(null);
		
		this.add(loginframe);
		this.loginframe.add(unameJLableLabel);
		this.loginframe.add(unameJTextField);
		this.loginframe.add(upasswordJLabel);
		this.loginframe.add(upasswordLableField);
		this.loginframe.add(button);
		
		button.setBounds(250, 100, 100, 30);
        button.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,18));
        button.setForeground(Color.white);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
		unameJLableLabel.setBounds(10,30,150,30);
		unameJLableLabel.setForeground(Color.white);
		unameJLableLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		unameJTextField.setBounds(10, 70, 120, 20);
		unameJTextField.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,16));
		unameJTextField.setOpaque(false);
		unameJTextField.setBorder(null);
		upasswordJLabel.setBounds(10, 100, 150, 30);
		upasswordJLabel.setForeground(Color.white);
		upasswordJLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		upasswordLableField.setBounds(10, 140, 120, 20);
		upasswordLableField.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,16));
		upasswordLableField.setOpaque(false);
		upasswordLableField.setBorder(null);
		Copyright.getSingletonInstance().copyrightout();
		
		MyEvent myevent=new MyEvent();
		this.button.addActionListener(myevent);
	}
	class MyEvent implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO ×Ô¶¯Éú³ÉµÄ·½·¨´æ¸ù
			
			String uname=unameJTextField.getText();
			String upassword=new String(upasswordLableField.getPassword());
			
			try {
				Socket socket=new Socket("42.193.38.194",8888);
				new MainFrame(uname,socket);
				setVisible(false);
			} catch (IOException e1) {
				// TODO ×Ô¶¯Éú³ÉµÄ catch ¿é
				e1.printStackTrace();
			}
			
			
		}
		
	}

}


