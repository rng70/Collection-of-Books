//^^^^^^^^^^^^^^^^^^^^^^^^  Import Classes  ^^^^^^^^^^^^^^^^^^^^^^^^^^^
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//^^^^^^^^^^^^^^^^^^^^^^^^  button_variable Class  ^^^^^^^^^^^^^^^^^^^^^^^^^^^
 class button_variable {
    static JFrame window = new JFrame("KataGollah");
        static JButton button1 = new JButton("");
        static JButton button2 = new JButton("");
        static JButton button3 = new JButton("");
        static JButton button4 = new JButton("");
        static JButton button5 = new JButton("");
        static JButton button6 = new JButton("");
        static JButton button7 = new JButton("");
        static JButton button8 = new JButton("");
        static JButton button9 = new JButton("");
       
        static String letter="";
        static int count =0;
        static boolean win = false;
    
}
//^^^^^^^^^^^^^^^^^^^^^^^^  Main Class  ^^^^^^^^^^^^^^^^^^^^^^^^^^^

public class katagollah extends button_variable implements ActionListener
{
    //^^^^^^^^^^^^^^^^^^^^^^^^  Main Method  ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        public static void main(String args[])
        {
         katagollah obj=new katagollah();
               
        }
//^^^^^^^^^^^^^^^^^^^^^^^^  Constructor  ^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
public katagollah()
{
        window.setSize(300,300);
        window.setLocation(500,250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(3,3));
//^^^^^^^^^^^^^^^^^^^^^^^^  Adding Button on the Windown ^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
        window.add(button1);
        window.add(button2);
        window.add(button3);
        window.add(button4);
        window.add(button5);
        window.add(button6);
        window.add(button7);
        window.add(button8);
        window.add(button9);

  //^^^^^^^^^^^^^^^^^^^^^^^^  Adding Button To Action Listener ^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

        window.setVisible(true);

}
//^^^^^^^^^^^^^^^^^^^^^^^^  Action Performed Method ^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
public void actionPerformed(ActionEvent e)
{
            count++;
            if(count==1 || count==3 || count==5 || count==7 || count==9 )
            {
            letter="X";
            }
            else if(count==2 || count==4 || count==6 || count==8 || count==10 )
            {
            letter="O";
            }
            if(e.getSource()==button1)
            {
                button1.setText(letter);
                button1.setEnabled(false);
            }
            else if(e.getSource()==button2)
            {
                button2.setText(letter);
                button2.setEnabled(false);
            }
            else if(e.getSource()==button3)
            {
                button3.setText(letter);
                button3.setEnabled(false);
            }
            else if(e.getSource()==button4)
            {
                button4.setText(letter);
                button4.setEnabled(false);
            }
            else if(e.getSource()==button5)
            {
                button5.setText(letter);
                button5.setEnabled(false);
            }
            else if(e.getSource()==button6)
            {
                button6.setText(letter);
                button6.setEnabled(false);
            }
            else if(e.getSource()==button7)
            {
                button7.setText(letter);
                button7.setEnabled(false);
            }
            else if(e.getSource()==button8)
            {
                button8.setText(letter);
                button8.setEnabled(false);
            }
            else if(e.getSource()==button9)
            {
                button9.setText(letter);
                button9.setEnabled(false);
            }
            //^^^^^^^^^^^^^^^^^^^^^^^^  Horizontal Conditions  ^^^^^^^^^^^^^^^^^^^^^^^^^^^
            if(button1.getText()== button2.getText() && button2.getText()==button3.getText()&& button1.getText() != "")
            {
            win=true;
            }
            else if(button4.getText()==button5.getText()&& button5.getText()==button6.getText() && button4.getText() != "")
            {
            win=true;
            }
            else if(button7.getText()==button8.getText() && button8.getText()==button9.getText()&& button7.getText() != "")
            {
            win=true;
            }
//^^^^^^^^^^^^^^^^^^^^^^^^  Vertical Conditions  ^^^^^^^^^^^^^^^^^^^^^^^^^^^
            
            else if(button1.getText()==button4.getText()&& button4.getText()==button7.getText()&& button1.getText() != "")
            {
            win=true;
            }
            else if(button2.getText()==button5.getText()&& button5.getText()==button8.getText()&& button2.getText() != "")
            {
            win=true;
            }
            else if(button3.getText()==button6.getText() && button6.getText()==button9.getText()&& button3.getText() != "")
            {
            win=true;
            }
//^^^^^^^^^^^^^^^^^^^^^^^^ Diagonal Conditions  ^^^^^^^^^^^^^^^^^^^^^^^^^^^
           
            else if(button1.getText()==button5.getText()&& button5.getText()==button9.getText() && button1.getText() != "")
            {
            win=true;
            }
            else if(button3.getText()==button5.getText()&& button5.getText()==button7.getText()&& button3.getText() !="")
            {
            win=true;
            }
            else
            {
            win=false;
            }     
//^^^^^^^^^^^^^^^^^^^^^^^^ Who Win the Game ^^^^^^^^^^^^^^^^^^^^^^^^^^^
        if(win==true)
        {
        JOptionPane.showMessageDialog(null,letter + " WINS  !" ,"Who Win The Game ?",JOptionPane.INFORMATION_MESSAGE);
               
        int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Confirm", JOptionPane.YES_NO_OPTION);

			if(answer == JOptionPane.NO_OPTION)

			{
				System.exit(0);
			}
			else
			{
			   reset();
			}  
        }

        else if (count==9 && win==false)
        {
        JOptionPane.showMessageDialog(null, " The Game is Tie ","Who Win The Game ?",JOptionPane.INFORMATION_MESSAGE);
                
       int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Confirm", JOptionPane.YES_NO_OPTION);

			if(answer == JOptionPane.NO_OPTION)

			{
				System.exit(0);
			}
			else
			{
			   reset();
			}
        }        
        }
//^^^^^^^^^^^^^^^^^^^^^^^^ Reset Method ^^^^^^^^^^^^^^^^^^^^^^^^^^^
 public void reset()
	{
		button1.setText("");
		button1.setEnabled(true);
		button2.setText("");
		button2.setEnabled(true);
		button3.setText("");
		button3.setEnabled(true);
		button4.setText("");
		button4.setEnabled(true);
		button5.setText("");
		button5.setEnabled(true);
		button6.setText("");
		button6.setEnabled(true);
		button7.setText("");
		button7.setEnabled(true);
		button8.setText("");
		button8.setEnabled(true);
		button9.setText("");
		button9.setEnabled(true);
		win = false;
		count = 0;
	}
}
//=============================    End Of Main Class    ==========================