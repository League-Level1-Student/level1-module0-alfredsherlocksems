package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String url = "https://www.hairybikers.com/uploads/images/_recipeImage/ChickenJalfrazi.jpg";
		// 2. create a variable of type "Component" that will hold your image
		//Done on line 3.
// 3. use the "createImage()" method below to initialize your Component
Component image = createImage(url);
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String curry = JOptionPane.showInputDialog("What type of indian food is this? (Example: If it's Chicken Korma, write 'Korma', with a capital letter.)");
		// 7. print "CORRECT" if the user gave the right answer
if (curry.equals("Jalfrezi")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
String pic = "https://imageresizer.static9.net.au/Uufmp9I9BAnOZh6_WRdDl5KYBM8=/1200x0/https%3A%2F%2Fprod.static9.net.au%2Ffs%2Ff2fb5c32-3a5a-414e-aebc-03559838e758";
		Component pic1 = createImage(pic);
// 11. add the second image to the quiz window
quizWindow.add(pic1);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String program = JOptionPane.showInputDialog("");
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
