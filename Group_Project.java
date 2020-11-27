import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Group_Project {

	public static void main(String[] args) {
		JRadioButton yes, no;
		ButtonGroup group;

		JTextField textName;
		JButton submit;

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		JLabel welcome;

		panel.add(new JLabel("Would you like some coffee?"));
		yes = new JRadioButton("Yes");
		no = new JRadioButton("No");

		group = new ButtonGroup();
		group.add(yes);
		group.add(no);

		panel.add(yes);
		panel.add(no);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300, 200));
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		frame.setTitle("Coffee Shoppe");

		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("<< Enter Your Name >>"));
		panel.add(textName = new JTextField(25));
		panel.add(submit = new JButton("Submit"));
		submit.setBackground(Color.GRAY);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textName.getText();
				if (name.isEmpty() && no.isSelected() == false && yes.isSelected() == false) {
					JOptionPane.showMessageDialog(null, "Please enter a valid name and option");

				} else if (yes.isSelected() && textName.getText().length() > 0) {
					JFrame frame = new JFrame("Coffee Shoppe");

					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setSize(300, 300);
					frame.setLocationRelativeTo(null);

					JPanel panel = new JPanel();
					frame.add(panel);

					JLabel welcome = new JLabel("Welcome " + name + " to Java Jim�s Coffee Shoppe");
					panel.add(welcome);

					JLabel welcome2 = new JLabel("What Coffee size would you like to order!");
					panel.add(welcome2);

					JButton button = new JButton("Small: $1.25");
					panel.add(button);
					button.setBackground(Color.WHITE);
					button.addActionListener(new beverage1());

					JButton button2 = new JButton("Medium: $1.75");
					panel.add(button2);
					button2.setBackground(Color.WHITE);
					button2.addActionListener(new beverage2());

					JButton button3 = new JButton("Large: $2.30");
					panel.add(button3);
					button3.setBackground(Color.WHITE);
					button3.addActionListener(new beverage3());
				} else if (no.isSelected() && name.isEmpty() && textName.getText().length() == 0) {
					System.exit(0);
				} else if (no.isSelected() && textName.getText().length() > 0) {
					System.exit(0);
				} else if (yes.isSelected() && name.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter a name");
				} else if (textName.getText().length() > 0 && yes.isSelected() == false && no.isSelected() == false) {
					JOptionPane.showMessageDialog(null, "Please choose an option");
				} else {
					JOptionPane.showMessageDialog(null, "Please choose an option");
				}
			}
		});
		frame.setVisible(true);

	}

	static class beverage1 extends JFrame implements ActionListener { // this class is for button1 (Small beverage).
		JLabel label, label2, label3;
		JCheckBox cream, sugar, espresso;
		JButton button;

		double Small_B = 1.25;// Small Beverage cost

		public void actionPerformed(ActionEvent e) {
			label = new JLabel("|Coffee Add On's|");
			label.setBounds(100, 30, 300, 20);
			label2 = new JLabel("|Extra 75 cents for Espresso Shots|");
			label2.setBounds(50, 70, 300, 20);
			label3 = new JLabel("|Sugar & Cream are free|");
			label3.setBounds(75, 50, 300, 20);

			cream = new JCheckBox("Cream");
			cream.setBounds(100, 100, 150, 20);

			sugar = new JCheckBox("Raw Sugar");
			sugar.setBounds(100, 150, 150, 20);

			espresso = new JCheckBox("Espresso Shot");
			espresso.setBounds(100, 200, 150, 20);

			button = new JButton("Order");

			button.setBounds(100, 250, 80, 30);
			button.setBackground(Color.GRAY);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double amount = Small_B;
					String MsgBox = "";
					String thanks = "Thanks for Ordering a Small Beverage\n";
					thanks += "-----------------\n";
					String Add_On = "|Additions|\n";
					if (cream.isSelected()) {
						MsgBox += "- Cream\n";
						amount += 0;
					}

					if (sugar.isSelected()) {
						MsgBox += "- Raw Sugar\n";
						amount += 0;
					}

					if (espresso.isSelected()) {
						amount += 0.75;
						MsgBox += "- Espresso Shot\n";
					}
					if (espresso.isSelected() == false && sugar.isSelected() == false && cream.isSelected() == false) {
						Add_On += "None\n";
					}
					DecimalFormat decim = new DecimalFormat("0.00");
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					String s = decim.format(amount);
					MsgBox += "-----------------\n";
					JOptionPane.showMessageDialog(null, thanks + Add_On + MsgBox + "Your total is $" + s,
							" Final Price", getDefaultCloseOperation());
				}
			});

			add(label);
			add(cream);
			add(sugar);
			add(espresso);
			add(button);
			add(label2);
			add(label3);
			setSize(400, 400);
			setLayout(null);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
		}
	}

	static class beverage2 extends JFrame implements ActionListener { // this class is for button22 (Medium beverage).
		JLabel label, label2, label3;
		JCheckBox cream, sugar, espresso;
		JButton button;
		double Medium_B = 1.75;// Medium Beverage cost

		public void actionPerformed(ActionEvent e) {

			label = new JLabel("|Coffee Add On's|");
			label.setBounds(100, 30, 300, 20);
			label2 = new JLabel("|Extra 75 cents for Espresso Shots|");
			label2.setBounds(50, 70, 300, 20);
			label3 = new JLabel("|Sugar & Cream are free|");
			label3.setBounds(75, 50, 300, 20);

			cream = new JCheckBox("Cream");
			cream.setBounds(100, 100, 150, 20);

			sugar = new JCheckBox("Raw Sugar");
			sugar.setBounds(100, 150, 150, 20);

			espresso = new JCheckBox("Espresso Shot");
			espresso.setBounds(100, 200, 150, 20);

			button = new JButton("Order");

			button.setBounds(100, 250, 80, 30);
			button.setBackground(Color.GRAY);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double amount = Medium_B;
					String MsgBox = "";
					String thanks = "Thanks for Ordering a Medium Beverage\n";
					thanks += "-----------------\n";
					String Add_On = "|Additions|\n";
					if (cream.isSelected()) {
						MsgBox += "- Cream\n";
						amount += 0;
					}

					if (sugar.isSelected()) {
						MsgBox += "- Raw Sugar\n";
						amount += 0;
					}

					if (espresso.isSelected()) {
						amount += 0.75;
						MsgBox += "- Espresso Shot\n";
					}
					if (espresso.isSelected() == false && sugar.isSelected() == false && cream.isSelected() == false) {
						Add_On += "None\n";
					}
					DecimalFormat decim = new DecimalFormat("0.00");
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					String s = decim.format(amount);
					MsgBox += "-----------------\n";
					JOptionPane.showMessageDialog(null, thanks + Add_On + MsgBox + "Your total is $" + s,
							" Final Price", getDefaultCloseOperation());
				}
			});

			add(label);
			add(cream);
			add(sugar);
			add(espresso);
			add(button);
			add(label2);
			add(label3);
			setSize(400, 400);
			setLayout(null);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
		}

	}

	static class beverage3 extends JFrame implements ActionListener {// this class is for button3 (Large beverage).
		protected static final String JOptionaPane = null;
		JLabel label, label2, label3;
		JCheckBox cream, sugar, espresso;
		JButton button;
		double Large_B = 2.30;// Large Beverage cost

		public void actionPerformed(ActionEvent e) {

			label = new JLabel("|Coffee Add On's|");
			label.setBounds(100, 30, 300, 20);
			label2 = new JLabel("|Extra 75 cents for Espresso Shots|");
			label2.setBounds(50, 70, 300, 20);
			label3 = new JLabel("|Sugar & Cream are free|");
			label3.setBounds(75, 50, 300, 20);
			cream = new JCheckBox("Cream");
			cream.setBounds(100, 100, 150, 20);

			sugar = new JCheckBox("Raw Sugar");
			sugar.setBounds(100, 150, 150, 20);

			espresso = new JCheckBox("Espresso Shot");
			espresso.setBounds(100, 200, 150, 20);

			button = new JButton("Order");

			button.setBounds(100, 250, 80, 30);
			button.setBackground(Color.GRAY);
			;
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double amount = Large_B;
					String MsgBox = "";
					String thanks = "Thanks for Ordering a Large Beverage\n";
					thanks += "-----------------\n";
					String Add_On = "|Additions|\n";
					if (cream.isSelected()) {
						MsgBox += "- Cream\n";
						amount += 0;
					}

					if (sugar.isSelected()) {
						MsgBox += "- Raw Sugar\n";
						amount += 0;
					}

					if (espresso.isSelected()) {
						amount += 0.75;
						MsgBox += "- Espresso Shot\n";
					}
					if (espresso.isSelected() == false && sugar.isSelected() == false && cream.isSelected() == false) {
						Add_On += "None\n";
					}
					DecimalFormat decim = new DecimalFormat("0.00");
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					String s = decim.format(amount);
					MsgBox += "-----------------\n";
					JOptionPane.showMessageDialog(null, thanks + Add_On + MsgBox + "Your total is $" + s,
							" Final Price", getDefaultCloseOperation());
				}
			});

			add(label);
			add(cream);
			add(sugar);
			add(espresso);
			add(button);
			add(label2);
			add(label3);
			setSize(400, 400);
			setLayout(null);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
		}
	}
}