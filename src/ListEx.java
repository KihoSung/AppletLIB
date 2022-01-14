import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5876497962539201462L;
	
	String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };
	ImageIcon[] images = { new ImageIcon("image0.jpg"), new ImageIcon("image1.jpg"), new ImageIcon("image2.jpg"), new ImageIcon("image3.jpg") };

	public ListEx()
	{
		this.setTitle("리스트 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		JList strList = new JList(fruits);
		this.add(strList);

		JList imageList = new JList(images);
		this.add(imageList);

		JList scrollList = new JList(fruits);
		this.add(new JScrollPane(scrollList));

		this.setLocationRelativeTo(null);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	public static void main(String[] args)
	{
		new ListEx();
	}
}