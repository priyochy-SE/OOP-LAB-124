/**
 * This program is created by : PRIYABRATA CHOWDHURY (ID-23010105)
 * All rights reserved by the creator of this program.
**/

package Scientific_Calculator_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Scientific_Calculator_Project {

	private JFrame frame;
	private JLabel lbl_2;
	private JLabel lbl_1;
	private JTextField textField;
	private JButton btn1_X;
	private JButton btnPlusMinus;
	private JButton btnExp;
	private JButton btnLog;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnSin;
	private JButton btnSinh;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btn1;
	private JButton btnBackspace;
	private JButton btn10;
	private JButton btn7;
	private JButton btn4;
	private JButton btnDot;
	private JButton btnEqual;
	private JButton btnDivision;
	private JButton btnMultiplication;
	private JButton btnMinus;
	private JButton btnAdd;
	private JButton btnClear;
	private JButton btnPercent;
	private JButton btnFact;
	private JButton btn_X2;
	private JButton btn_X3;
	private JButton btn_XY;
	private JButton btnCos;
	private JButton btnTan;
	private JButton btnCosh;
	private JButton btnTanh;
	private JLabel lblAuthor_Priyo;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the Scientific Calculator.
	 */
        
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
                        @Override
			public void run() {
				try {
					Scientific_Calculator_Project window = new Scientific_Calculator_Project();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the Scientific Calculator.
	 */
        
	public Scientific_Calculator_Project() {
		initialize();
	}

	/**
	 * The main contents of the Scientific Calculator.
	 */
        
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 387, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" CASIO");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(47, 11, 79, 30);
		frame.getContentPane().add(lblNewLabel);
		
		lbl_2 = new JLabel(" NATURAL-V.P.A.M");
		lbl_2.setForeground(new Color(107, 142, 35));
		lbl_2.setFont(new Font("Verdana Pro Semibold", Font.BOLD | Font.ITALIC, 12));
		lbl_2.setBounds(20, 61, 130, 20);
		frame.getContentPane().add(lbl_2);
		
		lbl_1 = new JLabel("Scientific Calculator");
		lbl_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_1.setForeground(new Color(128, 0, 0));
		lbl_1.setBounds(31, 41, 119, 20);
		frame.getContentPane().add(lbl_1);
		
		JLabel lbl_3 = new JLabel("");
		lbl_3.setBounds(210, 28, 139, 44);
		frame.getContentPane().add(lbl_3);
		lbl_3.setIcon(new ImageIcon("C:\\Users\\PRIYO\\Downloads\\Solar.jpg"));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setForeground(Color.BLACK);
		textField.setBackground(new Color(153, 204, 153));
		textField.setBounds(20, 92, 330, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnR = new JButton("\u221A");
		btnR.setEnabled(false);
		btnR.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnR.setBackground(new Color(255, 255, 204));
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnR.setBounds(20, 189, 63, 36);
		frame.getContentPane().add(btnR);
		
		btn1_X = new JButton("1/x");
		btn1_X.setEnabled(false);
		btn1_X.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn1_X.setBackground(new Color(255, 255, 204));
		btn1_X.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1_X.setBounds(20, 230, 63, 36);
		frame.getContentPane().add(btn1_X);
		
		btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setBackground(new Color(255, 255, 204));
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPlusMinus.setBounds(20, 438, 63, 36);
		frame.getContentPane().add(btnPlusMinus);
		
		btnExp = new JButton("e^x");
		btnExp.setEnabled(false);
		btnExp.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnExp.setBackground(new Color(255, 255, 204));
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExp.setBounds(93, 189, 57, 36);
		frame.getContentPane().add(btnExp);
		
		btnLog = new JButton("Log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(textField.getText());
                                 double log = Math.log10(a);

				textField.setText(String.valueOf(log));
			}
		});
		btnLog.setBackground(new Color(255, 255, 204));
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLog.setBounds(93, 230, 57, 36);
		frame.getContentPane().add(btnLog);
		
		btn8 = new JButton("7");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBackground(new Color(255, 255, 255));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(93, 312, 57, 36);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("4");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBackground(Color.WHITE);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(93, 353, 57, 36);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("1");
		btn2.setEnabled(false);
		btn2.setBackground(Color.WHITE);
		btn2.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(93, 395, 57, 36);
		frame.getContentPane().add(btn2);
		
		btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(textField.getText());
                                double sin = Math.sin(Math.toRadians(a));
                                
				textField.setText(String.valueOf(sin));
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSin.setBounds(160, 189, 57, 36);
		frame.getContentPane().add(btnSin);
		
		btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(textField.getText());
                                double sinh = Math.sinh(a);
                                
				textField.setText(String.valueOf(sinh));
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSinh.setBounds(160, 230, 57, 36);
		frame.getContentPane().add(btnSinh);
		
		btn9 = new JButton("8");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBackground(new Color(255, 255, 255));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(160, 312, 57, 36);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("5");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBackground(Color.WHITE);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(160, 353, 57, 36);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("2");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBackground(Color.WHITE);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(160, 395, 57, 36);
		frame.getContentPane().add(btn3);
		
		btn1 = new JButton("0");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBackground(Color.WHITE);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(93, 438, 124, 36);
		frame.getContentPane().add(btn1);
		
		btnBackspace = new JButton("\uF0E7");
		btnBackspace.setEnabled(false);
		btnBackspace.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnBackspace.setForeground(new Color(0, 51, 255));
		btnBackspace.setBackground(new Color(255, 204, 102));
		btnBackspace.setFont(new Font("Wingdings", Font.PLAIN, 16));
		btnBackspace.setBounds(227, 272, 57, 36);
		frame.getContentPane().add(btnBackspace);
		
		btn10 = new JButton("9");
		btn10.setEnabled(false);
		btn10.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn10.getText();
				textField.setText(number);
			}
		});
		btn10.setBackground(Color.WHITE);
		btn10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn10.setBounds(227, 312, 57, 36);
		frame.getContentPane().add(btn10);
		
		btn7 = new JButton("6");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBackground(Color.WHITE);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(227, 353, 57, 36);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("3");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBackground(Color.WHITE);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(227, 395, 57, 36);
		frame.getContentPane().add(btn4);
		
		btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setBackground(Color.WHITE);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(227, 438, 57, 36);
		frame.getContentPane().add(btnDot);
		
		btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);				
				}
				else if(operation=="-")
				{
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);				
				}
				else if(operation=="×")
				{
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);				
				}
				else if(operation=="÷")
				{
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);				
				}
				else if(operation=="%")
				{
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);				
				}
				else if (operation=="X^Y")
				{
					double result = 1;
					for (int i=0; i<second; i++)
					{
					result = first * result;
					}
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setBackground(new Color(204, 255, 255));
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEqual.setBounds(292, 438, 57, 36);
		frame.getContentPane().add(btnEqual);
		
		btnDivision = new JButton("÷");
		btnDivision.setEnabled(false);
		btnDivision.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "÷";
			}
		});
		btnDivision.setBackground(Color.LIGHT_GRAY);
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDivision.setBounds(292, 395, 57, 36);
		frame.getContentPane().add(btnDivision);
		
		btnMultiplication = new JButton("×");
		btnMultiplication.setEnabled(false);
		btnMultiplication.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "×";
			}
		});
		btnMultiplication.setBackground(Color.LIGHT_GRAY);
		btnMultiplication.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMultiplication.setBounds(292, 353, 57, 36);
		frame.getContentPane().add(btnMultiplication);
		
		btnMinus = new JButton("-");
		btnMinus.setEnabled(false);
		btnMinus.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnMinus.setBackground(Color.LIGHT_GRAY);
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(292, 312, 57, 36);
		frame.getContentPane().add(btnMinus);
		
		btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.setBounds(292, 272, 57, 36);
		frame.getContentPane().add(btnAdd);
		
		btnClear = new JButton("AC");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setForeground(new Color(0, 51, 255));
		btnClear.setBackground(new Color(255, 204, 102));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBounds(160, 272, 57, 36);
		frame.getContentPane().add(btnClear);
		
		btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setBackground(new Color(255, 255, 204));
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPercent.setBounds(93, 272, 57, 36);
		frame.getContentPane().add(btnPercent);
		
		btnFact = new JButton("n!");
		btnFact.setEnabled(false);
		btnFact.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(textField.getText());
				double fact = 1;
				while(a!=0) 
				{
					fact = fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnFact.setBackground(new Color(255, 255, 204));
		btnFact.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFact.setBounds(20, 395, 63, 36);
		frame.getContentPane().add(btnFact);
		
		btn_X2 = new JButton("x^2");
		btn_X2.setEnabled(false);
		btn_X2.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = (Double.parseDouble(textField.getText()));
				a = a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_X2.setBackground(new Color(255, 255, 204));
		btn_X2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_X2.setBounds(20, 353, 63, 36);
		frame.getContentPane().add(btn_X2);
		
		btn_X3 = new JButton("x^3");
		btn_X3.setEnabled(false);
		btn_X3.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn_X3.setBackground(new Color(255, 255, 204));
		btn_X3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_X3.setBounds(20, 312, 63, 36);
		frame.getContentPane().add(btn_X3);
		
		btn_XY = new JButton("x^y");
		btn_XY.setEnabled(false);
		btn_XY.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "X^Y";
			}
		});
		btn_XY.setBackground(new Color(255, 255, 204));
		btn_XY.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_XY.setBounds(20, 272, 63, 36);
		frame.getContentPane().add(btn_XY);
		
		btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(textField.getText());
                                double cos = Math.cos(Math.toRadians(a));
                                
				textField.setText(String.valueOf(cos));
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCos.setBounds(227, 189, 57, 36);
		frame.getContentPane().add(btnCos);
		
		btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(textField.getText());
                                double tan = Math.tan(Math.toRadians(a));
                                
				textField.setText(String.valueOf(tan));
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTan.setBounds(292, 189, 57, 36);
		frame.getContentPane().add(btnTan);
		
		btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(textField.getText());
                                double cosh = Math.cosh(a);
                                
				textField.setText(String.valueOf(cosh));
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCosh.setBounds(227, 230, 57, 36);
		frame.getContentPane().add(btnCosh);
		
		btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				double a = Double.parseDouble(textField.getText());
                                double tanh = Math.tanh(a);

				textField.setText(String.valueOf(tanh));
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTanh.setBounds(292, 230, 57, 36);
		frame.getContentPane().add(btnTanh);
		
		JRadioButton ON_Button = new JRadioButton("ON");
		ON_Button.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				
				btn1.setEnabled(true);
				
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				
				btn10.setEnabled(true);
				
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnMinus.setEnabled(true);
				
				btnMultiplication.setEnabled(true);
				btnDivision.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				
				btnFact.setEnabled(true);
				btn_X2.setEnabled(true);
				btn_X3.setEnabled(true);
				btn_XY.setEnabled(true);
				btn1_X.setEnabled(true);
				btnR.setEnabled(true);
				btnExp.setEnabled(true);
				btnLog.setEnabled(true);
				btnPercent.setEnabled(true);
				
				btnSin.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCos.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTan.setEnabled(true);
				btnTanh.setEnabled(true);
				
				btnClear.setEnabled(true);
				btnBackspace.setEnabled(true);
				
				btnEqual.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(ON_Button);
		ON_Button.setForeground(Color.GREEN);
		ON_Button.setFont(new Font("Tahoma", Font.BOLD, 11));
		ON_Button.setBounds(308, 161, 41, 23);
		frame.getContentPane().add(ON_Button);
		
		JRadioButton OFF_Button = new JRadioButton("OFF");
		OFF_Button.setSelected(true);
		OFF_Button.addActionListener(new ActionListener() {
                        @Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn1.setEnabled(false);
				
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				
				btn10.setEnabled(false);
				
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnMinus.setEnabled(false);
				
				btnMultiplication.setEnabled(false);
				btnDivision.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				
				btnFact.setEnabled(false);
				btn_X2.setEnabled(false);
				btn_X3.setEnabled(false);
				btn_XY.setEnabled(false);
				btn1_X.setEnabled(false);
				btnR.setEnabled(false);
				btnExp.setEnabled(false);
				btnLog.setEnabled(false);
				btnPercent.setEnabled(false);
				
				btnSin.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCos.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTan.setEnabled(false);
				btnTanh.setEnabled(false);
				
				btnClear.setEnabled(false);
				btnBackspace.setEnabled(false);
				
				btnEqual.setEnabled(false);
				textField.setEnabled(false);
			}
		});
		buttonGroup.add(OFF_Button);
		OFF_Button.setFont(new Font("Tahoma", Font.BOLD, 11));
		OFF_Button.setForeground(Color.RED);
		OFF_Button.setBounds(20, 161, 45, 23);
		frame.getContentPane().add(OFF_Button);
		
		lblAuthor_Priyo = new JLabel("AUTHOR : PRIYO");
		lblAuthor_Priyo.setForeground(Color.GRAY);
		lblAuthor_Priyo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAuthor_Priyo.setBounds(124, 164, 130, 14);
		frame.getContentPane().add(lblAuthor_Priyo);
	}
}
