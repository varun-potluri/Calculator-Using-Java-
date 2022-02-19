import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;

class Myframe extends JFrame implements ActionListener{
	
	private Container c;
	private JLabel label1,label2;
	private JTextField t1,t2,t3;
	private JRadioButton add,sub,mul,div;
	
	
	Myframe(){
		setTitle("Calculator");
		setSize(440,300);
		setLocation(100,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(null);
		
		
		t1 = new JTextField();
		t1.setBounds(40,20,100,20);
		c.add(t1);
		
		label1 = new JLabel("&");
		label1.setBounds(150,7,50,50);
		c.add(label1);

		
		
		t2 = new JTextField();
		t2.setBounds(170,20,100,20);
		c.add(t2);
		
		label2 = new JLabel("=");
		label2.setBounds(280,7,55,55);
		c.add(label2);

		t3 = new JTextField();
		t3.setBounds(300,20,100,20);
		c.add(t3);
		
		add = new JRadioButton("+");
		add.setBounds(185,80,70,30);
		c.add(add);
		
		sub = new JRadioButton("-");
		sub.setBounds(185,120,70,30);
		c.add(sub);
		
		mul = new JRadioButton("*");
		mul.setBounds(185,160,70,30);
		c.add(mul);
		
		div = new JRadioButton("/");
		div.setBounds(185,200,70,30);
		c.add(div);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		
		try {
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			
			if(evt.getSource() == add) {
				t3.setText(Integer.toString(a +b));
			}
			
			if(evt.getSource() == sub) {
				t3.setText(Integer.toString(a-b));
			}
			
			if(evt.getSource() == mul) {
				t3.setText(Integer.toString(a*b));
			}
			
			if(evt.getSource() == div) {
				t3.setText(Float.toString(a/b));
			}
			
		}
		catch(ArithmeticException e) {
			t3.setText("Div by 'o'");
			JOptionPane.showMessageDialog(this, "Division By Zero is not Possible");
		}
		catch(NumberFormatException e){
		     t3.setText("Give Nums");
		     JOptionPane.showMessageDialog(this, "Give Numbers As Input");
		    }
		
		
	}
	
}


public class Calculator {
	public static void main(String args[]) {
		
		Myframe frame = new Myframe();
	}
}
