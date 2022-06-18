package com.arunabha.project.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


//to frame the ChatBot Area
public class ChatBot extends JFrame {
	private JTextArea Chatarea = new JTextArea();
	private JTextField chatbox = new JTextField();
	public   ChatBot() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setTitle("Noah here");
		frame.add(Chatarea);
		frame.add(chatbox);
		
		//For Text Area
		Chatarea.setSize(500, 400);
		Chatarea.setLocation(2, 2);
		
		//For TextField
		chatbox.setSize(540, 30);
		chatbox.setLocation(2, 500);
		
		chatbox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String gtext = chatbox.getText().toLowerCase();
				Chatarea.append("YOU ->" + gtext + "\n");
				chatbox.setText("");
				
				if(gtext.contains("hi")){
					bot("Hey there! How can I help you?");}
				
				
				
				else if(gtext.contains("how are you")){
					bot("I am Fine.How are you?");}
				
			
					
				
				else if(gtext.contains("need help")){
					bot("You can reach our tech team by these numbers=XXXXXXXXXX");}
				
			
					
				
				
				else if(gtext.contains("order problem")){
					bot("Press 1 to know the status of your order" + "\n" +"Press 2 to cancel your order" + "\n" + "Press 3 to contact the tech team");}
				
				
					
				
				
				else if(gtext.contains("1")){
					bot("Status of your order is:");}
				
				
					
				
				
				
				else if(gtext.contains("2")){
					bot("Your order has been cancelled");}
				
				
				
				
				
				else if(gtext.contains("3")){
					bot("Tech team details:Contact No:XXXXXXXXXXXXX"+"\n"+"Email:ajsdjhasj@gmail.com");}
				
				
					
				
				else {bot("Sorry, cannot understand you");}
					
					
				
			}
			
		});
	}
		
		private void bot(String string) {
			
			Chatarea.append("BOT ->"  +string+ "\n");
			}
			
		

		
		
	
	
	
	public static void main(String [] args) {
		new ChatBot();
		
	}

}
