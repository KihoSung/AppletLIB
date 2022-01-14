import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingEX16
{

	SwingEX16()
	{

		JFrame frame1 = new JFrame();
		JPanel panel1 = new JPanel();
		ComponentEX com1 = new ComponentEX();
		MyCanvas canvas1 = new MyCanvas();

		panel1.setLayout(new FlowLayout());
		panel1.setBounds(50, 100, 150, 200);
		panel1.setBackground(new Color(0, 153, 255));

		JLabel label1 = new JLabel("JLabel Example");
		JButton button1 = new JButton("Nice Click!");
		JButton button2 = new JButton("GOOD Click!");
		button1.setBackground(new Color(255, 153, 255));
		button2.setBackground(new Color(255, 204, 000));

		panel1.add(label1);
		panel1.add(button1);
		panel1.add(button2);
		frame1.add(panel1);
		frame1.add(com1);
		// frame1.add(canvas1);

		// frame1.setLayout(null);
		frame1.setBounds(300, 300, 700, 700);
		frame1.setTitle("JFrame");
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		new SwingEX16();
	}
}

class MyCanvas extends Canvas{
	
	public void paint(Graphics g) {
		g.setColor(new Color(255,153,51));
		g.fillRect(250, 300, 150, 200);
		g.drawOval(300, 100, 100, 70);
		g.setColor(new Color(0,51,204));
		g.fillOval(450, 100, 100, 90);
		g.drawArc(550, 100, 140, 80,90,60);
		g.fillArc(550, 250, 140, 80,90,60);
		
	}
}
 
class ComponentEX extends JComponent{
	public void paint(Graphics g) {
		g.setColor(new Color(51,255,0));
		g.fillRect(250, 100, 150, 200);
	}
}