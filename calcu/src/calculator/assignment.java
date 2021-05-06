package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class assignment {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					assignment window = new assignment();
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
	public assignment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 370, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		textField.setBounds(10, 27, 339, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Backspace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					Backspace=str.toString();
					textField.setText(Backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 28));
		btnBackspace.setBounds(10, 114, 66, 43);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btn7.setBounds(10, 167, 66, 43);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btn4.setBounds(10, 224, 66, 43);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btn1.setBounds(10, 277, 66, 43);
		frame.getContentPane().add(btn1);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btn00.setBounds(10, 330, 66, 43);
		frame.getContentPane().add(btn00);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		
		});
		btnclear.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btnclear.setBounds(102, 114, 66, 43);
		frame.getContentPane().add(btnclear);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btndot.setBounds(191, 114, 66, 43);
		frame.getContentPane().add(btndot);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnplus.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btnplus.setBounds(283, 114, 66, 43);
		frame.getContentPane().add(btnplus);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btn9.setBounds(191, 167, 66, 43);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btn8.setBounds(102, 167, 66, 43);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btn5.setBounds(102, 224, 66, 43);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btn6.setBounds(191, 224, 66, 43);
		frame.getContentPane().add(btn6);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnminus.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btnminus.setBounds(283, 167, 66, 43);
		frame.getContentPane().add(btnminus);
		
		JButton btninto = new JButton("*");
		btninto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btninto.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btninto.setBounds(283, 224, 66, 43);
		frame.getContentPane().add(btninto);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btn2.setBounds(102, 277, 66, 43);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btn0.setBounds(102, 330, 66, 43);
		frame.getContentPane().add(btn0);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btn3.setBounds(191, 277, 66, 43);
		frame.getContentPane().add(btn3);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f, result");
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f, result");
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f, result");
					textField.setText(answer);
				}
				if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f, result");
					textField.setText(answer);
				}
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f, result");
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f, result");
					textField.setText(answer);
				}
				
				
				
				
			}
		});
		btnequal.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btnequal.setBounds(191, 330, 66, 43);
		frame.getContentPane().add(btnequal);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndivide.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btndivide.setBounds(283, 277, 66, 43);
		frame.getContentPane().add(btndivide);
		
		JButton btnpercent = new JButton("%");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnpercent.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		btnpercent.setBounds(283, 330, 66, 43);
		frame.getContentPane().add(btnpercent);
	}
}
