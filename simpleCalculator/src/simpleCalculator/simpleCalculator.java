package simpleCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class simpleCalculator extends JFrame{
	private JTextField display;
	private double a1,a2;
	public simpleCalculator(){
		super("Calculator");
		setSize(400,400);
		display = new JTextField();
		display.setEditable(false);
		Font f = new Font("Helvetica", Font.BOLD, 32);
		display.setFont(f);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4,4));
		String[] names = {
				"1", "2", "3", "+",
				"4", "5", "6", "-",
				"7", "8", "9", "*",
				"0", ".", "=", "/"
		};
		for (int i = 0; i < names.length; i++) {
			JButton b = new JButton(names[i]);
			p.add(b);
			if(Character.isDigit(names[i].charAt(0))){
				b.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						display.setText(b.getText());
					}
				});
			}
		}
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, p);
		c.add(BorderLayout.NORTH, display);
		setVisible(true);
}
	public static void main(String[] a) {
		new simpleCalculator();
	}
}
