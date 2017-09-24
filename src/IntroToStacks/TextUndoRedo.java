package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener{
	JFrame frame = new JFrame("The Shift Key is the Undo Key!");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String thing = "";
	
	Stack <String> text = new Stack<String>();
	public void UI() {
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.pack();
	}
	public static void main(String[] args) {
		TextUndoRedo t = new TextUndoRedo();
	t.UI();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		

		//thing = thing + text.peek();

if(e.getKeyCode()== KeyEvent.VK_BACK_SPACE) {
	String lastletter = thing.substring(thing.length()-1, thing.length()-1);
	thing=thing.substring(0, thing.length()-2);
	label.setText(thing);
	text.push(lastletter);
	System.out.println(lastletter);
	
}
else if(e.getKeyCode()== KeyEvent.VK_SHIFT){
	thing = thing+text.pop();

}
else{
	thing=thing+String.valueOf(e.getKeyChar());
}
label.setText(thing);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
}
