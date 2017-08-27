package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		GuestBook g = new GuestBook();
		g.createG();
	}

	public void createG() {
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String userAnswer = JOptionPane.showInputDialog("Enter a name");
			names.add(userAnswer);
		}
		if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, names);
		}
	}

	// When the add name button is clicked, display an input dialog that asks
	// the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked,
	// display a message dialog that displays
	// all the names added to the list.

}
