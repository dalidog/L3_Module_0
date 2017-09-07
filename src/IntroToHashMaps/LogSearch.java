package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener{
	HashMap<Integer, String> ID = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Entry");
	JButton button2 = new JButton("Search by ID");
	JButton button3 = new JButton("View List");
	JButton button4 = new JButton("Remove Entry");
	public static void main(String[] args) {
		LogSearch log = new LogSearch();
	}
	LogSearch(){
		frame.add(panel);
		panel.add(button1);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setVisible(true);
		frame.pack();
	}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	  
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String userAnswer = "";
		String userAnswer2 = "";
		int user = 0;
		if(e.getSource() == button1){
			userAnswer = JOptionPane.showInputDialog("Enter an ID number.");
			user = Integer.parseInt(userAnswer);
			userAnswer2  = JOptionPane.showInputDialog("Enter a name.");
			ID.put(user, userAnswer2);
		}
		else if(e.getSource() == button2){
			String userAnswer3 = JOptionPane.showInputDialog("Enter an ID number.");
			int user2 = Integer.parseInt(userAnswer3);
			if(ID.containsKey(user2)){
				System.out.println(ID.get(user2));
			}
			else{
				JOptionPane.showMessageDialog(null, "This entry does not exist.");
			}
		}
		else if(e.getSource() == button3){
			for(Integer i : ID.keySet()){
				System.out.println("ID: " + i + " Name: "+ ID.get(i) );
			}
			
		}
		else if (e.getSource() == button4){
			String userAnswer4 = JOptionPane.showInputDialog("Enter an ID number.");
			int user3 = Integer.parseInt(userAnswer4);
			if(ID.containsKey(user3)){
				ID.remove(user3);
		}
			else{
				JOptionPane.showMessageDialog(null, "This ID is not on  the list.");
			}
	}
	
}}
