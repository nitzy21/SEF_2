package sef.module15.sample;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class InnerClassSample extends JFrame {
	
	
	private class InnerWindowAdapter extends WindowAdapter{
		
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
	
	public InnerClassSample(){
		setSize(300,300);
		setVisible(true);
		addWindowListener(new InnerWindowAdapter());
	}
	
	public static void main(String arg[]){
		new InnerClassSample();
	}

}
