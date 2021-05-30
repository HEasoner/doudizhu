package view;

import javax.swing.JOptionPane;

public class Copyright {
	private static Copyright singletonInstance;
	
	private Copyright() {}
	
	 public static Copyright getSingletonInstance() {
	        if (singletonInstance == null) {
	            singletonInstance = new Copyright();
	        }
	        return singletonInstance;
	    }
	 public void copyrightout() {
		 JOptionPane.showMessageDialog(null, "该软件由何雨声和曾恒制作，如有侵权，将追究法律责任(确认以继续)", "版权声明",JOptionPane.WARNING_MESSAGE); 
	 }
}
