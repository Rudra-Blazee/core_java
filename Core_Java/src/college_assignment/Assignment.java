import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Assignment {

	public static void main(String[] args) {
		CSE cse = new CSE();
	}
}

class CSE {
	

	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel message;
	private JTextField cse1ValueField;
	private JTextField cse2ValueField;
	private int value_A = 0;

	private int value_B = 0;

	public CSE() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(600, 400);
		frame.add(panel);
		panel.setLayout(null);

		label = new JLabel("CSE A count: ");
		label.setBounds(10, 20, 150, 25);
		panel.add(label);
		cse1ValueField = new JTextField();
		cse1ValueField.setBounds(100, 20, 165, 25);
		panel.add(cse1ValueField);

		label = new JLabel("CSE B count: ");
		label.setBounds(10, 50, 150, 25);
		panel.add(label);
		cse2ValueField = new JTextField();
		cse2ValueField.setBounds(100, 50, 165, 25);
		panel.add(cse2ValueField);

		JButton addButton = new JButton("Get sum");
		addButton.setBounds(10, 120, 150, 25);
		addButton.addActionListener(new AddNumber());
		panel.add(addButton);

		JButton exitButton = new JButton("Exit");
		exitButton.setBounds(200, 120, 150, 25);
		exitButton.addActionListener(new ExitEventListener());
		panel.add(exitButton);

		message = new JLabel("");
		message.setBounds(10, 150, 400, 25);
		panel.add(message);
		frame.setVisible(true);

	}

	public int getValuesofBothSections() {

		boolean ok1 = false;
		boolean ok2 = false;
		String TextFeild1 = cse1ValueField.getText();
		String TextFeild2 = cse2ValueField.getText();
		try {
			value_A = Integer.parseInt(TextFeild1);
			ok1 = true;
		} catch (Exception e) {
			ok1 = false;
		}

		try {
			value_B = Integer.parseInt(TextFeild2);
			ok2 = true;
		} catch (Exception e) {
			ok2 = false;
		}
		if (ok1 && ok2) {
			int result = value_A  +value_B;
			return result;
		} else {
			return 0;
		}

	}
	
	class ExitEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			exit();
		}

		private void exit() {
			System.exit(0);
		}
	}

	class AddNumber implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			int result = getValuesofBothSections();
			if (result == 0) {			
				message.setText("Invalid Input: Please Enter a valid integer and must be greater than 0");
			} else {			
				message.setText("Strength of CSE A and CSE B is: " + result);
			}
		}
	}

}


