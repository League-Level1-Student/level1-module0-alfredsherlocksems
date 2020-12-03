package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cookie implements ActionListener {
	 public void showButton() {
        JFrame window = new JFrame();
  window.setVisible(true); 
	JButton button = new JButton();
	window.add(button);
	window.pack();
	button.addActionListener(this);
	 
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo!");
Random ran = new Random();
int ran1 = ran.nextInt(5);
	if (ran1 == 0) {
		JOptionPane.showMessageDialog(null, "YAY!");
	}
	else if (ran1 == 1) {
		JOptionPane.showMessageDialog(null, "Fun!");
	}
else if (ran1 == 2) {
	JOptionPane.showMessageDialog(null, "Awesome!");	
	}
else if (ran1 == 3) {
	JOptionPane.showMessageDialog(null, "Amazing!");
}
else if (ran1 == 4) {
	JOptionPane.showMessageDialog(null, "Incredulous!");	
}
	
	}
}
