package jsq;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Jsq{
	
	public static void main(String[] args) {
		 
		JJsq sjq=new JJsq();
		
	}
	
}

class JJsq extends JFrame implements ActionListener{

	
	//输入框
	TextField tf=null;
	
	//按钮
	JButton b0 =null;
	JButton b1 =null;
	JButton b2 =null;
	JButton b3 =null;
	JButton b4 =null;
	JButton b5 =null;
	JButton b6 =null;
	JButton b7 =null;
	JButton b8 =null;
	JButton b9 =null;
	JButton add =null;
	JButton dvi =null;
	JButton mul =null;
	JButton sub =null;
	
	JButton eql =null;
	JButton C =null;
	
	JPanel p=null;
	
	//第一个值
	public static int first= 0;
	//第二个值
	public static int second= 0;
	//结果
	public static int sum= 0;
	//符号
	public static int operate=0;
	
	public JJsq()
	{
		tf=new TextField();
		b0=new JButton("0");
		b0.addActionListener(this);
		b0.setActionCommand("0");
		b1=new JButton("1");
		b1.addActionListener(this);
		b1.setActionCommand("1");
		b2=new JButton("2");
		b2.addActionListener(this);
		b2.setActionCommand("2");
		b3=new JButton("3");
		b3.addActionListener(this);
		b3.setActionCommand("3");
		b4=new JButton("4");
		b4.addActionListener(this);
		b4.setActionCommand("4");
		b5=new JButton("5");
		b5.addActionListener(this);
		b5.setActionCommand("5");
		b6=new JButton("6");
		b6.addActionListener(this);
		b6.setActionCommand("6");
		b7=new JButton("7");
		b7.addActionListener(this);
		b7.setActionCommand("7");
		b8=new JButton("8");
		b8.addActionListener(this);
		b8.setActionCommand("8");
		b9=new JButton("9");
		b9.addActionListener(this);
		b9.setActionCommand("9");
		
		add=new JButton("+");
		add.addActionListener(this);
		add.setActionCommand("+");
		dvi=new JButton("÷");
		dvi.addActionListener(this);
		dvi.setActionCommand("÷");
		mul=new JButton("*");
		mul.addActionListener(this);
		mul.setActionCommand("*");
		sub=new JButton("-");
		sub.addActionListener(this);
		sub.setActionCommand("-");
		eql=new JButton("=");
		eql.addActionListener(this);
		eql.setActionCommand("=");
		C=new JButton("C");
		C.addActionListener(this);
		C.setActionCommand("C");
		
		p=new JPanel();
		
		p.setLayout(new GridLayout(4,4,4,4));
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(add);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(sub);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(dvi);
		p.add(b0);
		p.add(C);
		p.add(eql);
		p.add(mul);
		
		this.add(tf,BorderLayout.NORTH);
		this.add(p,BorderLayout.CENTER);
		
		this.setVisible(true);//显示
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //关闭
		this.setSize(200, 300);//大小
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO 自动生成的方法存根
		
		
		
		switch( a.getActionCommand() )
		{
		case "0":
			tf.setText(tf.getText() + "0");
			break;
		case "1":
			tf.setText(tf.getText() + "1");
			break;
		case "2":
			tf.setText(tf.getText() + "2");
			break;
		case "3":
			tf.setText(tf.getText() + "3");
			break;
		case "4":
			tf.setText(tf.getText() + "4");
			break;
		case "5":
			tf.setText(tf.getText() + "5");
			break;
		case "6":
			tf.setText(tf.getText() + "6");
			break;
		case "7":
			tf.setText(tf.getText() + "7");
			break;
		case "8":
			tf.setText(tf.getText() + "8");
			break;
		case "9":
			tf.setText(tf.getText() + "9");
			break;
		case "C":
			first = 0;
			second = 0;
			sum = 0;
			tf.setText("");
			break;
		case "+":
			operate = 1;
			first = Integer.parseInt(tf.getText());// 得到了文本框里的值
			tf.setText("");
			break;
		case "-":
			operate = 2;
			first = Integer.parseInt(tf.getText());
			tf.setText("");
			break;
		case "*":
			operate = 3;
			first = Integer.parseInt(tf.getText());
			tf.setText("");
			break;
		case "÷":
			operate = 4;
			first = Integer.parseInt(tf.getText());
			tf.setText("");
			break;
		case "=":
			
			second = Integer.parseInt(tf.getText());
			tf.setText("");
			
			switch(operate)
			{
			case 1:
				sum = first + second;
				tf.setText(Integer.toString(sum));
				break;
			case 2:
				sum = first - second;
				tf.setText(Integer.toString(sum));
				break;
			case 3:
				sum = first * second;
				tf.setText(Integer.toString(sum));
				break;
			case 4:
				sum = first / second;
				tf.setText(Integer.toString(sum));
				break;
			}
			break;
			
		
		}
	}
}
