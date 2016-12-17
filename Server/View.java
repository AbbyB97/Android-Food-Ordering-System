import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

import javax.swing.*;
import javax.swing.table.*;
import java.text.SimpleDateFormat;




class View extends JPanel implements ActionListener
{
public static ActionListener a=null;
JPanel p=new JPanel();
JPanel r=new JPanel();
static JLabel l;
static JLabel l1;
static JTable table;
static JScrollPane jsp;
static Object[] col={"Item","Qty","Price"};
static JLabel l2=new JLabel("Order Time:N.A",JLabel.CENTER);
static JLabel l3=new JLabel("Payment Time:N.A",JLabel.CENTER);
static WinButton print=new WinButton(new ImageIcon("images/r1.png"),new ImageIcon("images/r2.png"),new ImageIcon("images/r3.png"),"Print Bill");
static JCheckBox paid=new JCheckBox();
static String xyz[];
static String pqr[];
static String abc[];
static JLabel ll=new JLabel("                Personal Preferences             ");
static JTextArea tt=new JTextArea();

public static void reset()
{
tt.setText("");
l.setText("Table No:00");
l1.setText("Total:00");
Object[][] data={{"Item","Qty","Price"},{"-------------------------","--------","------"}};
table.setModel(new DefaultTableModel(data,col));
l2.setText("Order Time:N.A");
l3.setText("Payment Time:N.A");
paid.setEnabled(false);
paid.setIcon(new ImageIcon("images/p2.png"));
paid.invalidate();
paid.repaint();
print.setEnabled(false);

table.getColumnModel().getColumn(0).setPreferredWidth((int)Math.round(table.getPreferredSize().width*0.70));
table.getColumnModel().getColumn(1).setPreferredWidth((int)Math.round(table.getPreferredSize().width*0.15));
table.getColumnModel().getColumn(2).setPreferredWidth((int)Math.round(table.getPreferredSize().width*0.15));
table.revalidate();
}





public static void set(String s,String n,String t,String pp,boolean b)
{
final  String p=s;
int c=0;
l3.setText("Payment Time:N.A");
tt.setText(pp);
paid.setEnabled(true);
paid.setSelected(false);
paid.revalidate();
paid.invalidate();
paid.repaint();
paid.validate();
print.setEnabled(false);

for(int i=0;i<n.length();i++)
if(n.charAt(i)=='-')     c++;

xyz=new String[c];
pqr=new String[c];
abc=new String[c];


for(int j=0;j<=c-1;j++)
{
xyz[j]=n.substring(0,n.indexOf("-"));
n=n.substring(n.indexOf("-")+1);
if(j==c-1)
pqr[j]=n;
else
{
pqr[j]=n.substring(0,n.indexOf(","));
n=n.substring(n.indexOf(",")+1);
}

}


for(int i=0;i<c;i++)
{
xyz[i]=xyz[i].replace("|0","");
if(xyz[i].trim().equals("veg crispy") || xyz[i].trim().equals("*veg crispy"))
abc[i]="x  150";
else if(xyz[i].trim().equals("chicken crispy") || xyz[i].trim().equals("*chicken crispy"))
abc[i]="x  170";
else if(xyz[i].equals("paneer chilly") ||xyz[i].equals("*paneer chilly"))
abc[i]="x   120";
else if(xyz[i].equals("masala papad") || xyz[i].equals("*masala papad"))
abc[i]="x  30";
else if(xyz[i].equals("veg soup")|| xyz[i].equals("*veg soup"))
abc[i]="x  80";
else if(xyz[i].equals("chicken soup") || xyz[i].equals("*chicken soup"))
abc[i]="x  80";
else if(xyz[i].equals("tomato soup") ||xyz[i].equals("*tomato soup"))
abc[i]="x  100";
else if(xyz[i].equals("cheese pakoda") || xyz[i].equals("*cheese pakoda"))
abc[i]="x  130";
else if(xyz[i].equals("paneer pakoda") ||xyz[i].equals("*paneer pakoda"))
abc[i]="x  140";
else if(xyz[i].equals("chicken chilly") || xyz[i].equals("*chicken chilly"))
abc[i]="x   120";

else if(xyz[i].equals("chicken burger") || xyz[i].equals("*chicken burger"))
abc[i]="x   120";
else if(xyz[i].equals("chicken bbq pizza") || xyz[i].equals("*chicken bbq pizza"))
abc[i]="x  200";
else if(xyz[i].equals("chicken tikka") || xyz[i].equals("*chicken tikka"))
abc[i]="x  300";
else if(xyz[i].equals("fried fish rice") || xyz[i].equals("*fried fish rice"))
abc[i]="x  250";
else if(xyz[i].equals("kolhapur chicken") || xyz[i].equals("*kolhapur chicken"))
abc[i]="x  120";
else if(xyz[i].equals("chicken noodles") || xyz[i].equals("*chicken noodles"))
abc[i]="x  120";
else if(xyz[i].equals("chicken fried rice") || xyz[i].equals("*chicken fried rice"))
abc[i]="x  120";
else if(xyz[i].equals("chicken lollipop") || xyz[i].equals("*chicken lollipop"))
abc[i]="x  100";
else if(xyz[i].equals("chicken biryani") || xyz[i].equals("*chicken biryani"))
abc[i]="x  180";
else if(xyz[i].equals("mutton biryani") || xyz[i].equals("*mutton biryani"))
abc[i]="x  200";

else if(xyz[i].equals("roti") || xyz[i].equals("*roti"))
abc[i]="x  20";
else if(xyz[i].equals("*butter roti"))
abc[i]="x  25";
else if(xyz[i].equals("paneer tikka") || xyz[i].equals("*paneer tikka"))
abc[i]="x  180";
else if(xyz[i].equals("veg pulao") || xyz[i].equals("*veg pulao"))
abc[i]="x  200";
else if(xyz[i].equals("mutter paneer") || xyz[i].equals("*mutter paneer"))
abc[i]="x  200";
else if(xyz[i].equals("veg noodles") || xyz[i].equals("*veg noodles"))
abc[i]="x  100";
else if(xyz[i].equals("veg fried rice") || xyz[i].equals("*veg fried rice"))
abc[i]="x  120";
else if(xyz[i].equals("veg burger") || xyz[i].equals("*veg burger"))
abc[i]="x  40";
else if(xyz[i].equals("veg briyani") || xyz[i].equals("*veg briyani"))
abc[i]="x  150";
else if(xyz[i].equals("paneer kofta") || xyz[i].equals("*paneer kofta"))
abc[i]="x  150";

else if(xyz[i].equals("chocolate ice cream") || xyz[i].equals("*chocolate ice cream"))
abc[i]="x  80";
else if(xyz[i].equals("vannila ice cream") || xyz[i].equals("*vannila ice cream"))
abc[i]="x  70";
else if(xyz[i].equals("strawberry ice cream") || xyz[i].equals("*strawberry ice cream"))
abc[i]="x  75";
else if(xyz[i].equals("falooda") || xyz[i].equals("*falooda"))
abc[i]="x  150";
else if(xyz[i].equals("brownie fudge") || xyz[i].equals("*brownie fudge"))
abc[i]="x  120";
else if(xyz[i].equals("alpine chocolate") || xyz[i].equals("*alpine chocolate"))
abc[i]="x  150";
else if(xyz[i].equals("devils delite") || xyz[i].equals("*devils delite"))
abc[i]="x  100";
else if(xyz[i].equals("black forest") || xyz[i].equals("*black forest"))
abc[i]="x  80";
else if(xyz[i].equals("chocolate lava") || xyz[i].equals("*chocolate lava"))
abc[i]="x  180";
else if(xyz[i].equals("dutch almond") || xyz[i].equals("dutch almond"))
abc[i]="x  120";






}



Object[][] data=new Object[c+2][3];
data[0][0]="Item";
data[0][1]="Qty";
data[0][2]="Price";
data[1][0]="-------------------------";
data[1][1]="--------";
data[1][2]="------";
for(int i=2;i<=c+1;i++)
{
data[i][0]=xyz[(i-1)-1];
data[i][1]=pqr[(i-1)-1];
data[i][2]=abc[(i-1)-1];
}

table.setModel(new DefaultTableModel(data,col));
table.getColumnModel().getColumn(0).setPreferredWidth((int)Math.round(table.getPreferredSize().width*0.70));
table.getColumnModel().getColumn(1).setPreferredWidth((int)Math.round(table.getPreferredSize().width*0.15));
table.getColumnModel().getColumn(2).setPreferredWidth((int)Math.round(table.getPreferredSize().width*0.15));
table.repaint();
table.revalidate();
table.validate();
table.invalidate();
jsp.repaint();
jsp.revalidate();
jsp.validate();
jsp.invalidate();

l.setText("Table No:"+p);
l1.setText("Total:"+t);


try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=Images/d.mdb");
Statement st=con.createStatement();
st.close();
con.close();
con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=Images/d.mdb");
st=con.createStatement();
ResultSet rs=st.executeQuery("select * from current where tab="+p);
String ss=null;
String ot=null;
while(rs.next())
{
ot=rs.getString(4);
ss=rs.getString(5);
}

if(ot!=null)
l2.setText("Order Time:"+ot);
else
{
SimpleDateFormat sdfDate = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
Date now = new Date();
String strDate = sdfDate.format(now);
l2.setText("Order Time:"+strDate);
}



if(ss!=null)
{
l3.setText("Payment Time:"+ss);
paid.setSelected(false);
paid.setEnabled(false);
print.setEnabled(true);
}
else
paid.setEnabled(true);

st.close();
con.close();
}catch(Exception e){e.printStackTrace();System.out.println("hi:");}


l.invalidate();

}


public void actionPerformed(ActionEvent ae)
{
new Print(l.getText(),l2.getText(),l3.getText(),xyz,pqr,abc,l1.getText());
System.out.println("printed:"+l.getText());
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=null;
Statement st=null;
con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=Images/d.mdb");
st=con.createStatement();
st.close();
con.close();
Thread.sleep(500);
con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=Images/d.mdb");
st=con.createStatement();
ResultSet rs=st.executeQuery("select * from current where tab="+l.getText().trim().replaceAll("Table No:",""));
st=con.createStatement();
String j=null;
while(rs.next())
j="insert into orders values("+rs.getInt(1)+",\'"+rs.getString(2)+"\',\'"+rs.getString(3)+"\',\'"+rs.getString(4)+"\',\'"+rs.getString(5)+"\',\'"+rs.getString(6)+"\')";
int n=st.executeUpdate(j);
st=con.createStatement();
n=st.executeUpdate("delete * from current where tab="+l.getText().trim().replaceAll("Table No:",""));
Middle.renotify(l.getText().trim().replaceAll("Table No:",""));
}catch(Exception e){System.out.println(e);}

View.reset();

}

View()
{
super();
setOpaque(false);
setLayout(null);



p.setOpaque(false);
p.setLayout(null);
add(p);

p.setBounds(100,50,320,700);

l=new JLabel("Table No:00",JLabel.CENTER);
l.setOpaque(false);
l.setBounds(0,0,300,32);
l.setForeground(new Color(128,0,0));
l.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
p.add(l);


l1=new JLabel("Total:00",JLabel.CENTER);
p.add(l1);
l1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
l1.setBounds(0,220,300,30);
l1.setOpaque(false);
l1.setForeground(new Color(128,0,0));


Object[][] data={{"Item","Qty","Price"},{"-------------------------","--------","------"}};
table=new JTable(data,col);
table.setModel(new DefaultTableModel(data,col));
table.setTableHeader(null);
table.setOpaque(false);
table.setShowGrid(false);
table.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
table.setRowHeight(20);
table.getColumnModel().getColumn(0).setPreferredWidth((int)Math.round(table.getPreferredSize().width*0.70));
table.getColumnModel().getColumn(1).setPreferredWidth((int)Math.round(table.getPreferredSize().width*0.15));
table.getColumnModel().getColumn(2).setPreferredWidth((int)Math.round(table.getPreferredSize().width*0.15));
table.setForeground(new Color(128,0,0));
((DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setOpaque(false);


jsp=new JScrollPane(table);
jsp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
p.add(jsp);
jsp.setBounds(-2,30,305,180);
jsp.setOpaque(false);
jsp.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
jsp.getViewport().setOpaque(false);


l2.setText("Order Time:N.A");
p.add(l2);
l2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
l2.setBounds(0,255,320,30);
l2.setOpaque(false);
l2.setForeground(new Color(128,0,0));

l3.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
l3.setForeground(new Color(128,0,0));
p.add(l3);
l3.setBounds(0,290,320,30);
l3.setOpaque(false);

JLabel l4=new JLabel("Payment Status",JLabel.CENTER);
p.add(l4);
l4.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
l4.setBounds(0,320,300,30);
l4.setOpaque(false);
l4.setForeground(new Color(128,0,0));


JPanel p2=new JPanel();
p2.setOpaque(false);
p2.setLayout(new BorderLayout());


paid.setEnabled(false);
paid.setOpaque(false);
paid.setIcon(new ImageIcon("images/p2.png"));
paid.setDisabledIcon(new ImageIcon("images/p2.png"));
paid.setDisabledSelectedIcon(new ImageIcon("images/p1.png"));
paid.setSelectedIcon(new ImageIcon("images/p1.png"));
paid.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent ae)
{
paid.setEnabled(false); 
SimpleDateFormat sdfDate = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
Date now = new Date();
String strDate = sdfDate.format(now);
String aa=l2.getText();
l3.setText("Payment Time:"+strDate);
print.setEnabled(true);

try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=null;
Statement st=null;
con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=Images/d.mdb");
st=con.createStatement();
st.close();
con.close();
con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=Images/d.mdb");
st=con.createStatement();
int n1=st.executeUpdate("update current set payment='"+strDate+"' where tab="+l.getText().trim().replace("Table No:",""));
System.out.println(n1+"updated");
st.close();
con.close();
}catch(Exception e){System.out.println(e);}

}});






p2.add(new JLabel("                                          "),BorderLayout.EAST);
p2.add(new JLabel("                                          "),BorderLayout.WEST);
p2.add(paid,BorderLayout.CENTER);
p.add(p2);
p2.setBounds(0,355,300,50);


p.add(print);
print.setEnabled(false);
print.setBounds(120,390,50,50);
print.addActionListener(this);


p.add(ll);
ll.setForeground(new Color(128,0,0));
ll.setBounds(0,440,500,32);
ll.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

p.add(tt);
tt.setForeground(new Color(128,0,0));
tt.setEditable(false);
tt.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
tt.setBounds(0,472,500,100);
tt.setOpaque(false);
}

}