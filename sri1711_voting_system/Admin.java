package VotePackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Admin {
	public static void  admin_otp_frame(){
		JFrame otp_frame = new JFrame();
		otp_frame.setContentPane(new JLabel(new ImageIcon("D:/Eclipse/workspace/Elite Voting System/images/blue_pattern.png")));
		
		//Links for the images used
		String url = "D:/Eclipse/workspace/Elite Voting System/images/ElectionComm-top-image.jpeg";
		String login_url ="D:/Eclipse/workspace/Elite Voting System/images/admin-login-button-3.png";
		String back_url ="D:/Eclipse/workspace/Elite Voting System/images/back-image.jfif";
		
//		ImageIcon background_icon = new ImageIcon(Background_url);
//		Image im = background_icon.getImage();
//		Image resizedImage_background = im.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
		
		
		//Creating Image Icons
		ImageIcon login_icon = new ImageIcon(login_url);
		ImageIcon back_icon = new ImageIcon(back_url);
				
		//Creating Labels,Button,TextField
		JLabel image = new JLabel(new ImageIcon(url));
		JLabel frame_title = new JLabel("OTP Portal");
		frame_title.setForeground(new Color(255, 215, 0));
		JLabel otp = new JLabel("Enter OTP :  ");
		otp.setForeground(new Color(255, 215, 0));
		JTextField otp_input = new JTextField();
		
		JButton otp_button = new JButton("Login");
		otp_button.setForeground(new Color(255, 215, 0));
		otp_button.setBackground(new Color(76,81,137));
		
		JButton back_button = new JButton("Back");
		back_button.setForeground(new Color(255, 215, 0));
		back_button.setBackground(new Color(76,81,137));
		
		//Adding components in frame 
		otp_frame.add(image);
		otp_frame.add(frame_title);
		otp_frame.add(otp);
		otp_frame.add(otp_input);
		otp_frame.add(otp_button);
		otp_frame.add(back_button);
		
		//otp_frame.getContentPane().setBackground(new Color(248, 248, 250));
		
		//Dimensions of  labels,buttons
		Dimension image_size = image.getPreferredSize();
		Dimension frame_title_size = frame_title.getPreferredSize();
		Dimension otp_size = otp.getPreferredSize();
		
		frame_title.setFont(frame_title.getFont().deriveFont(32f));
		otp.setFont(otp.getFont().deriveFont(22f));
		
		//Setting coordinates and width and height of labels,buttons
		image.setBounds(200, 50, image_size.width, image_size.height);
		frame_title.setBounds(300, 150, frame_title_size.width*32, frame_title_size.height+32);
		otp.setBounds(200, 250, otp_size.width*22, otp_size.height+22);
		otp_input.setBounds(400, 260, 120, 25);
		otp_button.setBounds(525, 325, 80, 40);
		back_button.setBounds(425, 325, 80, 40);
		
		otp_frame.setLayout(null);
		otp_frame.setSize(800,600);
		otp_frame.setVisible(true); 
	}
	public static void main(String[] args){
		admin_otp_frame();
	}

}