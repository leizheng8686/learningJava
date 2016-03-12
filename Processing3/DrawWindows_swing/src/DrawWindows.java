import java.awt.*;
import javax.swing.*;

public class DrawWindows extends JFrame{
	DrawWindows(String title, Color bg){
		super(title);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 400);
		
		Container c = getContentPane();
		c.setBackground(bg);
		
		JButton b = new JButton("OK");
		c.add(BorderLayout.NORTH, b);
//		b = new JButton("CANCEL");
//		c.add(BorderLayout.EAST, b);
		JTextField t = new JTextField("Please type...");
//		t.setFont("Times", Font.PLAIN, 28);
		c.add(BorderLayout.SOUTH, t);
		
		JPanel p = new JPanel();
		p.setBackground(Color.GREEN);
		p.setLayout(new GridLayout(2,3,5,10));
		for(int i = 0; i<6; i++){
			b = new JButton(i+"");
			p.add(b);			
		}
		c.add(BorderLayout.CENTER, p);
	}
	public static void main(String[] args){
		new DrawWindows("demo1", Color.red);
	}
}
