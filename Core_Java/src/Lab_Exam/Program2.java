package Lab_Exam;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class CloseEventListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		exit();
	}

	private void exit() {

		System.exit(0);
	}
}

class CSE1 {
	class AddEventListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int result = getValuesofBothSections();
			if (result == -1) {
				message.setText("Invalid Input: Please Enter a valid integer and must be greater than 0");
			} else {
				message.setText("factorial is " + solver(result));
			}
		}
	}

	private JFrame frame;

	private JPanel panel;
	private JLabel label;
	private JLabel message;
	private JTextField cse1ValueField;
	private int value1 = 0;

	public CSE1() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(600, 400);
		frame.add(panel);
		panel.setLayout(null);

		label = new JLabel("Enter the Number for factorial computation: ");
		label.setBounds(10, 20, 250, 25);
		panel.add(label);
		cse1ValueField = new JTextField();
		cse1ValueField.setBounds(300, 20, 165, 25);
		panel.add(cse1ValueField);

		JButton addButton = new JButton("Compute");
		addButton.setBounds(10, 120, 150, 25);
		addButton.addActionListener(new AddEventListener());
		panel.add(addButton);

		JButton exitButton = new JButton("Quit");
		exitButton.setBounds(200, 120, 150, 25);
		exitButton.addActionListener(new CloseEventListener());
		panel.add(exitButton);

		message = new JLabel("");
		message.setBounds(10, 150, 400, 25);
		panel.add(message);
		frame.setVisible(true);

	}

	private int getValuesofBothSections() {

		boolean ok = false;
		String TextFeild1 = cse1ValueField.getText();
		try {
			value1 = Integer.parseInt(TextFeild1);
			ok = true;
		} catch (Exception e) {
			ok = false;
		}

		if (ok) {
			if (value1 < 0) {
				return -1;
			}
			int result = value1;
			return result;
		} else {
			return -1;
		}

	}

	private int solver(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

}


public class Program2 {

	public static void main(String[] args) {
		CSE1 cse = new CSE1();
			
	}

}
