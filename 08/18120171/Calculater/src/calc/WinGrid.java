package calc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Spring;

public class WinGrid extends JFrame {
	   GridLayout grid;
	   JPanel bottomboard;
	   JTextArea jt;
	   int num1,num2;
	   int choice;
	   
	   WinGrid() {
		  choice = 0;
		  num1 = num2 = 0;
		  bottomboard = new JPanel();
	      grid=new GridLayout(4,4); 
	      bottomboard.setLayout(grid);
	      BtnListener btnl = new BtnListener();
	      JButton btn[]; // 声明按钮数组
		  String str[]={"0","1","2","3","4","5","6","7","8","9","+","-","*","/","C","="};
		  btn=new JButton[str.length]; // 创建按钮数组
		  for(int i=0;i<str.length;i++){
				btn[i]=new JButton(str[i]);
				btn[i].addActionListener(btnl);
				bottomboard.add(btn[i]);
			}
	      
	      
	      add(bottomboard,BorderLayout.CENTER);
	      jt = new JTextArea("0");
	      add(jt,BorderLayout.NORTH);
	      setBounds(30, 40, 400, 400);
	      setVisible(true);
	      setTitle("Calculator");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
	   
	   private class BtnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String regInt = "-?\\d+(\\.(0*))?";
			
			String buttonName = e.getActionCommand();
			Pattern patternInt = Pattern.compile(regInt);
			Matcher matcherInt = patternInt.matcher(buttonName);
			boolean resultInt = matcherInt.matches();
			if(resultInt) {
				String jtstr = jt.getText();
				Matcher matcherInt2 = patternInt.matcher(jtstr);
				boolean resultInt2 = matcherInt2.matches();
				if(resultInt2) {
					double a = Double.parseDouble(jtstr);
					double b = Double.parseDouble(buttonName);
					int c = (int) (10 * a + b);
					jt.setText(String.valueOf(c));
				}
				else {
					jt.setText(buttonName);
				}
			}
			if(buttonName.equals("C")) {
				choice = 0;
				num1 = num2 = 0;
				jt.setText("0");
			}
			if(buttonName.equals("+")) {
				if(choice != 0) {
					 JOptionPane.showMessageDialog(bottomboard,"重复输入运算符！");
				}
				String jtstr = jt.getText();
				Matcher matcherInt2 = patternInt.matcher(jtstr);
				boolean resultInt2 = matcherInt2.matches();
				if(resultInt2) {
					num1 = Integer.parseInt(jtstr);
					choice = 1;
					jt.setText("0");
				}
				else {
					JOptionPane.showMessageDialog(bottomboard,"输入为非整数！");
					jt.setText("0");
				}
			}
			if(buttonName.equals("-")) {
				if(choice != 0) {
					 JOptionPane.showMessageDialog(bottomboard,"重复输入运算符！");
				}
				String jtstr = jt.getText();
				Matcher matcherInt2 = patternInt.matcher(jtstr);
				boolean resultInt2 = matcherInt2.matches();
				if(resultInt2) {
					num1 = Integer.parseInt(jtstr);
					choice = 2;
					jt.setText("0");
				}
				else {
					JOptionPane.showMessageDialog(bottomboard,"输入为非整数！");
					jt.setText("0");
				}
			}
			if(buttonName.equals("*")) {
				if(choice != 0) {
					 JOptionPane.showMessageDialog(bottomboard,"重复输入运算符！");
				}
				String jtstr = jt.getText();
				Matcher matcherInt2 = patternInt.matcher(jtstr);
				boolean resultInt2 = matcherInt2.matches();
				if(resultInt2) {
					num1 = Integer.parseInt(jtstr);
					choice = 3;
					jt.setText("0");
				}
				else {
					JOptionPane.showMessageDialog(bottomboard,"输入为非整数！");
					jt.setText("0");
				}
			}
			if(buttonName.equals("/")) {
				if(choice != 0) {
					 JOptionPane.showMessageDialog(bottomboard,"重复输入运算符！");
				}
				String jtstr = jt.getText();
				Matcher matcherInt2 = patternInt.matcher(jtstr);
				boolean resultInt2 = matcherInt2.matches();
				if(resultInt2) {
					num1 = Integer.parseInt(jtstr);
					choice = 4;
					jt.setText("0");
				}
				else {
					JOptionPane.showMessageDialog(bottomboard,"输入为非整数！");
					jt.setText("0");
				}
			}
			if(buttonName.equals("=")) {
				String jtstr = jt.getText();
				Matcher matcherInt2 = patternInt.matcher(jtstr);
				boolean resultInt2 = matcherInt2.matches();
				if(resultInt2)num2 = Integer.parseInt(jtstr);
				if(!resultInt2) {
					JOptionPane.showMessageDialog(bottomboard,"输入为非整数！");
					jt.setText("0");
				}
				else if(choice == 0) {
					JOptionPane.showMessageDialog(bottomboard,"未输入运算符！");
				}
				else if(choice == 1) {
					int ans = num1 + num2;
					String ansstr = "运算结果为："+	String.valueOf(ans);
					jt.setText(ansstr);
					num2 = num1 = choice = 0;
				}
				else if(choice == 2) {
					int ans = num1 - num2;
					String ansstr = "运算结果为："+	String.valueOf(ans);
					jt.setText(ansstr);
					num2 = num1 = choice = 0;
				}
				else if(choice == 3) {
					int ans = num1 * num2;
					String ansstr = "运算结果为："+	String.valueOf(ans);
					jt.setText(ansstr);
					num2 = num1 = choice = 0;
				}
				else if(choice == 4) {
					if(num2 != 0) {
						double ans = (double)(num1) / (double)(num2);
						String ansstr = "运算结果为："+	String.valueOf(ans);
						jt.setText(ansstr);
						num2 = num1 = choice = 0;
					}
					else {
						JOptionPane.showMessageDialog(bottomboard,"不能除0！");
					}
				}
			}
		}
		   
	   }
	   
	}
