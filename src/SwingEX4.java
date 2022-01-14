import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingEX4 extends JFrame implements ActionListener
{
	int count = 0;
	Font f1;
	JTextField tf1, tf2, tf3;
	JButton bt1, bt2;

	SwingEX4()
	{

		f1 = new Font("배달의민족 도현", Font.PLAIN, 30);

		// JTextField
		tf1 = new JTextField();
		tf1.setBounds(50, 70, 200, 40);
		tf1.setFont(f1);

		tf2 = new JTextField();
		tf2.setBounds(50, 120, 200, 40);
		tf2.setFont(f1);

		tf3 = new JTextField("Answer");
		tf3.setBounds(50, 190, 200, 40);
		tf3.setEditable(false);
		tf3.setFont(f1);

		bt1 = new JButton("+");
		bt1.setBounds(50, 270, 70, 50);
		bt1.setFont(f1);

		bt2 = new JButton("-");
		bt2.setBounds(160, 270, 70, 50);
		bt2.setFont(f1);

		// ActionListener
		bt1.addActionListener(this);
		bt2.addActionListener(this);

		// JFrame
		add(tf1);
		add(tf2);
		add(tf3);
		add(bt1);
		add(bt2);

		setTitle("JButton EX");
		setSize(300, 400);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new SwingEX4();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		String str1 = tf1.getText();
		String str2 = tf2.getText();
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int c = 0;

		if (e.getSource() == bt1)
		{
			c = a + b;
		}
		else if (e.getSource() == bt2)
		{
			c = a - b;
		}
		String res = String.valueOf(c);
		tf3.setText(res);

	}
}