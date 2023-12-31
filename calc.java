import javax.swing.*;
import java.awt.event.*;
class Calc implements ActionListener
{
JFrame f;
JTextField t1;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,bzero,bpoint,badd,bsub,bmul,bdiv,bclr,bdel,bequal;
JLabel l1;

static double a,b,c=0;
static char op;

Calc()
{
f=new JFrame();

l1=new JLabel("Calculator");
l1.setBounds(150,10,130,40);
f.add(l1);

t1=new JTextField();
t1.setBounds(80,50,230,40);
f.add(t1);

b1=new JButton("1");
b1.setBounds(80,100,50,40);
f.add(b1);

b2=new JButton("2");
b2.setBounds(140,100,50,40);
f.add(b2);

b3=new JButton("3");
b3.setBounds(200,100,50,40);
f.add(b3);

badd=new JButton("+");
badd.setBounds(260,100,50,40);
f.add(badd);

b4=new JButton("4");
b4.setBounds(80,150,50,40);
f.add(b4);

b5=new JButton("5");
b5.setBounds(140,150,50,40);
f.add(b5);

b6=new JButton("6");
b6.setBounds(200,150,50,40);
f.add(b6);

bsub=new JButton("-");
bsub.setBounds(260,150,50,40);
f.add(bsub);

b7=new JButton("7");
b7.setBounds(80,200,50,40);
f.add(b7);

b8=new JButton("8");
b8.setBounds(140,200,50,40);
f.add(b8);

b9=new JButton("9");
b9.setBounds(200,200,50,40);
f.add(b9);

bmul=new JButton("*");
bmul.setBounds(260,200,50,40);
f.add(bmul);

bpoint=new JButton(".");
bpoint.setBounds(80,250,50,40);
f.add(bpoint);

bzero=new JButton("0");
bzero.setBounds(140,250,50,40);
f.add(bzero);

bdel=new JButton("Del");
bdel.setBounds(200,250,50,40);
f.add(bdel);

bdiv=new JButton("/");
bdiv.setBounds(260,250,50,40);
f.add(bdiv);

bequal=new JButton("=");
bequal.setBounds(80,300,100,40);
f.add(bequal);

bclr=new JButton("Clr");
bclr.setBounds(190,300,120,40);
f.add(bclr);


f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
bzero.addActionListener(this);
bpoint.addActionListener(this);
badd.addActionListener(this);
bsub.addActionListener(this);
bmul.addActionListener(this);
bdiv.addActionListener(this);
bdel.addActionListener(this);
bequal.addActionListener(this);
bclr.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
t1.setText(t1.getText().concat("1"));

if(e.getSource()==b2)
t1.setText(t1.getText().concat("2"));

if(e.getSource()==b3)
t1.setText(t1.getText().concat("3"));

if(e.getSource()==b4)
t1.setText(t1.getText().concat("4"));

if(e.getSource()==b5)
t1.setText(t1.getText().concat("5"));

if(e.getSource()==b6)
t1.setText(t1.getText().concat("6"));

if(e.getSource()==b7)
t1.setText(t1.getText().concat("7"));

if(e.getSource()==b8)
t1.setText(t1.getText().concat("8"));

if(e.getSource()==b9)
t1.setText(t1.getText().concat("9"));

if(e.getSource()==bzero)
t1.setText(t1.getText().concat("0"));

if(e.getSource()==bpoint)
t1.setText(t1.getText().concat("."));

if(e.getSource()==badd)
{
a=Double.parseDouble(t1.getText());
op=1;
t1.setText("");
}

if(e.getSource()==bsub)
{
a=Double.parseDouble(t1.getText());
op=2;
t1.setText("");
}

if(e.getSource()==bmul)
{
a=Double.parseDouble(t1.getText());
op=3;
t1.setText("");
}

if(e.getSource()==bdiv)
{
a=Double.parseDouble(t1.getText());
op=4;
t1.setText("");
}

if(e.getSource()==bequal)
{
b=Double.parseDouble(t1.getText());
switch(op)
{
case 1:
c=a+b;
break;
case 2:
c=a-b;
break;
case 3:
c=a*b;
break;
case 4:
c=a/b;
break;
default:
//System.out.print();
JOptionPane.showMessageDialog(null,"Invalid option");
}
t1.setText(" "+c);
}

if(e.getSource()==bdel)
{
String string=t1.getText();
t1.setText("");
for(int i=0; i<string.length()-1; i++)
{
t1.setText(t1.getText()+string.charAt(i));
}}

if(e.getSource()==bclr)
t1.setText("");
}
public static void main(String[] args)
{
new Calc();
}
}