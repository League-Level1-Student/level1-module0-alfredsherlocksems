package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton button = new JButton();
	 JButton button1 = new JButton();
	 JButton button2 = new JButton();
	public void showButton() {
	 JFrame window = new JFrame();	
		window.setVisible(true);
	JPanel panel = new JPanel();
		window.add(panel);
button.setText("Ducks");
	button1.setText("Frogs");
button2.setText("Cute Fluffy Unicorns");
	panel.add(button);
panel.add(button1);
panel.add(button2);
	window.pack();
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	}	
	void showDucks() {
	     JOptionPane.showMessageDialog(null, "Ducks!");
	}

	void showFrog() {
	   JOptionPane.showMessageDialog(null, "Frogs!");
	}

	void showFluffyUnicorns() {
	    JOptionPane.showMessageDialog(null, "FLUFFY UNICORNS!");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if (pressed == button) {
		showDucks();	
		}
		if (pressed == button1) {
			showFrog();	
		}
		if (pressed == button2) {
			showFluffyUnicorns();	
		}
	}
}