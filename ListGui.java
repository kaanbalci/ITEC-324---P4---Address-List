package project4;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;

public class ListGui {
	
	AddressList list = new AddressList();
	/**
	 * initialize text fields and frame
	 */
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListGui window = new ListGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		/**
		 * create labels,Panels,frame, buttons, text field/areas and add them to frame and create 
		 * action listeners for buttons 
		 * Format bounds and various options
		 */
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.BLUE);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		tabbedPane.addTab("Data Input", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(6, 6, 40, 16);
		panel.add(lblName);
		
		JLabel lblNewLabel = new JLabel("Address: ");
		lblNewLabel.setBounds(6, 34, 61, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-Mail: ");
		lblNewLabel_1.setBounds(6, 69, 61, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telephone(with dashes): ");
		lblNewLabel_2.setBounds(6, 92, 162, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date of Birth: ");
		lblNewLabel_3.setBounds(6, 125, 97, 16);
		panel.add(lblNewLabel_3);
		
		JButton btnAddInputTo = new JButton("Add input to front");
		btnAddInputTo.setBounds(40, 164, 140, 29);
		panel.add(btnAddInputTo);
		
		JButton btnAddInputTo_1 = new JButton("Add input to back");
		btnAddInputTo_1.setBounds(248, 164, 140, 29);
		panel.add(btnAddInputTo_1);
		
		textField = new JTextField();
		textField.setBounds(98, 120, 290, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 92, 222, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(98, 64, 290, 26);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(98, 1, 290, 26);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(98, 29, 290, 26);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		tabbedPane.addTab("Show Info", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnTostring = new JButton("ToString");
		btnTostring.setBounds(6, 6, 97, 21);
		panel_1.add(btnTostring);
		
		JButton btnNewButton = new JButton("Reverse (ToString)");
		btnNewButton.setBounds(35, 36, 124, 21);
		panel_1.add(btnNewButton);
		
		final JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBounds(45, 7, 117, 138);
		textArea.setEditable(false);
		panel_1.add(textArea);
		
		//JScrollPane scrollBar = new JScrollPane();
		JScrollPane scroll = new JScrollPane (textArea, 
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(6, 69, 417, 157);
		panel_1.add(scroll);
		
		JButton btnShowListSize = new JButton("Show List Size");
		btnShowListSize.setBounds(143, 6, 117, 21);
		panel_1.add(btnShowListSize);
		
		JButton btnEmptytrueOr = new JButton("Empty (True or False)");
		btnEmptytrueOr.setBounds(235, 36, 163, 21);
		panel_1.add(btnEmptytrueOr);
		
		JButton btnNewButton_1 = new JButton("Reverse");
		btnNewButton_1.setBounds(306, 6, 117, 21);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		tabbedPane.addTab("Search", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblSearchField = new JLabel("Search Field: ");
		lblSearchField.setBounds(6, 6, 83, 16);
		panel_2.add(lblSearchField);
		
		textField_5 = new JTextField();
		textField_5.setBounds(88, 1, 216, 26);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setEditable(false);
		textArea_1.setBounds(6, 66, 324, 160);
		JScrollPane scroll_2 = new JScrollPane (textArea_1, 
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll_2.setBounds(6, 56, 321, 170);
		panel_2.add(scroll_2);
		
		JLabel lblInput = new JLabel("_Output_");
		lblInput.setBounds(130, 39, 61, 16);
		panel_2.add(lblInput);
		
		JButton btnNewButton_2 = new JButton("DOB");
		btnNewButton_2.setBounds(333, 50, 90, 29);
		panel_2.add(btnNewButton_2);
		
		JButton btnPhone = new JButton("Phone");
		btnPhone.setBounds(333, 20, 90, 29);
		panel_2.add(btnPhone);
		
		JLabel lblSearchByName = new JLabel("Search By Name");
		lblSearchByName.setBounds(316, 1, 107, 16);
		panel_2.add(lblSearchByName);
		
		JButton btnNewButton_3 = new JButton("Email");
		btnNewButton_3.setBounds(333, 81, 90, 29);
		panel_2.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("By Phone #");
		lblNewLabel_4.setBounds(339, 115, 83, 16);
		panel_2.add(lblNewLabel_4);
		
		JButton btnName = new JButton("Name");
		btnName.setBounds(339, 137, 84, 29);
		panel_2.add(btnName);
		
		final String clearTextField = "";
		
		// ButtonListeners
		btnTostring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				textArea.setText("");
				textArea.append(list.toString());
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				list = list.reverse();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (!list.isEmpty()) {
					textArea.setText("");
					textArea.append(list.reverseToString());
				}
			}
		});
		btnShowListSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (!list.isEmpty()) {
					textArea.setText("");
					textArea.append("Size Of List: "
							+ Integer.toString(list.sizeOf()));
				}
			}
		});
		btnEmptytrueOr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (!list.isEmpty()) {
					textArea.setText("");
					textArea.append("List Empty?: " + list.isEmpty());
				}
			}
		});
		btnAddInputTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				list.addToFront(textField_3.getText(), textField_1.getText(),
						textField_2.getText(), textField_4.getText(),
						textField.getText());
				textField.setText(clearTextField);
				textField_1.setText(clearTextField);
				textField_2.setText(clearTextField);
				textField_3.setText(clearTextField);
				textField_4.setText(clearTextField);
			}
		});
		btnAddInputTo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				list.addToBack(textField_3.getText(), textField_1.getText(),
						textField_2.getText(), textField_4.getText(),
						textField.getText());
				textField.setText(clearTextField);
				textField_1.setText(clearTextField);
				textField_2.setText(clearTextField);
				textField_3.setText(clearTextField);
				textField_4.setText(clearTextField);
			}
		});

		btnPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				textArea_1.setText("");
				textArea_1.append(list.phoneNumberByName(textField_5.getText()));
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				textArea_1.setText("");
				textArea_1.append(list.emailByName(textField_5.getText()));
			}
		});
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				textArea_1.setText("");
				textArea_1.append(list.nameByPhoneNumber(textField_5.getText()));
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				textArea_1.setText("");
				textArea_1.append(list.dobByName(textField_5.getText()));
			}
		});
	}
}