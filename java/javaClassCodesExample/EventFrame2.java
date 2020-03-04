import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventFrame2 extends JFrame
{
	JLabel label;
	JButton button1;
	JButton button2;
	
	public EventFrame2() 
	{
		super("Simple Frame");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		label=new JLabel("Label");
		button1=new JButton("Button-1");
		button2=new JButton("Button-2");	
		button1.addActionListener(new Button1Listener(this));
		button2.addActionListener(new Button2Listener(this));
		c.add(button1);					
		c.add(button2);
		c.add(label);
		setSize(200,200);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		setResizable(false);
		
	}
	
	public static void main(String args[])
	{
		new EventFrame2();
	}
}

class Button1Listener implements ActionListener
{
	EventFrame2 ef;
	
	public Button1Listener(EventFrame2 ef)
	{
		this.ef=ef;	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		this.ef.label.setText("Button-1 is Pressed");
	}
}


class Button2Listener implements ActionListener
{
	EventFrame2 ef;
	
	public Button2Listener(EventFrame2 ef)
	{
		this.ef=ef;		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		this.ef.label.setText("Button-2 is Pressed");
	}
}
