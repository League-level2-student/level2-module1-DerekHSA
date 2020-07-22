package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	ArrayList<String> List = new ArrayList<String>();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	public static void main(String[] args) {
		new GuestBook().run();
	}
	public void run(){
		frame.add(panel);
		button1.setText("Add Name");
		button2.setText("View Names");
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String vacant="";
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.equals(button1)) {
			String input=JOptionPane.showInputDialog("What name would you like to add?");
			List.add(input);
		}else if(buttonPressed.equals(button2)) {
			for (int i = 0; i < List.size(); i++) {
				vacant+=("Guest #"+(i+1)+": "+List.get(i)+"\n");
			}
			JOptionPane.showMessageDialog(null, vacant);
		}
	}
}
